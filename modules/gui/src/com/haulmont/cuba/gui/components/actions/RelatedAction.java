/*
 * Copyright (c) 2008-2016 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.haulmont.cuba.gui.components.actions;

import com.haulmont.bali.datastruct.Node;
import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.chile.core.model.MetaProperty;
import com.haulmont.chile.core.model.Range.Cardinality;
import com.haulmont.cuba.core.app.RelatedEntitiesService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.core.global.filter.Op;
import com.haulmont.cuba.gui.AppConfig;
import com.haulmont.cuba.gui.ComponentsHelper;
import com.haulmont.cuba.gui.WindowManager.OpenType;
import com.haulmont.cuba.gui.WindowParams;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.filter.ConditionParamBuilder;
import com.haulmont.cuba.gui.components.filter.ConditionsTree;
import com.haulmont.cuba.gui.components.filter.FilterParser;
import com.haulmont.cuba.gui.components.filter.Param;
import com.haulmont.cuba.gui.components.filter.condition.AbstractCondition;
import com.haulmont.cuba.gui.components.filter.condition.CustomCondition;
import com.haulmont.cuba.gui.components.filter.condition.PropertyCondition;
import com.haulmont.cuba.gui.components.filter.descriptor.PropertyConditionDescriptor;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.impl.DsContextImplementation;
import com.haulmont.cuba.security.entity.FilterEntity;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.context.annotation.Scope;

import javax.annotation.Nullable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Action used in {@link RelatedEntities} visual component.
 * <p>
 * In order to provide your own implementation globally, create a subclass and register it in {@code web-spring.xml},
 * for example:
 * <pre>
 * &lt;bean id="cuba_RelatedAction" class="com.company.sample.gui.MyRelatedAction" scope="prototype"/&gt;
 * </pre>
 */
@org.springframework.stereotype.Component("cuba_RelatedAction")
@Scope("prototype")
public class RelatedAction extends BaseAction implements Action.HasBeforeActionPerformedHandler {

    public static final String ACTION_ID = "related";

    protected final MetaProperty metaProperty;
    protected final MetaClass metaClass;
    protected final MetaClass relatedMetaClass;

    protected String screen;
    protected String filterCaption;
    protected String paramName;

    protected OpenType openType = OpenType.THIS_TAB;

    protected ExtendedEntities extendedEntities = AppBeans.get(ExtendedEntities.NAME);
    protected RelatedEntitiesService relatedEntitiesService = AppBeans.get(RelatedEntitiesService.NAME);
    protected MetadataTools metadataTools = AppBeans.get(MetadataTools.NAME);

    protected BeforeActionPerformedHandler beforeActionPerformedHandler;

    /**
     * Creates an action with the given id.
     * @param target    component containing this action
     */
    public static RelatedAction create(String id, ListComponent target, MetaClass metaClass, MetaProperty metaProperty) {
        return AppBeans.getPrototype("cuba_RelatedAction", id, target, metaClass, metaProperty);
    }

    public RelatedAction(String id, ListComponent target, MetaClass metaClass, MetaProperty metaProperty) {
        super(id);

        this.target = target;
        this.metaClass = metaClass;
        this.metaProperty = metaProperty;
        this.relatedMetaClass = metaProperty.getRange().asClass();

        MessageTools tools = AppBeans.get(MessageTools.NAME);
        setCaption(StringUtils.capitalize(tools.getPropertyCaption(target.getDatasource().getMetaClass(), metaProperty.getName())));
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getFilterCaption() {
        return filterCaption;
    }

    public void setFilterCaption(String filterCaption) {
        this.filterCaption = filterCaption;
    }

    public OpenType getOpenType() {
        return openType;
    }

    public void setOpenType(OpenType openType) {
        this.openType = openType;
    }

    @Override
    public void actionPerform(Component component) {
        if (beforeActionPerformedHandler != null) {
            if (!beforeActionPerformedHandler.beforeActionPerformed())
                return;
        }

        final Set<Entity> selected = target.getSelected();

        if (!selected.isEmpty()) {
            Map<String, Object> params = new HashMap<>();

            WindowParams.DISABLE_AUTO_REFRESH.set(params, true);
            WindowParams.DISABLE_RESUME_SUSPENDED.set(params, true);

            Window window = target.getFrame().openWindow(getScreen(), getOpenType(), params);

            boolean found = ComponentsHelper.walkComponents(window, screenComponent -> {
                if (!(screenComponent instanceof Filter)) {
                    return false;
                } else {
                    MetaClass actualMetaClass = ((Filter) screenComponent).getDatasource().getMetaClass();
                    MetaClass effectiveMetaClass = extendedEntities.getEffectiveMetaClass(relatedMetaClass);
                    if (ObjectUtils.equals(actualMetaClass, effectiveMetaClass)) {
                        applyFilter(((Filter) screenComponent), selected);
                        return true;
                    }
                    return false;
                }
            });
            if (!found) {
                target.getFrame().showNotification(messages.getMainMessage("actions.Related.FilterNotFound"), Frame.NotificationType.WARNING);
            }

            ((DsContextImplementation) window.getDsContext()).resumeSuspended();
        } else {
            target.getFrame().showNotification(messages.getMainMessage("actions.Related.NotSelected"), Frame.NotificationType.HUMANIZED);
        }
    }

    protected void applyFilter(Filter component, Set<Entity> selectedParents) {
        MessageTools messageTools = AppBeans.get(MessageTools.NAME);
        Metadata metadata = AppBeans.get(Metadata.NAME);

        FilterEntity filterEntity = metadata.create(FilterEntity.class);
        filterEntity.setComponentId(ComponentsHelper.getFilterComponentPath(component));

        if (StringUtils.isNotEmpty(filterCaption)) {
            filterEntity.setName(filterCaption);
        } else {
            filterEntity.setName(messages.getMainMessage("actions.Related.Filter") +
                    " " + messageTools.getPropertyCaption(metaProperty.getDomain(), metaProperty.getName()));
        }

        MetaClass effectiveMetaClass = extendedEntities.getEffectiveMetaClass(relatedMetaClass);

        filterEntity.setXml(getRelatedEntitiesFilterXml(effectiveMetaClass, selectedParents, component));
        filterEntity.setUser(userSession.getCurrentOrSubstitutedUser());

        component.setFilterEntity(filterEntity);
        component.apply(true);
    }

    protected String getRelatedEntitiesFilterXml(MetaClass relatedMetaCLass, Set<Entity> selectedEntities, Filter component) {
        ConditionsTree tree = new ConditionsTree();

        String filterComponentPath = ComponentsHelper.getFilterComponentPath(component);
        String[] strings = ValuePathHelper.parse(filterComponentPath);
        String filterComponentName = ValuePathHelper.format(Arrays.copyOfRange(strings, 1, strings.length));

        String relatedPrimaryKey = metadataTools.getPrimaryKeyName(relatedMetaCLass);
        AbstractCondition condition = getOptimizedCondition(getParentIds(selectedEntities), component.getDatasource(),
                filterComponentName, relatedPrimaryKey);

        if (condition == null) {
            condition = getNonOptimizedCondition(relatedMetaCLass, getRelatedIds(selectedEntities), component,
                    filterComponentName, relatedPrimaryKey);
        }

        tree.setRootNodes(Collections.singletonList(new Node<>(condition)));

        FilterParser filterParser = AppBeans.get(FilterParser.class);
        return filterParser.getXml(tree, Param.ValueProperty.VALUE);
    }

    @Nullable
    protected AbstractCondition getOptimizedCondition(List<Object> parentIds, CollectionDatasource datasource,
                                                      String filterComponentName, String relatedPrimaryKey) {
        Cardinality cardinality = metaProperty.getRange().getCardinality();

        if (cardinality == Cardinality.MANY_TO_ONE) {
            return getManyToOneCondition(parentIds, datasource, filterComponentName, relatedPrimaryKey);
        } else if (cardinality == Cardinality.ONE_TO_MANY || cardinality == Cardinality.ONE_TO_ONE) {
            return getOneToManyCondition(parentIds, datasource, filterComponentName);
        } else if (cardinality == Cardinality.MANY_TO_MANY) {
            return getManyToManyCondition(parentIds, datasource, filterComponentName, relatedPrimaryKey);
        }

        return null;
    }

    @Nullable
    protected AbstractCondition getOneToManyCondition(List<Object> parentIds, CollectionDatasource datasource,
                                                      String filterComponentName) {
        MetaProperty inverseField = metaProperty.getInverse();
        if (inverseField == null) {
            return null;
        }

        String parentPrimaryKey = metadataTools.getPrimaryKeyName(metaClass);
        CustomCondition customCondition = getParentEntitiesCondition(parentIds, parentPrimaryKey, datasource, filterComponentName);

        String whereString = String.format("{E}.%s.%s in :%s",
                inverseField.getName(), parentPrimaryKey, paramName);
        customCondition.setWhere(whereString);

        return customCondition;
    }

    @Nullable
    protected AbstractCondition getManyToManyCondition(List<Object> parentIds, CollectionDatasource datasource,
                                                       String filterComponentName, String relatedPrimaryKey) {
        String parentPrimaryKey = metadataTools.getPrimaryKeyName(metaClass);
        CustomCondition customCondition = getParentEntitiesCondition(parentIds, parentPrimaryKey, datasource, filterComponentName);

        String parentEntityAlias = RandomStringUtils.randomAlphabetic(6);
        String entityAlias = RandomStringUtils.randomAlphabetic(6);
        String select = String.format("select %s.%s from %s %s ", entityAlias, relatedPrimaryKey, metaClass, parentEntityAlias);

        String joinWhere = String.format("join %s.%s %s where %s.%s in :%s", parentEntityAlias, metaProperty.getName(),
                entityAlias, parentEntityAlias, parentPrimaryKey, paramName);

        String whereString = String.format("{E}.%s in (%s)", relatedPrimaryKey, select + joinWhere);
        customCondition.setWhere(whereString);

        return customCondition;
    }

    @Nullable
    protected AbstractCondition getManyToOneCondition(List<Object> parentIds, CollectionDatasource datasource,
                                                      String filterComponentName, String relatedPrimaryKey) {
        String parentPrimaryKey = metadataTools.getPrimaryKeyName(metaClass);
        CustomCondition customCondition = getParentEntitiesCondition(parentIds, parentPrimaryKey, datasource, filterComponentName);

        String entityAlias = RandomStringUtils.randomAlphabetic(6);
        String subQuery = String.format("select %s.%s.%s from %s %s where %s.%s in :%s", entityAlias,
                metaProperty.getName(), relatedPrimaryKey, metaClass.getName(), entityAlias, entityAlias, parentPrimaryKey, paramName);

        String whereString = String.format("{E}.%s in (%s)", relatedPrimaryKey, subQuery);
        customCondition.setWhere(whereString);

        return customCondition;
    }

    protected Param getParentEntitiesParam(List<Object> parentIds, String parentPrimaryKey, CollectionDatasource datasource,
                                           Class parentPrimaryKeyClass, String paramName) {
        Param param = Param.Builder.getInstance().setName(paramName)
                .setJavaClass(parentPrimaryKeyClass)
                .setEntityWhere(StringUtils.EMPTY)
                .setEntityView(StringUtils.EMPTY)
                .setDataSource(datasource)
                .setProperty(metaClass.getPropertyNN(parentPrimaryKey))
                .setInExpr(true)
                .setRequired(true)
                .build();
        param.setValue(parentIds);
        return param;
    }

    protected CustomCondition getParentEntitiesCondition(List<Object> parentIds, String parentPrimaryKey, CollectionDatasource datasource,
                                                         String filterComponentName) {
        String conditionName = String.format("related_%s", RandomStringUtils.randomAlphabetic(6));
        CustomCondition condition = new CustomCondition(getConditionXmlElement(conditionName), AppConfig.getMessagesPack(),
                filterComponentName, datasource);

        Class<?> parentPrimaryKeyClass = metaClass.getPropertyNN(parentPrimaryKey).getJavaType();
        condition.setJavaClass(parentPrimaryKeyClass);
        condition.setHidden(true);
        condition.setInExpr(true);

        int randInt = new Random().nextInt((99999 - 11111) + 1) + 11111;
        paramName = String.format("component$%s.%s%s", filterComponentName, conditionName, randInt);

        condition.setParam(getParentEntitiesParam(parentIds, parentPrimaryKey, datasource, parentPrimaryKeyClass, paramName));
        return condition;
    }

    protected Element getConditionXmlElement(String conditionName) {
        Element conditionElement = DocumentHelper.createDocument().addElement("c");
        conditionElement.addAttribute("name", conditionName);
        conditionElement.addAttribute("width", "1");
        conditionElement.addAttribute("type", "CUSTOM");
        String conditionCaption = String.format("%s ids", metaClass.getName().split("\\$")[1]);
        // condition will be hidden so we don't have to load localized condition caption
        conditionElement.addAttribute("locCaption", conditionCaption);
        return conditionElement;
    }

    protected PropertyCondition getNonOptimizedCondition(MetaClass metaClass, List<Object> ids, Filter component, String filterComponentName, String primaryKey) {
        PropertyConditionDescriptor conditionDescriptor = new PropertyConditionDescriptor(primaryKey, primaryKey,
                AppConfig.getMessagesPack(), filterComponentName, component.getDatasource());

        PropertyCondition condition = (PropertyCondition) conditionDescriptor.createCondition();
        condition.setInExpr(true);
        condition.setHidden(true);
        condition.setOperator(Op.IN);

        ConditionParamBuilder paramBuilder = AppBeans.get(ConditionParamBuilder.class);

        @SuppressWarnings("ConstantConditions")
        Class idType = metaClass.getProperty(primaryKey).getJavaType();

        Param param = Param.Builder.getInstance().setName(paramBuilder.createParamName(condition))
                .setJavaClass(idType)
                .setEntityWhere("")
                .setEntityView("")
                .setDataSource(component.getDatasource())
                .setProperty(metaClass.getProperty(primaryKey))
                .setInExpr(true)
                .setRequired(true)
                .build();
        param.setValue(ids);

        condition.setParam(param);
        return condition;
    }

    protected List<Object> getRelatedIds(Set<Entity> selectedParents) {
        if (selectedParents.isEmpty()) {
            return Collections.emptyList();
        } else {
            List<Object> parentIds = new ArrayList<>();
            for (Entity e : selectedParents) {
                parentIds.add(e.getId());
            }

            //noinspection UnnecessaryLocalVariable
            List<Object> relatedIds = relatedEntitiesService.getRelatedIds(parentIds, metaClass.getName(), metaProperty.getName());
            return relatedIds;
        }
    }

    protected List<Object> getParentIds(Set<Entity> selectedParents) {
        if (selectedParents.isEmpty()) {
            return Collections.emptyList();
        } else {
            return selectedParents.stream().map(Entity::getId).collect(Collectors.toList());
        }
    }

    @Override
    public BeforeActionPerformedHandler getBeforeActionPerformedHandler() {
        return beforeActionPerformedHandler;
    }

    @Override
    public void setBeforeActionPerformedHandler(BeforeActionPerformedHandler handler) {
        beforeActionPerformedHandler = handler;
    }
}