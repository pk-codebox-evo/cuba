// $ANTLR 3.5.2 JPA2.g 2017-03-03 18:40:01

package com.haulmont.cuba.core.sys.jpql.antlr2;

import com.haulmont.cuba.core.sys.jpql.tree.QueryNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemNode;
import com.haulmont.cuba.core.sys.jpql.tree.PathNode;
import com.haulmont.cuba.core.sys.jpql.tree.FromNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectionSourceNode;
import com.haulmont.cuba.core.sys.jpql.tree.IdentificationVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.JoinVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.CollectionMemberNode;
import com.haulmont.cuba.core.sys.jpql.tree.WhereNode;
import com.haulmont.cuba.core.sys.jpql.tree.SimpleConditionNode;
import com.haulmont.cuba.core.sys.jpql.tree.ParameterNode;
import com.haulmont.cuba.core.sys.jpql.tree.GroupByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByFieldNode;
import com.haulmont.cuba.core.sys.jpql.tree.AggregateExpressionNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemsNode;
import com.haulmont.cuba.core.sys.jpql.tree.UpdateSetNode;
import com.haulmont.cuba.core.sys.jpql.tree.EnumConditionNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JPA2Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASC", "AVG", "BY", "COMMENT", 
		"COUNT", "DESC", "DISTINCT", "ESCAPE_CHARACTER", "FETCH", "GROUP", "HAVING", 
		"IN", "INNER", "INT_NUMERAL", "JOIN", "LEFT", "LINE_COMMENT", "LOWER", 
		"LPAREN", "MAX", "MIN", "NAMED_PARAMETER", "NOT", "OR", "ORDER", "OUTER", 
		"RPAREN", "RUSSIAN_SYMBOLS", "SET", "STRING_LITERAL", "SUM", "TRIM_CHARACTER", 
		"T_AGGREGATE_EXPR", "T_COLLECTION_MEMBER", "T_CONDITION", "T_ENUM_MACROS", 
		"T_GROUP_BY", "T_ID_VAR", "T_JOIN_VAR", "T_ORDER_BY", "T_ORDER_BY_FIELD", 
		"T_PARAMETER", "T_QUERY", "T_SELECTED_ENTITY", "T_SELECTED_FIELD", "T_SELECTED_ITEM", 
		"T_SELECTED_ITEMS", "T_SIMPLE_CONDITION", "T_SOURCE", "T_SOURCES", "WORD", 
		"WS", "'${'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0x'", "'<'", 
		"'<='", "'<>'", "'='", "'>'", "'>='", "'?'", "'@BETWEEN'", "'@DATEAFTER'", 
		"'@DATEBEFORE'", "'@DATEEQUALS'", "'@ENUM'", "'@TODAY'", "'ABS('", "'ALL'", 
		"'ANY'", "'AS'", "'BETWEEN'", "'BOTH'", "'CASE'", "'CAST('", "'COALESCE('", 
		"'CONCAT('", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
		"'DAY'", "'DELETE'", "'ELSE'", "'EMPTY'", "'END'", "'ENTRY('", "'EPOCH'", 
		"'ESCAPE'", "'EXISTS'", "'EXTRACT('", "'FROM'", "'FUNCTION('", "'HOUR'", 
		"'INDEX('", "'IS'", "'KEY('", "'LEADING'", "'LENGTH('", "'LIKE'", "'LOCATE('", 
		"'MEMBER'", "'MINUTE'", "'MOD('", "'MONTH'", "'NEW'", "'NOW'", "'NULL'", 
		"'NULLIF('", "'OBJECT'", "'OF'", "'ON'", "'QUARTER'", "'REGEXP'", "'SECOND'", 
		"'SELECT'", "'SIZE('", "'SOME'", "'SQRT('", "'SUBSTRING('", "'THEN'", 
		"'TRAILING'", "'TREAT('", "'TRIM('", "'TYPE('", "'UPDATE'", "'UPPER('", 
		"'VALUE('", "'WEEK'", "'WHEN'", "'WHERE'", "'YEAR'", "'false'", "'true'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int AND=4;
	public static final int ASC=5;
	public static final int AVG=6;
	public static final int BY=7;
	public static final int COMMENT=8;
	public static final int COUNT=9;
	public static final int DESC=10;
	public static final int DISTINCT=11;
	public static final int ESCAPE_CHARACTER=12;
	public static final int FETCH=13;
	public static final int GROUP=14;
	public static final int HAVING=15;
	public static final int IN=16;
	public static final int INNER=17;
	public static final int INT_NUMERAL=18;
	public static final int JOIN=19;
	public static final int LEFT=20;
	public static final int LINE_COMMENT=21;
	public static final int LOWER=22;
	public static final int LPAREN=23;
	public static final int MAX=24;
	public static final int MIN=25;
	public static final int NAMED_PARAMETER=26;
	public static final int NOT=27;
	public static final int OR=28;
	public static final int ORDER=29;
	public static final int OUTER=30;
	public static final int RPAREN=31;
	public static final int RUSSIAN_SYMBOLS=32;
	public static final int SET=33;
	public static final int STRING_LITERAL=34;
	public static final int SUM=35;
	public static final int TRIM_CHARACTER=36;
	public static final int T_AGGREGATE_EXPR=37;
	public static final int T_COLLECTION_MEMBER=38;
	public static final int T_CONDITION=39;
	public static final int T_ENUM_MACROS=40;
	public static final int T_GROUP_BY=41;
	public static final int T_ID_VAR=42;
	public static final int T_JOIN_VAR=43;
	public static final int T_ORDER_BY=44;
	public static final int T_ORDER_BY_FIELD=45;
	public static final int T_PARAMETER=46;
	public static final int T_QUERY=47;
	public static final int T_SELECTED_ENTITY=48;
	public static final int T_SELECTED_FIELD=49;
	public static final int T_SELECTED_ITEM=50;
	public static final int T_SELECTED_ITEMS=51;
	public static final int T_SIMPLE_CONDITION=52;
	public static final int T_SOURCE=53;
	public static final int T_SOURCES=54;
	public static final int WORD=55;
	public static final int WS=56;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JPA2Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JPA2Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JPA2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "JPA2.g"; }


	public static class ql_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ql_statement"
	// JPA2.g:81:1: ql_statement : ( select_statement | update_statement | delete_statement );
	public final JPA2Parser.ql_statement_return ql_statement() throws RecognitionException {
		JPA2Parser.ql_statement_return retval = new JPA2Parser.ql_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope select_statement1 =null;
		ParserRuleReturnScope update_statement2 =null;
		ParserRuleReturnScope delete_statement3 =null;


		try {
			// JPA2.g:82:5: ( select_statement | update_statement | delete_statement )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 125:
				{
				alt1=1;
				}
				break;
			case 135:
				{
				alt1=2;
				}
				break;
			case 92:
				{
				alt1=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// JPA2.g:82:7: select_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_select_statement_in_ql_statement445);
					select_statement1=select_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement1.getTree());

					}
					break;
				case 2 :
					// JPA2.g:82:26: update_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_update_statement_in_ql_statement449);
					update_statement2=update_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement2.getTree());

					}
					break;
				case 3 :
					// JPA2.g:82:45: delete_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_delete_statement_in_ql_statement453);
					delete_statement3=delete_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement3.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ql_statement"


	public static class select_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_statement"
	// JPA2.g:84:1: select_statement : sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ) ;
	public final JPA2Parser.select_statement_return select_statement() throws RecognitionException {
		JPA2Parser.select_statement_return retval = new JPA2Parser.select_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token sl=null;
		ParserRuleReturnScope select_clause4 =null;
		ParserRuleReturnScope from_clause5 =null;
		ParserRuleReturnScope where_clause6 =null;
		ParserRuleReturnScope groupby_clause7 =null;
		ParserRuleReturnScope having_clause8 =null;
		ParserRuleReturnScope orderby_clause9 =null;

		Object sl_tree=null;
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_select_clause=new RewriteRuleSubtreeStream(adaptor,"rule select_clause");
		RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");
		RewriteRuleSubtreeStream stream_orderby_clause=new RewriteRuleSubtreeStream(adaptor,"rule orderby_clause");

		try {
			// JPA2.g:85:6: (sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ) )
			// JPA2.g:85:8: sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )?
			{
			sl=(Token)match(input,125,FOLLOW_125_in_select_statement468); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_125.add(sl);

			pushFollow(FOLLOW_select_clause_in_select_statement470);
			select_clause4=select_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_clause.add(select_clause4.getTree());
			pushFollow(FOLLOW_from_clause_in_select_statement472);
			from_clause5=from_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_from_clause.add(from_clause5.getTree());
			// JPA2.g:85:46: ( where_clause )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==140) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// JPA2.g:85:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_select_statement475);
					where_clause6=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause6.getTree());
					}
					break;

			}

			// JPA2.g:85:62: ( groupby_clause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==GROUP) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// JPA2.g:85:63: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_select_statement480);
					groupby_clause7=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause7.getTree());
					}
					break;

			}

			// JPA2.g:85:80: ( having_clause )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==HAVING) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// JPA2.g:85:81: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_select_statement485);
					having_clause8=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause8.getTree());
					}
					break;

			}

			// JPA2.g:85:97: ( orderby_clause )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ORDER) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// JPA2.g:85:98: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_select_statement490);
					orderby_clause9=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause9.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: orderby_clause, groupby_clause, select_clause, having_clause, from_clause, where_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:6: -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? )
			{
				// JPA2.g:86:9: ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, sl), root_1);
				// JPA2.g:86:35: ( select_clause )?
				if ( stream_select_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_select_clause.nextTree());
				}
				stream_select_clause.reset();

				adaptor.addChild(root_1, stream_from_clause.nextTree());
				// JPA2.g:86:64: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// JPA2.g:86:80: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// JPA2.g:86:98: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// JPA2.g:86:115: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_statement"


	public static class update_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_statement"
	// JPA2.g:88:1: update_statement : up= 'UPDATE' update_clause ( where_clause )? -> ^( T_QUERY[$up] update_clause ( where_clause )? ) ;
	public final JPA2Parser.update_statement_return update_statement() throws RecognitionException {
		JPA2Parser.update_statement_return retval = new JPA2Parser.update_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token up=null;
		ParserRuleReturnScope update_clause10 =null;
		ParserRuleReturnScope where_clause11 =null;

		Object up_tree=null;
		RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_update_clause=new RewriteRuleSubtreeStream(adaptor,"rule update_clause");

		try {
			// JPA2.g:89:5: (up= 'UPDATE' update_clause ( where_clause )? -> ^( T_QUERY[$up] update_clause ( where_clause )? ) )
			// JPA2.g:89:7: up= 'UPDATE' update_clause ( where_clause )?
			{
			up=(Token)match(input,135,FOLLOW_135_in_update_statement548); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_135.add(up);

			pushFollow(FOLLOW_update_clause_in_update_statement550);
			update_clause10=update_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_update_clause.add(update_clause10.getTree());
			// JPA2.g:89:33: ( where_clause )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==140) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// JPA2.g:89:34: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_update_statement553);
					where_clause11=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause11.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: where_clause, update_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:5: -> ^( T_QUERY[$up] update_clause ( where_clause )? )
			{
				// JPA2.g:90:8: ^( T_QUERY[$up] update_clause ( where_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, up), root_1);
				adaptor.addChild(root_1, stream_update_clause.nextTree());
				// JPA2.g:90:48: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_statement"


	public static class delete_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "delete_statement"
	// JPA2.g:91:1: delete_statement : dl= 'DELETE' delete_clause ( where_clause )? -> ^( T_QUERY[$dl] delete_clause ( where_clause )? ) ;
	public final JPA2Parser.delete_statement_return delete_statement() throws RecognitionException {
		JPA2Parser.delete_statement_return retval = new JPA2Parser.delete_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token dl=null;
		ParserRuleReturnScope delete_clause12 =null;
		ParserRuleReturnScope where_clause13 =null;

		Object dl_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_delete_clause=new RewriteRuleSubtreeStream(adaptor,"rule delete_clause");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");

		try {
			// JPA2.g:92:5: (dl= 'DELETE' delete_clause ( where_clause )? -> ^( T_QUERY[$dl] delete_clause ( where_clause )? ) )
			// JPA2.g:92:7: dl= 'DELETE' delete_clause ( where_clause )?
			{
			dl=(Token)match(input,92,FOLLOW_92_in_delete_statement589); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(dl);

			pushFollow(FOLLOW_delete_clause_in_delete_statement591);
			delete_clause12=delete_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_delete_clause.add(delete_clause12.getTree());
			// JPA2.g:92:33: ( where_clause )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==140) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// JPA2.g:92:34: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_delete_statement594);
					where_clause13=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause13.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: delete_clause, where_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 93:5: -> ^( T_QUERY[$dl] delete_clause ( where_clause )? )
			{
				// JPA2.g:93:8: ^( T_QUERY[$dl] delete_clause ( where_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, dl), root_1);
				adaptor.addChild(root_1, stream_delete_clause.nextTree());
				// JPA2.g:93:48: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "delete_statement"


	public static class from_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// JPA2.g:95:1: from_clause : fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )* -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* ) ;
	public final JPA2Parser.from_clause_return from_clause() throws RecognitionException {
		JPA2Parser.from_clause_return retval = new JPA2Parser.from_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fr=null;
		Token char_literal15=null;
		ParserRuleReturnScope identification_variable_declaration14 =null;
		ParserRuleReturnScope identification_variable_declaration_or_collection_member_declaration16 =null;

		Object fr_tree=null;
		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration");
		RewriteRuleSubtreeStream stream_identification_variable_declaration_or_collection_member_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration_or_collection_member_declaration");

		try {
			// JPA2.g:96:6: (fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )* -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* ) )
			// JPA2.g:96:8: fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )*
			{
			fr=(Token)match(input,101,FOLLOW_101_in_from_clause632); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(fr);

			pushFollow(FOLLOW_identification_variable_declaration_in_from_clause634);
			identification_variable_declaration14=identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable_declaration.add(identification_variable_declaration14.getTree());
			// JPA2.g:96:54: ( ',' identification_variable_declaration_or_collection_member_declaration )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==60) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// JPA2.g:96:55: ',' identification_variable_declaration_or_collection_member_declaration
					{
					char_literal15=(Token)match(input,60,FOLLOW_60_in_from_clause637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal15);

					pushFollow(FOLLOW_identification_variable_declaration_or_collection_member_declaration_in_from_clause639);
					identification_variable_declaration_or_collection_member_declaration16=identification_variable_declaration_or_collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable_declaration_or_collection_member_declaration.add(identification_variable_declaration_or_collection_member_declaration16.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: identification_variable_declaration, identification_variable_declaration_or_collection_member_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:6: -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* )
			{
				// JPA2.g:97:9: ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new FromNode(T_SOURCES, fr), root_1);
				adaptor.addChild(root_1, stream_identification_variable_declaration.nextTree());
				// JPA2.g:97:72: ( identification_variable_declaration_or_collection_member_declaration )*
				while ( stream_identification_variable_declaration_or_collection_member_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_identification_variable_declaration_or_collection_member_declaration.nextTree());
				}
				stream_identification_variable_declaration_or_collection_member_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "from_clause"


	public static class identification_variable_declaration_or_collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable_declaration_or_collection_member_declaration"
	// JPA2.g:98:1: identification_variable_declaration_or_collection_member_declaration : ( identification_variable_declaration | collection_member_declaration -> ^( T_SOURCE collection_member_declaration ) );
	public final JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return identification_variable_declaration_or_collection_member_declaration() throws RecognitionException {
		JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return retval = new JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable_declaration17 =null;
		ParserRuleReturnScope collection_member_declaration18 =null;

		RewriteRuleSubtreeStream stream_collection_member_declaration=new RewriteRuleSubtreeStream(adaptor,"rule collection_member_declaration");

		try {
			// JPA2.g:99:6: ( identification_variable_declaration | collection_member_declaration -> ^( T_SOURCE collection_member_declaration ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==WORD) ) {
				alt9=1;
			}
			else if ( (LA9_0==IN) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// JPA2.g:99:8: identification_variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_declaration_in_identification_variable_declaration_or_collection_member_declaration673);
					identification_variable_declaration17=identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable_declaration17.getTree());

					}
					break;
				case 2 :
					// JPA2.g:100:8: collection_member_declaration
					{
					pushFollow(FOLLOW_collection_member_declaration_in_identification_variable_declaration_or_collection_member_declaration682);
					collection_member_declaration18=collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_collection_member_declaration.add(collection_member_declaration18.getTree());
					// AST REWRITE
					// elements: collection_member_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:38: -> ^( T_SOURCE collection_member_declaration )
					{
						// JPA2.g:100:41: ^( T_SOURCE collection_member_declaration )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_1);
						adaptor.addChild(root_1, stream_collection_member_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable_declaration_or_collection_member_declaration"


	public static class identification_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable_declaration"
	// JPA2.g:102:1: identification_variable_declaration : range_variable_declaration ( joined_clause )* -> ^( T_SOURCE range_variable_declaration ( joined_clause )* ) ;
	public final JPA2Parser.identification_variable_declaration_return identification_variable_declaration() throws RecognitionException {
		JPA2Parser.identification_variable_declaration_return retval = new JPA2Parser.identification_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope range_variable_declaration19 =null;
		ParserRuleReturnScope joined_clause20 =null;

		RewriteRuleSubtreeStream stream_range_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule range_variable_declaration");
		RewriteRuleSubtreeStream stream_joined_clause=new RewriteRuleSubtreeStream(adaptor,"rule joined_clause");

		try {
			// JPA2.g:103:6: ( range_variable_declaration ( joined_clause )* -> ^( T_SOURCE range_variable_declaration ( joined_clause )* ) )
			// JPA2.g:103:8: range_variable_declaration ( joined_clause )*
			{
			pushFollow(FOLLOW_range_variable_declaration_in_identification_variable_declaration706);
			range_variable_declaration19=range_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_range_variable_declaration.add(range_variable_declaration19.getTree());
			// JPA2.g:103:35: ( joined_clause )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==INNER||(LA10_0 >= JOIN && LA10_0 <= LEFT)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// JPA2.g:103:35: joined_clause
					{
					pushFollow(FOLLOW_joined_clause_in_identification_variable_declaration708);
					joined_clause20=joined_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_joined_clause.add(joined_clause20.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// AST REWRITE
			// elements: range_variable_declaration, joined_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 104:6: -> ^( T_SOURCE range_variable_declaration ( joined_clause )* )
			{
				// JPA2.g:104:9: ^( T_SOURCE range_variable_declaration ( joined_clause )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_1);
				adaptor.addChild(root_1, stream_range_variable_declaration.nextTree());
				// JPA2.g:104:68: ( joined_clause )*
				while ( stream_joined_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_joined_clause.nextTree());
				}
				stream_joined_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable_declaration"


	public static class join_section_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_section"
	// JPA2.g:105:1: join_section : ( joined_clause )* ;
	public final JPA2Parser.join_section_return join_section() throws RecognitionException {
		JPA2Parser.join_section_return retval = new JPA2Parser.join_section_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope joined_clause21 =null;


		try {
			// JPA2.g:105:14: ( ( joined_clause )* )
			// JPA2.g:106:5: ( joined_clause )*
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:106:5: ( joined_clause )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INNER||(LA11_0 >= JOIN && LA11_0 <= LEFT)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// JPA2.g:106:5: joined_clause
					{
					pushFollow(FOLLOW_joined_clause_in_join_section739);
					joined_clause21=joined_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_clause21.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join_section"


	public static class joined_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "joined_clause"
	// JPA2.g:107:1: joined_clause : ( join | fetch_join );
	public final JPA2Parser.joined_clause_return joined_clause() throws RecognitionException {
		JPA2Parser.joined_clause_return retval = new JPA2Parser.joined_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope join22 =null;
		ParserRuleReturnScope fetch_join23 =null;


		try {
			// JPA2.g:107:15: ( join | fetch_join )
			int alt12=2;
			switch ( input.LA(1) ) {
			case LEFT:
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1==OUTER) ) {
					int LA12_4 = input.LA(3);
					if ( (LA12_4==JOIN) ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3==WORD||LA12_3==132) ) {
							alt12=1;
						}
						else if ( (LA12_3==FETCH) ) {
							alt12=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA12_1==JOIN) ) {
					int LA12_3 = input.LA(3);
					if ( (LA12_3==WORD||LA12_3==132) ) {
						alt12=1;
					}
					else if ( (LA12_3==FETCH) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INNER:
				{
				int LA12_2 = input.LA(2);
				if ( (LA12_2==JOIN) ) {
					int LA12_3 = input.LA(3);
					if ( (LA12_3==WORD||LA12_3==132) ) {
						alt12=1;
					}
					else if ( (LA12_3==FETCH) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOIN:
				{
				int LA12_3 = input.LA(2);
				if ( (LA12_3==WORD||LA12_3==132) ) {
					alt12=1;
				}
				else if ( (LA12_3==FETCH) ) {
					alt12=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// JPA2.g:107:17: join
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_join_in_joined_clause747);
					join22=join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join22.getTree());

					}
					break;
				case 2 :
					// JPA2.g:107:24: fetch_join
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fetch_join_in_joined_clause751);
					fetch_join23=fetch_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fetch_join23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joined_clause"


	public static class range_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range_variable_declaration"
	// JPA2.g:108:1: range_variable_declaration : entity_name ( 'AS' )? identification_variable -> ^( T_ID_VAR[$identification_variable.text] entity_name ) ;
	public final JPA2Parser.range_variable_declaration_return range_variable_declaration() throws RecognitionException {
		JPA2Parser.range_variable_declaration_return retval = new JPA2Parser.range_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		ParserRuleReturnScope entity_name24 =null;
		ParserRuleReturnScope identification_variable26 =null;

		Object string_literal25_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_entity_name=new RewriteRuleSubtreeStream(adaptor,"rule entity_name");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:109:6: ( entity_name ( 'AS' )? identification_variable -> ^( T_ID_VAR[$identification_variable.text] entity_name ) )
			// JPA2.g:109:8: entity_name ( 'AS' )? identification_variable
			{
			pushFollow(FOLLOW_entity_name_in_range_variable_declaration763);
			entity_name24=entity_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_entity_name.add(entity_name24.getTree());
			// JPA2.g:109:20: ( 'AS' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==81) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// JPA2.g:109:21: 'AS'
					{
					string_literal25=(Token)match(input,81,FOLLOW_81_in_range_variable_declaration766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal25);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_range_variable_declaration770);
			identification_variable26=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable26.getTree());
			// AST REWRITE
			// elements: entity_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 110:6: -> ^( T_ID_VAR[$identification_variable.text] entity_name )
			{
				// JPA2.g:110:9: ^( T_ID_VAR[$identification_variable.text] entity_name )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new IdentificationVariableNode(T_ID_VAR, (identification_variable26!=null?input.toString(identification_variable26.start,identification_variable26.stop):null)), root_1);
				adaptor.addChild(root_1, stream_entity_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_variable_declaration"


	public static class join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join"
	// JPA2.g:111:1: join : join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )? -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text] join_association_path_expression ( conditional_expression )? ) ;
	public final JPA2Parser.join_return join() throws RecognitionException {
		JPA2Parser.join_return retval = new JPA2Parser.join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal29=null;
		Token string_literal31=null;
		ParserRuleReturnScope join_spec27 =null;
		ParserRuleReturnScope join_association_path_expression28 =null;
		ParserRuleReturnScope identification_variable30 =null;
		ParserRuleReturnScope conditional_expression32 =null;

		Object string_literal29_tree=null;
		Object string_literal31_tree=null;
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");
		RewriteRuleSubtreeStream stream_join_association_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule join_association_path_expression");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");
		RewriteRuleSubtreeStream stream_join_spec=new RewriteRuleSubtreeStream(adaptor,"rule join_spec");

		try {
			// JPA2.g:112:6: ( join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )? -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text] join_association_path_expression ( conditional_expression )? ) )
			// JPA2.g:112:8: join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )?
			{
			pushFollow(FOLLOW_join_spec_in_join799);
			join_spec27=join_spec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_spec.add(join_spec27.getTree());
			pushFollow(FOLLOW_join_association_path_expression_in_join801);
			join_association_path_expression28=join_association_path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_association_path_expression.add(join_association_path_expression28.getTree());
			// JPA2.g:112:51: ( 'AS' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==81) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// JPA2.g:112:52: 'AS'
					{
					string_literal29=(Token)match(input,81,FOLLOW_81_in_join804); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal29);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_join808);
			identification_variable30=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable30.getTree());
			// JPA2.g:112:83: ( 'ON' conditional_expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==121) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// JPA2.g:112:84: 'ON' conditional_expression
					{
					string_literal31=(Token)match(input,121,FOLLOW_121_in_join811); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_121.add(string_literal31);

					pushFollow(FOLLOW_conditional_expression_in_join813);
					conditional_expression32=conditional_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression32.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: conditional_expression, join_association_path_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 113:6: -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text] join_association_path_expression ( conditional_expression )? )
			{
				// JPA2.g:113:9: ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text] join_association_path_expression ( conditional_expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new JoinVariableNode(T_JOIN_VAR, (join_spec27!=null?input.toString(join_spec27.start,join_spec27.stop):null), (identification_variable30!=null?input.toString(identification_variable30.start,identification_variable30.stop):null)), root_1);
				adaptor.addChild(root_1, stream_join_association_path_expression.nextTree());
				// JPA2.g:113:121: ( conditional_expression )?
				if ( stream_conditional_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_conditional_expression.nextTree());
				}
				stream_conditional_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join"


	public static class fetch_join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fetch_join"
	// JPA2.g:114:1: fetch_join : join_spec 'FETCH' join_association_path_expression ;
	public final JPA2Parser.fetch_join_return fetch_join() throws RecognitionException {
		JPA2Parser.fetch_join_return retval = new JPA2Parser.fetch_join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		ParserRuleReturnScope join_spec33 =null;
		ParserRuleReturnScope join_association_path_expression35 =null;

		Object string_literal34_tree=null;

		try {
			// JPA2.g:115:6: ( join_spec 'FETCH' join_association_path_expression )
			// JPA2.g:115:8: join_spec 'FETCH' join_association_path_expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_join_spec_in_fetch_join847);
			join_spec33=join_spec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, join_spec33.getTree());

			string_literal34=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_join849); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal34_tree = (Object)adaptor.create(string_literal34);
			adaptor.addChild(root_0, string_literal34_tree);
			}

			pushFollow(FOLLOW_join_association_path_expression_in_fetch_join851);
			join_association_path_expression35=join_association_path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, join_association_path_expression35.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fetch_join"


	public static class join_spec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_spec"
	// JPA2.g:116:1: join_spec : ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN' ;
	public final JPA2Parser.join_spec_return join_spec() throws RecognitionException {
		JPA2Parser.join_spec_return retval = new JPA2Parser.join_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal36=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal39=null;

		Object string_literal36_tree=null;
		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;

		try {
			// JPA2.g:117:6: ( ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN' )
			// JPA2.g:117:8: ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN'
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:117:8: ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LEFT) ) {
				alt17=1;
			}
			else if ( (LA17_0==INNER) ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// JPA2.g:117:9: ( 'LEFT' ) ( 'OUTER' )?
					{
					// JPA2.g:117:9: ( 'LEFT' )
					// JPA2.g:117:10: 'LEFT'
					{
					string_literal36=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_spec865); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal36_tree = (Object)adaptor.create(string_literal36);
					adaptor.addChild(root_0, string_literal36_tree);
					}

					}

					// JPA2.g:117:18: ( 'OUTER' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==OUTER) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// JPA2.g:117:19: 'OUTER'
							{
							string_literal37=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_spec869); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal37_tree = (Object)adaptor.create(string_literal37);
							adaptor.addChild(root_0, string_literal37_tree);
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// JPA2.g:117:31: 'INNER'
					{
					string_literal38=(Token)match(input,INNER,FOLLOW_INNER_in_join_spec875); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal38_tree = (Object)adaptor.create(string_literal38);
					adaptor.addChild(root_0, string_literal38_tree);
					}

					}
					break;

			}

			string_literal39=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_spec880); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			adaptor.addChild(root_0, string_literal39_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join_spec"


	public static class join_association_path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_association_path_expression"
	// JPA2.g:120:1: join_association_path_expression : ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')' -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | entity_name );
	public final JPA2Parser.join_association_path_expression_return join_association_path_expression() throws RecognitionException {
		JPA2Parser.join_association_path_expression_return retval = new JPA2Parser.join_association_path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal41=null;
		Token char_literal43=null;
		Token string_literal45=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token string_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope identification_variable40 =null;
		ParserRuleReturnScope field42 =null;
		ParserRuleReturnScope field44 =null;
		ParserRuleReturnScope identification_variable46 =null;
		ParserRuleReturnScope field48 =null;
		ParserRuleReturnScope field50 =null;
		ParserRuleReturnScope subtype52 =null;
		ParserRuleReturnScope entity_name54 =null;

		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object string_literal45_tree=null;
		Object char_literal47_tree=null;
		Object char_literal49_tree=null;
		Object string_literal51_tree=null;
		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:121:6: ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')' -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | entity_name )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==WORD) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==62) ) {
					alt22=1;
				}
				else if ( (LA22_1==EOF||(LA22_1 >= GROUP && LA22_1 <= HAVING)||LA22_1==INNER||(LA22_1 >= JOIN && LA22_1 <= LEFT)||LA22_1==ORDER||LA22_1==RPAREN||LA22_1==SET||LA22_1==WORD||LA22_1==60||LA22_1==81||LA22_1==105||LA22_1==140) ) {
					alt22=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA22_0==132) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// JPA2.g:121:8: identification_variable '.' ( field '.' )* ( field )?
					{
					pushFollow(FOLLOW_identification_variable_in_join_association_path_expression894);
					identification_variable40=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable40.getTree());
					char_literal41=(Token)match(input,62,FOLLOW_62_in_join_association_path_expression896); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal41);

					// JPA2.g:121:36: ( field '.' )*
					loop18:
					while (true) {
						int alt18=2;
						switch ( input.LA(1) ) {
						case WORD:
							{
							int LA18_1 = input.LA(2);
							if ( (LA18_1==62) ) {
								alt18=1;
							}

							}
							break;
						case 125:
							{
							int LA18_2 = input.LA(2);
							if ( (LA18_2==62) ) {
								alt18=1;
							}

							}
							break;
						case 101:
							{
							int LA18_3 = input.LA(2);
							if ( (LA18_3==62) ) {
								alt18=1;
							}

							}
							break;
						case GROUP:
							{
							int LA18_4 = input.LA(2);
							if ( (LA18_4==62) ) {
								alt18=1;
							}

							}
							break;
						case ORDER:
							{
							int LA18_5 = input.LA(2);
							if ( (LA18_5==62) ) {
								alt18=1;
							}

							}
							break;
						case MAX:
							{
							int LA18_6 = input.LA(2);
							if ( (LA18_6==62) ) {
								alt18=1;
							}

							}
							break;
						case MIN:
							{
							int LA18_7 = input.LA(2);
							if ( (LA18_7==62) ) {
								alt18=1;
							}

							}
							break;
						case SUM:
							{
							int LA18_8 = input.LA(2);
							if ( (LA18_8==62) ) {
								alt18=1;
							}

							}
							break;
						case AVG:
							{
							int LA18_9 = input.LA(2);
							if ( (LA18_9==62) ) {
								alt18=1;
							}

							}
							break;
						case COUNT:
							{
							int LA18_10 = input.LA(2);
							if ( (LA18_10==62) ) {
								alt18=1;
							}

							}
							break;
						case 81:
							{
							int LA18_11 = input.LA(2);
							if ( (LA18_11==62) ) {
								alt18=1;
							}

							}
							break;
						case 111:
							{
							int LA18_12 = input.LA(2);
							if ( (LA18_12==62) ) {
								alt18=1;
							}

							}
							break;
						case 91:
						case 97:
						case 103:
						case 112:
						case 114:
						case 122:
						case 124:
						case 138:
						case 141:
							{
							int LA18_13 = input.LA(2);
							if ( (LA18_13==62) ) {
								alt18=1;
							}

							}
							break;
						}
						switch (alt18) {
						case 1 :
							// JPA2.g:121:37: field '.'
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression899);
							field42=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field42.getTree());
							char_literal43=(Token)match(input,62,FOLLOW_62_in_join_association_path_expression900); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_62.add(char_literal43);

							}
							break;

						default :
							break loop18;
						}
					}

					// JPA2.g:121:48: ( field )?
					int alt19=2;
					switch ( input.LA(1) ) {
						case WORD:
							{
							int LA19_1 = input.LA(2);
							if ( (synpred21_JPA2()) ) {
								alt19=1;
							}
							}
							break;
						case AVG:
						case COUNT:
						case MAX:
						case MIN:
						case SUM:
						case 91:
						case 97:
						case 101:
						case 103:
						case 111:
						case 112:
						case 114:
						case 122:
						case 124:
						case 125:
						case 138:
						case 141:
							{
							alt19=1;
							}
							break;
						case GROUP:
							{
							int LA19_3 = input.LA(2);
							if ( (LA19_3==EOF||(LA19_3 >= GROUP && LA19_3 <= HAVING)||LA19_3==INNER||(LA19_3 >= JOIN && LA19_3 <= LEFT)||LA19_3==ORDER||LA19_3==RPAREN||LA19_3==SET||LA19_3==WORD||LA19_3==60||LA19_3==81||LA19_3==105||LA19_3==140) ) {
								alt19=1;
							}
							}
							break;
						case ORDER:
							{
							int LA19_4 = input.LA(2);
							if ( (LA19_4==EOF||(LA19_4 >= GROUP && LA19_4 <= HAVING)||LA19_4==INNER||(LA19_4 >= JOIN && LA19_4 <= LEFT)||LA19_4==ORDER||LA19_4==RPAREN||LA19_4==SET||LA19_4==WORD||LA19_4==60||LA19_4==81||LA19_4==105||LA19_4==140) ) {
								alt19=1;
							}
							}
							break;
						case 81:
							{
							int LA19_5 = input.LA(2);
							if ( (synpred21_JPA2()) ) {
								alt19=1;
							}
							}
							break;
					}
					switch (alt19) {
						case 1 :
							// JPA2.g:121:48: field
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression904);
							field44=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field44.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: field
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:10: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
					{
						// JPA2.g:122:13: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable40!=null?input.toString(identification_variable40.start,identification_variable40.stop):null)), root_1);
						// JPA2.g:122:73: ( field )*
						while ( stream_field.hasNext() ) {
							adaptor.addChild(root_1, stream_field.nextTree());
						}
						stream_field.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:123:9: 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')'
					{
					string_literal45=(Token)match(input,132,FOLLOW_132_in_join_association_path_expression939); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_132.add(string_literal45);

					pushFollow(FOLLOW_identification_variable_in_join_association_path_expression941);
					identification_variable46=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable46.getTree());
					char_literal47=(Token)match(input,62,FOLLOW_62_in_join_association_path_expression943); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal47);

					// JPA2.g:123:46: ( field '.' )*
					loop20:
					while (true) {
						int alt20=2;
						switch ( input.LA(1) ) {
						case WORD:
							{
							int LA20_1 = input.LA(2);
							if ( (LA20_1==62) ) {
								alt20=1;
							}

							}
							break;
						case 125:
							{
							int LA20_2 = input.LA(2);
							if ( (LA20_2==62) ) {
								alt20=1;
							}

							}
							break;
						case 101:
							{
							int LA20_3 = input.LA(2);
							if ( (LA20_3==62) ) {
								alt20=1;
							}

							}
							break;
						case GROUP:
							{
							int LA20_4 = input.LA(2);
							if ( (LA20_4==62) ) {
								alt20=1;
							}

							}
							break;
						case ORDER:
							{
							int LA20_5 = input.LA(2);
							if ( (LA20_5==62) ) {
								alt20=1;
							}

							}
							break;
						case MAX:
							{
							int LA20_6 = input.LA(2);
							if ( (LA20_6==62) ) {
								alt20=1;
							}

							}
							break;
						case MIN:
							{
							int LA20_7 = input.LA(2);
							if ( (LA20_7==62) ) {
								alt20=1;
							}

							}
							break;
						case SUM:
							{
							int LA20_8 = input.LA(2);
							if ( (LA20_8==62) ) {
								alt20=1;
							}

							}
							break;
						case AVG:
							{
							int LA20_9 = input.LA(2);
							if ( (LA20_9==62) ) {
								alt20=1;
							}

							}
							break;
						case COUNT:
							{
							int LA20_10 = input.LA(2);
							if ( (LA20_10==62) ) {
								alt20=1;
							}

							}
							break;
						case 81:
							{
							int LA20_11 = input.LA(2);
							if ( (LA20_11==62) ) {
								alt20=1;
							}

							}
							break;
						case 111:
							{
							int LA20_12 = input.LA(2);
							if ( (LA20_12==62) ) {
								alt20=1;
							}

							}
							break;
						case 91:
						case 97:
						case 103:
						case 112:
						case 114:
						case 122:
						case 124:
						case 138:
						case 141:
							{
							int LA20_13 = input.LA(2);
							if ( (LA20_13==62) ) {
								alt20=1;
							}

							}
							break;
						}
						switch (alt20) {
						case 1 :
							// JPA2.g:123:47: field '.'
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression946);
							field48=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field48.getTree());
							char_literal49=(Token)match(input,62,FOLLOW_62_in_join_association_path_expression947); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_62.add(char_literal49);

							}
							break;

						default :
							break loop20;
						}
					}

					// JPA2.g:123:58: ( field )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==AVG||LA21_0==COUNT||LA21_0==GROUP||(LA21_0 >= MAX && LA21_0 <= MIN)||LA21_0==ORDER||LA21_0==SUM||LA21_0==WORD||LA21_0==91||LA21_0==97||LA21_0==101||LA21_0==103||(LA21_0 >= 111 && LA21_0 <= 112)||LA21_0==114||LA21_0==122||(LA21_0 >= 124 && LA21_0 <= 125)||LA21_0==138||LA21_0==141) ) {
						alt21=1;
					}
					else if ( (LA21_0==81) ) {
						int LA21_2 = input.LA(2);
						if ( (LA21_2==81) ) {
							alt21=1;
						}
					}
					switch (alt21) {
						case 1 :
							// JPA2.g:123:58: field
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression951);
							field50=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field50.getTree());
							}
							break;

					}

					string_literal51=(Token)match(input,81,FOLLOW_81_in_join_association_path_expression954); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal51);

					pushFollow(FOLLOW_subtype_in_join_association_path_expression956);
					subtype52=subtype();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_subtype.add(subtype52.getTree());
					char_literal53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_association_path_expression958); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal53);

					// AST REWRITE
					// elements: field
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:10: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
					{
						// JPA2.g:124:13: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable46!=null?input.toString(identification_variable46.start,identification_variable46.stop):null)), root_1);
						// JPA2.g:124:73: ( field )*
						while ( stream_field.hasNext() ) {
							adaptor.addChild(root_1, stream_field.nextTree());
						}
						stream_field.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:125:8: entity_name
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_name_in_join_association_path_expression991);
					entity_name54=entity_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_name54.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join_association_path_expression"


	public static class collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_member_declaration"
	// JPA2.g:128:1: collection_member_declaration : 'IN' '(' path_expression ')' ( 'AS' )? identification_variable -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression ) ;
	public final JPA2Parser.collection_member_declaration_return collection_member_declaration() throws RecognitionException {
		JPA2Parser.collection_member_declaration_return retval = new JPA2Parser.collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token string_literal59=null;
		ParserRuleReturnScope path_expression57 =null;
		ParserRuleReturnScope identification_variable60 =null;

		Object string_literal55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object string_literal59_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");
		RewriteRuleSubtreeStream stream_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule path_expression");

		try {
			// JPA2.g:129:5: ( 'IN' '(' path_expression ')' ( 'AS' )? identification_variable -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression ) )
			// JPA2.g:129:7: 'IN' '(' path_expression ')' ( 'AS' )? identification_variable
			{
			string_literal55=(Token)match(input,IN,FOLLOW_IN_in_collection_member_declaration1004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(string_literal55);

			char_literal56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_member_declaration1005); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(char_literal56);

			pushFollow(FOLLOW_path_expression_in_collection_member_declaration1007);
			path_expression57=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_path_expression.add(path_expression57.getTree());
			char_literal58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_member_declaration1009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(char_literal58);

			// JPA2.g:129:35: ( 'AS' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==81) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// JPA2.g:129:36: 'AS'
					{
					string_literal59=(Token)match(input,81,FOLLOW_81_in_collection_member_declaration1012); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal59);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_collection_member_declaration1016);
			identification_variable60=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable60.getTree());
			// AST REWRITE
			// elements: path_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:5: -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression )
			{
				// JPA2.g:130:8: ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new CollectionMemberNode(T_COLLECTION_MEMBER, (identification_variable60!=null?input.toString(identification_variable60.start,identification_variable60.stop):null)), root_1);
				adaptor.addChild(root_1, stream_path_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_member_declaration"


	public static class qualified_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualified_identification_variable"
	// JPA2.g:132:1: qualified_identification_variable : ( map_field_identification_variable | 'ENTRY(' identification_variable ')' );
	public final JPA2Parser.qualified_identification_variable_return qualified_identification_variable() throws RecognitionException {
		JPA2Parser.qualified_identification_variable_return retval = new JPA2Parser.qualified_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope map_field_identification_variable61 =null;
		ParserRuleReturnScope identification_variable63 =null;

		Object string_literal62_tree=null;
		Object char_literal64_tree=null;

		try {
			// JPA2.g:133:5: ( map_field_identification_variable | 'ENTRY(' identification_variable ')' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==106||LA24_0==137) ) {
				alt24=1;
			}
			else if ( (LA24_0==96) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// JPA2.g:133:7: map_field_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_map_field_identification_variable_in_qualified_identification_variable1045);
					map_field_identification_variable61=map_field_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, map_field_identification_variable61.getTree());

					}
					break;
				case 2 :
					// JPA2.g:134:7: 'ENTRY(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal62=(Token)match(input,96,FOLLOW_96_in_qualified_identification_variable1053); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal62_tree = (Object)adaptor.create(string_literal62);
					adaptor.addChild(root_0, string_literal62_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_qualified_identification_variable1054);
					identification_variable63=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable63.getTree());

					char_literal64=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_qualified_identification_variable1055); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal64_tree = (Object)adaptor.create(char_literal64);
					adaptor.addChild(root_0, char_literal64_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualified_identification_variable"


	public static class map_field_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "map_field_identification_variable"
	// JPA2.g:135:1: map_field_identification_variable : ( 'KEY(' identification_variable ')' | 'VALUE(' identification_variable ')' );
	public final JPA2Parser.map_field_identification_variable_return map_field_identification_variable() throws RecognitionException {
		JPA2Parser.map_field_identification_variable_return retval = new JPA2Parser.map_field_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;
		Token char_literal67=null;
		Token string_literal68=null;
		Token char_literal70=null;
		ParserRuleReturnScope identification_variable66 =null;
		ParserRuleReturnScope identification_variable69 =null;

		Object string_literal65_tree=null;
		Object char_literal67_tree=null;
		Object string_literal68_tree=null;
		Object char_literal70_tree=null;

		try {
			// JPA2.g:135:35: ( 'KEY(' identification_variable ')' | 'VALUE(' identification_variable ')' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==106) ) {
				alt25=1;
			}
			else if ( (LA25_0==137) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// JPA2.g:135:37: 'KEY(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal65=(Token)match(input,106,FOLLOW_106_in_map_field_identification_variable1062); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = (Object)adaptor.create(string_literal65);
					adaptor.addChild(root_0, string_literal65_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_map_field_identification_variable1063);
					identification_variable66=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable66.getTree());

					char_literal67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_map_field_identification_variable1064); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal67_tree = (Object)adaptor.create(char_literal67);
					adaptor.addChild(root_0, char_literal67_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:135:72: 'VALUE(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal68=(Token)match(input,137,FOLLOW_137_in_map_field_identification_variable1068); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal68_tree = (Object)adaptor.create(string_literal68);
					adaptor.addChild(root_0, string_literal68_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_map_field_identification_variable1069);
					identification_variable69=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable69.getTree());

					char_literal70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_map_field_identification_variable1070); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal70_tree = (Object)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_field_identification_variable"


	public static class path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "path_expression"
	// JPA2.g:138:1: path_expression : identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) ;
	public final JPA2Parser.path_expression_return path_expression() throws RecognitionException {
		JPA2Parser.path_expression_return retval = new JPA2Parser.path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		Token char_literal74=null;
		ParserRuleReturnScope identification_variable71 =null;
		ParserRuleReturnScope field73 =null;
		ParserRuleReturnScope field75 =null;

		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:139:5: ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) )
			// JPA2.g:139:8: identification_variable '.' ( field '.' )* ( field )?
			{
			pushFollow(FOLLOW_identification_variable_in_path_expression1084);
			identification_variable71=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable71.getTree());
			char_literal72=(Token)match(input,62,FOLLOW_62_in_path_expression1086); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(char_literal72);

			// JPA2.g:139:36: ( field '.' )*
			loop26:
			while (true) {
				int alt26=2;
				switch ( input.LA(1) ) {
				case WORD:
					{
					int LA26_1 = input.LA(2);
					if ( (LA26_1==62) ) {
						alt26=1;
					}

					}
					break;
				case 125:
					{
					int LA26_2 = input.LA(2);
					if ( (LA26_2==62) ) {
						alt26=1;
					}

					}
					break;
				case 101:
					{
					int LA26_3 = input.LA(2);
					if ( (LA26_3==62) ) {
						alt26=1;
					}

					}
					break;
				case GROUP:
					{
					int LA26_4 = input.LA(2);
					if ( (LA26_4==62) ) {
						alt26=1;
					}

					}
					break;
				case ORDER:
					{
					int LA26_5 = input.LA(2);
					if ( (LA26_5==62) ) {
						alt26=1;
					}

					}
					break;
				case MAX:
					{
					int LA26_6 = input.LA(2);
					if ( (LA26_6==62) ) {
						alt26=1;
					}

					}
					break;
				case MIN:
					{
					int LA26_7 = input.LA(2);
					if ( (LA26_7==62) ) {
						alt26=1;
					}

					}
					break;
				case SUM:
					{
					int LA26_8 = input.LA(2);
					if ( (LA26_8==62) ) {
						alt26=1;
					}

					}
					break;
				case AVG:
					{
					int LA26_9 = input.LA(2);
					if ( (LA26_9==62) ) {
						alt26=1;
					}

					}
					break;
				case COUNT:
					{
					int LA26_10 = input.LA(2);
					if ( (LA26_10==62) ) {
						alt26=1;
					}

					}
					break;
				case 81:
					{
					int LA26_11 = input.LA(2);
					if ( (LA26_11==62) ) {
						alt26=1;
					}

					}
					break;
				case 111:
					{
					int LA26_12 = input.LA(2);
					if ( (LA26_12==62) ) {
						alt26=1;
					}

					}
					break;
				case 91:
				case 97:
				case 103:
				case 112:
				case 114:
				case 122:
				case 124:
				case 138:
				case 141:
					{
					int LA26_13 = input.LA(2);
					if ( (LA26_13==62) ) {
						alt26=1;
					}

					}
					break;
				}
				switch (alt26) {
				case 1 :
					// JPA2.g:139:37: field '.'
					{
					pushFollow(FOLLOW_field_in_path_expression1089);
					field73=field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field.add(field73.getTree());
					char_literal74=(Token)match(input,62,FOLLOW_62_in_path_expression1090); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal74);

					}
					break;

				default :
					break loop26;
				}
			}

			// JPA2.g:139:48: ( field )?
			int alt27=2;
			switch ( input.LA(1) ) {
				case WORD:
					{
					int LA27_1 = input.LA(2);
					if ( (synpred30_JPA2()) ) {
						alt27=1;
					}
					}
					break;
				case AVG:
				case COUNT:
				case MAX:
				case MIN:
				case SUM:
				case 91:
				case 97:
				case 103:
				case 112:
				case 114:
				case 122:
				case 124:
				case 125:
				case 138:
				case 141:
					{
					alt27=1;
					}
					break;
				case 101:
					{
					switch ( input.LA(2) ) {
						case EOF:
						case AND:
						case ASC:
						case DESC:
						case GROUP:
						case HAVING:
						case INNER:
						case JOIN:
						case LEFT:
						case NOT:
						case OR:
						case ORDER:
						case RPAREN:
						case SET:
						case 58:
						case 59:
						case 60:
						case 61:
						case 63:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 81:
						case 82:
						case 93:
						case 95:
						case 98:
						case 101:
						case 105:
						case 109:
						case 111:
						case 123:
						case 130:
						case 139:
						case 140:
							{
							alt27=1;
							}
							break;
						case WORD:
							{
							int LA27_9 = input.LA(3);
							if ( (LA27_9==EOF||LA27_9==LPAREN||LA27_9==RPAREN||LA27_9==60||LA27_9==101) ) {
								alt27=1;
							}
							}
							break;
						case IN:
							{
							int LA27_10 = input.LA(3);
							if ( (LA27_10==LPAREN||LA27_10==NAMED_PARAMETER||LA27_10==57||LA27_10==71) ) {
								alt27=1;
							}
							}
							break;
					}
					}
					break;
				case GROUP:
					{
					int LA27_4 = input.LA(2);
					if ( (LA27_4==EOF||(LA27_4 >= AND && LA27_4 <= ASC)||LA27_4==DESC||(LA27_4 >= GROUP && LA27_4 <= INNER)||(LA27_4 >= JOIN && LA27_4 <= LEFT)||(LA27_4 >= NOT && LA27_4 <= ORDER)||LA27_4==RPAREN||LA27_4==SET||LA27_4==WORD||(LA27_4 >= 58 && LA27_4 <= 61)||LA27_4==63||(LA27_4 >= 65 && LA27_4 <= 70)||(LA27_4 >= 81 && LA27_4 <= 82)||LA27_4==93||LA27_4==95||LA27_4==98||LA27_4==101||LA27_4==105||LA27_4==109||LA27_4==111||LA27_4==123||LA27_4==130||(LA27_4 >= 139 && LA27_4 <= 140)) ) {
						alt27=1;
					}
					}
					break;
				case ORDER:
					{
					int LA27_5 = input.LA(2);
					if ( (LA27_5==EOF||(LA27_5 >= AND && LA27_5 <= ASC)||LA27_5==DESC||(LA27_5 >= GROUP && LA27_5 <= INNER)||(LA27_5 >= JOIN && LA27_5 <= LEFT)||(LA27_5 >= NOT && LA27_5 <= ORDER)||LA27_5==RPAREN||LA27_5==SET||LA27_5==WORD||(LA27_5 >= 58 && LA27_5 <= 61)||LA27_5==63||(LA27_5 >= 65 && LA27_5 <= 70)||(LA27_5 >= 81 && LA27_5 <= 82)||LA27_5==93||LA27_5==95||LA27_5==98||LA27_5==101||LA27_5==105||LA27_5==109||LA27_5==111||LA27_5==123||LA27_5==130||(LA27_5 >= 139 && LA27_5 <= 140)) ) {
						alt27=1;
					}
					}
					break;
				case 81:
					{
					int LA27_6 = input.LA(2);
					if ( (synpred30_JPA2()) ) {
						alt27=1;
					}
					}
					break;
				case 111:
					{
					int LA27_7 = input.LA(2);
					if ( (LA27_7==EOF||(LA27_7 >= AND && LA27_7 <= ASC)||LA27_7==DESC||(LA27_7 >= GROUP && LA27_7 <= INNER)||(LA27_7 >= JOIN && LA27_7 <= LEFT)||(LA27_7 >= NOT && LA27_7 <= ORDER)||LA27_7==RPAREN||LA27_7==SET||(LA27_7 >= 58 && LA27_7 <= 61)||LA27_7==63||(LA27_7 >= 65 && LA27_7 <= 70)||(LA27_7 >= 81 && LA27_7 <= 82)||LA27_7==93||LA27_7==95||LA27_7==98||LA27_7==101||LA27_7==105||LA27_7==109||LA27_7==111||LA27_7==123||LA27_7==130||(LA27_7 >= 139 && LA27_7 <= 140)) ) {
						alt27=1;
					}
					else if ( (LA27_7==WORD) ) {
						int LA27_11 = input.LA(3);
						if ( (LA27_11==EOF||LA27_11==LPAREN||LA27_11==RPAREN||LA27_11==60||LA27_11==101) ) {
							alt27=1;
						}
					}
					}
					break;
			}
			switch (alt27) {
				case 1 :
					// JPA2.g:139:48: field
					{
					pushFollow(FOLLOW_field_in_path_expression1094);
					field75=field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field.add(field75.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:5: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
			{
				// JPA2.g:140:8: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable71!=null?input.toString(identification_variable71.start,identification_variable71.stop):null)), root_1);
				// JPA2.g:140:68: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "path_expression"


	public static class general_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_identification_variable"
	// JPA2.g:145:1: general_identification_variable : ( identification_variable | map_field_identification_variable );
	public final JPA2Parser.general_identification_variable_return general_identification_variable() throws RecognitionException {
		JPA2Parser.general_identification_variable_return retval = new JPA2Parser.general_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable76 =null;
		ParserRuleReturnScope map_field_identification_variable77 =null;


		try {
			// JPA2.g:146:5: ( identification_variable | map_field_identification_variable )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==WORD) ) {
				alt28=1;
			}
			else if ( (LA28_0==106||LA28_0==137) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// JPA2.g:146:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_general_identification_variable1133);
					identification_variable76=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable76.getTree());

					}
					break;
				case 2 :
					// JPA2.g:147:7: map_field_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_map_field_identification_variable_in_general_identification_variable1141);
					map_field_identification_variable77=map_field_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, map_field_identification_variable77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_identification_variable"


	public static class update_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_clause"
	// JPA2.g:150:1: update_clause : identification_variable_declaration SET update_item ( ',' update_item )* -> ^( T_SOURCES identification_variable_declaration SET update_item ( ',' update_item )* ) ;
	public final JPA2Parser.update_clause_return update_clause() throws RecognitionException {
		JPA2Parser.update_clause_return retval = new JPA2Parser.update_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SET79=null;
		Token char_literal81=null;
		ParserRuleReturnScope identification_variable_declaration78 =null;
		ParserRuleReturnScope update_item80 =null;
		ParserRuleReturnScope update_item82 =null;

		Object SET79_tree=null;
		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_update_item=new RewriteRuleSubtreeStream(adaptor,"rule update_item");
		RewriteRuleSubtreeStream stream_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration");

		try {
			// JPA2.g:151:5: ( identification_variable_declaration SET update_item ( ',' update_item )* -> ^( T_SOURCES identification_variable_declaration SET update_item ( ',' update_item )* ) )
			// JPA2.g:151:7: identification_variable_declaration SET update_item ( ',' update_item )*
			{
			pushFollow(FOLLOW_identification_variable_declaration_in_update_clause1154);
			identification_variable_declaration78=identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable_declaration.add(identification_variable_declaration78.getTree());
			SET79=(Token)match(input,SET,FOLLOW_SET_in_update_clause1156); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET79);

			pushFollow(FOLLOW_update_item_in_update_clause1158);
			update_item80=update_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_update_item.add(update_item80.getTree());
			// JPA2.g:151:59: ( ',' update_item )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==60) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// JPA2.g:151:60: ',' update_item
					{
					char_literal81=(Token)match(input,60,FOLLOW_60_in_update_clause1161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal81);

					pushFollow(FOLLOW_update_item_in_update_clause1163);
					update_item82=update_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_update_item.add(update_item82.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			// AST REWRITE
			// elements: 60, update_item, SET, update_item, identification_variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 152:5: -> ^( T_SOURCES identification_variable_declaration SET update_item ( ',' update_item )* )
			{
				// JPA2.g:152:8: ^( T_SOURCES identification_variable_declaration SET update_item ( ',' update_item )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCES), root_1);
				adaptor.addChild(root_1, stream_identification_variable_declaration.nextTree());
				adaptor.addChild(root_1, new UpdateSetNode(stream_SET.nextToken()));
				adaptor.addChild(root_1, stream_update_item.nextTree());
				// JPA2.g:152:108: ( ',' update_item )*
				while ( stream_60.hasNext()||stream_update_item.hasNext() ) {
					adaptor.addChild(root_1, stream_60.nextNode());
					adaptor.addChild(root_1, stream_update_item.nextTree());
				}
				stream_60.reset();
				stream_update_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_clause"


	public static class update_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_item"
	// JPA2.g:153:1: update_item : path_expression '=' new_value ;
	public final JPA2Parser.update_item_return update_item() throws RecognitionException {
		JPA2Parser.update_item_return retval = new JPA2Parser.update_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal84=null;
		ParserRuleReturnScope path_expression83 =null;
		ParserRuleReturnScope new_value85 =null;

		Object char_literal84_tree=null;

		try {
			// JPA2.g:154:5: ( path_expression '=' new_value )
			// JPA2.g:154:7: path_expression '=' new_value
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_path_expression_in_update_item1205);
			path_expression83=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression83.getTree());

			char_literal84=(Token)match(input,68,FOLLOW_68_in_update_item1207); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal84_tree = (Object)adaptor.create(char_literal84);
			adaptor.addChild(root_0, char_literal84_tree);
			}

			pushFollow(FOLLOW_new_value_in_update_item1209);
			new_value85=new_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, new_value85.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_item"


	public static class new_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "new_value"
	// JPA2.g:155:1: new_value : ( scalar_expression | simple_entity_expression | 'NULL' );
	public final JPA2Parser.new_value_return new_value() throws RecognitionException {
		JPA2Parser.new_value_return retval = new JPA2Parser.new_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal88=null;
		ParserRuleReturnScope scalar_expression86 =null;
		ParserRuleReturnScope simple_entity_expression87 =null;

		Object string_literal88_tree=null;

		try {
			// JPA2.g:156:5: ( scalar_expression | simple_entity_expression | 'NULL' )
			int alt30=3;
			switch ( input.LA(1) ) {
			case AVG:
			case COUNT:
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case MAX:
			case MIN:
			case STRING_LITERAL:
			case SUM:
			case 59:
			case 61:
			case 64:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 102:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt30=1;
				}
				break;
			case WORD:
				{
				int LA30_2 = input.LA(2);
				if ( (synpred33_JPA2()) ) {
					alt30=1;
				}
				else if ( (synpred34_JPA2()) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 71:
				{
				int LA30_3 = input.LA(2);
				if ( (LA30_3==64) ) {
					int LA30_8 = input.LA(3);
					if ( (LA30_8==INT_NUMERAL) ) {
						int LA30_9 = input.LA(4);
						if ( (synpred33_JPA2()) ) {
							alt30=1;
						}
						else if ( (synpred34_JPA2()) ) {
							alt30=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA30_3==INT_NUMERAL) ) {
					int LA30_9 = input.LA(3);
					if ( (synpred33_JPA2()) ) {
						alt30=1;
					}
					else if ( (synpred34_JPA2()) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA30_4 = input.LA(2);
				if ( (synpred33_JPA2()) ) {
					alt30=1;
				}
				else if ( (synpred34_JPA2()) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
				{
				int LA30_5 = input.LA(2);
				if ( (LA30_5==WORD) ) {
					int LA30_10 = input.LA(3);
					if ( (LA30_10==144) ) {
						int LA30_11 = input.LA(4);
						if ( (synpred33_JPA2()) ) {
							alt30=1;
						}
						else if ( (synpred34_JPA2()) ) {
							alt30=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 117:
				{
				alt30=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// JPA2.g:156:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_new_value1220);
					scalar_expression86=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression86.getTree());

					}
					break;
				case 2 :
					// JPA2.g:157:7: simple_entity_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_expression_in_new_value1228);
					simple_entity_expression87=simple_entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_expression87.getTree());

					}
					break;
				case 3 :
					// JPA2.g:158:7: 'NULL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal88=(Token)match(input,117,FOLLOW_117_in_new_value1236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal88_tree = (Object)adaptor.create(string_literal88);
					adaptor.addChild(root_0, string_literal88_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "new_value"


	public static class delete_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "delete_clause"
	// JPA2.g:160:1: delete_clause : fr= 'FROM' identification_variable_declaration -> ^( T_SOURCES[$fr] identification_variable_declaration ) ;
	public final JPA2Parser.delete_clause_return delete_clause() throws RecognitionException {
		JPA2Parser.delete_clause_return retval = new JPA2Parser.delete_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fr=null;
		ParserRuleReturnScope identification_variable_declaration89 =null;

		Object fr_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration");

		try {
			// JPA2.g:161:5: (fr= 'FROM' identification_variable_declaration -> ^( T_SOURCES[$fr] identification_variable_declaration ) )
			// JPA2.g:161:7: fr= 'FROM' identification_variable_declaration
			{
			fr=(Token)match(input,101,FOLLOW_101_in_delete_clause1250); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(fr);

			pushFollow(FOLLOW_identification_variable_declaration_in_delete_clause1252);
			identification_variable_declaration89=identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable_declaration.add(identification_variable_declaration89.getTree());
			// AST REWRITE
			// elements: identification_variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 162:5: -> ^( T_SOURCES[$fr] identification_variable_declaration )
			{
				// JPA2.g:162:8: ^( T_SOURCES[$fr] identification_variable_declaration )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new FromNode(T_SOURCES, fr), root_1);
				adaptor.addChild(root_1, stream_identification_variable_declaration.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "delete_clause"


	public static class select_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_clause"
	// JPA2.g:163:1: select_clause : ( 'DISTINCT' )? select_item ( ',' select_item )* -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* ) ;
	public final JPA2Parser.select_clause_return select_clause() throws RecognitionException {
		JPA2Parser.select_clause_return retval = new JPA2Parser.select_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal90=null;
		Token char_literal92=null;
		ParserRuleReturnScope select_item91 =null;
		ParserRuleReturnScope select_item93 =null;

		Object string_literal90_tree=null;
		Object char_literal92_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_select_item=new RewriteRuleSubtreeStream(adaptor,"rule select_item");

		try {
			// JPA2.g:164:5: ( ( 'DISTINCT' )? select_item ( ',' select_item )* -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* ) )
			// JPA2.g:164:7: ( 'DISTINCT' )? select_item ( ',' select_item )*
			{
			// JPA2.g:164:7: ( 'DISTINCT' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==DISTINCT) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// JPA2.g:164:8: 'DISTINCT'
					{
					string_literal90=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_clause1280); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(string_literal90);

					}
					break;

			}

			pushFollow(FOLLOW_select_item_in_select_clause1284);
			select_item91=select_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_item.add(select_item91.getTree());
			// JPA2.g:164:33: ( ',' select_item )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==60) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// JPA2.g:164:34: ',' select_item
					{
					char_literal92=(Token)match(input,60,FOLLOW_60_in_select_clause1287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal92);

					pushFollow(FOLLOW_select_item_in_select_clause1289);
					select_item93=select_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_select_item.add(select_item93.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: DISTINCT, select_item
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 165:5: -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* )
			{
				// JPA2.g:165:8: ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectedItemsNode(T_SELECTED_ITEMS), root_1);
				// JPA2.g:165:48: ( 'DISTINCT' )?
				if ( stream_DISTINCT.hasNext() ) {
					adaptor.addChild(root_1, stream_DISTINCT.nextNode());
				}
				stream_DISTINCT.reset();

				// JPA2.g:165:62: ( ^( T_SELECTED_ITEM[] select_item ) )*
				while ( stream_select_item.hasNext() ) {
					// JPA2.g:165:62: ^( T_SELECTED_ITEM[] select_item )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(new SelectedItemNode(T_SELECTED_ITEM), root_2);
					adaptor.addChild(root_2, stream_select_item.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_select_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_clause"


	public static class select_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_item"
	// JPA2.g:166:1: select_item : select_expression ( ( 'AS' )? result_variable )? ;
	public final JPA2Parser.select_item_return select_item() throws RecognitionException {
		JPA2Parser.select_item_return retval = new JPA2Parser.select_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal95=null;
		ParserRuleReturnScope select_expression94 =null;
		ParserRuleReturnScope result_variable96 =null;

		Object string_literal95_tree=null;

		try {
			// JPA2.g:167:5: ( select_expression ( ( 'AS' )? result_variable )? )
			// JPA2.g:167:7: select_expression ( ( 'AS' )? result_variable )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_select_expression_in_select_item1332);
			select_expression94=select_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_expression94.getTree());

			// JPA2.g:167:25: ( ( 'AS' )? result_variable )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==WORD||LA34_0==81) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// JPA2.g:167:26: ( 'AS' )? result_variable
					{
					// JPA2.g:167:26: ( 'AS' )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==81) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// JPA2.g:167:27: 'AS'
							{
							string_literal95=(Token)match(input,81,FOLLOW_81_in_select_item1336); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal95_tree = (Object)adaptor.create(string_literal95);
							adaptor.addChild(root_0, string_literal95_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_result_variable_in_select_item1340);
					result_variable96=result_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, result_variable96.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_item"


	public static class select_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_expression"
	// JPA2.g:168:1: select_expression : ( path_expression ( ( '+' | '-' | '*' | '/' ) scalar_expression )? | identification_variable -> ^( T_SELECTED_ENTITY[$identification_variable.text] ) | scalar_expression | aggregate_expression | 'OBJECT' '(' identification_variable ')' | constructor_expression );
	public final JPA2Parser.select_expression_return select_expression() throws RecognitionException {
		JPA2Parser.select_expression_return retval = new JPA2Parser.select_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set98=null;
		Token string_literal103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		ParserRuleReturnScope path_expression97 =null;
		ParserRuleReturnScope scalar_expression99 =null;
		ParserRuleReturnScope identification_variable100 =null;
		ParserRuleReturnScope scalar_expression101 =null;
		ParserRuleReturnScope aggregate_expression102 =null;
		ParserRuleReturnScope identification_variable105 =null;
		ParserRuleReturnScope constructor_expression107 =null;

		Object set98_tree=null;
		Object string_literal103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:169:5: ( path_expression ( ( '+' | '-' | '*' | '/' ) scalar_expression )? | identification_variable -> ^( T_SELECTED_ENTITY[$identification_variable.text] ) | scalar_expression | aggregate_expression | 'OBJECT' '(' identification_variable ')' | constructor_expression )
			int alt36=6;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA36_1 = input.LA(2);
				if ( (synpred43_JPA2()) ) {
					alt36=1;
				}
				else if ( (synpred44_JPA2()) ) {
					alt36=2;
				}
				else if ( (synpred45_JPA2()) ) {
					alt36=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 57:
			case 59:
			case 61:
			case 64:
			case 71:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt36=3;
				}
				break;
			case COUNT:
				{
				int LA36_16 = input.LA(2);
				if ( (synpred45_JPA2()) ) {
					alt36=3;
				}
				else if ( (synpred46_JPA2()) ) {
					alt36=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA36_17 = input.LA(2);
				if ( (synpred45_JPA2()) ) {
					alt36=3;
				}
				else if ( (synpred46_JPA2()) ) {
					alt36=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA36_18 = input.LA(2);
				if ( (synpred45_JPA2()) ) {
					alt36=3;
				}
				else if ( (synpred46_JPA2()) ) {
					alt36=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 119:
				{
				alt36=5;
				}
				break;
			case 115:
				{
				alt36=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// JPA2.g:169:7: path_expression ( ( '+' | '-' | '*' | '/' ) scalar_expression )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_select_expression1353);
					path_expression97=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression97.getTree());

					// JPA2.g:169:23: ( ( '+' | '-' | '*' | '/' ) scalar_expression )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( ((LA35_0 >= 58 && LA35_0 <= 59)||LA35_0==61||LA35_0==63) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// JPA2.g:169:24: ( '+' | '-' | '*' | '/' ) scalar_expression
							{
							set98=input.LT(1);
							if ( (input.LA(1) >= 58 && input.LA(1) <= 59)||input.LA(1)==61||input.LA(1)==63 ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set98));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_scalar_expression_in_select_expression1372);
							scalar_expression99=scalar_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression99.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// JPA2.g:170:7: identification_variable
					{
					pushFollow(FOLLOW_identification_variable_in_select_expression1382);
					identification_variable100=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable100.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:31: -> ^( T_SELECTED_ENTITY[$identification_variable.text] )
					{
						// JPA2.g:170:34: ^( T_SELECTED_ENTITY[$identification_variable.text] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_ENTITY, (identification_variable100!=null?input.toString(identification_variable100.start,identification_variable100.stop):null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:171:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_select_expression1400);
					scalar_expression101=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression101.getTree());

					}
					break;
				case 4 :
					// JPA2.g:172:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_select_expression1408);
					aggregate_expression102=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression102.getTree());

					}
					break;
				case 5 :
					// JPA2.g:173:7: 'OBJECT' '(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal103=(Token)match(input,119,FOLLOW_119_in_select_expression1416); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal103_tree = (Object)adaptor.create(string_literal103);
					adaptor.addChild(root_0, string_literal103_tree);
					}

					char_literal104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_select_expression1418); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal104_tree = (Object)adaptor.create(char_literal104);
					adaptor.addChild(root_0, char_literal104_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_select_expression1419);
					identification_variable105=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable105.getTree());

					char_literal106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_select_expression1420); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal106_tree = (Object)adaptor.create(char_literal106);
					adaptor.addChild(root_0, char_literal106_tree);
					}

					}
					break;
				case 6 :
					// JPA2.g:174:7: constructor_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constructor_expression_in_select_expression1428);
					constructor_expression107=constructor_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_expression107.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_expression"


	public static class constructor_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_expression"
	// JPA2.g:175:1: constructor_expression : 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')' ;
	public final JPA2Parser.constructor_expression_return constructor_expression() throws RecognitionException {
		JPA2Parser.constructor_expression_return retval = new JPA2Parser.constructor_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal108=null;
		Token char_literal110=null;
		Token char_literal112=null;
		Token char_literal114=null;
		ParserRuleReturnScope constructor_name109 =null;
		ParserRuleReturnScope constructor_item111 =null;
		ParserRuleReturnScope constructor_item113 =null;

		Object string_literal108_tree=null;
		Object char_literal110_tree=null;
		Object char_literal112_tree=null;
		Object char_literal114_tree=null;

		try {
			// JPA2.g:176:5: ( 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')' )
			// JPA2.g:176:7: 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal108=(Token)match(input,115,FOLLOW_115_in_constructor_expression1439); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal108_tree = (Object)adaptor.create(string_literal108);
			adaptor.addChild(root_0, string_literal108_tree);
			}

			pushFollow(FOLLOW_constructor_name_in_constructor_expression1441);
			constructor_name109=constructor_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_name109.getTree());

			char_literal110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_expression1443); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal110_tree = (Object)adaptor.create(char_literal110);
			adaptor.addChild(root_0, char_literal110_tree);
			}

			pushFollow(FOLLOW_constructor_item_in_constructor_expression1445);
			constructor_item111=constructor_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_item111.getTree());

			// JPA2.g:176:51: ( ',' constructor_item )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==60) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// JPA2.g:176:52: ',' constructor_item
					{
					char_literal112=(Token)match(input,60,FOLLOW_60_in_constructor_expression1448); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal112_tree = (Object)adaptor.create(char_literal112);
					adaptor.addChild(root_0, char_literal112_tree);
					}

					pushFollow(FOLLOW_constructor_item_in_constructor_expression1450);
					constructor_item113=constructor_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_item113.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			char_literal114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_expression1454); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal114_tree = (Object)adaptor.create(char_literal114);
			adaptor.addChild(root_0, char_literal114_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_expression"


	public static class constructor_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_item"
	// JPA2.g:177:1: constructor_item : ( path_expression | scalar_expression | aggregate_expression | identification_variable );
	public final JPA2Parser.constructor_item_return constructor_item() throws RecognitionException {
		JPA2Parser.constructor_item_return retval = new JPA2Parser.constructor_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression115 =null;
		ParserRuleReturnScope scalar_expression116 =null;
		ParserRuleReturnScope aggregate_expression117 =null;
		ParserRuleReturnScope identification_variable118 =null;


		try {
			// JPA2.g:178:5: ( path_expression | scalar_expression | aggregate_expression | identification_variable )
			int alt38=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA38_1 = input.LA(2);
				if ( (synpred49_JPA2()) ) {
					alt38=1;
				}
				else if ( (synpred50_JPA2()) ) {
					alt38=2;
				}
				else if ( (true) ) {
					alt38=4;
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 57:
			case 59:
			case 61:
			case 64:
			case 71:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt38=2;
				}
				break;
			case COUNT:
				{
				int LA38_16 = input.LA(2);
				if ( (synpred50_JPA2()) ) {
					alt38=2;
				}
				else if ( (synpred51_JPA2()) ) {
					alt38=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA38_17 = input.LA(2);
				if ( (synpred50_JPA2()) ) {
					alt38=2;
				}
				else if ( (synpred51_JPA2()) ) {
					alt38=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA38_18 = input.LA(2);
				if ( (synpred50_JPA2()) ) {
					alt38=2;
				}
				else if ( (synpred51_JPA2()) ) {
					alt38=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// JPA2.g:178:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_constructor_item1465);
					path_expression115=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression115.getTree());

					}
					break;
				case 2 :
					// JPA2.g:179:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_constructor_item1473);
					scalar_expression116=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression116.getTree());

					}
					break;
				case 3 :
					// JPA2.g:180:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_constructor_item1481);
					aggregate_expression117=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression117.getTree());

					}
					break;
				case 4 :
					// JPA2.g:181:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_constructor_item1489);
					identification_variable118=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable118.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_item"


	public static class aggregate_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aggregate_expression"
	// JPA2.g:182:1: aggregate_expression : ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation );
	public final JPA2Parser.aggregate_expression_return aggregate_expression() throws RecognitionException {
		JPA2Parser.aggregate_expression_return retval = new JPA2Parser.aggregate_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token DISTINCT121=null;
		Token char_literal123=null;
		Token string_literal124=null;
		Token char_literal125=null;
		Token DISTINCT126=null;
		Token char_literal128=null;
		ParserRuleReturnScope aggregate_expression_function_name119 =null;
		ParserRuleReturnScope path_expression122 =null;
		ParserRuleReturnScope count_argument127 =null;
		ParserRuleReturnScope function_invocation129 =null;

		Object char_literal120_tree=null;
		Object DISTINCT121_tree=null;
		Object char_literal123_tree=null;
		Object string_literal124_tree=null;
		Object char_literal125_tree=null;
		Object DISTINCT126_tree=null;
		Object char_literal128_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_count_argument=new RewriteRuleSubtreeStream(adaptor,"rule count_argument");
		RewriteRuleSubtreeStream stream_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule path_expression");
		RewriteRuleSubtreeStream stream_aggregate_expression_function_name=new RewriteRuleSubtreeStream(adaptor,"rule aggregate_expression_function_name");

		try {
			// JPA2.g:183:5: ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation )
			int alt41=3;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// JPA2.g:183:7: aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')'
					{
					pushFollow(FOLLOW_aggregate_expression_function_name_in_aggregate_expression1500);
					aggregate_expression_function_name119=aggregate_expression_function_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aggregate_expression_function_name.add(aggregate_expression_function_name119.getTree());
					char_literal120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aggregate_expression1502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(char_literal120);

					// JPA2.g:183:45: ( DISTINCT )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==DISTINCT) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// JPA2.g:183:46: DISTINCT
							{
							DISTINCT121=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate_expression1504); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT121);

							}
							break;

					}

					pushFollow(FOLLOW_path_expression_in_aggregate_expression1508);
					path_expression122=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_path_expression.add(path_expression122.getTree());
					char_literal123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aggregate_expression1509); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal123);

					// AST REWRITE
					// elements: path_expression, RPAREN, LPAREN, DISTINCT, aggregate_expression_function_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 184:5: -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' )
					{
						// JPA2.g:184:8: ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AggregateExpressionNode(T_AGGREGATE_EXPR), root_1);
						adaptor.addChild(root_1, stream_aggregate_expression_function_name.nextTree());
						adaptor.addChild(root_1, stream_LPAREN.nextNode());
						// JPA2.g:184:93: ( 'DISTINCT' )?
						if ( stream_DISTINCT.hasNext() ) {
							adaptor.addChild(root_1, (Object)adaptor.create(DISTINCT, "DISTINCT"));
						}
						stream_DISTINCT.reset();

						adaptor.addChild(root_1, stream_path_expression.nextTree());
						adaptor.addChild(root_1, stream_RPAREN.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:185:7: 'COUNT' '(' ( DISTINCT )? count_argument ')'
					{
					string_literal124=(Token)match(input,COUNT,FOLLOW_COUNT_in_aggregate_expression1543); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(string_literal124);

					char_literal125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aggregate_expression1545); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(char_literal125);

					// JPA2.g:185:18: ( DISTINCT )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==DISTINCT) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// JPA2.g:185:19: DISTINCT
							{
							DISTINCT126=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate_expression1547); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT126);

							}
							break;

					}

					pushFollow(FOLLOW_count_argument_in_aggregate_expression1551);
					count_argument127=count_argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_count_argument.add(count_argument127.getTree());
					char_literal128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aggregate_expression1553); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal128);

					// AST REWRITE
					// elements: RPAREN, COUNT, LPAREN, DISTINCT, count_argument
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 186:5: -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' )
					{
						// JPA2.g:186:8: ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AggregateExpressionNode(T_AGGREGATE_EXPR), root_1);
						adaptor.addChild(root_1, stream_COUNT.nextNode());
						adaptor.addChild(root_1, stream_LPAREN.nextNode());
						// JPA2.g:186:66: ( 'DISTINCT' )?
						if ( stream_DISTINCT.hasNext() ) {
							adaptor.addChild(root_1, (Object)adaptor.create(DISTINCT, "DISTINCT"));
						}
						stream_DISTINCT.reset();

						adaptor.addChild(root_1, stream_count_argument.nextTree());
						adaptor.addChild(root_1, stream_RPAREN.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:187:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_aggregate_expression1588);
					function_invocation129=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation129.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate_expression"


	public static class aggregate_expression_function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aggregate_expression_function_name"
	// JPA2.g:188:1: aggregate_expression_function_name : ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'COUNT' );
	public final JPA2Parser.aggregate_expression_function_name_return aggregate_expression_function_name() throws RecognitionException {
		JPA2Parser.aggregate_expression_function_name_return retval = new JPA2Parser.aggregate_expression_function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set130=null;

		Object set130_tree=null;

		try {
			// JPA2.g:189:5: ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'COUNT' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set130=input.LT(1);
			if ( input.LA(1)==AVG||input.LA(1)==COUNT||(input.LA(1) >= MAX && input.LA(1) <= MIN)||input.LA(1)==SUM ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set130));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate_expression_function_name"


	public static class count_argument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "count_argument"
	// JPA2.g:190:1: count_argument : ( identification_variable | path_expression );
	public final JPA2Parser.count_argument_return count_argument() throws RecognitionException {
		JPA2Parser.count_argument_return retval = new JPA2Parser.count_argument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable131 =null;
		ParserRuleReturnScope path_expression132 =null;


		try {
			// JPA2.g:191:5: ( identification_variable | path_expression )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==WORD) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==RPAREN) ) {
					alt42=1;
				}
				else if ( (LA42_1==62) ) {
					alt42=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// JPA2.g:191:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_count_argument1625);
					identification_variable131=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable131.getTree());

					}
					break;
				case 2 :
					// JPA2.g:191:33: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_count_argument1629);
					path_expression132=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression132.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "count_argument"


	public static class where_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// JPA2.g:192:1: where_clause : wh= 'WHERE' conditional_expression -> ^( T_CONDITION[$wh] conditional_expression ) ;
	public final JPA2Parser.where_clause_return where_clause() throws RecognitionException {
		JPA2Parser.where_clause_return retval = new JPA2Parser.where_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token wh=null;
		ParserRuleReturnScope conditional_expression133 =null;

		Object wh_tree=null;
		RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
		RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");

		try {
			// JPA2.g:193:5: (wh= 'WHERE' conditional_expression -> ^( T_CONDITION[$wh] conditional_expression ) )
			// JPA2.g:193:7: wh= 'WHERE' conditional_expression
			{
			wh=(Token)match(input,140,FOLLOW_140_in_where_clause1642); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_140.add(wh);

			pushFollow(FOLLOW_conditional_expression_in_where_clause1644);
			conditional_expression133=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression133.getTree());
			// AST REWRITE
			// elements: conditional_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:40: -> ^( T_CONDITION[$wh] conditional_expression )
			{
				// JPA2.g:193:43: ^( T_CONDITION[$wh] conditional_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new WhereNode(T_CONDITION, wh), root_1);
				adaptor.addChild(root_1, stream_conditional_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class groupby_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_clause"
	// JPA2.g:194:1: groupby_clause : 'GROUP' 'BY' groupby_item ( ',' groupby_item )* -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* ) ;
	public final JPA2Parser.groupby_clause_return groupby_clause() throws RecognitionException {
		JPA2Parser.groupby_clause_return retval = new JPA2Parser.groupby_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal134=null;
		Token string_literal135=null;
		Token char_literal137=null;
		ParserRuleReturnScope groupby_item136 =null;
		ParserRuleReturnScope groupby_item138 =null;

		Object string_literal134_tree=null;
		Object string_literal135_tree=null;
		Object char_literal137_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_groupby_item=new RewriteRuleSubtreeStream(adaptor,"rule groupby_item");

		try {
			// JPA2.g:195:5: ( 'GROUP' 'BY' groupby_item ( ',' groupby_item )* -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* ) )
			// JPA2.g:195:7: 'GROUP' 'BY' groupby_item ( ',' groupby_item )*
			{
			string_literal134=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause1666); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(string_literal134);

			string_literal135=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause1668); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(string_literal135);

			pushFollow(FOLLOW_groupby_item_in_groupby_clause1670);
			groupby_item136=groupby_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_groupby_item.add(groupby_item136.getTree());
			// JPA2.g:195:33: ( ',' groupby_item )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==60) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// JPA2.g:195:34: ',' groupby_item
					{
					char_literal137=(Token)match(input,60,FOLLOW_60_in_groupby_clause1673); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal137);

					pushFollow(FOLLOW_groupby_item_in_groupby_clause1675);
					groupby_item138=groupby_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_item.add(groupby_item138.getTree());
					}
					break;

				default :
					break loop43;
				}
			}

			// AST REWRITE
			// elements: BY, groupby_item, GROUP
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 196:5: -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* )
			{
				// JPA2.g:196:8: ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new GroupByNode(T_GROUP_BY), root_1);
				adaptor.addChild(root_1, stream_GROUP.nextNode());
				adaptor.addChild(root_1, stream_BY.nextNode());
				// JPA2.g:196:49: ( groupby_item )*
				while ( stream_groupby_item.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_item.nextTree());
				}
				stream_groupby_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_clause"


	public static class groupby_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_item"
	// JPA2.g:197:1: groupby_item : ( path_expression | identification_variable );
	public final JPA2Parser.groupby_item_return groupby_item() throws RecognitionException {
		JPA2Parser.groupby_item_return retval = new JPA2Parser.groupby_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression139 =null;
		ParserRuleReturnScope identification_variable140 =null;


		try {
			// JPA2.g:198:5: ( path_expression | identification_variable )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WORD) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==62) ) {
					alt44=1;
				}
				else if ( (LA44_1==EOF||LA44_1==HAVING||LA44_1==ORDER||LA44_1==RPAREN||LA44_1==60) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// JPA2.g:198:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_groupby_item1709);
					path_expression139=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression139.getTree());

					}
					break;
				case 2 :
					// JPA2.g:198:25: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_groupby_item1713);
					identification_variable140=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable140.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_item"


	public static class having_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "having_clause"
	// JPA2.g:199:1: having_clause : 'HAVING' conditional_expression ;
	public final JPA2Parser.having_clause_return having_clause() throws RecognitionException {
		JPA2Parser.having_clause_return retval = new JPA2Parser.having_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal141=null;
		ParserRuleReturnScope conditional_expression142 =null;

		Object string_literal141_tree=null;

		try {
			// JPA2.g:200:5: ( 'HAVING' conditional_expression )
			// JPA2.g:200:7: 'HAVING' conditional_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal141=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause1724); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal141_tree = (Object)adaptor.create(string_literal141);
			adaptor.addChild(root_0, string_literal141_tree);
			}

			pushFollow(FOLLOW_conditional_expression_in_having_clause1726);
			conditional_expression142=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression142.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "having_clause"


	public static class orderby_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_clause"
	// JPA2.g:201:1: orderby_clause : 'ORDER' 'BY' orderby_item ( ',' orderby_item )* -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* ) ;
	public final JPA2Parser.orderby_clause_return orderby_clause() throws RecognitionException {
		JPA2Parser.orderby_clause_return retval = new JPA2Parser.orderby_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal143=null;
		Token string_literal144=null;
		Token char_literal146=null;
		ParserRuleReturnScope orderby_item145 =null;
		ParserRuleReturnScope orderby_item147 =null;

		Object string_literal143_tree=null;
		Object string_literal144_tree=null;
		Object char_literal146_tree=null;
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_orderby_item=new RewriteRuleSubtreeStream(adaptor,"rule orderby_item");

		try {
			// JPA2.g:202:5: ( 'ORDER' 'BY' orderby_item ( ',' orderby_item )* -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* ) )
			// JPA2.g:202:7: 'ORDER' 'BY' orderby_item ( ',' orderby_item )*
			{
			string_literal143=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause1737); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(string_literal143);

			string_literal144=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause1739); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(string_literal144);

			pushFollow(FOLLOW_orderby_item_in_orderby_clause1741);
			orderby_item145=orderby_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_orderby_item.add(orderby_item145.getTree());
			// JPA2.g:202:33: ( ',' orderby_item )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==60) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// JPA2.g:202:34: ',' orderby_item
					{
					char_literal146=(Token)match(input,60,FOLLOW_60_in_orderby_clause1744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal146);

					pushFollow(FOLLOW_orderby_item_in_orderby_clause1746);
					orderby_item147=orderby_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_item.add(orderby_item147.getTree());
					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: ORDER, orderby_item, BY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 203:5: -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* )
			{
				// JPA2.g:203:8: ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new OrderByNode(T_ORDER_BY), root_1);
				adaptor.addChild(root_1, stream_ORDER.nextNode());
				adaptor.addChild(root_1, stream_BY.nextNode());
				// JPA2.g:203:49: ( orderby_item )*
				while ( stream_orderby_item.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_item.nextTree());
				}
				stream_orderby_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_clause"


	public static class orderby_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_item"
	// JPA2.g:204:1: orderby_item : orderby_variable ( sort )? -> ^( T_ORDER_BY_FIELD[] orderby_variable ( sort )? ) ;
	public final JPA2Parser.orderby_item_return orderby_item() throws RecognitionException {
		JPA2Parser.orderby_item_return retval = new JPA2Parser.orderby_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope orderby_variable148 =null;
		ParserRuleReturnScope sort149 =null;

		RewriteRuleSubtreeStream stream_orderby_variable=new RewriteRuleSubtreeStream(adaptor,"rule orderby_variable");
		RewriteRuleSubtreeStream stream_sort=new RewriteRuleSubtreeStream(adaptor,"rule sort");

		try {
			// JPA2.g:205:5: ( orderby_variable ( sort )? -> ^( T_ORDER_BY_FIELD[] orderby_variable ( sort )? ) )
			// JPA2.g:205:7: orderby_variable ( sort )?
			{
			pushFollow(FOLLOW_orderby_variable_in_orderby_item1780);
			orderby_variable148=orderby_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_orderby_variable.add(orderby_variable148.getTree());
			// JPA2.g:205:24: ( sort )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ASC||LA46_0==DESC) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// JPA2.g:205:24: sort
					{
					pushFollow(FOLLOW_sort_in_orderby_item1782);
					sort149=sort();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort.add(sort149.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: orderby_variable, sort
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 206:6: -> ^( T_ORDER_BY_FIELD[] orderby_variable ( sort )? )
			{
				// JPA2.g:206:9: ^( T_ORDER_BY_FIELD[] orderby_variable ( sort )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new OrderByFieldNode(T_ORDER_BY_FIELD), root_1);
				adaptor.addChild(root_1, stream_orderby_variable.nextTree());
				// JPA2.g:206:65: ( sort )?
				if ( stream_sort.hasNext() ) {
					adaptor.addChild(root_1, stream_sort.nextTree());
				}
				stream_sort.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_item"


	public static class orderby_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_variable"
	// JPA2.g:207:1: orderby_variable : ( path_expression | general_identification_variable | result_variable | scalar_expression | aggregate_expression );
	public final JPA2Parser.orderby_variable_return orderby_variable() throws RecognitionException {
		JPA2Parser.orderby_variable_return retval = new JPA2Parser.orderby_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression150 =null;
		ParserRuleReturnScope general_identification_variable151 =null;
		ParserRuleReturnScope result_variable152 =null;
		ParserRuleReturnScope scalar_expression153 =null;
		ParserRuleReturnScope aggregate_expression154 =null;


		try {
			// JPA2.g:208:5: ( path_expression | general_identification_variable | result_variable | scalar_expression | aggregate_expression )
			int alt47=5;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA47_1 = input.LA(2);
				if ( (synpred65_JPA2()) ) {
					alt47=1;
				}
				else if ( (synpred66_JPA2()) ) {
					alt47=2;
				}
				else if ( (synpred67_JPA2()) ) {
					alt47=3;
				}
				else if ( (synpred68_JPA2()) ) {
					alt47=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
			case 137:
				{
				alt47=2;
				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 57:
			case 59:
			case 61:
			case 64:
			case 71:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt47=4;
				}
				break;
			case COUNT:
				{
				int LA47_18 = input.LA(2);
				if ( (synpred68_JPA2()) ) {
					alt47=4;
				}
				else if ( (true) ) {
					alt47=5;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA47_19 = input.LA(2);
				if ( (synpred68_JPA2()) ) {
					alt47=4;
				}
				else if ( (true) ) {
					alt47=5;
				}

				}
				break;
			case 102:
				{
				int LA47_20 = input.LA(2);
				if ( (synpred68_JPA2()) ) {
					alt47=4;
				}
				else if ( (true) ) {
					alt47=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// JPA2.g:208:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_orderby_variable1814);
					path_expression150=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression150.getTree());

					}
					break;
				case 2 :
					// JPA2.g:208:25: general_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_identification_variable_in_orderby_variable1818);
					general_identification_variable151=general_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_identification_variable151.getTree());

					}
					break;
				case 3 :
					// JPA2.g:208:59: result_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_result_variable_in_orderby_variable1822);
					result_variable152=result_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, result_variable152.getTree());

					}
					break;
				case 4 :
					// JPA2.g:208:77: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_orderby_variable1826);
					scalar_expression153=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression153.getTree());

					}
					break;
				case 5 :
					// JPA2.g:208:97: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_orderby_variable1830);
					aggregate_expression154=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression154.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_variable"


	public static class sort_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sort"
	// JPA2.g:209:1: sort : ( 'ASC' | 'DESC' ) ;
	public final JPA2Parser.sort_return sort() throws RecognitionException {
		JPA2Parser.sort_return retval = new JPA2Parser.sort_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set155=null;

		Object set155_tree=null;

		try {
			// JPA2.g:210:5: ( ( 'ASC' | 'DESC' ) )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set155=input.LT(1);
			if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set155));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sort"


	public static class subquery_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subquery"
	// JPA2.g:211:1: subquery : lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')' -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ) ;
	public final JPA2Parser.subquery_return subquery() throws RecognitionException {
		JPA2Parser.subquery_return retval = new JPA2Parser.subquery_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lp=null;
		Token rp=null;
		Token string_literal156=null;
		ParserRuleReturnScope simple_select_clause157 =null;
		ParserRuleReturnScope subquery_from_clause158 =null;
		ParserRuleReturnScope where_clause159 =null;
		ParserRuleReturnScope groupby_clause160 =null;
		ParserRuleReturnScope having_clause161 =null;

		Object lp_tree=null;
		Object rp_tree=null;
		Object string_literal156_tree=null;
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_subquery_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule subquery_from_clause");
		RewriteRuleSubtreeStream stream_simple_select_clause=new RewriteRuleSubtreeStream(adaptor,"rule simple_select_clause");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");

		try {
			// JPA2.g:212:5: (lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')' -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ) )
			// JPA2.g:212:7: lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')'
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery1860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			string_literal156=(Token)match(input,125,FOLLOW_125_in_subquery1862); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_125.add(string_literal156);

			pushFollow(FOLLOW_simple_select_clause_in_subquery1864);
			simple_select_clause157=simple_select_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_simple_select_clause.add(simple_select_clause157.getTree());
			pushFollow(FOLLOW_subquery_from_clause_in_subquery1866);
			subquery_from_clause158=subquery_from_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_subquery_from_clause.add(subquery_from_clause158.getTree());
			// JPA2.g:212:65: ( where_clause )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==140) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// JPA2.g:212:66: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_subquery1869);
					where_clause159=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause159.getTree());
					}
					break;

			}

			// JPA2.g:212:81: ( groupby_clause )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==GROUP) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// JPA2.g:212:82: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_subquery1874);
					groupby_clause160=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause160.getTree());
					}
					break;

			}

			// JPA2.g:212:99: ( having_clause )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==HAVING) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// JPA2.g:212:100: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_subquery1879);
					having_clause161=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause161.getTree());
					}
					break;

			}

			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery1885); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: 125, having_clause, groupby_clause, subquery_from_clause, where_clause, simple_select_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 213:6: -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? )
			{
				// JPA2.g:213:9: ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, lp, rp), root_1);
				adaptor.addChild(root_1, stream_125.nextNode());
				adaptor.addChild(root_1, stream_simple_select_clause.nextTree());
				adaptor.addChild(root_1, stream_subquery_from_clause.nextTree());
				// JPA2.g:213:90: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// JPA2.g:213:106: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// JPA2.g:213:124: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subquery"


	public static class subquery_from_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subquery_from_clause"
	// JPA2.g:214:1: subquery_from_clause : fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )* -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* ) ;
	public final JPA2Parser.subquery_from_clause_return subquery_from_clause() throws RecognitionException {
		JPA2Parser.subquery_from_clause_return retval = new JPA2Parser.subquery_from_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fr=null;
		Token char_literal163=null;
		ParserRuleReturnScope subselect_identification_variable_declaration162 =null;
		ParserRuleReturnScope subselect_identification_variable_declaration164 =null;

		Object fr_tree=null;
		Object char_literal163_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_subselect_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule subselect_identification_variable_declaration");

		try {
			// JPA2.g:215:5: (fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )* -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* ) )
			// JPA2.g:215:7: fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )*
			{
			fr=(Token)match(input,101,FOLLOW_101_in_subquery_from_clause1935); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(fr);

			pushFollow(FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1937);
			subselect_identification_variable_declaration162=subselect_identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_subselect_identification_variable_declaration.add(subselect_identification_variable_declaration162.getTree());
			// JPA2.g:215:63: ( ',' subselect_identification_variable_declaration )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==60) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// JPA2.g:215:64: ',' subselect_identification_variable_declaration
					{
					char_literal163=(Token)match(input,60,FOLLOW_60_in_subquery_from_clause1940); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal163);

					pushFollow(FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1942);
					subselect_identification_variable_declaration164=subselect_identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_subselect_identification_variable_declaration.add(subselect_identification_variable_declaration164.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			// AST REWRITE
			// elements: subselect_identification_variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 216:5: -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* )
			{
				// JPA2.g:216:8: ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new FromNode(T_SOURCES, fr), root_1);
				// JPA2.g:216:35: ( ^( T_SOURCE subselect_identification_variable_declaration ) )*
				while ( stream_subselect_identification_variable_declaration.hasNext() ) {
					// JPA2.g:216:35: ^( T_SOURCE subselect_identification_variable_declaration )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_2);
					adaptor.addChild(root_2, stream_subselect_identification_variable_declaration.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_subselect_identification_variable_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subquery_from_clause"


	public static class subselect_identification_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subselect_identification_variable_declaration"
	// JPA2.g:218:1: subselect_identification_variable_declaration : ( identification_variable_declaration | derived_path_expression 'AS' identification_variable ( join )* | derived_collection_member_declaration );
	public final JPA2Parser.subselect_identification_variable_declaration_return subselect_identification_variable_declaration() throws RecognitionException {
		JPA2Parser.subselect_identification_variable_declaration_return retval = new JPA2Parser.subselect_identification_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal167=null;
		ParserRuleReturnScope identification_variable_declaration165 =null;
		ParserRuleReturnScope derived_path_expression166 =null;
		ParserRuleReturnScope identification_variable168 =null;
		ParserRuleReturnScope join169 =null;
		ParserRuleReturnScope derived_collection_member_declaration170 =null;

		Object string_literal167_tree=null;

		try {
			// JPA2.g:219:5: ( identification_variable_declaration | derived_path_expression 'AS' identification_variable ( join )* | derived_collection_member_declaration )
			int alt53=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA53_1 = input.LA(2);
				if ( (LA53_1==WORD||LA53_1==81) ) {
					alt53=1;
				}
				else if ( (LA53_1==62) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 132:
				{
				alt53=2;
				}
				break;
			case IN:
				{
				alt53=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// JPA2.g:219:7: identification_variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_declaration_in_subselect_identification_variable_declaration1980);
					identification_variable_declaration165=identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable_declaration165.getTree());

					}
					break;
				case 2 :
					// JPA2.g:220:7: derived_path_expression 'AS' identification_variable ( join )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derived_path_expression_in_subselect_identification_variable_declaration1988);
					derived_path_expression166=derived_path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_path_expression166.getTree());

					string_literal167=(Token)match(input,81,FOLLOW_81_in_subselect_identification_variable_declaration1990); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal167_tree = (Object)adaptor.create(string_literal167);
					adaptor.addChild(root_0, string_literal167_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_subselect_identification_variable_declaration1992);
					identification_variable168=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable168.getTree());

					// JPA2.g:220:60: ( join )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==INNER||(LA52_0 >= JOIN && LA52_0 <= LEFT)) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// JPA2.g:220:61: join
							{
							pushFollow(FOLLOW_join_in_subselect_identification_variable_declaration1995);
							join169=join();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, join169.getTree());

							}
							break;

						default :
							break loop52;
						}
					}

					}
					break;
				case 3 :
					// JPA2.g:221:7: derived_collection_member_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derived_collection_member_declaration_in_subselect_identification_variable_declaration2005);
					derived_collection_member_declaration170=derived_collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_collection_member_declaration170.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subselect_identification_variable_declaration"


	public static class derived_path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derived_path_expression"
	// JPA2.g:222:1: derived_path_expression : ( general_derived_path '.' single_valued_object_field | general_derived_path '.' collection_valued_field );
	public final JPA2Parser.derived_path_expression_return derived_path_expression() throws RecognitionException {
		JPA2Parser.derived_path_expression_return retval = new JPA2Parser.derived_path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal172=null;
		Token char_literal175=null;
		ParserRuleReturnScope general_derived_path171 =null;
		ParserRuleReturnScope single_valued_object_field173 =null;
		ParserRuleReturnScope general_derived_path174 =null;
		ParserRuleReturnScope collection_valued_field176 =null;

		Object char_literal172_tree=null;
		Object char_literal175_tree=null;

		try {
			// JPA2.g:223:5: ( general_derived_path '.' single_valued_object_field | general_derived_path '.' collection_valued_field )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==WORD) ) {
				int LA54_1 = input.LA(2);
				if ( (synpred77_JPA2()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

			}
			else if ( (LA54_0==132) ) {
				int LA54_2 = input.LA(2);
				if ( (synpred77_JPA2()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// JPA2.g:223:7: general_derived_path '.' single_valued_object_field
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_derived_path_in_derived_path_expression2016);
					general_derived_path171=general_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path171.getTree());

					char_literal172=(Token)match(input,62,FOLLOW_62_in_derived_path_expression2017); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal172_tree = (Object)adaptor.create(char_literal172);
					adaptor.addChild(root_0, char_literal172_tree);
					}

					pushFollow(FOLLOW_single_valued_object_field_in_derived_path_expression2018);
					single_valued_object_field173=single_valued_object_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field173.getTree());

					}
					break;
				case 2 :
					// JPA2.g:224:7: general_derived_path '.' collection_valued_field
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_derived_path_in_derived_path_expression2026);
					general_derived_path174=general_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path174.getTree());

					char_literal175=(Token)match(input,62,FOLLOW_62_in_derived_path_expression2027); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal175_tree = (Object)adaptor.create(char_literal175);
					adaptor.addChild(root_0, char_literal175_tree);
					}

					pushFollow(FOLLOW_collection_valued_field_in_derived_path_expression2028);
					collection_valued_field176=collection_valued_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_field176.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derived_path_expression"


	public static class general_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_derived_path"
	// JPA2.g:225:1: general_derived_path : ( simple_derived_path | treated_derived_path ( '.' single_valued_object_field )* );
	public final JPA2Parser.general_derived_path_return general_derived_path() throws RecognitionException {
		JPA2Parser.general_derived_path_return retval = new JPA2Parser.general_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal179=null;
		ParserRuleReturnScope simple_derived_path177 =null;
		ParserRuleReturnScope treated_derived_path178 =null;
		ParserRuleReturnScope single_valued_object_field180 =null;

		Object char_literal179_tree=null;

		try {
			// JPA2.g:226:5: ( simple_derived_path | treated_derived_path ( '.' single_valued_object_field )* )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==WORD) ) {
				alt56=1;
			}
			else if ( (LA56_0==132) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// JPA2.g:226:7: simple_derived_path
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_derived_path_in_general_derived_path2039);
					simple_derived_path177=simple_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_derived_path177.getTree());

					}
					break;
				case 2 :
					// JPA2.g:227:7: treated_derived_path ( '.' single_valued_object_field )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_treated_derived_path_in_general_derived_path2047);
					treated_derived_path178=treated_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, treated_derived_path178.getTree());

					// JPA2.g:227:27: ( '.' single_valued_object_field )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==62) ) {
							int LA55_1 = input.LA(2);
							if ( (LA55_1==WORD) ) {
								int LA55_3 = input.LA(3);
								if ( (LA55_3==81) ) {
									int LA55_4 = input.LA(4);
									if ( (LA55_4==WORD) ) {
										int LA55_6 = input.LA(5);
										if ( (LA55_6==RPAREN) ) {
											int LA55_7 = input.LA(6);
											if ( (LA55_7==81) ) {
												int LA55_8 = input.LA(7);
												if ( (LA55_8==WORD) ) {
													int LA55_9 = input.LA(8);
													if ( (LA55_9==RPAREN) ) {
														alt55=1;
													}

												}

											}
											else if ( (LA55_7==62) ) {
												alt55=1;
											}

										}

									}

								}
								else if ( (LA55_3==62) ) {
									alt55=1;
								}

							}

						}

						switch (alt55) {
						case 1 :
							// JPA2.g:227:28: '.' single_valued_object_field
							{
							char_literal179=(Token)match(input,62,FOLLOW_62_in_general_derived_path2049); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal179_tree = (Object)adaptor.create(char_literal179);
							adaptor.addChild(root_0, char_literal179_tree);
							}

							pushFollow(FOLLOW_single_valued_object_field_in_general_derived_path2050);
							single_valued_object_field180=single_valued_object_field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field180.getTree());

							}
							break;

						default :
							break loop55;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_derived_path"


	public static class simple_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_derived_path"
	// JPA2.g:229:1: simple_derived_path : superquery_identification_variable ;
	public final JPA2Parser.simple_derived_path_return simple_derived_path() throws RecognitionException {
		JPA2Parser.simple_derived_path_return retval = new JPA2Parser.simple_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope superquery_identification_variable181 =null;


		try {
			// JPA2.g:230:5: ( superquery_identification_variable )
			// JPA2.g:230:7: superquery_identification_variable
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_superquery_identification_variable_in_simple_derived_path2068);
			superquery_identification_variable181=superquery_identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, superquery_identification_variable181.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_derived_path"


	public static class treated_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "treated_derived_path"
	// JPA2.g:232:1: treated_derived_path : 'TREAT(' general_derived_path 'AS' subtype ')' ;
	public final JPA2Parser.treated_derived_path_return treated_derived_path() throws RecognitionException {
		JPA2Parser.treated_derived_path_return retval = new JPA2Parser.treated_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal182=null;
		Token string_literal184=null;
		Token char_literal186=null;
		ParserRuleReturnScope general_derived_path183 =null;
		ParserRuleReturnScope subtype185 =null;

		Object string_literal182_tree=null;
		Object string_literal184_tree=null;
		Object char_literal186_tree=null;

		try {
			// JPA2.g:233:5: ( 'TREAT(' general_derived_path 'AS' subtype ')' )
			// JPA2.g:233:7: 'TREAT(' general_derived_path 'AS' subtype ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal182=(Token)match(input,132,FOLLOW_132_in_treated_derived_path2085); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal182_tree = (Object)adaptor.create(string_literal182);
			adaptor.addChild(root_0, string_literal182_tree);
			}

			pushFollow(FOLLOW_general_derived_path_in_treated_derived_path2086);
			general_derived_path183=general_derived_path();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path183.getTree());

			string_literal184=(Token)match(input,81,FOLLOW_81_in_treated_derived_path2088); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal184_tree = (Object)adaptor.create(string_literal184);
			adaptor.addChild(root_0, string_literal184_tree);
			}

			pushFollow(FOLLOW_subtype_in_treated_derived_path2090);
			subtype185=subtype();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subtype185.getTree());

			char_literal186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_treated_derived_path2092); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal186_tree = (Object)adaptor.create(char_literal186);
			adaptor.addChild(root_0, char_literal186_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "treated_derived_path"


	public static class derived_collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derived_collection_member_declaration"
	// JPA2.g:234:1: derived_collection_member_declaration : 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field ;
	public final JPA2Parser.derived_collection_member_declaration_return derived_collection_member_declaration() throws RecognitionException {
		JPA2Parser.derived_collection_member_declaration_return retval = new JPA2Parser.derived_collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal187=null;
		Token char_literal189=null;
		Token char_literal191=null;
		ParserRuleReturnScope superquery_identification_variable188 =null;
		ParserRuleReturnScope single_valued_object_field190 =null;
		ParserRuleReturnScope collection_valued_field192 =null;

		Object string_literal187_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;

		try {
			// JPA2.g:235:5: ( 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field )
			// JPA2.g:235:7: 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field
			{
			root_0 = (Object)adaptor.nil();


			string_literal187=(Token)match(input,IN,FOLLOW_IN_in_derived_collection_member_declaration2103); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal187_tree = (Object)adaptor.create(string_literal187);
			adaptor.addChild(root_0, string_literal187_tree);
			}

			pushFollow(FOLLOW_superquery_identification_variable_in_derived_collection_member_declaration2105);
			superquery_identification_variable188=superquery_identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, superquery_identification_variable188.getTree());

			char_literal189=(Token)match(input,62,FOLLOW_62_in_derived_collection_member_declaration2106); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal189_tree = (Object)adaptor.create(char_literal189);
			adaptor.addChild(root_0, char_literal189_tree);
			}

			// JPA2.g:235:49: ( single_valued_object_field '.' )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WORD) ) {
					int LA57_1 = input.LA(2);
					if ( (LA57_1==62) ) {
						alt57=1;
					}

				}

				switch (alt57) {
				case 1 :
					// JPA2.g:235:50: single_valued_object_field '.'
					{
					pushFollow(FOLLOW_single_valued_object_field_in_derived_collection_member_declaration2108);
					single_valued_object_field190=single_valued_object_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field190.getTree());

					char_literal191=(Token)match(input,62,FOLLOW_62_in_derived_collection_member_declaration2110); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal191_tree = (Object)adaptor.create(char_literal191);
					adaptor.addChild(root_0, char_literal191_tree);
					}

					}
					break;

				default :
					break loop57;
				}
			}

			pushFollow(FOLLOW_collection_valued_field_in_derived_collection_member_declaration2113);
			collection_valued_field192=collection_valued_field();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_field192.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derived_collection_member_declaration"


	public static class simple_select_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_select_clause"
	// JPA2.g:237:1: simple_select_clause : ( 'DISTINCT' )? simple_select_expression -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) ) ;
	public final JPA2Parser.simple_select_clause_return simple_select_clause() throws RecognitionException {
		JPA2Parser.simple_select_clause_return retval = new JPA2Parser.simple_select_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal193=null;
		ParserRuleReturnScope simple_select_expression194 =null;

		Object string_literal193_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleSubtreeStream stream_simple_select_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_select_expression");

		try {
			// JPA2.g:238:5: ( ( 'DISTINCT' )? simple_select_expression -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) ) )
			// JPA2.g:238:7: ( 'DISTINCT' )? simple_select_expression
			{
			// JPA2.g:238:7: ( 'DISTINCT' )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==DISTINCT) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// JPA2.g:238:8: 'DISTINCT'
					{
					string_literal193=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_simple_select_clause2126); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(string_literal193);

					}
					break;

			}

			pushFollow(FOLLOW_simple_select_expression_in_simple_select_clause2130);
			simple_select_expression194=simple_select_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_simple_select_expression.add(simple_select_expression194.getTree());
			// AST REWRITE
			// elements: DISTINCT, simple_select_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 239:5: -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) )
			{
				// JPA2.g:239:8: ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectedItemsNode(T_SELECTED_ITEMS), root_1);
				// JPA2.g:239:48: ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(new SelectedItemNode(T_SELECTED_ITEM), root_2);
				// JPA2.g:239:86: ( 'DISTINCT' )?
				if ( stream_DISTINCT.hasNext() ) {
					adaptor.addChild(root_2, stream_DISTINCT.nextNode());
				}
				stream_DISTINCT.reset();

				adaptor.addChild(root_2, stream_simple_select_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_select_clause"


	public static class simple_select_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_select_expression"
	// JPA2.g:240:1: simple_select_expression : ( path_expression | scalar_expression | aggregate_expression | identification_variable );
	public final JPA2Parser.simple_select_expression_return simple_select_expression() throws RecognitionException {
		JPA2Parser.simple_select_expression_return retval = new JPA2Parser.simple_select_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression195 =null;
		ParserRuleReturnScope scalar_expression196 =null;
		ParserRuleReturnScope aggregate_expression197 =null;
		ParserRuleReturnScope identification_variable198 =null;


		try {
			// JPA2.g:241:5: ( path_expression | scalar_expression | aggregate_expression | identification_variable )
			int alt59=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA59_1 = input.LA(2);
				if ( (synpred82_JPA2()) ) {
					alt59=1;
				}
				else if ( (synpred83_JPA2()) ) {
					alt59=2;
				}
				else if ( (true) ) {
					alt59=4;
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 57:
			case 59:
			case 61:
			case 64:
			case 71:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt59=2;
				}
				break;
			case COUNT:
				{
				int LA59_16 = input.LA(2);
				if ( (synpred83_JPA2()) ) {
					alt59=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt59=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA59_17 = input.LA(2);
				if ( (synpred83_JPA2()) ) {
					alt59=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt59=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA59_18 = input.LA(2);
				if ( (synpred83_JPA2()) ) {
					alt59=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt59=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// JPA2.g:241:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_simple_select_expression2170);
					path_expression195=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression195.getTree());

					}
					break;
				case 2 :
					// JPA2.g:242:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_simple_select_expression2178);
					scalar_expression196=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression196.getTree());

					}
					break;
				case 3 :
					// JPA2.g:243:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_simple_select_expression2186);
					aggregate_expression197=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression197.getTree());

					}
					break;
				case 4 :
					// JPA2.g:244:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_select_expression2194);
					identification_variable198=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable198.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_select_expression"


	public static class scalar_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scalar_expression"
	// JPA2.g:245:1: scalar_expression : ( arithmetic_expression | string_expression | enum_expression | datetime_expression | boolean_expression | case_expression | entity_type_expression );
	public final JPA2Parser.scalar_expression_return scalar_expression() throws RecognitionException {
		JPA2Parser.scalar_expression_return retval = new JPA2Parser.scalar_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic_expression199 =null;
		ParserRuleReturnScope string_expression200 =null;
		ParserRuleReturnScope enum_expression201 =null;
		ParserRuleReturnScope datetime_expression202 =null;
		ParserRuleReturnScope boolean_expression203 =null;
		ParserRuleReturnScope case_expression204 =null;
		ParserRuleReturnScope entity_type_expression205 =null;


		try {
			// JPA2.g:246:5: ( arithmetic_expression | string_expression | enum_expression | datetime_expression | boolean_expression | case_expression | entity_type_expression )
			int alt60=7;
			switch ( input.LA(1) ) {
			case INT_NUMERAL:
			case 59:
			case 61:
			case 64:
			case 78:
			case 104:
			case 108:
			case 110:
			case 113:
			case 126:
			case 128:
				{
				alt60=1;
				}
				break;
			case WORD:
				{
				int LA60_2 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (true) ) {
					alt60=7;
				}

				}
				break;
			case LPAREN:
				{
				int LA60_5 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 71:
				{
				int LA60_6 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (true) ) {
					alt60=7;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA60_7 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (true) ) {
					alt60=7;
				}

				}
				break;
			case 57:
				{
				int LA60_8 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (true) ) {
					alt60=7;
				}

				}
				break;
			case COUNT:
				{
				int LA60_16 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA60_17 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA60_18 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 84:
				{
				int LA60_19 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (synpred90_JPA2()) ) {
					alt60=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 86:
				{
				int LA60_20 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (synpred90_JPA2()) ) {
					alt60=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 118:
				{
				int LA60_21 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred87_JPA2()) ) {
					alt60=3;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}
				else if ( (synpred90_JPA2()) ) {
					alt60=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 85:
				{
				int LA60_22 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 100:
				{
				int LA60_23 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 23, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 76:
				{
				int LA60_24 = input.LA(2);
				if ( (synpred85_JPA2()) ) {
					alt60=1;
				}
				else if ( (synpred86_JPA2()) ) {
					alt60=2;
				}
				else if ( (synpred88_JPA2()) ) {
					alt60=4;
				}
				else if ( (synpred89_JPA2()) ) {
					alt60=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 24, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 87:
			case 129:
			case 133:
			case 136:
				{
				alt60=2;
				}
				break;
			case 88:
			case 89:
			case 90:
				{
				alt60=4;
				}
				break;
			case 142:
			case 143:
				{
				alt60=5;
				}
				break;
			case 134:
				{
				alt60=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// JPA2.g:246:7: arithmetic_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_scalar_expression2205);
					arithmetic_expression199=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression199.getTree());

					}
					break;
				case 2 :
					// JPA2.g:247:7: string_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_scalar_expression2213);
					string_expression200=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression200.getTree());

					}
					break;
				case 3 :
					// JPA2.g:248:7: enum_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_expression_in_scalar_expression2221);
					enum_expression201=enum_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression201.getTree());

					}
					break;
				case 4 :
					// JPA2.g:249:7: datetime_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_scalar_expression2229);
					datetime_expression202=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression202.getTree());

					}
					break;
				case 5 :
					// JPA2.g:250:7: boolean_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expression_in_scalar_expression2237);
					boolean_expression203=boolean_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression203.getTree());

					}
					break;
				case 6 :
					// JPA2.g:251:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_scalar_expression2245);
					case_expression204=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression204.getTree());

					}
					break;
				case 7 :
					// JPA2.g:252:7: entity_type_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_expression_in_scalar_expression2253);
					entity_type_expression205=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression205.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalar_expression"


	public static class conditional_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_expression"
	// JPA2.g:253:1: conditional_expression : ( conditional_term ) ( 'OR' conditional_term )* ;
	public final JPA2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
		JPA2Parser.conditional_expression_return retval = new JPA2Parser.conditional_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal207=null;
		ParserRuleReturnScope conditional_term206 =null;
		ParserRuleReturnScope conditional_term208 =null;

		Object string_literal207_tree=null;

		try {
			// JPA2.g:254:5: ( ( conditional_term ) ( 'OR' conditional_term )* )
			// JPA2.g:254:7: ( conditional_term ) ( 'OR' conditional_term )*
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:254:7: ( conditional_term )
			// JPA2.g:254:8: conditional_term
			{
			pushFollow(FOLLOW_conditional_term_in_conditional_expression2265);
			conditional_term206=conditional_term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_term206.getTree());

			}

			// JPA2.g:254:26: ( 'OR' conditional_term )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==OR) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// JPA2.g:254:27: 'OR' conditional_term
					{
					string_literal207=(Token)match(input,OR,FOLLOW_OR_in_conditional_expression2269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal207_tree = (Object)adaptor.create(string_literal207);
					adaptor.addChild(root_0, string_literal207_tree);
					}

					pushFollow(FOLLOW_conditional_term_in_conditional_expression2271);
					conditional_term208=conditional_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_term208.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_expression"


	public static class conditional_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_term"
	// JPA2.g:255:1: conditional_term : ( conditional_factor ) ( 'AND' conditional_factor )* ;
	public final JPA2Parser.conditional_term_return conditional_term() throws RecognitionException {
		JPA2Parser.conditional_term_return retval = new JPA2Parser.conditional_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal210=null;
		ParserRuleReturnScope conditional_factor209 =null;
		ParserRuleReturnScope conditional_factor211 =null;

		Object string_literal210_tree=null;

		try {
			// JPA2.g:256:5: ( ( conditional_factor ) ( 'AND' conditional_factor )* )
			// JPA2.g:256:7: ( conditional_factor ) ( 'AND' conditional_factor )*
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:256:7: ( conditional_factor )
			// JPA2.g:256:8: conditional_factor
			{
			pushFollow(FOLLOW_conditional_factor_in_conditional_term2285);
			conditional_factor209=conditional_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_factor209.getTree());

			}

			// JPA2.g:256:28: ( 'AND' conditional_factor )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==AND) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// JPA2.g:256:29: 'AND' conditional_factor
					{
					string_literal210=(Token)match(input,AND,FOLLOW_AND_in_conditional_term2289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal210_tree = (Object)adaptor.create(string_literal210);
					adaptor.addChild(root_0, string_literal210_tree);
					}

					pushFollow(FOLLOW_conditional_factor_in_conditional_term2291);
					conditional_factor211=conditional_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_factor211.getTree());

					}
					break;

				default :
					break loop62;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_term"


	public static class conditional_factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_factor"
	// JPA2.g:257:1: conditional_factor : ( 'NOT' )? conditional_primary ;
	public final JPA2Parser.conditional_factor_return conditional_factor() throws RecognitionException {
		JPA2Parser.conditional_factor_return retval = new JPA2Parser.conditional_factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope conditional_primary213 =null;

		Object string_literal212_tree=null;

		try {
			// JPA2.g:258:5: ( ( 'NOT' )? conditional_primary )
			// JPA2.g:258:7: ( 'NOT' )? conditional_primary
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:258:7: ( 'NOT' )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==NOT) ) {
				int LA63_1 = input.LA(2);
				if ( (synpred93_JPA2()) ) {
					alt63=1;
				}
			}
			switch (alt63) {
				case 1 :
					// JPA2.g:258:8: 'NOT'
					{
					string_literal212=(Token)match(input,NOT,FOLLOW_NOT_in_conditional_factor2305); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = (Object)adaptor.create(string_literal212);
					adaptor.addChild(root_0, string_literal212_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_conditional_primary_in_conditional_factor2309);
			conditional_primary213=conditional_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_primary213.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_factor"


	public static class conditional_primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_primary"
	// JPA2.g:259:1: conditional_primary : ( simple_cond_expression -> ^( T_SIMPLE_CONDITION[] simple_cond_expression ) | '(' conditional_expression ')' );
	public final JPA2Parser.conditional_primary_return conditional_primary() throws RecognitionException {
		JPA2Parser.conditional_primary_return retval = new JPA2Parser.conditional_primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal215=null;
		Token char_literal217=null;
		ParserRuleReturnScope simple_cond_expression214 =null;
		ParserRuleReturnScope conditional_expression216 =null;

		Object char_literal215_tree=null;
		Object char_literal217_tree=null;
		RewriteRuleSubtreeStream stream_simple_cond_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_cond_expression");

		try {
			// JPA2.g:260:5: ( simple_cond_expression -> ^( T_SIMPLE_CONDITION[] simple_cond_expression ) | '(' conditional_expression ')' )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==AVG||LA64_0==COUNT||LA64_0==INT_NUMERAL||LA64_0==LOWER||(LA64_0 >= MAX && LA64_0 <= NOT)||(LA64_0 >= STRING_LITERAL && LA64_0 <= SUM)||LA64_0==WORD||LA64_0==57||LA64_0==59||LA64_0==61||LA64_0==64||(LA64_0 >= 71 && LA64_0 <= 78)||(LA64_0 >= 84 && LA64_0 <= 90)||(LA64_0 >= 99 && LA64_0 <= 100)||LA64_0==102||LA64_0==104||LA64_0==108||LA64_0==110||LA64_0==113||LA64_0==118||LA64_0==126||(LA64_0 >= 128 && LA64_0 <= 129)||(LA64_0 >= 132 && LA64_0 <= 134)||LA64_0==136||(LA64_0 >= 142 && LA64_0 <= 143)) ) {
				alt64=1;
			}
			else if ( (LA64_0==LPAREN) ) {
				int LA64_20 = input.LA(2);
				if ( (synpred94_JPA2()) ) {
					alt64=1;
				}
				else if ( (true) ) {
					alt64=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// JPA2.g:260:7: simple_cond_expression
					{
					pushFollow(FOLLOW_simple_cond_expression_in_conditional_primary2320);
					simple_cond_expression214=simple_cond_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_simple_cond_expression.add(simple_cond_expression214.getTree());
					// AST REWRITE
					// elements: simple_cond_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 261:5: -> ^( T_SIMPLE_CONDITION[] simple_cond_expression )
					{
						// JPA2.g:261:8: ^( T_SIMPLE_CONDITION[] simple_cond_expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new SimpleConditionNode(T_SIMPLE_CONDITION), root_1);
						adaptor.addChild(root_1, stream_simple_cond_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:262:7: '(' conditional_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_primary2344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = (Object)adaptor.create(char_literal215);
					adaptor.addChild(root_0, char_literal215_tree);
					}

					pushFollow(FOLLOW_conditional_expression_in_conditional_primary2345);
					conditional_expression216=conditional_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression216.getTree());

					char_literal217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_primary2346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal217_tree = (Object)adaptor.create(char_literal217);
					adaptor.addChild(root_0, char_literal217_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_primary"


	public static class simple_cond_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_cond_expression"
	// JPA2.g:263:1: simple_cond_expression : ( comparison_expression | between_expression | in_expression | like_expression | null_comparison_expression | empty_collection_comparison_expression | collection_member_expression | exists_expression | date_macro_expression );
	public final JPA2Parser.simple_cond_expression_return simple_cond_expression() throws RecognitionException {
		JPA2Parser.simple_cond_expression_return retval = new JPA2Parser.simple_cond_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope comparison_expression218 =null;
		ParserRuleReturnScope between_expression219 =null;
		ParserRuleReturnScope in_expression220 =null;
		ParserRuleReturnScope like_expression221 =null;
		ParserRuleReturnScope null_comparison_expression222 =null;
		ParserRuleReturnScope empty_collection_comparison_expression223 =null;
		ParserRuleReturnScope collection_member_expression224 =null;
		ParserRuleReturnScope exists_expression225 =null;
		ParserRuleReturnScope date_macro_expression226 =null;


		try {
			// JPA2.g:264:5: ( comparison_expression | between_expression | in_expression | like_expression | null_comparison_expression | empty_collection_comparison_expression | collection_member_expression | exists_expression | date_macro_expression )
			int alt65=9;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA65_1 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred97_JPA2()) ) {
					alt65=3;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}
				else if ( (synpred99_JPA2()) ) {
					alt65=5;
				}
				else if ( (synpred100_JPA2()) ) {
					alt65=6;
				}
				else if ( (synpred101_JPA2()) ) {
					alt65=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING_LITERAL:
				{
				int LA65_2 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 71:
				{
				int LA65_3 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}
				else if ( (synpred99_JPA2()) ) {
					alt65=5;
				}
				else if ( (synpred101_JPA2()) ) {
					alt65=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA65_4 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}
				else if ( (synpred99_JPA2()) ) {
					alt65=5;
				}
				else if ( (synpred101_JPA2()) ) {
					alt65=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
				{
				int LA65_5 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}
				else if ( (synpred99_JPA2()) ) {
					alt65=5;
				}
				else if ( (synpred101_JPA2()) ) {
					alt65=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 87:
				{
				int LA65_6 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 129:
				{
				int LA65_7 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 133:
				{
				int LA65_8 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LOWER:
				{
				int LA65_9 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 136:
				{
				int LA65_10 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA65_11 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA65_12 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA65_13 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 84:
				{
				int LA65_14 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 86:
				{
				int LA65_15 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 118:
				{
				int LA65_16 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 85:
				{
				int LA65_17 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 100:
				{
				int LA65_18 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 76:
				{
				int LA65_19 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				int LA65_20 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}
				else if ( (synpred98_JPA2()) ) {
					alt65=4;
				}
				else if ( (synpred101_JPA2()) ) {
					alt65=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 142:
			case 143:
				{
				alt65=1;
				}
				break;
			case 88:
			case 89:
			case 90:
				{
				int LA65_22 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 134:
				{
				int LA65_23 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred97_JPA2()) ) {
					alt65=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 23, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 59:
			case 61:
				{
				int LA65_24 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 24, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 64:
				{
				int LA65_25 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 25, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA65_26 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 26, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 108:
				{
				int LA65_27 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 27, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 110:
				{
				int LA65_28 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 28, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 78:
				{
				int LA65_29 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 29, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 128:
				{
				int LA65_30 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 30, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 113:
				{
				int LA65_31 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 31, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 126:
				{
				int LA65_32 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 32, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 104:
				{
				int LA65_33 = input.LA(2);
				if ( (synpred95_JPA2()) ) {
					alt65=1;
				}
				else if ( (synpred96_JPA2()) ) {
					alt65=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 33, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 132:
				{
				alt65=5;
				}
				break;
			case NOT:
			case 99:
				{
				alt65=8;
				}
				break;
			case 72:
			case 73:
			case 74:
			case 75:
			case 77:
				{
				alt65=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// JPA2.g:264:7: comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_expression_in_simple_cond_expression2357);
					comparison_expression218=comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_expression218.getTree());

					}
					break;
				case 2 :
					// JPA2.g:265:7: between_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_between_expression_in_simple_cond_expression2365);
					between_expression219=between_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, between_expression219.getTree());

					}
					break;
				case 3 :
					// JPA2.g:266:7: in_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_in_expression_in_simple_cond_expression2373);
					in_expression220=in_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_expression220.getTree());

					}
					break;
				case 4 :
					// JPA2.g:267:7: like_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_like_expression_in_simple_cond_expression2381);
					like_expression221=like_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_expression221.getTree());

					}
					break;
				case 5 :
					// JPA2.g:268:7: null_comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_null_comparison_expression_in_simple_cond_expression2389);
					null_comparison_expression222=null_comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_comparison_expression222.getTree());

					}
					break;
				case 6 :
					// JPA2.g:269:7: empty_collection_comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_empty_collection_comparison_expression_in_simple_cond_expression2397);
					empty_collection_comparison_expression223=empty_collection_comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_collection_comparison_expression223.getTree());

					}
					break;
				case 7 :
					// JPA2.g:270:7: collection_member_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_collection_member_expression_in_simple_cond_expression2405);
					collection_member_expression224=collection_member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_member_expression224.getTree());

					}
					break;
				case 8 :
					// JPA2.g:271:7: exists_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exists_expression_in_simple_cond_expression2413);
					exists_expression225=exists_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists_expression225.getTree());

					}
					break;
				case 9 :
					// JPA2.g:272:7: date_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_macro_expression_in_simple_cond_expression2421);
					date_macro_expression226=date_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_macro_expression226.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_cond_expression"


	public static class date_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_macro_expression"
	// JPA2.g:275:1: date_macro_expression : ( date_between_macro_expression | date_before_macro_expression | date_after_macro_expression | date_equals_macro_expression | date_today_macro_expression );
	public final JPA2Parser.date_macro_expression_return date_macro_expression() throws RecognitionException {
		JPA2Parser.date_macro_expression_return retval = new JPA2Parser.date_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope date_between_macro_expression227 =null;
		ParserRuleReturnScope date_before_macro_expression228 =null;
		ParserRuleReturnScope date_after_macro_expression229 =null;
		ParserRuleReturnScope date_equals_macro_expression230 =null;
		ParserRuleReturnScope date_today_macro_expression231 =null;


		try {
			// JPA2.g:276:5: ( date_between_macro_expression | date_before_macro_expression | date_after_macro_expression | date_equals_macro_expression | date_today_macro_expression )
			int alt66=5;
			switch ( input.LA(1) ) {
			case 72:
				{
				alt66=1;
				}
				break;
			case 74:
				{
				alt66=2;
				}
				break;
			case 73:
				{
				alt66=3;
				}
				break;
			case 75:
				{
				alt66=4;
				}
				break;
			case 77:
				{
				alt66=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// JPA2.g:276:7: date_between_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_between_macro_expression_in_date_macro_expression2434);
					date_between_macro_expression227=date_between_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_between_macro_expression227.getTree());

					}
					break;
				case 2 :
					// JPA2.g:277:7: date_before_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_before_macro_expression_in_date_macro_expression2442);
					date_before_macro_expression228=date_before_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_before_macro_expression228.getTree());

					}
					break;
				case 3 :
					// JPA2.g:278:7: date_after_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_after_macro_expression_in_date_macro_expression2450);
					date_after_macro_expression229=date_after_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_after_macro_expression229.getTree());

					}
					break;
				case 4 :
					// JPA2.g:279:7: date_equals_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_equals_macro_expression_in_date_macro_expression2458);
					date_equals_macro_expression230=date_equals_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_equals_macro_expression230.getTree());

					}
					break;
				case 5 :
					// JPA2.g:280:7: date_today_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_today_macro_expression_in_date_macro_expression2466);
					date_today_macro_expression231=date_today_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_today_macro_expression231.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_macro_expression"


	public static class date_between_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_between_macro_expression"
	// JPA2.g:282:1: date_between_macro_expression : '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')' ;
	public final JPA2Parser.date_between_macro_expression_return date_between_macro_expression() throws RecognitionException {
		JPA2Parser.date_between_macro_expression_return retval = new JPA2Parser.date_between_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal232=null;
		Token char_literal233=null;
		Token char_literal235=null;
		Token string_literal236=null;
		Token set237=null;
		Token char_literal239=null;
		Token string_literal240=null;
		Token set241=null;
		Token char_literal243=null;
		Token set244=null;
		Token char_literal245=null;
		ParserRuleReturnScope path_expression234 =null;
		ParserRuleReturnScope numeric_literal238 =null;
		ParserRuleReturnScope numeric_literal242 =null;

		Object string_literal232_tree=null;
		Object char_literal233_tree=null;
		Object char_literal235_tree=null;
		Object string_literal236_tree=null;
		Object set237_tree=null;
		Object char_literal239_tree=null;
		Object string_literal240_tree=null;
		Object set241_tree=null;
		Object char_literal243_tree=null;
		Object set244_tree=null;
		Object char_literal245_tree=null;

		try {
			// JPA2.g:283:5: ( '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')' )
			// JPA2.g:283:7: '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal232=(Token)match(input,72,FOLLOW_72_in_date_between_macro_expression2478); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal232_tree = (Object)adaptor.create(string_literal232);
			adaptor.addChild(root_0, string_literal232_tree);
			}

			char_literal233=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_between_macro_expression2480); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal233_tree = (Object)adaptor.create(char_literal233);
			adaptor.addChild(root_0, char_literal233_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_between_macro_expression2482);
			path_expression234=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression234.getTree());

			char_literal235=(Token)match(input,60,FOLLOW_60_in_date_between_macro_expression2484); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal235_tree = (Object)adaptor.create(char_literal235);
			adaptor.addChild(root_0, char_literal235_tree);
			}

			string_literal236=(Token)match(input,116,FOLLOW_116_in_date_between_macro_expression2486); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal236_tree = (Object)adaptor.create(string_literal236);
			adaptor.addChild(root_0, string_literal236_tree);
			}

			// JPA2.g:283:48: ( ( '+' | '-' ) numeric_literal )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==59||LA67_0==61) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// JPA2.g:283:49: ( '+' | '-' ) numeric_literal
					{
					set237=input.LT(1);
					if ( input.LA(1)==59||input.LA(1)==61 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set237));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_literal_in_date_between_macro_expression2497);
					numeric_literal238=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal238.getTree());

					}
					break;

			}

			char_literal239=(Token)match(input,60,FOLLOW_60_in_date_between_macro_expression2501); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal239_tree = (Object)adaptor.create(char_literal239);
			adaptor.addChild(root_0, char_literal239_tree);
			}

			string_literal240=(Token)match(input,116,FOLLOW_116_in_date_between_macro_expression2503); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal240_tree = (Object)adaptor.create(string_literal240);
			adaptor.addChild(root_0, string_literal240_tree);
			}

			// JPA2.g:283:89: ( ( '+' | '-' ) numeric_literal )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==59||LA68_0==61) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// JPA2.g:283:90: ( '+' | '-' ) numeric_literal
					{
					set241=input.LT(1);
					if ( input.LA(1)==59||input.LA(1)==61 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set241));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_literal_in_date_between_macro_expression2514);
					numeric_literal242=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal242.getTree());

					}
					break;

			}

			char_literal243=(Token)match(input,60,FOLLOW_60_in_date_between_macro_expression2518); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal243_tree = (Object)adaptor.create(char_literal243);
			adaptor.addChild(root_0, char_literal243_tree);
			}

			set244=input.LT(1);
			if ( input.LA(1)==91||input.LA(1)==103||input.LA(1)==112||input.LA(1)==114||input.LA(1)==124||input.LA(1)==141 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set244));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_between_macro_expression2543); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal245_tree = (Object)adaptor.create(char_literal245);
			adaptor.addChild(root_0, char_literal245_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_between_macro_expression"


	public static class date_before_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_before_macro_expression"
	// JPA2.g:285:1: date_before_macro_expression : '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_before_macro_expression_return date_before_macro_expression() throws RecognitionException {
		JPA2Parser.date_before_macro_expression_return retval = new JPA2Parser.date_before_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal246=null;
		Token char_literal247=null;
		Token char_literal249=null;
		Token char_literal252=null;
		ParserRuleReturnScope path_expression248 =null;
		ParserRuleReturnScope path_expression250 =null;
		ParserRuleReturnScope input_parameter251 =null;

		Object string_literal246_tree=null;
		Object char_literal247_tree=null;
		Object char_literal249_tree=null;
		Object char_literal252_tree=null;

		try {
			// JPA2.g:286:5: ( '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:286:7: '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal246=(Token)match(input,74,FOLLOW_74_in_date_before_macro_expression2555); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal246_tree = (Object)adaptor.create(string_literal246);
			adaptor.addChild(root_0, string_literal246_tree);
			}

			char_literal247=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_before_macro_expression2557); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal247_tree = (Object)adaptor.create(char_literal247);
			adaptor.addChild(root_0, char_literal247_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_before_macro_expression2559);
			path_expression248=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression248.getTree());

			char_literal249=(Token)match(input,60,FOLLOW_60_in_date_before_macro_expression2561); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal249_tree = (Object)adaptor.create(char_literal249);
			adaptor.addChild(root_0, char_literal249_tree);
			}

			// JPA2.g:286:45: ( path_expression | input_parameter )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==WORD) ) {
				alt69=1;
			}
			else if ( (LA69_0==NAMED_PARAMETER||LA69_0==57||LA69_0==71) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// JPA2.g:286:46: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_before_macro_expression2564);
					path_expression250=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression250.getTree());

					}
					break;
				case 2 :
					// JPA2.g:286:64: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_before_macro_expression2568);
					input_parameter251=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter251.getTree());

					}
					break;

			}

			char_literal252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_before_macro_expression2571); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal252_tree = (Object)adaptor.create(char_literal252);
			adaptor.addChild(root_0, char_literal252_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_before_macro_expression"


	public static class date_after_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_after_macro_expression"
	// JPA2.g:288:1: date_after_macro_expression : '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_after_macro_expression_return date_after_macro_expression() throws RecognitionException {
		JPA2Parser.date_after_macro_expression_return retval = new JPA2Parser.date_after_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal253=null;
		Token char_literal254=null;
		Token char_literal256=null;
		Token char_literal259=null;
		ParserRuleReturnScope path_expression255 =null;
		ParserRuleReturnScope path_expression257 =null;
		ParserRuleReturnScope input_parameter258 =null;

		Object string_literal253_tree=null;
		Object char_literal254_tree=null;
		Object char_literal256_tree=null;
		Object char_literal259_tree=null;

		try {
			// JPA2.g:289:5: ( '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:289:7: '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal253=(Token)match(input,73,FOLLOW_73_in_date_after_macro_expression2583); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal253_tree = (Object)adaptor.create(string_literal253);
			adaptor.addChild(root_0, string_literal253_tree);
			}

			char_literal254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_after_macro_expression2585); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal254_tree = (Object)adaptor.create(char_literal254);
			adaptor.addChild(root_0, char_literal254_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_after_macro_expression2587);
			path_expression255=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression255.getTree());

			char_literal256=(Token)match(input,60,FOLLOW_60_in_date_after_macro_expression2589); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal256_tree = (Object)adaptor.create(char_literal256);
			adaptor.addChild(root_0, char_literal256_tree);
			}

			// JPA2.g:289:44: ( path_expression | input_parameter )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==WORD) ) {
				alt70=1;
			}
			else if ( (LA70_0==NAMED_PARAMETER||LA70_0==57||LA70_0==71) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// JPA2.g:289:45: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_after_macro_expression2592);
					path_expression257=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression257.getTree());

					}
					break;
				case 2 :
					// JPA2.g:289:63: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_after_macro_expression2596);
					input_parameter258=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter258.getTree());

					}
					break;

			}

			char_literal259=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_after_macro_expression2599); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal259_tree = (Object)adaptor.create(char_literal259);
			adaptor.addChild(root_0, char_literal259_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_after_macro_expression"


	public static class date_equals_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_equals_macro_expression"
	// JPA2.g:291:1: date_equals_macro_expression : '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_equals_macro_expression_return date_equals_macro_expression() throws RecognitionException {
		JPA2Parser.date_equals_macro_expression_return retval = new JPA2Parser.date_equals_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal260=null;
		Token char_literal261=null;
		Token char_literal263=null;
		Token char_literal266=null;
		ParserRuleReturnScope path_expression262 =null;
		ParserRuleReturnScope path_expression264 =null;
		ParserRuleReturnScope input_parameter265 =null;

		Object string_literal260_tree=null;
		Object char_literal261_tree=null;
		Object char_literal263_tree=null;
		Object char_literal266_tree=null;

		try {
			// JPA2.g:292:5: ( '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:292:7: '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal260=(Token)match(input,75,FOLLOW_75_in_date_equals_macro_expression2611); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal260_tree = (Object)adaptor.create(string_literal260);
			adaptor.addChild(root_0, string_literal260_tree);
			}

			char_literal261=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_equals_macro_expression2613); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal261_tree = (Object)adaptor.create(char_literal261);
			adaptor.addChild(root_0, char_literal261_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_equals_macro_expression2615);
			path_expression262=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression262.getTree());

			char_literal263=(Token)match(input,60,FOLLOW_60_in_date_equals_macro_expression2617); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal263_tree = (Object)adaptor.create(char_literal263);
			adaptor.addChild(root_0, char_literal263_tree);
			}

			// JPA2.g:292:45: ( path_expression | input_parameter )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==WORD) ) {
				alt71=1;
			}
			else if ( (LA71_0==NAMED_PARAMETER||LA71_0==57||LA71_0==71) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// JPA2.g:292:46: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_equals_macro_expression2620);
					path_expression264=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression264.getTree());

					}
					break;
				case 2 :
					// JPA2.g:292:64: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_equals_macro_expression2624);
					input_parameter265=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter265.getTree());

					}
					break;

			}

			char_literal266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_equals_macro_expression2627); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal266_tree = (Object)adaptor.create(char_literal266);
			adaptor.addChild(root_0, char_literal266_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_equals_macro_expression"


	public static class date_today_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_today_macro_expression"
	// JPA2.g:294:1: date_today_macro_expression : '@TODAY' '(' path_expression ')' ;
	public final JPA2Parser.date_today_macro_expression_return date_today_macro_expression() throws RecognitionException {
		JPA2Parser.date_today_macro_expression_return retval = new JPA2Parser.date_today_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal267=null;
		Token char_literal268=null;
		Token char_literal270=null;
		ParserRuleReturnScope path_expression269 =null;

		Object string_literal267_tree=null;
		Object char_literal268_tree=null;
		Object char_literal270_tree=null;

		try {
			// JPA2.g:295:5: ( '@TODAY' '(' path_expression ')' )
			// JPA2.g:295:7: '@TODAY' '(' path_expression ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal267=(Token)match(input,77,FOLLOW_77_in_date_today_macro_expression2639); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal267_tree = (Object)adaptor.create(string_literal267);
			adaptor.addChild(root_0, string_literal267_tree);
			}

			char_literal268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_today_macro_expression2641); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal268_tree = (Object)adaptor.create(char_literal268);
			adaptor.addChild(root_0, char_literal268_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_today_macro_expression2643);
			path_expression269=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression269.getTree());

			char_literal270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_today_macro_expression2645); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal270_tree = (Object)adaptor.create(char_literal270);
			adaptor.addChild(root_0, char_literal270_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_today_macro_expression"


	public static class between_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "between_expression"
	// JPA2.g:298:1: between_expression : ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression | string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression | datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression );
	public final JPA2Parser.between_expression_return between_expression() throws RecognitionException {
		JPA2Parser.between_expression_return retval = new JPA2Parser.between_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal272=null;
		Token string_literal273=null;
		Token string_literal275=null;
		Token string_literal278=null;
		Token string_literal279=null;
		Token string_literal281=null;
		Token string_literal284=null;
		Token string_literal285=null;
		Token string_literal287=null;
		ParserRuleReturnScope arithmetic_expression271 =null;
		ParserRuleReturnScope arithmetic_expression274 =null;
		ParserRuleReturnScope arithmetic_expression276 =null;
		ParserRuleReturnScope string_expression277 =null;
		ParserRuleReturnScope string_expression280 =null;
		ParserRuleReturnScope string_expression282 =null;
		ParserRuleReturnScope datetime_expression283 =null;
		ParserRuleReturnScope datetime_expression286 =null;
		ParserRuleReturnScope datetime_expression288 =null;

		Object string_literal272_tree=null;
		Object string_literal273_tree=null;
		Object string_literal275_tree=null;
		Object string_literal278_tree=null;
		Object string_literal279_tree=null;
		Object string_literal281_tree=null;
		Object string_literal284_tree=null;
		Object string_literal285_tree=null;
		Object string_literal287_tree=null;

		try {
			// JPA2.g:299:5: ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression | string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression | datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression )
			int alt75=3;
			switch ( input.LA(1) ) {
			case INT_NUMERAL:
			case 59:
			case 61:
			case 64:
			case 78:
			case 104:
			case 108:
			case 110:
			case 113:
			case 126:
			case 128:
				{
				alt75=1;
				}
				break;
			case WORD:
				{
				int LA75_2 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case LPAREN:
				{
				int LA75_5 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 71:
				{
				int LA75_6 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA75_7 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 57:
				{
				int LA75_8 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case COUNT:
				{
				int LA75_16 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA75_17 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 102:
				{
				int LA75_18 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 84:
				{
				int LA75_19 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 86:
				{
				int LA75_20 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 118:
				{
				int LA75_21 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 85:
				{
				int LA75_22 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 100:
				{
				int LA75_23 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case 76:
				{
				int LA75_24 = input.LA(2);
				if ( (synpred120_JPA2()) ) {
					alt75=1;
				}
				else if ( (synpred122_JPA2()) ) {
					alt75=2;
				}
				else if ( (true) ) {
					alt75=3;
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 87:
			case 129:
			case 133:
			case 136:
				{
				alt75=2;
				}
				break;
			case 88:
			case 89:
			case 90:
				{
				alt75=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// JPA2.g:299:7: arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2658);
					arithmetic_expression271=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression271.getTree());

					// JPA2.g:299:29: ( 'NOT' )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==NOT) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// JPA2.g:299:30: 'NOT'
							{
							string_literal272=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2661); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal272_tree = (Object)adaptor.create(string_literal272);
							adaptor.addChild(root_0, string_literal272_tree);
							}

							}
							break;

					}

					string_literal273=(Token)match(input,82,FOLLOW_82_in_between_expression2665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal273_tree = (Object)adaptor.create(string_literal273);
					adaptor.addChild(root_0, string_literal273_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2667);
					arithmetic_expression274=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression274.getTree());

					string_literal275=(Token)match(input,AND,FOLLOW_AND_in_between_expression2669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal275_tree = (Object)adaptor.create(string_literal275);
					adaptor.addChild(root_0, string_literal275_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2671);
					arithmetic_expression276=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression276.getTree());

					}
					break;
				case 2 :
					// JPA2.g:300:7: string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_between_expression2679);
					string_expression277=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression277.getTree());

					// JPA2.g:300:25: ( 'NOT' )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==NOT) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// JPA2.g:300:26: 'NOT'
							{
							string_literal278=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2682); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal278_tree = (Object)adaptor.create(string_literal278);
							adaptor.addChild(root_0, string_literal278_tree);
							}

							}
							break;

					}

					string_literal279=(Token)match(input,82,FOLLOW_82_in_between_expression2686); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal279_tree = (Object)adaptor.create(string_literal279);
					adaptor.addChild(root_0, string_literal279_tree);
					}

					pushFollow(FOLLOW_string_expression_in_between_expression2688);
					string_expression280=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression280.getTree());

					string_literal281=(Token)match(input,AND,FOLLOW_AND_in_between_expression2690); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal281_tree = (Object)adaptor.create(string_literal281);
					adaptor.addChild(root_0, string_literal281_tree);
					}

					pushFollow(FOLLOW_string_expression_in_between_expression2692);
					string_expression282=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression282.getTree());

					}
					break;
				case 3 :
					// JPA2.g:301:7: datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_between_expression2700);
					datetime_expression283=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression283.getTree());

					// JPA2.g:301:27: ( 'NOT' )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==NOT) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// JPA2.g:301:28: 'NOT'
							{
							string_literal284=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2703); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal284_tree = (Object)adaptor.create(string_literal284);
							adaptor.addChild(root_0, string_literal284_tree);
							}

							}
							break;

					}

					string_literal285=(Token)match(input,82,FOLLOW_82_in_between_expression2707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal285_tree = (Object)adaptor.create(string_literal285);
					adaptor.addChild(root_0, string_literal285_tree);
					}

					pushFollow(FOLLOW_datetime_expression_in_between_expression2709);
					datetime_expression286=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression286.getTree());

					string_literal287=(Token)match(input,AND,FOLLOW_AND_in_between_expression2711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal287_tree = (Object)adaptor.create(string_literal287);
					adaptor.addChild(root_0, string_literal287_tree);
					}

					pushFollow(FOLLOW_datetime_expression_in_between_expression2713);
					datetime_expression288=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression288.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "between_expression"


	public static class in_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_expression"
	// JPA2.g:302:1: in_expression : ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' ) ;
	public final JPA2Parser.in_expression_return in_expression() throws RecognitionException {
		JPA2Parser.in_expression_return retval = new JPA2Parser.in_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT292=null;
		Token IN293=null;
		Token char_literal294=null;
		Token char_literal296=null;
		Token char_literal298=null;
		Token char_literal301=null;
		Token char_literal303=null;
		ParserRuleReturnScope path_expression289 =null;
		ParserRuleReturnScope type_discriminator290 =null;
		ParserRuleReturnScope identification_variable291 =null;
		ParserRuleReturnScope in_item295 =null;
		ParserRuleReturnScope in_item297 =null;
		ParserRuleReturnScope subquery299 =null;
		ParserRuleReturnScope collection_valued_input_parameter300 =null;
		ParserRuleReturnScope path_expression302 =null;

		Object NOT292_tree=null;
		Object IN293_tree=null;
		Object char_literal294_tree=null;
		Object char_literal296_tree=null;
		Object char_literal298_tree=null;
		Object char_literal301_tree=null;
		Object char_literal303_tree=null;

		try {
			// JPA2.g:303:5: ( ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' ) )
			// JPA2.g:303:7: ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' )
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:303:7: ( path_expression | type_discriminator | identification_variable )
			int alt76=3;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==WORD) ) {
				int LA76_1 = input.LA(2);
				if ( (LA76_1==62) ) {
					alt76=1;
				}
				else if ( (LA76_1==IN||LA76_1==NOT) ) {
					alt76=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA76_0==134) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// JPA2.g:303:8: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_in_expression2725);
					path_expression289=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression289.getTree());

					}
					break;
				case 2 :
					// JPA2.g:303:26: type_discriminator
					{
					pushFollow(FOLLOW_type_discriminator_in_in_expression2729);
					type_discriminator290=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator290.getTree());

					}
					break;
				case 3 :
					// JPA2.g:303:47: identification_variable
					{
					pushFollow(FOLLOW_identification_variable_in_in_expression2733);
					identification_variable291=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable291.getTree());

					}
					break;

			}

			// JPA2.g:303:72: ( NOT )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==NOT) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// JPA2.g:303:73: NOT
					{
					NOT292=(Token)match(input,NOT,FOLLOW_NOT_in_in_expression2737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT292_tree = (Object)adaptor.create(NOT292);
					adaptor.addChild(root_0, NOT292_tree);
					}

					}
					break;

			}

			IN293=(Token)match(input,IN,FOLLOW_IN_in_in_expression2741); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN293_tree = (Object)adaptor.create(IN293);
			adaptor.addChild(root_0, IN293_tree);
			}

			// JPA2.g:304:13: ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' )
			int alt79=4;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LPAREN) ) {
				switch ( input.LA(2) ) {
				case 125:
					{
					alt79=2;
					}
					break;
				case WORD:
					{
					int LA79_4 = input.LA(3);
					if ( (LA79_4==RPAREN||LA79_4==60) ) {
						alt79=1;
					}
					else if ( (LA79_4==62) ) {
						alt79=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 79, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case NAMED_PARAMETER:
				case 57:
				case 71:
					{
					alt79=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA79_0==NAMED_PARAMETER||LA79_0==57||LA79_0==71) ) {
				alt79=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// JPA2.g:304:15: '(' in_item ( ',' in_item )* ')'
					{
					char_literal294=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expression2757); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal294_tree = (Object)adaptor.create(char_literal294);
					adaptor.addChild(root_0, char_literal294_tree);
					}

					pushFollow(FOLLOW_in_item_in_in_expression2759);
					in_item295=in_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_item295.getTree());

					// JPA2.g:304:27: ( ',' in_item )*
					loop78:
					while (true) {
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==60) ) {
							alt78=1;
						}

						switch (alt78) {
						case 1 :
							// JPA2.g:304:28: ',' in_item
							{
							char_literal296=(Token)match(input,60,FOLLOW_60_in_in_expression2762); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal296_tree = (Object)adaptor.create(char_literal296);
							adaptor.addChild(root_0, char_literal296_tree);
							}

							pushFollow(FOLLOW_in_item_in_in_expression2764);
							in_item297=in_item();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, in_item297.getTree());

							}
							break;

						default :
							break loop78;
						}
					}

					char_literal298=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expression2768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal298_tree = (Object)adaptor.create(char_literal298);
					adaptor.addChild(root_0, char_literal298_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:305:15: subquery
					{
					pushFollow(FOLLOW_subquery_in_in_expression2784);
					subquery299=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery299.getTree());

					}
					break;
				case 3 :
					// JPA2.g:306:15: collection_valued_input_parameter
					{
					pushFollow(FOLLOW_collection_valued_input_parameter_in_in_expression2800);
					collection_valued_input_parameter300=collection_valued_input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_input_parameter300.getTree());

					}
					break;
				case 4 :
					// JPA2.g:307:15: '(' path_expression ')'
					{
					char_literal301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expression2816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal301_tree = (Object)adaptor.create(char_literal301);
					adaptor.addChild(root_0, char_literal301_tree);
					}

					pushFollow(FOLLOW_path_expression_in_in_expression2818);
					path_expression302=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression302.getTree());

					char_literal303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expression2820); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal303_tree = (Object)adaptor.create(char_literal303);
					adaptor.addChild(root_0, char_literal303_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_expression"


	public static class in_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_item"
	// JPA2.g:313:1: in_item : ( literal | single_valued_input_parameter );
	public final JPA2Parser.in_item_return in_item() throws RecognitionException {
		JPA2Parser.in_item_return retval = new JPA2Parser.in_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope literal304 =null;
		ParserRuleReturnScope single_valued_input_parameter305 =null;


		try {
			// JPA2.g:314:5: ( literal | single_valued_input_parameter )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==WORD) ) {
				alt80=1;
			}
			else if ( (LA80_0==NAMED_PARAMETER||LA80_0==57||LA80_0==71) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// JPA2.g:314:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_in_item2848);
					literal304=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal304.getTree());

					}
					break;
				case 2 :
					// JPA2.g:314:17: single_valued_input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_valued_input_parameter_in_in_item2852);
					single_valued_input_parameter305=single_valued_input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_input_parameter305.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_item"


	public static class like_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "like_expression"
	// JPA2.g:315:1: like_expression : string_expression ( 'NOT' )? 'LIKE' ( string_expression | pattern_value | input_parameter ) ( 'ESCAPE' escape_character )? ;
	public final JPA2Parser.like_expression_return like_expression() throws RecognitionException {
		JPA2Parser.like_expression_return retval = new JPA2Parser.like_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal307=null;
		Token string_literal308=null;
		Token string_literal312=null;
		ParserRuleReturnScope string_expression306 =null;
		ParserRuleReturnScope string_expression309 =null;
		ParserRuleReturnScope pattern_value310 =null;
		ParserRuleReturnScope input_parameter311 =null;
		ParserRuleReturnScope escape_character313 =null;

		Object string_literal307_tree=null;
		Object string_literal308_tree=null;
		Object string_literal312_tree=null;

		try {
			// JPA2.g:316:5: ( string_expression ( 'NOT' )? 'LIKE' ( string_expression | pattern_value | input_parameter ) ( 'ESCAPE' escape_character )? )
			// JPA2.g:316:7: string_expression ( 'NOT' )? 'LIKE' ( string_expression | pattern_value | input_parameter ) ( 'ESCAPE' escape_character )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_string_expression_in_like_expression2863);
			string_expression306=string_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression306.getTree());

			// JPA2.g:316:25: ( 'NOT' )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==NOT) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// JPA2.g:316:26: 'NOT'
					{
					string_literal307=(Token)match(input,NOT,FOLLOW_NOT_in_like_expression2866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal307_tree = (Object)adaptor.create(string_literal307);
					adaptor.addChild(root_0, string_literal307_tree);
					}

					}
					break;

			}

			string_literal308=(Token)match(input,109,FOLLOW_109_in_like_expression2870); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal308_tree = (Object)adaptor.create(string_literal308);
			adaptor.addChild(root_0, string_literal308_tree);
			}

			// JPA2.g:316:41: ( string_expression | pattern_value | input_parameter )
			int alt82=3;
			switch ( input.LA(1) ) {
			case AVG:
			case COUNT:
			case LOWER:
			case LPAREN:
			case MAX:
			case MIN:
			case SUM:
			case WORD:
			case 76:
			case 84:
			case 85:
			case 86:
			case 87:
			case 100:
			case 102:
			case 118:
			case 129:
			case 133:
			case 136:
				{
				alt82=1;
				}
				break;
			case STRING_LITERAL:
				{
				int LA82_2 = input.LA(2);
				if ( (synpred133_JPA2()) ) {
					alt82=1;
				}
				else if ( (synpred134_JPA2()) ) {
					alt82=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 71:
				{
				int LA82_3 = input.LA(2);
				if ( (LA82_3==64) ) {
					int LA82_7 = input.LA(3);
					if ( (LA82_7==INT_NUMERAL) ) {
						int LA82_11 = input.LA(4);
						if ( (synpred133_JPA2()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=3;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA82_3==INT_NUMERAL) ) {
					int LA82_8 = input.LA(3);
					if ( (synpred133_JPA2()) ) {
						alt82=1;
					}
					else if ( (true) ) {
						alt82=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA82_4 = input.LA(2);
				if ( (synpred133_JPA2()) ) {
					alt82=1;
				}
				else if ( (true) ) {
					alt82=3;
				}

				}
				break;
			case 57:
				{
				int LA82_5 = input.LA(2);
				if ( (LA82_5==WORD) ) {
					int LA82_10 = input.LA(3);
					if ( (LA82_10==144) ) {
						int LA82_12 = input.LA(4);
						if ( (synpred133_JPA2()) ) {
							alt82=1;
						}
						else if ( (true) ) {
							alt82=3;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// JPA2.g:316:42: string_expression
					{
					pushFollow(FOLLOW_string_expression_in_like_expression2873);
					string_expression309=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression309.getTree());

					}
					break;
				case 2 :
					// JPA2.g:316:62: pattern_value
					{
					pushFollow(FOLLOW_pattern_value_in_like_expression2877);
					pattern_value310=pattern_value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern_value310.getTree());

					}
					break;
				case 3 :
					// JPA2.g:316:78: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_like_expression2881);
					input_parameter311=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter311.getTree());

					}
					break;

			}

			// JPA2.g:316:94: ( 'ESCAPE' escape_character )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==98) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// JPA2.g:316:95: 'ESCAPE' escape_character
					{
					string_literal312=(Token)match(input,98,FOLLOW_98_in_like_expression2884); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal312_tree = (Object)adaptor.create(string_literal312);
					adaptor.addChild(root_0, string_literal312_tree);
					}

					pushFollow(FOLLOW_escape_character_in_like_expression2886);
					escape_character313=escape_character();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, escape_character313.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "like_expression"


	public static class null_comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "null_comparison_expression"
	// JPA2.g:317:1: null_comparison_expression : ( path_expression | input_parameter | join_association_path_expression ) 'IS' ( 'NOT' )? 'NULL' ;
	public final JPA2Parser.null_comparison_expression_return null_comparison_expression() throws RecognitionException {
		JPA2Parser.null_comparison_expression_return retval = new JPA2Parser.null_comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal317=null;
		Token string_literal318=null;
		Token string_literal319=null;
		ParserRuleReturnScope path_expression314 =null;
		ParserRuleReturnScope input_parameter315 =null;
		ParserRuleReturnScope join_association_path_expression316 =null;

		Object string_literal317_tree=null;
		Object string_literal318_tree=null;
		Object string_literal319_tree=null;

		try {
			// JPA2.g:318:5: ( ( path_expression | input_parameter | join_association_path_expression ) 'IS' ( 'NOT' )? 'NULL' )
			// JPA2.g:318:7: ( path_expression | input_parameter | join_association_path_expression ) 'IS' ( 'NOT' )? 'NULL'
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:318:7: ( path_expression | input_parameter | join_association_path_expression )
			int alt84=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA84_1 = input.LA(2);
				if ( (LA84_1==62) ) {
					int LA84_4 = input.LA(3);
					if ( (synpred136_JPA2()) ) {
						alt84=1;
					}
					else if ( (true) ) {
						alt84=3;
					}

				}
				else if ( (LA84_1==105) ) {
					alt84=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt84=2;
				}
				break;
			case 132:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// JPA2.g:318:8: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_null_comparison_expression2900);
					path_expression314=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression314.getTree());

					}
					break;
				case 2 :
					// JPA2.g:318:26: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_null_comparison_expression2904);
					input_parameter315=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter315.getTree());

					}
					break;
				case 3 :
					// JPA2.g:318:44: join_association_path_expression
					{
					pushFollow(FOLLOW_join_association_path_expression_in_null_comparison_expression2908);
					join_association_path_expression316=join_association_path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_association_path_expression316.getTree());

					}
					break;

			}

			string_literal317=(Token)match(input,105,FOLLOW_105_in_null_comparison_expression2911); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal317_tree = (Object)adaptor.create(string_literal317);
			adaptor.addChild(root_0, string_literal317_tree);
			}

			// JPA2.g:318:83: ( 'NOT' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==NOT) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// JPA2.g:318:84: 'NOT'
					{
					string_literal318=(Token)match(input,NOT,FOLLOW_NOT_in_null_comparison_expression2914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal318_tree = (Object)adaptor.create(string_literal318);
					adaptor.addChild(root_0, string_literal318_tree);
					}

					}
					break;

			}

			string_literal319=(Token)match(input,117,FOLLOW_117_in_null_comparison_expression2918); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal319_tree = (Object)adaptor.create(string_literal319);
			adaptor.addChild(root_0, string_literal319_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "null_comparison_expression"


	public static class empty_collection_comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "empty_collection_comparison_expression"
	// JPA2.g:319:1: empty_collection_comparison_expression : path_expression 'IS' ( 'NOT' )? 'EMPTY' ;
	public final JPA2Parser.empty_collection_comparison_expression_return empty_collection_comparison_expression() throws RecognitionException {
		JPA2Parser.empty_collection_comparison_expression_return retval = new JPA2Parser.empty_collection_comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal321=null;
		Token string_literal322=null;
		Token string_literal323=null;
		ParserRuleReturnScope path_expression320 =null;

		Object string_literal321_tree=null;
		Object string_literal322_tree=null;
		Object string_literal323_tree=null;

		try {
			// JPA2.g:320:5: ( path_expression 'IS' ( 'NOT' )? 'EMPTY' )
			// JPA2.g:320:7: path_expression 'IS' ( 'NOT' )? 'EMPTY'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_path_expression_in_empty_collection_comparison_expression2929);
			path_expression320=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression320.getTree());

			string_literal321=(Token)match(input,105,FOLLOW_105_in_empty_collection_comparison_expression2931); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal321_tree = (Object)adaptor.create(string_literal321);
			adaptor.addChild(root_0, string_literal321_tree);
			}

			// JPA2.g:320:28: ( 'NOT' )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==NOT) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// JPA2.g:320:29: 'NOT'
					{
					string_literal322=(Token)match(input,NOT,FOLLOW_NOT_in_empty_collection_comparison_expression2934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal322_tree = (Object)adaptor.create(string_literal322);
					adaptor.addChild(root_0, string_literal322_tree);
					}

					}
					break;

			}

			string_literal323=(Token)match(input,94,FOLLOW_94_in_empty_collection_comparison_expression2938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal323_tree = (Object)adaptor.create(string_literal323);
			adaptor.addChild(root_0, string_literal323_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "empty_collection_comparison_expression"


	public static class collection_member_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_member_expression"
	// JPA2.g:321:1: collection_member_expression : entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression ;
	public final JPA2Parser.collection_member_expression_return collection_member_expression() throws RecognitionException {
		JPA2Parser.collection_member_expression_return retval = new JPA2Parser.collection_member_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal325=null;
		Token string_literal326=null;
		Token string_literal327=null;
		ParserRuleReturnScope entity_or_value_expression324 =null;
		ParserRuleReturnScope path_expression328 =null;

		Object string_literal325_tree=null;
		Object string_literal326_tree=null;
		Object string_literal327_tree=null;

		try {
			// JPA2.g:322:5: ( entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression )
			// JPA2.g:322:7: entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_entity_or_value_expression_in_collection_member_expression2949);
			entity_or_value_expression324=entity_or_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_or_value_expression324.getTree());

			// JPA2.g:322:35: ( 'NOT' )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==NOT) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// JPA2.g:322:36: 'NOT'
					{
					string_literal325=(Token)match(input,NOT,FOLLOW_NOT_in_collection_member_expression2953); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal325_tree = (Object)adaptor.create(string_literal325);
					adaptor.addChild(root_0, string_literal325_tree);
					}

					}
					break;

			}

			string_literal326=(Token)match(input,111,FOLLOW_111_in_collection_member_expression2957); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal326_tree = (Object)adaptor.create(string_literal326);
			adaptor.addChild(root_0, string_literal326_tree);
			}

			// JPA2.g:322:53: ( 'OF' )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==120) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// JPA2.g:322:54: 'OF'
					{
					string_literal327=(Token)match(input,120,FOLLOW_120_in_collection_member_expression2960); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal327_tree = (Object)adaptor.create(string_literal327);
					adaptor.addChild(root_0, string_literal327_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_path_expression_in_collection_member_expression2964);
			path_expression328=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression328.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_member_expression"


	public static class entity_or_value_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_or_value_expression"
	// JPA2.g:323:1: entity_or_value_expression : ( path_expression | simple_entity_or_value_expression | subquery );
	public final JPA2Parser.entity_or_value_expression_return entity_or_value_expression() throws RecognitionException {
		JPA2Parser.entity_or_value_expression_return retval = new JPA2Parser.entity_or_value_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression329 =null;
		ParserRuleReturnScope simple_entity_or_value_expression330 =null;
		ParserRuleReturnScope subquery331 =null;


		try {
			// JPA2.g:324:5: ( path_expression | simple_entity_or_value_expression | subquery )
			int alt89=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA89_1 = input.LA(2);
				if ( (LA89_1==62) ) {
					alt89=1;
				}
				else if ( (LA89_1==NOT||LA89_1==111) ) {
					alt89=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt89=2;
				}
				break;
			case LPAREN:
				{
				alt89=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// JPA2.g:324:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_entity_or_value_expression2975);
					path_expression329=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression329.getTree());

					}
					break;
				case 2 :
					// JPA2.g:325:7: simple_entity_or_value_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_or_value_expression_in_entity_or_value_expression2983);
					simple_entity_or_value_expression330=simple_entity_or_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_or_value_expression330.getTree());

					}
					break;
				case 3 :
					// JPA2.g:326:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_entity_or_value_expression2991);
					subquery331=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery331.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_or_value_expression"


	public static class simple_entity_or_value_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_entity_or_value_expression"
	// JPA2.g:327:1: simple_entity_or_value_expression : ( identification_variable | input_parameter | literal );
	public final JPA2Parser.simple_entity_or_value_expression_return simple_entity_or_value_expression() throws RecognitionException {
		JPA2Parser.simple_entity_or_value_expression_return retval = new JPA2Parser.simple_entity_or_value_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable332 =null;
		ParserRuleReturnScope input_parameter333 =null;
		ParserRuleReturnScope literal334 =null;


		try {
			// JPA2.g:328:5: ( identification_variable | input_parameter | literal )
			int alt90=3;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==WORD) ) {
				int LA90_1 = input.LA(2);
				if ( (synpred144_JPA2()) ) {
					alt90=1;
				}
				else if ( (true) ) {
					alt90=3;
				}

			}
			else if ( (LA90_0==NAMED_PARAMETER||LA90_0==57||LA90_0==71) ) {
				alt90=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// JPA2.g:328:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_entity_or_value_expression3002);
					identification_variable332=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable332.getTree());

					}
					break;
				case 2 :
					// JPA2.g:329:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_simple_entity_or_value_expression3010);
					input_parameter333=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter333.getTree());

					}
					break;
				case 3 :
					// JPA2.g:330:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_simple_entity_or_value_expression3018);
					literal334=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal334.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_entity_or_value_expression"


	public static class exists_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exists_expression"
	// JPA2.g:331:1: exists_expression : ( 'NOT' )? 'EXISTS' subquery ;
	public final JPA2Parser.exists_expression_return exists_expression() throws RecognitionException {
		JPA2Parser.exists_expression_return retval = new JPA2Parser.exists_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal335=null;
		Token string_literal336=null;
		ParserRuleReturnScope subquery337 =null;

		Object string_literal335_tree=null;
		Object string_literal336_tree=null;

		try {
			// JPA2.g:332:5: ( ( 'NOT' )? 'EXISTS' subquery )
			// JPA2.g:332:7: ( 'NOT' )? 'EXISTS' subquery
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:332:7: ( 'NOT' )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==NOT) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// JPA2.g:332:8: 'NOT'
					{
					string_literal335=(Token)match(input,NOT,FOLLOW_NOT_in_exists_expression3030); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal335_tree = (Object)adaptor.create(string_literal335);
					adaptor.addChild(root_0, string_literal335_tree);
					}

					}
					break;

			}

			string_literal336=(Token)match(input,99,FOLLOW_99_in_exists_expression3034); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal336_tree = (Object)adaptor.create(string_literal336);
			adaptor.addChild(root_0, string_literal336_tree);
			}

			pushFollow(FOLLOW_subquery_in_exists_expression3036);
			subquery337=subquery();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery337.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exists_expression"


	public static class all_or_any_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "all_or_any_expression"
	// JPA2.g:333:1: all_or_any_expression : ( 'ALL' | 'ANY' | 'SOME' ) subquery ;
	public final JPA2Parser.all_or_any_expression_return all_or_any_expression() throws RecognitionException {
		JPA2Parser.all_or_any_expression_return retval = new JPA2Parser.all_or_any_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set338=null;
		ParserRuleReturnScope subquery339 =null;

		Object set338_tree=null;

		try {
			// JPA2.g:334:5: ( ( 'ALL' | 'ANY' | 'SOME' ) subquery )
			// JPA2.g:334:7: ( 'ALL' | 'ANY' | 'SOME' ) subquery
			{
			root_0 = (Object)adaptor.nil();


			set338=input.LT(1);
			if ( (input.LA(1) >= 79 && input.LA(1) <= 80)||input.LA(1)==127 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set338));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_subquery_in_all_or_any_expression3060);
			subquery339=subquery();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery339.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "all_or_any_expression"


	public static class comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_expression"
	// JPA2.g:335:1: comparison_expression : ( string_expression ( comparison_operator | 'REGEXP' ) ( string_expression | all_or_any_expression ) | boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) | enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) | datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) | entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) | entity_type_expression ( '=' | '<>' ) entity_type_expression | arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression ) );
	public final JPA2Parser.comparison_expression_return comparison_expression() throws RecognitionException {
		JPA2Parser.comparison_expression_return retval = new JPA2Parser.comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal342=null;
		Token set346=null;
		Token set350=null;
		Token set358=null;
		Token set362=null;
		ParserRuleReturnScope string_expression340 =null;
		ParserRuleReturnScope comparison_operator341 =null;
		ParserRuleReturnScope string_expression343 =null;
		ParserRuleReturnScope all_or_any_expression344 =null;
		ParserRuleReturnScope boolean_expression345 =null;
		ParserRuleReturnScope boolean_expression347 =null;
		ParserRuleReturnScope all_or_any_expression348 =null;
		ParserRuleReturnScope enum_expression349 =null;
		ParserRuleReturnScope enum_expression351 =null;
		ParserRuleReturnScope all_or_any_expression352 =null;
		ParserRuleReturnScope datetime_expression353 =null;
		ParserRuleReturnScope comparison_operator354 =null;
		ParserRuleReturnScope datetime_expression355 =null;
		ParserRuleReturnScope all_or_any_expression356 =null;
		ParserRuleReturnScope entity_expression357 =null;
		ParserRuleReturnScope entity_expression359 =null;
		ParserRuleReturnScope all_or_any_expression360 =null;
		ParserRuleReturnScope entity_type_expression361 =null;
		ParserRuleReturnScope entity_type_expression363 =null;
		ParserRuleReturnScope arithmetic_expression364 =null;
		ParserRuleReturnScope comparison_operator365 =null;
		ParserRuleReturnScope arithmetic_expression366 =null;
		ParserRuleReturnScope all_or_any_expression367 =null;

		Object string_literal342_tree=null;
		Object set346_tree=null;
		Object set350_tree=null;
		Object set358_tree=null;
		Object set362_tree=null;

		try {
			// JPA2.g:336:5: ( string_expression ( comparison_operator | 'REGEXP' ) ( string_expression | all_or_any_expression ) | boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) | enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) | datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) | entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) | entity_type_expression ( '=' | '<>' ) entity_type_expression | arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression ) )
			int alt99=7;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA99_1 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (synpred162_JPA2()) ) {
					alt99=5;
				}
				else if ( (synpred164_JPA2()) ) {
					alt99=6;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 87:
			case 129:
			case 133:
			case 136:
				{
				alt99=1;
				}
				break;
			case 71:
				{
				int LA99_3 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (synpred162_JPA2()) ) {
					alt99=5;
				}
				else if ( (synpred164_JPA2()) ) {
					alt99=6;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA99_4 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (synpred162_JPA2()) ) {
					alt99=5;
				}
				else if ( (synpred164_JPA2()) ) {
					alt99=6;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 57:
				{
				int LA99_5 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (synpred162_JPA2()) ) {
					alt99=5;
				}
				else if ( (synpred164_JPA2()) ) {
					alt99=6;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case COUNT:
				{
				int LA99_11 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA99_12 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 102:
				{
				int LA99_13 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 84:
				{
				int LA99_14 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 86:
				{
				int LA99_15 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 118:
				{
				int LA99_16 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 85:
				{
				int LA99_17 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 100:
				{
				int LA99_18 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 76:
				{
				int LA99_19 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case LPAREN:
				{
				int LA99_20 = input.LA(2);
				if ( (synpred151_JPA2()) ) {
					alt99=1;
				}
				else if ( (synpred154_JPA2()) ) {
					alt99=2;
				}
				else if ( (synpred157_JPA2()) ) {
					alt99=3;
				}
				else if ( (synpred159_JPA2()) ) {
					alt99=4;
				}
				else if ( (true) ) {
					alt99=7;
				}

				}
				break;
			case 142:
			case 143:
				{
				alt99=2;
				}
				break;
			case 88:
			case 89:
			case 90:
				{
				alt99=4;
				}
				break;
			case 134:
				{
				alt99=6;
				}
				break;
			case INT_NUMERAL:
			case 59:
			case 61:
			case 64:
			case 78:
			case 104:
			case 108:
			case 110:
			case 113:
			case 126:
			case 128:
				{
				alt99=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// JPA2.g:336:7: string_expression ( comparison_operator | 'REGEXP' ) ( string_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_comparison_expression3071);
					string_expression340=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression340.getTree());

					// JPA2.g:336:25: ( comparison_operator | 'REGEXP' )
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( ((LA92_0 >= 65 && LA92_0 <= 70)) ) {
						alt92=1;
					}
					else if ( (LA92_0==123) ) {
						alt92=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 92, 0, input);
						throw nvae;
					}

					switch (alt92) {
						case 1 :
							// JPA2.g:336:26: comparison_operator
							{
							pushFollow(FOLLOW_comparison_operator_in_comparison_expression3074);
							comparison_operator341=comparison_operator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator341.getTree());

							}
							break;
						case 2 :
							// JPA2.g:336:48: 'REGEXP'
							{
							string_literal342=(Token)match(input,123,FOLLOW_123_in_comparison_expression3078); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal342_tree = (Object)adaptor.create(string_literal342);
							adaptor.addChild(root_0, string_literal342_tree);
							}

							}
							break;

					}

					// JPA2.g:336:58: ( string_expression | all_or_any_expression )
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==AVG||LA93_0==COUNT||(LA93_0 >= LOWER && LA93_0 <= NAMED_PARAMETER)||(LA93_0 >= STRING_LITERAL && LA93_0 <= SUM)||LA93_0==WORD||LA93_0==57||LA93_0==71||LA93_0==76||(LA93_0 >= 84 && LA93_0 <= 87)||LA93_0==100||LA93_0==102||LA93_0==118||LA93_0==129||LA93_0==133||LA93_0==136) ) {
						alt93=1;
					}
					else if ( ((LA93_0 >= 79 && LA93_0 <= 80)||LA93_0==127) ) {
						alt93=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 93, 0, input);
						throw nvae;
					}

					switch (alt93) {
						case 1 :
							// JPA2.g:336:59: string_expression
							{
							pushFollow(FOLLOW_string_expression_in_comparison_expression3082);
							string_expression343=string_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression343.getTree());

							}
							break;
						case 2 :
							// JPA2.g:336:79: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3086);
							all_or_any_expression344=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression344.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// JPA2.g:337:7: boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expression_in_comparison_expression3095);
					boolean_expression345=boolean_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression345.getTree());

					set346=input.LT(1);
					if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set346));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:337:39: ( boolean_expression | all_or_any_expression )
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==LPAREN||LA94_0==NAMED_PARAMETER||LA94_0==WORD||LA94_0==57||LA94_0==71||LA94_0==76||(LA94_0 >= 84 && LA94_0 <= 86)||LA94_0==100||LA94_0==102||LA94_0==118||(LA94_0 >= 142 && LA94_0 <= 143)) ) {
						alt94=1;
					}
					else if ( ((LA94_0 >= 79 && LA94_0 <= 80)||LA94_0==127) ) {
						alt94=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);
						throw nvae;
					}

					switch (alt94) {
						case 1 :
							// JPA2.g:337:40: boolean_expression
							{
							pushFollow(FOLLOW_boolean_expression_in_comparison_expression3106);
							boolean_expression347=boolean_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression347.getTree());

							}
							break;
						case 2 :
							// JPA2.g:337:61: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3110);
							all_or_any_expression348=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression348.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// JPA2.g:338:7: enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_expression_in_comparison_expression3119);
					enum_expression349=enum_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression349.getTree());

					set350=input.LT(1);
					if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set350));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:338:34: ( enum_expression | all_or_any_expression )
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==LPAREN||LA95_0==NAMED_PARAMETER||LA95_0==WORD||LA95_0==57||LA95_0==71||LA95_0==84||LA95_0==86||LA95_0==118) ) {
						alt95=1;
					}
					else if ( ((LA95_0 >= 79 && LA95_0 <= 80)||LA95_0==127) ) {
						alt95=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 95, 0, input);
						throw nvae;
					}

					switch (alt95) {
						case 1 :
							// JPA2.g:338:35: enum_expression
							{
							pushFollow(FOLLOW_enum_expression_in_comparison_expression3128);
							enum_expression351=enum_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression351.getTree());

							}
							break;
						case 2 :
							// JPA2.g:338:53: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3132);
							all_or_any_expression352=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression352.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// JPA2.g:339:7: datetime_expression comparison_operator ( datetime_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_comparison_expression3141);
					datetime_expression353=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression353.getTree());

					pushFollow(FOLLOW_comparison_operator_in_comparison_expression3143);
					comparison_operator354=comparison_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator354.getTree());

					// JPA2.g:339:47: ( datetime_expression | all_or_any_expression )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==AVG||LA96_0==COUNT||(LA96_0 >= LPAREN && LA96_0 <= NAMED_PARAMETER)||LA96_0==SUM||LA96_0==WORD||LA96_0==57||LA96_0==71||LA96_0==76||(LA96_0 >= 84 && LA96_0 <= 86)||(LA96_0 >= 88 && LA96_0 <= 90)||LA96_0==100||LA96_0==102||LA96_0==118) ) {
						alt96=1;
					}
					else if ( ((LA96_0 >= 79 && LA96_0 <= 80)||LA96_0==127) ) {
						alt96=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// JPA2.g:339:48: datetime_expression
							{
							pushFollow(FOLLOW_datetime_expression_in_comparison_expression3146);
							datetime_expression355=datetime_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression355.getTree());

							}
							break;
						case 2 :
							// JPA2.g:339:70: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3150);
							all_or_any_expression356=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression356.getTree());

							}
							break;

					}

					}
					break;
				case 5 :
					// JPA2.g:340:7: entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_expression_in_comparison_expression3159);
					entity_expression357=entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_expression357.getTree());

					set358=input.LT(1);
					if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set358));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:340:38: ( entity_expression | all_or_any_expression )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==NAMED_PARAMETER||LA97_0==WORD||LA97_0==57||LA97_0==71) ) {
						alt97=1;
					}
					else if ( ((LA97_0 >= 79 && LA97_0 <= 80)||LA97_0==127) ) {
						alt97=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// JPA2.g:340:39: entity_expression
							{
							pushFollow(FOLLOW_entity_expression_in_comparison_expression3170);
							entity_expression359=entity_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_expression359.getTree());

							}
							break;
						case 2 :
							// JPA2.g:340:59: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3174);
							all_or_any_expression360=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression360.getTree());

							}
							break;

					}

					}
					break;
				case 6 :
					// JPA2.g:341:7: entity_type_expression ( '=' | '<>' ) entity_type_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_expression_in_comparison_expression3183);
					entity_type_expression361=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression361.getTree());

					set362=input.LT(1);
					if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set362));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_entity_type_expression_in_comparison_expression3193);
					entity_type_expression363=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression363.getTree());

					}
					break;
				case 7 :
					// JPA2.g:342:7: arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_comparison_expression3201);
					arithmetic_expression364=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression364.getTree());

					pushFollow(FOLLOW_comparison_operator_in_comparison_expression3203);
					comparison_operator365=comparison_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator365.getTree());

					// JPA2.g:342:49: ( arithmetic_expression | all_or_any_expression )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==AVG||LA98_0==COUNT||LA98_0==INT_NUMERAL||(LA98_0 >= LPAREN && LA98_0 <= NAMED_PARAMETER)||LA98_0==SUM||LA98_0==WORD||LA98_0==57||LA98_0==59||LA98_0==61||LA98_0==64||LA98_0==71||LA98_0==76||LA98_0==78||(LA98_0 >= 84 && LA98_0 <= 86)||LA98_0==100||LA98_0==102||LA98_0==104||LA98_0==108||LA98_0==110||LA98_0==113||LA98_0==118||LA98_0==126||LA98_0==128) ) {
						alt98=1;
					}
					else if ( ((LA98_0 >= 79 && LA98_0 <= 80)||LA98_0==127) ) {
						alt98=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}

					switch (alt98) {
						case 1 :
							// JPA2.g:342:50: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_comparison_expression3206);
							arithmetic_expression366=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression366.getTree());

							}
							break;
						case 2 :
							// JPA2.g:342:74: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3210);
							all_or_any_expression367=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression367.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison_expression"


	public static class comparison_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_operator"
	// JPA2.g:344:1: comparison_operator : ( '=' | '>' | '>=' | '<' | '<=' | '<>' );
	public final JPA2Parser.comparison_operator_return comparison_operator() throws RecognitionException {
		JPA2Parser.comparison_operator_return retval = new JPA2Parser.comparison_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set368=null;

		Object set368_tree=null;

		try {
			// JPA2.g:345:5: ( '=' | '>' | '>=' | '<' | '<=' | '<>' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set368=input.LT(1);
			if ( (input.LA(1) >= 65 && input.LA(1) <= 70) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set368));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison_operator"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// JPA2.g:351:1: arithmetic_expression : ( arithmetic_term ( '+' | '-' ) arithmetic_term | arithmetic_term );
	public final JPA2Parser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		JPA2Parser.arithmetic_expression_return retval = new JPA2Parser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set370=null;
		ParserRuleReturnScope arithmetic_term369 =null;
		ParserRuleReturnScope arithmetic_term371 =null;
		ParserRuleReturnScope arithmetic_term372 =null;

		Object set370_tree=null;

		try {
			// JPA2.g:352:5: ( arithmetic_term ( '+' | '-' ) arithmetic_term | arithmetic_term )
			int alt100=2;
			switch ( input.LA(1) ) {
			case 59:
			case 61:
				{
				int LA100_1 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case WORD:
				{
				int LA100_2 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 64:
				{
				int LA100_3 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA100_4 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA100_5 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 71:
				{
				int LA100_6 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA100_7 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 57:
				{
				int LA100_8 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 108:
				{
				int LA100_9 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 110:
				{
				int LA100_10 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 78:
				{
				int LA100_11 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 128:
				{
				int LA100_12 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 113:
				{
				int LA100_13 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 126:
				{
				int LA100_14 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 104:
				{
				int LA100_15 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case COUNT:
				{
				int LA100_16 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA100_17 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 102:
				{
				int LA100_18 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 84:
				{
				int LA100_19 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 86:
				{
				int LA100_20 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 118:
				{
				int LA100_21 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 85:
				{
				int LA100_22 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 100:
				{
				int LA100_23 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			case 76:
				{
				int LA100_24 = input.LA(2);
				if ( (synpred172_JPA2()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// JPA2.g:352:7: arithmetic_term ( '+' | '-' ) arithmetic_term
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3274);
					arithmetic_term369=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term369.getTree());

					set370=input.LT(1);
					if ( input.LA(1)==59||input.LA(1)==61 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set370));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3284);
					arithmetic_term371=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term371.getTree());

					}
					break;
				case 2 :
					// JPA2.g:353:7: arithmetic_term
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3292);
					arithmetic_term372=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term372.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression"


	public static class arithmetic_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_term"
	// JPA2.g:354:1: arithmetic_term : ( arithmetic_factor ( '*' | '/' ) arithmetic_factor | arithmetic_factor );
	public final JPA2Parser.arithmetic_term_return arithmetic_term() throws RecognitionException {
		JPA2Parser.arithmetic_term_return retval = new JPA2Parser.arithmetic_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set374=null;
		ParserRuleReturnScope arithmetic_factor373 =null;
		ParserRuleReturnScope arithmetic_factor375 =null;
		ParserRuleReturnScope arithmetic_factor376 =null;

		Object set374_tree=null;

		try {
			// JPA2.g:355:5: ( arithmetic_factor ( '*' | '/' ) arithmetic_factor | arithmetic_factor )
			int alt101=2;
			switch ( input.LA(1) ) {
			case 59:
			case 61:
				{
				int LA101_1 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case WORD:
				{
				int LA101_2 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 64:
				{
				int LA101_3 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA101_4 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA101_5 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 71:
				{
				int LA101_6 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA101_7 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 57:
				{
				int LA101_8 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 108:
				{
				int LA101_9 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 110:
				{
				int LA101_10 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 78:
				{
				int LA101_11 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 128:
				{
				int LA101_12 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 113:
				{
				int LA101_13 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 126:
				{
				int LA101_14 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 104:
				{
				int LA101_15 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case COUNT:
				{
				int LA101_16 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA101_17 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 102:
				{
				int LA101_18 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 84:
				{
				int LA101_19 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 86:
				{
				int LA101_20 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 118:
				{
				int LA101_21 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 85:
				{
				int LA101_22 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 100:
				{
				int LA101_23 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			case 76:
				{
				int LA101_24 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// JPA2.g:355:7: arithmetic_factor ( '*' | '/' ) arithmetic_factor
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3303);
					arithmetic_factor373=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor373.getTree());

					set374=input.LT(1);
					if ( input.LA(1)==58||input.LA(1)==63 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set374));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3314);
					arithmetic_factor375=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor375.getTree());

					}
					break;
				case 2 :
					// JPA2.g:356:7: arithmetic_factor
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3322);
					arithmetic_factor376=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor376.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_term"


	public static class arithmetic_factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_factor"
	// JPA2.g:357:1: arithmetic_factor : ( ( '+' | '-' ) )? arithmetic_primary ;
	public final JPA2Parser.arithmetic_factor_return arithmetic_factor() throws RecognitionException {
		JPA2Parser.arithmetic_factor_return retval = new JPA2Parser.arithmetic_factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set377=null;
		ParserRuleReturnScope arithmetic_primary378 =null;

		Object set377_tree=null;

		try {
			// JPA2.g:358:5: ( ( ( '+' | '-' ) )? arithmetic_primary )
			// JPA2.g:358:7: ( ( '+' | '-' ) )? arithmetic_primary
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:358:7: ( ( '+' | '-' ) )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==59||LA102_0==61) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// JPA2.g:
					{
					set377=input.LT(1);
					if ( input.LA(1)==59||input.LA(1)==61 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set377));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_arithmetic_primary_in_arithmetic_factor3345);
			arithmetic_primary378=arithmetic_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_primary378.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_factor"


	public static class arithmetic_primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_primary"
	// JPA2.g:359:1: arithmetic_primary : ( path_expression | numeric_literal | '(' arithmetic_expression ')' | input_parameter | functions_returning_numerics | aggregate_expression | case_expression | function_invocation | extension_functions | subquery );
	public final JPA2Parser.arithmetic_primary_return arithmetic_primary() throws RecognitionException {
		JPA2Parser.arithmetic_primary_return retval = new JPA2Parser.arithmetic_primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal381=null;
		Token char_literal383=null;
		ParserRuleReturnScope path_expression379 =null;
		ParserRuleReturnScope numeric_literal380 =null;
		ParserRuleReturnScope arithmetic_expression382 =null;
		ParserRuleReturnScope input_parameter384 =null;
		ParserRuleReturnScope functions_returning_numerics385 =null;
		ParserRuleReturnScope aggregate_expression386 =null;
		ParserRuleReturnScope case_expression387 =null;
		ParserRuleReturnScope function_invocation388 =null;
		ParserRuleReturnScope extension_functions389 =null;
		ParserRuleReturnScope subquery390 =null;

		Object char_literal381_tree=null;
		Object char_literal383_tree=null;

		try {
			// JPA2.g:360:5: ( path_expression | numeric_literal | '(' arithmetic_expression ')' | input_parameter | functions_returning_numerics | aggregate_expression | case_expression | function_invocation | extension_functions | subquery )
			int alt103=10;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt103=1;
				}
				break;
			case INT_NUMERAL:
			case 64:
				{
				alt103=2;
				}
				break;
			case LPAREN:
				{
				int LA103_4 = input.LA(2);
				if ( (synpred179_JPA2()) ) {
					alt103=3;
				}
				else if ( (true) ) {
					alt103=10;
				}

				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt103=4;
				}
				break;
			case 78:
			case 104:
			case 108:
			case 110:
			case 113:
			case 126:
			case 128:
				{
				alt103=5;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt103=6;
				}
				break;
			case 102:
				{
				int LA103_17 = input.LA(2);
				if ( (synpred182_JPA2()) ) {
					alt103=6;
				}
				else if ( (synpred184_JPA2()) ) {
					alt103=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 84:
			case 86:
			case 118:
				{
				alt103=7;
				}
				break;
			case 76:
			case 85:
			case 100:
				{
				alt103=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// JPA2.g:360:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_arithmetic_primary3356);
					path_expression379=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression379.getTree());

					}
					break;
				case 2 :
					// JPA2.g:361:7: numeric_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numeric_literal_in_arithmetic_primary3364);
					numeric_literal380=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal380.getTree());

					}
					break;
				case 3 :
					// JPA2.g:362:7: '(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal381=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arithmetic_primary3372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal381_tree = (Object)adaptor.create(char_literal381);
					adaptor.addChild(root_0, char_literal381_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_arithmetic_primary3373);
					arithmetic_expression382=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression382.getTree());

					char_literal383=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arithmetic_primary3374); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal383_tree = (Object)adaptor.create(char_literal383);
					adaptor.addChild(root_0, char_literal383_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:363:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_arithmetic_primary3382);
					input_parameter384=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter384.getTree());

					}
					break;
				case 5 :
					// JPA2.g:364:7: functions_returning_numerics
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_numerics_in_arithmetic_primary3390);
					functions_returning_numerics385=functions_returning_numerics();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_numerics385.getTree());

					}
					break;
				case 6 :
					// JPA2.g:365:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_arithmetic_primary3398);
					aggregate_expression386=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression386.getTree());

					}
					break;
				case 7 :
					// JPA2.g:366:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_arithmetic_primary3406);
					case_expression387=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression387.getTree());

					}
					break;
				case 8 :
					// JPA2.g:367:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_arithmetic_primary3414);
					function_invocation388=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation388.getTree());

					}
					break;
				case 9 :
					// JPA2.g:368:7: extension_functions
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_extension_functions_in_arithmetic_primary3422);
					extension_functions389=extension_functions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extension_functions389.getTree());

					}
					break;
				case 10 :
					// JPA2.g:369:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_arithmetic_primary3430);
					subquery390=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery390.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_primary"


	public static class string_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string_expression"
	// JPA2.g:370:1: string_expression : ( path_expression | string_literal | input_parameter | functions_returning_strings | aggregate_expression | case_expression | function_invocation | extension_functions | subquery );
	public final JPA2Parser.string_expression_return string_expression() throws RecognitionException {
		JPA2Parser.string_expression_return retval = new JPA2Parser.string_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression391 =null;
		ParserRuleReturnScope string_literal392 =null;
		ParserRuleReturnScope input_parameter393 =null;
		ParserRuleReturnScope functions_returning_strings394 =null;
		ParserRuleReturnScope aggregate_expression395 =null;
		ParserRuleReturnScope case_expression396 =null;
		ParserRuleReturnScope function_invocation397 =null;
		ParserRuleReturnScope extension_functions398 =null;
		ParserRuleReturnScope subquery399 =null;


		try {
			// JPA2.g:371:5: ( path_expression | string_literal | input_parameter | functions_returning_strings | aggregate_expression | case_expression | function_invocation | extension_functions | subquery )
			int alt104=9;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt104=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt104=2;
				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt104=3;
				}
				break;
			case LOWER:
			case 87:
			case 129:
			case 133:
			case 136:
				{
				alt104=4;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt104=5;
				}
				break;
			case 102:
				{
				int LA104_13 = input.LA(2);
				if ( (synpred190_JPA2()) ) {
					alt104=5;
				}
				else if ( (synpred192_JPA2()) ) {
					alt104=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 84:
			case 86:
			case 118:
				{
				alt104=6;
				}
				break;
			case 76:
			case 85:
			case 100:
				{
				alt104=8;
				}
				break;
			case LPAREN:
				{
				alt104=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}
			switch (alt104) {
				case 1 :
					// JPA2.g:371:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_string_expression3441);
					path_expression391=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression391.getTree());

					}
					break;
				case 2 :
					// JPA2.g:372:7: string_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_literal_in_string_expression3449);
					string_literal392=string_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_literal392.getTree());

					}
					break;
				case 3 :
					// JPA2.g:373:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_string_expression3457);
					input_parameter393=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter393.getTree());

					}
					break;
				case 4 :
					// JPA2.g:374:7: functions_returning_strings
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_strings_in_string_expression3465);
					functions_returning_strings394=functions_returning_strings();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_strings394.getTree());

					}
					break;
				case 5 :
					// JPA2.g:375:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_string_expression3473);
					aggregate_expression395=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression395.getTree());

					}
					break;
				case 6 :
					// JPA2.g:376:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_string_expression3481);
					case_expression396=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression396.getTree());

					}
					break;
				case 7 :
					// JPA2.g:377:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_string_expression3489);
					function_invocation397=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation397.getTree());

					}
					break;
				case 8 :
					// JPA2.g:378:7: extension_functions
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_extension_functions_in_string_expression3497);
					extension_functions398=extension_functions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extension_functions398.getTree());

					}
					break;
				case 9 :
					// JPA2.g:379:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_string_expression3505);
					subquery399=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery399.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_expression"


	public static class datetime_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "datetime_expression"
	// JPA2.g:380:1: datetime_expression : ( path_expression | input_parameter | functions_returning_datetime | aggregate_expression | case_expression | function_invocation | extension_functions | date_time_timestamp_literal | subquery );
	public final JPA2Parser.datetime_expression_return datetime_expression() throws RecognitionException {
		JPA2Parser.datetime_expression_return retval = new JPA2Parser.datetime_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression400 =null;
		ParserRuleReturnScope input_parameter401 =null;
		ParserRuleReturnScope functions_returning_datetime402 =null;
		ParserRuleReturnScope aggregate_expression403 =null;
		ParserRuleReturnScope case_expression404 =null;
		ParserRuleReturnScope function_invocation405 =null;
		ParserRuleReturnScope extension_functions406 =null;
		ParserRuleReturnScope date_time_timestamp_literal407 =null;
		ParserRuleReturnScope subquery408 =null;


		try {
			// JPA2.g:381:5: ( path_expression | input_parameter | functions_returning_datetime | aggregate_expression | case_expression | function_invocation | extension_functions | date_time_timestamp_literal | subquery )
			int alt105=9;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA105_1 = input.LA(2);
				if ( (synpred194_JPA2()) ) {
					alt105=1;
				}
				else if ( (synpred201_JPA2()) ) {
					alt105=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt105=2;
				}
				break;
			case 88:
			case 89:
			case 90:
				{
				alt105=3;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt105=4;
				}
				break;
			case 102:
				{
				int LA105_8 = input.LA(2);
				if ( (synpred197_JPA2()) ) {
					alt105=4;
				}
				else if ( (synpred199_JPA2()) ) {
					alt105=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 84:
			case 86:
			case 118:
				{
				alt105=5;
				}
				break;
			case 76:
			case 85:
			case 100:
				{
				alt105=7;
				}
				break;
			case LPAREN:
				{
				alt105=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// JPA2.g:381:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_datetime_expression3516);
					path_expression400=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression400.getTree());

					}
					break;
				case 2 :
					// JPA2.g:382:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_datetime_expression3524);
					input_parameter401=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter401.getTree());

					}
					break;
				case 3 :
					// JPA2.g:383:7: functions_returning_datetime
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_datetime_in_datetime_expression3532);
					functions_returning_datetime402=functions_returning_datetime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_datetime402.getTree());

					}
					break;
				case 4 :
					// JPA2.g:384:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_datetime_expression3540);
					aggregate_expression403=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression403.getTree());

					}
					break;
				case 5 :
					// JPA2.g:385:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_datetime_expression3548);
					case_expression404=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression404.getTree());

					}
					break;
				case 6 :
					// JPA2.g:386:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_datetime_expression3556);
					function_invocation405=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation405.getTree());

					}
					break;
				case 7 :
					// JPA2.g:387:7: extension_functions
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_extension_functions_in_datetime_expression3564);
					extension_functions406=extension_functions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extension_functions406.getTree());

					}
					break;
				case 8 :
					// JPA2.g:388:7: date_time_timestamp_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_time_timestamp_literal_in_datetime_expression3572);
					date_time_timestamp_literal407=date_time_timestamp_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_time_timestamp_literal407.getTree());

					}
					break;
				case 9 :
					// JPA2.g:389:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_datetime_expression3580);
					subquery408=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery408.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datetime_expression"


	public static class boolean_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expression"
	// JPA2.g:390:1: boolean_expression : ( path_expression | boolean_literal | input_parameter | case_expression | function_invocation | extension_functions | subquery );
	public final JPA2Parser.boolean_expression_return boolean_expression() throws RecognitionException {
		JPA2Parser.boolean_expression_return retval = new JPA2Parser.boolean_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression409 =null;
		ParserRuleReturnScope boolean_literal410 =null;
		ParserRuleReturnScope input_parameter411 =null;
		ParserRuleReturnScope case_expression412 =null;
		ParserRuleReturnScope function_invocation413 =null;
		ParserRuleReturnScope extension_functions414 =null;
		ParserRuleReturnScope subquery415 =null;


		try {
			// JPA2.g:391:5: ( path_expression | boolean_literal | input_parameter | case_expression | function_invocation | extension_functions | subquery )
			int alt106=7;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt106=1;
				}
				break;
			case 142:
			case 143:
				{
				alt106=2;
				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt106=3;
				}
				break;
			case 84:
			case 86:
			case 118:
				{
				alt106=4;
				}
				break;
			case 102:
				{
				alt106=5;
				}
				break;
			case 76:
			case 85:
			case 100:
				{
				alt106=6;
				}
				break;
			case LPAREN:
				{
				alt106=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// JPA2.g:391:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_boolean_expression3591);
					path_expression409=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression409.getTree());

					}
					break;
				case 2 :
					// JPA2.g:392:7: boolean_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_literal_in_boolean_expression3599);
					boolean_literal410=boolean_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_literal410.getTree());

					}
					break;
				case 3 :
					// JPA2.g:393:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_boolean_expression3607);
					input_parameter411=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter411.getTree());

					}
					break;
				case 4 :
					// JPA2.g:394:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_expression3615);
					case_expression412=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression412.getTree());

					}
					break;
				case 5 :
					// JPA2.g:395:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_boolean_expression3623);
					function_invocation413=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation413.getTree());

					}
					break;
				case 6 :
					// JPA2.g:396:7: extension_functions
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_extension_functions_in_boolean_expression3631);
					extension_functions414=extension_functions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extension_functions414.getTree());

					}
					break;
				case 7 :
					// JPA2.g:397:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_boolean_expression3639);
					subquery415=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery415.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_expression"


	public static class enum_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_expression"
	// JPA2.g:398:1: enum_expression : ( path_expression | enum_literal | input_parameter | case_expression | subquery );
	public final JPA2Parser.enum_expression_return enum_expression() throws RecognitionException {
		JPA2Parser.enum_expression_return retval = new JPA2Parser.enum_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression416 =null;
		ParserRuleReturnScope enum_literal417 =null;
		ParserRuleReturnScope input_parameter418 =null;
		ParserRuleReturnScope case_expression419 =null;
		ParserRuleReturnScope subquery420 =null;


		try {
			// JPA2.g:399:5: ( path_expression | enum_literal | input_parameter | case_expression | subquery )
			int alt107=5;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA107_1 = input.LA(2);
				if ( (LA107_1==62) ) {
					alt107=1;
				}
				else if ( (LA107_1==EOF||(LA107_1 >= AND && LA107_1 <= ASC)||LA107_1==DESC||(LA107_1 >= GROUP && LA107_1 <= HAVING)||LA107_1==INNER||(LA107_1 >= JOIN && LA107_1 <= LEFT)||(LA107_1 >= OR && LA107_1 <= ORDER)||LA107_1==RPAREN||LA107_1==SET||LA107_1==WORD||LA107_1==60||(LA107_1 >= 67 && LA107_1 <= 68)||LA107_1==81||LA107_1==93||LA107_1==95||LA107_1==101||LA107_1==130||(LA107_1 >= 139 && LA107_1 <= 140)) ) {
					alt107=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt107=3;
				}
				break;
			case 84:
			case 86:
			case 118:
				{
				alt107=4;
				}
				break;
			case LPAREN:
				{
				alt107=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// JPA2.g:399:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_enum_expression3650);
					path_expression416=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression416.getTree());

					}
					break;
				case 2 :
					// JPA2.g:400:7: enum_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_literal_in_enum_expression3658);
					enum_literal417=enum_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_literal417.getTree());

					}
					break;
				case 3 :
					// JPA2.g:401:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_enum_expression3666);
					input_parameter418=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter418.getTree());

					}
					break;
				case 4 :
					// JPA2.g:402:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_enum_expression3674);
					case_expression419=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression419.getTree());

					}
					break;
				case 5 :
					// JPA2.g:403:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_enum_expression3682);
					subquery420=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery420.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_expression"


	public static class entity_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_expression"
	// JPA2.g:404:1: entity_expression : ( path_expression | simple_entity_expression );
	public final JPA2Parser.entity_expression_return entity_expression() throws RecognitionException {
		JPA2Parser.entity_expression_return retval = new JPA2Parser.entity_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression421 =null;
		ParserRuleReturnScope simple_entity_expression422 =null;


		try {
			// JPA2.g:405:5: ( path_expression | simple_entity_expression )
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==WORD) ) {
				int LA108_1 = input.LA(2);
				if ( (LA108_1==62) ) {
					alt108=1;
				}
				else if ( (LA108_1==EOF||LA108_1==AND||(LA108_1 >= GROUP && LA108_1 <= HAVING)||LA108_1==INNER||(LA108_1 >= JOIN && LA108_1 <= LEFT)||(LA108_1 >= OR && LA108_1 <= ORDER)||LA108_1==RPAREN||LA108_1==SET||LA108_1==60||(LA108_1 >= 67 && LA108_1 <= 68)||LA108_1==130||LA108_1==140) ) {
					alt108=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA108_0==NAMED_PARAMETER||LA108_0==57||LA108_0==71) ) {
				alt108=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}

			switch (alt108) {
				case 1 :
					// JPA2.g:405:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_entity_expression3693);
					path_expression421=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression421.getTree());

					}
					break;
				case 2 :
					// JPA2.g:406:7: simple_entity_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_expression_in_entity_expression3701);
					simple_entity_expression422=simple_entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_expression422.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_expression"


	public static class simple_entity_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_entity_expression"
	// JPA2.g:407:1: simple_entity_expression : ( identification_variable | input_parameter );
	public final JPA2Parser.simple_entity_expression_return simple_entity_expression() throws RecognitionException {
		JPA2Parser.simple_entity_expression_return retval = new JPA2Parser.simple_entity_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable423 =null;
		ParserRuleReturnScope input_parameter424 =null;


		try {
			// JPA2.g:408:5: ( identification_variable | input_parameter )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==WORD) ) {
				alt109=1;
			}
			else if ( (LA109_0==NAMED_PARAMETER||LA109_0==57||LA109_0==71) ) {
				alt109=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// JPA2.g:408:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_entity_expression3712);
					identification_variable423=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable423.getTree());

					}
					break;
				case 2 :
					// JPA2.g:409:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_simple_entity_expression3720);
					input_parameter424=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter424.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_entity_expression"


	public static class entity_type_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_type_expression"
	// JPA2.g:410:1: entity_type_expression : ( type_discriminator | entity_type_literal | input_parameter );
	public final JPA2Parser.entity_type_expression_return entity_type_expression() throws RecognitionException {
		JPA2Parser.entity_type_expression_return retval = new JPA2Parser.entity_type_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_discriminator425 =null;
		ParserRuleReturnScope entity_type_literal426 =null;
		ParserRuleReturnScope input_parameter427 =null;


		try {
			// JPA2.g:411:5: ( type_discriminator | entity_type_literal | input_parameter )
			int alt110=3;
			switch ( input.LA(1) ) {
			case 134:
				{
				alt110=1;
				}
				break;
			case WORD:
				{
				alt110=2;
				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt110=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// JPA2.g:411:7: type_discriminator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_discriminator_in_entity_type_expression3731);
					type_discriminator425=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator425.getTree());

					}
					break;
				case 2 :
					// JPA2.g:412:7: entity_type_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_literal_in_entity_type_expression3739);
					entity_type_literal426=entity_type_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_literal426.getTree());

					}
					break;
				case 3 :
					// JPA2.g:413:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_entity_type_expression3747);
					input_parameter427=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter427.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_type_expression"


	public static class type_discriminator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_discriminator"
	// JPA2.g:414:1: type_discriminator : 'TYPE(' ( general_identification_variable | path_expression | input_parameter ) ')' ;
	public final JPA2Parser.type_discriminator_return type_discriminator() throws RecognitionException {
		JPA2Parser.type_discriminator_return retval = new JPA2Parser.type_discriminator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal428=null;
		Token char_literal432=null;
		ParserRuleReturnScope general_identification_variable429 =null;
		ParserRuleReturnScope path_expression430 =null;
		ParserRuleReturnScope input_parameter431 =null;

		Object string_literal428_tree=null;
		Object char_literal432_tree=null;

		try {
			// JPA2.g:415:5: ( 'TYPE(' ( general_identification_variable | path_expression | input_parameter ) ')' )
			// JPA2.g:415:7: 'TYPE(' ( general_identification_variable | path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal428=(Token)match(input,134,FOLLOW_134_in_type_discriminator3758); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal428_tree = (Object)adaptor.create(string_literal428);
			adaptor.addChild(root_0, string_literal428_tree);
			}

			// JPA2.g:415:15: ( general_identification_variable | path_expression | input_parameter )
			int alt111=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA111_1 = input.LA(2);
				if ( (LA111_1==RPAREN) ) {
					alt111=1;
				}
				else if ( (LA111_1==62) ) {
					alt111=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
			case 137:
				{
				alt111=1;
				}
				break;
			case NAMED_PARAMETER:
			case 57:
			case 71:
				{
				alt111=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// JPA2.g:415:16: general_identification_variable
					{
					pushFollow(FOLLOW_general_identification_variable_in_type_discriminator3761);
					general_identification_variable429=general_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_identification_variable429.getTree());

					}
					break;
				case 2 :
					// JPA2.g:415:50: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_type_discriminator3765);
					path_expression430=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression430.getTree());

					}
					break;
				case 3 :
					// JPA2.g:415:68: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_type_discriminator3769);
					input_parameter431=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter431.getTree());

					}
					break;

			}

			char_literal432=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_discriminator3772); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal432_tree = (Object)adaptor.create(char_literal432);
			adaptor.addChild(root_0, char_literal432_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_discriminator"


	public static class functions_returning_numerics_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_numerics"
	// JPA2.g:416:1: functions_returning_numerics : ( 'LENGTH(' string_expression ')' | 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')' | 'ABS(' arithmetic_expression ')' | 'SQRT(' arithmetic_expression ')' | 'MOD(' arithmetic_expression ',' arithmetic_expression ')' | 'SIZE(' path_expression ')' | 'INDEX(' identification_variable ')' );
	public final JPA2Parser.functions_returning_numerics_return functions_returning_numerics() throws RecognitionException {
		JPA2Parser.functions_returning_numerics_return retval = new JPA2Parser.functions_returning_numerics_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal433=null;
		Token char_literal435=null;
		Token string_literal436=null;
		Token char_literal438=null;
		Token char_literal440=null;
		Token char_literal442=null;
		Token string_literal443=null;
		Token char_literal445=null;
		Token string_literal446=null;
		Token char_literal448=null;
		Token string_literal449=null;
		Token char_literal451=null;
		Token char_literal453=null;
		Token string_literal454=null;
		Token char_literal456=null;
		Token string_literal457=null;
		Token char_literal459=null;
		ParserRuleReturnScope string_expression434 =null;
		ParserRuleReturnScope string_expression437 =null;
		ParserRuleReturnScope string_expression439 =null;
		ParserRuleReturnScope arithmetic_expression441 =null;
		ParserRuleReturnScope arithmetic_expression444 =null;
		ParserRuleReturnScope arithmetic_expression447 =null;
		ParserRuleReturnScope arithmetic_expression450 =null;
		ParserRuleReturnScope arithmetic_expression452 =null;
		ParserRuleReturnScope path_expression455 =null;
		ParserRuleReturnScope identification_variable458 =null;

		Object string_literal433_tree=null;
		Object char_literal435_tree=null;
		Object string_literal436_tree=null;
		Object char_literal438_tree=null;
		Object char_literal440_tree=null;
		Object char_literal442_tree=null;
		Object string_literal443_tree=null;
		Object char_literal445_tree=null;
		Object string_literal446_tree=null;
		Object char_literal448_tree=null;
		Object string_literal449_tree=null;
		Object char_literal451_tree=null;
		Object char_literal453_tree=null;
		Object string_literal454_tree=null;
		Object char_literal456_tree=null;
		Object string_literal457_tree=null;
		Object char_literal459_tree=null;

		try {
			// JPA2.g:417:5: ( 'LENGTH(' string_expression ')' | 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')' | 'ABS(' arithmetic_expression ')' | 'SQRT(' arithmetic_expression ')' | 'MOD(' arithmetic_expression ',' arithmetic_expression ')' | 'SIZE(' path_expression ')' | 'INDEX(' identification_variable ')' )
			int alt113=7;
			switch ( input.LA(1) ) {
			case 108:
				{
				alt113=1;
				}
				break;
			case 110:
				{
				alt113=2;
				}
				break;
			case 78:
				{
				alt113=3;
				}
				break;
			case 128:
				{
				alt113=4;
				}
				break;
			case 113:
				{
				alt113=5;
				}
				break;
			case 126:
				{
				alt113=6;
				}
				break;
			case 104:
				{
				alt113=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}
			switch (alt113) {
				case 1 :
					// JPA2.g:417:7: 'LENGTH(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal433=(Token)match(input,108,FOLLOW_108_in_functions_returning_numerics3783); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal433_tree = (Object)adaptor.create(string_literal433);
					adaptor.addChild(root_0, string_literal433_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3784);
					string_expression434=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression434.getTree());

					char_literal435=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal435_tree = (Object)adaptor.create(char_literal435);
					adaptor.addChild(root_0, char_literal435_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:418:7: 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal436=(Token)match(input,110,FOLLOW_110_in_functions_returning_numerics3793); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal436_tree = (Object)adaptor.create(string_literal436);
					adaptor.addChild(root_0, string_literal436_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3795);
					string_expression437=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression437.getTree());

					char_literal438=(Token)match(input,60,FOLLOW_60_in_functions_returning_numerics3796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal438_tree = (Object)adaptor.create(char_literal438);
					adaptor.addChild(root_0, char_literal438_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3798);
					string_expression439=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression439.getTree());

					// JPA2.g:418:55: ( ',' arithmetic_expression )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==60) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// JPA2.g:418:56: ',' arithmetic_expression
							{
							char_literal440=(Token)match(input,60,FOLLOW_60_in_functions_returning_numerics3800); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal440_tree = (Object)adaptor.create(char_literal440);
							adaptor.addChild(root_0, char_literal440_tree);
							}

							pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3801);
							arithmetic_expression441=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression441.getTree());

							}
							break;

					}

					char_literal442=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3804); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal442_tree = (Object)adaptor.create(char_literal442);
					adaptor.addChild(root_0, char_literal442_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:419:7: 'ABS(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal443=(Token)match(input,78,FOLLOW_78_in_functions_returning_numerics3812); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal443_tree = (Object)adaptor.create(string_literal443);
					adaptor.addChild(root_0, string_literal443_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3813);
					arithmetic_expression444=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression444.getTree());

					char_literal445=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal445_tree = (Object)adaptor.create(char_literal445);
					adaptor.addChild(root_0, char_literal445_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:420:7: 'SQRT(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal446=(Token)match(input,128,FOLLOW_128_in_functions_returning_numerics3822); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal446_tree = (Object)adaptor.create(string_literal446);
					adaptor.addChild(root_0, string_literal446_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3823);
					arithmetic_expression447=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression447.getTree());

					char_literal448=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3824); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal448_tree = (Object)adaptor.create(char_literal448);
					adaptor.addChild(root_0, char_literal448_tree);
					}

					}
					break;
				case 5 :
					// JPA2.g:421:7: 'MOD(' arithmetic_expression ',' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal449=(Token)match(input,113,FOLLOW_113_in_functions_returning_numerics3832); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal449_tree = (Object)adaptor.create(string_literal449);
					adaptor.addChild(root_0, string_literal449_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3833);
					arithmetic_expression450=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression450.getTree());

					char_literal451=(Token)match(input,60,FOLLOW_60_in_functions_returning_numerics3834); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal451_tree = (Object)adaptor.create(char_literal451);
					adaptor.addChild(root_0, char_literal451_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3836);
					arithmetic_expression452=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression452.getTree());

					char_literal453=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal453_tree = (Object)adaptor.create(char_literal453);
					adaptor.addChild(root_0, char_literal453_tree);
					}

					}
					break;
				case 6 :
					// JPA2.g:422:7: 'SIZE(' path_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal454=(Token)match(input,126,FOLLOW_126_in_functions_returning_numerics3845); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal454_tree = (Object)adaptor.create(string_literal454);
					adaptor.addChild(root_0, string_literal454_tree);
					}

					pushFollow(FOLLOW_path_expression_in_functions_returning_numerics3846);
					path_expression455=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression455.getTree());

					char_literal456=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3847); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal456_tree = (Object)adaptor.create(char_literal456);
					adaptor.addChild(root_0, char_literal456_tree);
					}

					}
					break;
				case 7 :
					// JPA2.g:423:7: 'INDEX(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal457=(Token)match(input,104,FOLLOW_104_in_functions_returning_numerics3855); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal457_tree = (Object)adaptor.create(string_literal457);
					adaptor.addChild(root_0, string_literal457_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_functions_returning_numerics3856);
					identification_variable458=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable458.getTree());

					char_literal459=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3857); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal459_tree = (Object)adaptor.create(char_literal459);
					adaptor.addChild(root_0, char_literal459_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_numerics"


	public static class functions_returning_datetime_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_datetime"
	// JPA2.g:424:1: functions_returning_datetime : ( 'CURRENT_DATE' | 'CURRENT_TIME' | 'CURRENT_TIMESTAMP' );
	public final JPA2Parser.functions_returning_datetime_return functions_returning_datetime() throws RecognitionException {
		JPA2Parser.functions_returning_datetime_return retval = new JPA2Parser.functions_returning_datetime_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set460=null;

		Object set460_tree=null;

		try {
			// JPA2.g:425:5: ( 'CURRENT_DATE' | 'CURRENT_TIME' | 'CURRENT_TIMESTAMP' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set460=input.LT(1);
			if ( (input.LA(1) >= 88 && input.LA(1) <= 90) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set460));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_datetime"


	public static class functions_returning_strings_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_strings"
	// JPA2.g:428:1: functions_returning_strings : ( 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')' | 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')' | 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')' | 'LOWER' '(' string_expression ')' | 'UPPER(' string_expression ')' );
	public final JPA2Parser.functions_returning_strings_return functions_returning_strings() throws RecognitionException {
		JPA2Parser.functions_returning_strings_return retval = new JPA2Parser.functions_returning_strings_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal461=null;
		Token char_literal463=null;
		Token char_literal465=null;
		Token char_literal467=null;
		Token string_literal468=null;
		Token char_literal470=null;
		Token char_literal472=null;
		Token char_literal474=null;
		Token string_literal475=null;
		Token string_literal478=null;
		Token char_literal480=null;
		Token string_literal481=null;
		Token char_literal482=null;
		Token char_literal484=null;
		Token string_literal485=null;
		Token char_literal487=null;
		ParserRuleReturnScope string_expression462 =null;
		ParserRuleReturnScope string_expression464 =null;
		ParserRuleReturnScope string_expression466 =null;
		ParserRuleReturnScope string_expression469 =null;
		ParserRuleReturnScope arithmetic_expression471 =null;
		ParserRuleReturnScope arithmetic_expression473 =null;
		ParserRuleReturnScope trim_specification476 =null;
		ParserRuleReturnScope trim_character477 =null;
		ParserRuleReturnScope string_expression479 =null;
		ParserRuleReturnScope string_expression483 =null;
		ParserRuleReturnScope string_expression486 =null;

		Object string_literal461_tree=null;
		Object char_literal463_tree=null;
		Object char_literal465_tree=null;
		Object char_literal467_tree=null;
		Object string_literal468_tree=null;
		Object char_literal470_tree=null;
		Object char_literal472_tree=null;
		Object char_literal474_tree=null;
		Object string_literal475_tree=null;
		Object string_literal478_tree=null;
		Object char_literal480_tree=null;
		Object string_literal481_tree=null;
		Object char_literal482_tree=null;
		Object char_literal484_tree=null;
		Object string_literal485_tree=null;
		Object char_literal487_tree=null;

		try {
			// JPA2.g:429:5: ( 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')' | 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')' | 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')' | 'LOWER' '(' string_expression ')' | 'UPPER(' string_expression ')' )
			int alt119=5;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt119=1;
				}
				break;
			case 129:
				{
				alt119=2;
				}
				break;
			case 133:
				{
				alt119=3;
				}
				break;
			case LOWER:
				{
				alt119=4;
				}
				break;
			case 136:
				{
				alt119=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}
			switch (alt119) {
				case 1 :
					// JPA2.g:429:7: 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal461=(Token)match(input,87,FOLLOW_87_in_functions_returning_strings3895); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal461_tree = (Object)adaptor.create(string_literal461);
					adaptor.addChild(root_0, string_literal461_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3896);
					string_expression462=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression462.getTree());

					char_literal463=(Token)match(input,60,FOLLOW_60_in_functions_returning_strings3897); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal463_tree = (Object)adaptor.create(char_literal463);
					adaptor.addChild(root_0, char_literal463_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3899);
					string_expression464=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression464.getTree());

					// JPA2.g:429:55: ( ',' string_expression )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==60) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// JPA2.g:429:56: ',' string_expression
							{
							char_literal465=(Token)match(input,60,FOLLOW_60_in_functions_returning_strings3902); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal465_tree = (Object)adaptor.create(char_literal465);
							adaptor.addChild(root_0, char_literal465_tree);
							}

							pushFollow(FOLLOW_string_expression_in_functions_returning_strings3904);
							string_expression466=string_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression466.getTree());

							}
							break;

						default :
							break loop114;
						}
					}

					char_literal467=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3907); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal467_tree = (Object)adaptor.create(char_literal467);
					adaptor.addChild(root_0, char_literal467_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:430:7: 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal468=(Token)match(input,129,FOLLOW_129_in_functions_returning_strings3915); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal468_tree = (Object)adaptor.create(string_literal468);
					adaptor.addChild(root_0, string_literal468_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3917);
					string_expression469=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression469.getTree());

					char_literal470=(Token)match(input,60,FOLLOW_60_in_functions_returning_strings3918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal470_tree = (Object)adaptor.create(char_literal470);
					adaptor.addChild(root_0, char_literal470_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_strings3920);
					arithmetic_expression471=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression471.getTree());

					// JPA2.g:430:63: ( ',' arithmetic_expression )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==60) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// JPA2.g:430:64: ',' arithmetic_expression
							{
							char_literal472=(Token)match(input,60,FOLLOW_60_in_functions_returning_strings3923); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal472_tree = (Object)adaptor.create(char_literal472);
							adaptor.addChild(root_0, char_literal472_tree);
							}

							pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_strings3925);
							arithmetic_expression473=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression473.getTree());

							}
							break;

					}

					char_literal474=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal474_tree = (Object)adaptor.create(char_literal474);
					adaptor.addChild(root_0, char_literal474_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:431:7: 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal475=(Token)match(input,133,FOLLOW_133_in_functions_returning_strings3936); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal475_tree = (Object)adaptor.create(string_literal475);
					adaptor.addChild(root_0, string_literal475_tree);
					}

					// JPA2.g:431:14: ( ( trim_specification )? ( trim_character )? 'FROM' )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==TRIM_CHARACTER||LA118_0==83||LA118_0==101||LA118_0==107||LA118_0==131) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// JPA2.g:431:15: ( trim_specification )? ( trim_character )? 'FROM'
							{
							// JPA2.g:431:15: ( trim_specification )?
							int alt116=2;
							int LA116_0 = input.LA(1);
							if ( (LA116_0==83||LA116_0==107||LA116_0==131) ) {
								alt116=1;
							}
							switch (alt116) {
								case 1 :
									// JPA2.g:431:16: trim_specification
									{
									pushFollow(FOLLOW_trim_specification_in_functions_returning_strings3939);
									trim_specification476=trim_specification();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, trim_specification476.getTree());

									}
									break;

							}

							// JPA2.g:431:37: ( trim_character )?
							int alt117=2;
							int LA117_0 = input.LA(1);
							if ( (LA117_0==TRIM_CHARACTER) ) {
								alt117=1;
							}
							switch (alt117) {
								case 1 :
									// JPA2.g:431:38: trim_character
									{
									pushFollow(FOLLOW_trim_character_in_functions_returning_strings3944);
									trim_character477=trim_character();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, trim_character477.getTree());

									}
									break;

							}

							string_literal478=(Token)match(input,101,FOLLOW_101_in_functions_returning_strings3948); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal478_tree = (Object)adaptor.create(string_literal478);
							adaptor.addChild(root_0, string_literal478_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3952);
					string_expression479=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression479.getTree());

					char_literal480=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3954); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal480_tree = (Object)adaptor.create(char_literal480);
					adaptor.addChild(root_0, char_literal480_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:432:7: 'LOWER' '(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal481=(Token)match(input,LOWER,FOLLOW_LOWER_in_functions_returning_strings3962); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal481_tree = (Object)adaptor.create(string_literal481);
					adaptor.addChild(root_0, string_literal481_tree);
					}

					char_literal482=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functions_returning_strings3964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal482_tree = (Object)adaptor.create(char_literal482);
					adaptor.addChild(root_0, char_literal482_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3965);
					string_expression483=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression483.getTree());

					char_literal484=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3966); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal484_tree = (Object)adaptor.create(char_literal484);
					adaptor.addChild(root_0, char_literal484_tree);
					}

					}
					break;
				case 5 :
					// JPA2.g:433:7: 'UPPER(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal485=(Token)match(input,136,FOLLOW_136_in_functions_returning_strings3974); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal485_tree = (Object)adaptor.create(string_literal485);
					adaptor.addChild(root_0, string_literal485_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3975);
					string_expression486=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression486.getTree());

					char_literal487=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal487_tree = (Object)adaptor.create(char_literal487);
					adaptor.addChild(root_0, char_literal487_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_strings"


	public static class trim_specification_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trim_specification"
	// JPA2.g:434:1: trim_specification : ( 'LEADING' | 'TRAILING' | 'BOTH' );
	public final JPA2Parser.trim_specification_return trim_specification() throws RecognitionException {
		JPA2Parser.trim_specification_return retval = new JPA2Parser.trim_specification_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set488=null;

		Object set488_tree=null;

		try {
			// JPA2.g:435:5: ( 'LEADING' | 'TRAILING' | 'BOTH' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set488=input.LT(1);
			if ( input.LA(1)==83||input.LA(1)==107||input.LA(1)==131 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set488));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trim_specification"


	public static class function_invocation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_invocation"
	// JPA2.g:436:1: function_invocation : 'FUNCTION(' function_name ( ',' function_arg )* ')' ;
	public final JPA2Parser.function_invocation_return function_invocation() throws RecognitionException {
		JPA2Parser.function_invocation_return retval = new JPA2Parser.function_invocation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal489=null;
		Token char_literal491=null;
		Token char_literal493=null;
		ParserRuleReturnScope function_name490 =null;
		ParserRuleReturnScope function_arg492 =null;

		Object string_literal489_tree=null;
		Object char_literal491_tree=null;
		Object char_literal493_tree=null;

		try {
			// JPA2.g:437:5: ( 'FUNCTION(' function_name ( ',' function_arg )* ')' )
			// JPA2.g:437:7: 'FUNCTION(' function_name ( ',' function_arg )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal489=(Token)match(input,102,FOLLOW_102_in_function_invocation4006); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal489_tree = (Object)adaptor.create(string_literal489);
			adaptor.addChild(root_0, string_literal489_tree);
			}

			pushFollow(FOLLOW_function_name_in_function_invocation4007);
			function_name490=function_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name490.getTree());

			// JPA2.g:437:32: ( ',' function_arg )*
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==60) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// JPA2.g:437:33: ',' function_arg
					{
					char_literal491=(Token)match(input,60,FOLLOW_60_in_function_invocation4010); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal491_tree = (Object)adaptor.create(char_literal491);
					adaptor.addChild(root_0, char_literal491_tree);
					}

					pushFollow(FOLLOW_function_arg_in_function_invocation4012);
					function_arg492=function_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_arg492.getTree());

					}
					break;

				default :
					break loop120;
				}
			}

			char_literal493=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_invocation4016); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal493_tree = (Object)adaptor.create(char_literal493);
			adaptor.addChild(root_0, char_literal493_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_invocation"


	public static class function_arg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_arg"
	// JPA2.g:438:1: function_arg : ( literal | path_expression | input_parameter | scalar_expression );
	public final JPA2Parser.function_arg_return function_arg() throws RecognitionException {
		JPA2Parser.function_arg_return retval = new JPA2Parser.function_arg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope literal494 =null;
		ParserRuleReturnScope path_expression495 =null;
		ParserRuleReturnScope input_parameter496 =null;
		ParserRuleReturnScope scalar_expression497 =null;


		try {
			// JPA2.g:439:5: ( literal | path_expression | input_parameter | scalar_expression )
			int alt121=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA121_1 = input.LA(2);
				if ( (LA121_1==62) ) {
					alt121=2;
				}
				else if ( (synpred239_JPA2()) ) {
					alt121=1;
				}
				else if ( (true) ) {
					alt121=4;
				}

				}
				break;
			case 71:
				{
				int LA121_2 = input.LA(2);
				if ( (LA121_2==64) ) {
					int LA121_8 = input.LA(3);
					if ( (LA121_8==INT_NUMERAL) ) {
						int LA121_12 = input.LA(4);
						if ( (synpred241_JPA2()) ) {
							alt121=3;
						}
						else if ( (true) ) {
							alt121=4;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 121, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA121_2==INT_NUMERAL) ) {
					int LA121_9 = input.LA(3);
					if ( (synpred241_JPA2()) ) {
						alt121=3;
					}
					else if ( (true) ) {
						alt121=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA121_3 = input.LA(2);
				if ( (synpred241_JPA2()) ) {
					alt121=3;
				}
				else if ( (true) ) {
					alt121=4;
				}

				}
				break;
			case 57:
				{
				int LA121_4 = input.LA(2);
				if ( (LA121_4==WORD) ) {
					int LA121_11 = input.LA(3);
					if ( (LA121_11==144) ) {
						int LA121_13 = input.LA(4);
						if ( (synpred241_JPA2()) ) {
							alt121=3;
						}
						else if ( (true) ) {
							alt121=4;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 121, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case COUNT:
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case MAX:
			case MIN:
			case STRING_LITERAL:
			case SUM:
			case 59:
			case 61:
			case 64:
			case 76:
			case 78:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 100:
			case 102:
			case 104:
			case 108:
			case 110:
			case 113:
			case 118:
			case 126:
			case 128:
			case 129:
			case 133:
			case 134:
			case 136:
			case 142:
			case 143:
				{
				alt121=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}
			switch (alt121) {
				case 1 :
					// JPA2.g:439:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_function_arg4027);
					literal494=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal494.getTree());

					}
					break;
				case 2 :
					// JPA2.g:440:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_function_arg4035);
					path_expression495=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression495.getTree());

					}
					break;
				case 3 :
					// JPA2.g:441:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_function_arg4043);
					input_parameter496=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter496.getTree());

					}
					break;
				case 4 :
					// JPA2.g:442:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_function_arg4051);
					scalar_expression497=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression497.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_arg"


	public static class case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "case_expression"
	// JPA2.g:443:1: case_expression : ( general_case_expression | simple_case_expression | coalesce_expression | nullif_expression );
	public final JPA2Parser.case_expression_return case_expression() throws RecognitionException {
		JPA2Parser.case_expression_return retval = new JPA2Parser.case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope general_case_expression498 =null;
		ParserRuleReturnScope simple_case_expression499 =null;
		ParserRuleReturnScope coalesce_expression500 =null;
		ParserRuleReturnScope nullif_expression501 =null;


		try {
			// JPA2.g:444:5: ( general_case_expression | simple_case_expression | coalesce_expression | nullif_expression )
			int alt122=4;
			switch ( input.LA(1) ) {
			case 84:
				{
				int LA122_1 = input.LA(2);
				if ( (LA122_1==139) ) {
					alt122=1;
				}
				else if ( (LA122_1==WORD||LA122_1==134) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 86:
				{
				alt122=3;
				}
				break;
			case 118:
				{
				alt122=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}
			switch (alt122) {
				case 1 :
					// JPA2.g:444:7: general_case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_case_expression_in_case_expression4062);
					general_case_expression498=general_case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_case_expression498.getTree());

					}
					break;
				case 2 :
					// JPA2.g:445:7: simple_case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_case_expression_in_case_expression4070);
					simple_case_expression499=simple_case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case_expression499.getTree());

					}
					break;
				case 3 :
					// JPA2.g:446:7: coalesce_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_coalesce_expression_in_case_expression4078);
					coalesce_expression500=coalesce_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, coalesce_expression500.getTree());

					}
					break;
				case 4 :
					// JPA2.g:447:7: nullif_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nullif_expression_in_case_expression4086);
					nullif_expression501=nullif_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nullif_expression501.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_expression"


	public static class general_case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_case_expression"
	// JPA2.g:448:1: general_case_expression : 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END' ;
	public final JPA2Parser.general_case_expression_return general_case_expression() throws RecognitionException {
		JPA2Parser.general_case_expression_return retval = new JPA2Parser.general_case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal502=null;
		Token string_literal505=null;
		Token string_literal507=null;
		ParserRuleReturnScope when_clause503 =null;
		ParserRuleReturnScope when_clause504 =null;
		ParserRuleReturnScope scalar_expression506 =null;

		Object string_literal502_tree=null;
		Object string_literal505_tree=null;
		Object string_literal507_tree=null;

		try {
			// JPA2.g:449:5: ( 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END' )
			// JPA2.g:449:7: 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal502=(Token)match(input,84,FOLLOW_84_in_general_case_expression4097); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal502_tree = (Object)adaptor.create(string_literal502);
			adaptor.addChild(root_0, string_literal502_tree);
			}

			pushFollow(FOLLOW_when_clause_in_general_case_expression4099);
			when_clause503=when_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, when_clause503.getTree());

			// JPA2.g:449:26: ( when_clause )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==139) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// JPA2.g:449:27: when_clause
					{
					pushFollow(FOLLOW_when_clause_in_general_case_expression4102);
					when_clause504=when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, when_clause504.getTree());

					}
					break;

				default :
					break loop123;
				}
			}

			string_literal505=(Token)match(input,93,FOLLOW_93_in_general_case_expression4106); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal505_tree = (Object)adaptor.create(string_literal505);
			adaptor.addChild(root_0, string_literal505_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_general_case_expression4108);
			scalar_expression506=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression506.getTree());

			string_literal507=(Token)match(input,95,FOLLOW_95_in_general_case_expression4110); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal507_tree = (Object)adaptor.create(string_literal507);
			adaptor.addChild(root_0, string_literal507_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_case_expression"


	public static class when_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "when_clause"
	// JPA2.g:450:1: when_clause : 'WHEN' conditional_expression 'THEN' scalar_expression ;
	public final JPA2Parser.when_clause_return when_clause() throws RecognitionException {
		JPA2Parser.when_clause_return retval = new JPA2Parser.when_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal508=null;
		Token string_literal510=null;
		ParserRuleReturnScope conditional_expression509 =null;
		ParserRuleReturnScope scalar_expression511 =null;

		Object string_literal508_tree=null;
		Object string_literal510_tree=null;

		try {
			// JPA2.g:451:5: ( 'WHEN' conditional_expression 'THEN' scalar_expression )
			// JPA2.g:451:7: 'WHEN' conditional_expression 'THEN' scalar_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal508=(Token)match(input,139,FOLLOW_139_in_when_clause4121); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal508_tree = (Object)adaptor.create(string_literal508);
			adaptor.addChild(root_0, string_literal508_tree);
			}

			pushFollow(FOLLOW_conditional_expression_in_when_clause4123);
			conditional_expression509=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression509.getTree());

			string_literal510=(Token)match(input,130,FOLLOW_130_in_when_clause4125); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal510_tree = (Object)adaptor.create(string_literal510);
			adaptor.addChild(root_0, string_literal510_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_when_clause4127);
			scalar_expression511=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression511.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "when_clause"


	public static class simple_case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_case_expression"
	// JPA2.g:452:1: simple_case_expression : 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END' ;
	public final JPA2Parser.simple_case_expression_return simple_case_expression() throws RecognitionException {
		JPA2Parser.simple_case_expression_return retval = new JPA2Parser.simple_case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal512=null;
		Token string_literal516=null;
		Token string_literal518=null;
		ParserRuleReturnScope case_operand513 =null;
		ParserRuleReturnScope simple_when_clause514 =null;
		ParserRuleReturnScope simple_when_clause515 =null;
		ParserRuleReturnScope scalar_expression517 =null;

		Object string_literal512_tree=null;
		Object string_literal516_tree=null;
		Object string_literal518_tree=null;

		try {
			// JPA2.g:453:5: ( 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END' )
			// JPA2.g:453:7: 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal512=(Token)match(input,84,FOLLOW_84_in_simple_case_expression4138); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal512_tree = (Object)adaptor.create(string_literal512);
			adaptor.addChild(root_0, string_literal512_tree);
			}

			pushFollow(FOLLOW_case_operand_in_simple_case_expression4140);
			case_operand513=case_operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_operand513.getTree());

			pushFollow(FOLLOW_simple_when_clause_in_simple_case_expression4142);
			simple_when_clause514=simple_when_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause514.getTree());

			// JPA2.g:453:46: ( simple_when_clause )*
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==139) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// JPA2.g:453:47: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case_expression4145);
					simple_when_clause515=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause515.getTree());

					}
					break;

				default :
					break loop124;
				}
			}

			string_literal516=(Token)match(input,93,FOLLOW_93_in_simple_case_expression4149); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal516_tree = (Object)adaptor.create(string_literal516);
			adaptor.addChild(root_0, string_literal516_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_case_expression4151);
			scalar_expression517=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression517.getTree());

			string_literal518=(Token)match(input,95,FOLLOW_95_in_simple_case_expression4153); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal518_tree = (Object)adaptor.create(string_literal518);
			adaptor.addChild(root_0, string_literal518_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_case_expression"


	public static class case_operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "case_operand"
	// JPA2.g:454:1: case_operand : ( path_expression | type_discriminator );
	public final JPA2Parser.case_operand_return case_operand() throws RecognitionException {
		JPA2Parser.case_operand_return retval = new JPA2Parser.case_operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression519 =null;
		ParserRuleReturnScope type_discriminator520 =null;


		try {
			// JPA2.g:455:5: ( path_expression | type_discriminator )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==WORD) ) {
				alt125=1;
			}
			else if ( (LA125_0==134) ) {
				alt125=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}

			switch (alt125) {
				case 1 :
					// JPA2.g:455:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_case_operand4164);
					path_expression519=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression519.getTree());

					}
					break;
				case 2 :
					// JPA2.g:456:7: type_discriminator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_discriminator_in_case_operand4172);
					type_discriminator520=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator520.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_operand"


	public static class simple_when_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_when_clause"
	// JPA2.g:457:1: simple_when_clause : 'WHEN' scalar_expression 'THEN' scalar_expression ;
	public final JPA2Parser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		JPA2Parser.simple_when_clause_return retval = new JPA2Parser.simple_when_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal521=null;
		Token string_literal523=null;
		ParserRuleReturnScope scalar_expression522 =null;
		ParserRuleReturnScope scalar_expression524 =null;

		Object string_literal521_tree=null;
		Object string_literal523_tree=null;

		try {
			// JPA2.g:458:5: ( 'WHEN' scalar_expression 'THEN' scalar_expression )
			// JPA2.g:458:7: 'WHEN' scalar_expression 'THEN' scalar_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal521=(Token)match(input,139,FOLLOW_139_in_simple_when_clause4183); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal521_tree = (Object)adaptor.create(string_literal521);
			adaptor.addChild(root_0, string_literal521_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_when_clause4185);
			scalar_expression522=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression522.getTree());

			string_literal523=(Token)match(input,130,FOLLOW_130_in_simple_when_clause4187); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal523_tree = (Object)adaptor.create(string_literal523);
			adaptor.addChild(root_0, string_literal523_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_when_clause4189);
			scalar_expression524=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression524.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_when_clause"


	public static class coalesce_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "coalesce_expression"
	// JPA2.g:459:1: coalesce_expression : 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')' ;
	public final JPA2Parser.coalesce_expression_return coalesce_expression() throws RecognitionException {
		JPA2Parser.coalesce_expression_return retval = new JPA2Parser.coalesce_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal525=null;
		Token char_literal527=null;
		Token char_literal529=null;
		ParserRuleReturnScope scalar_expression526 =null;
		ParserRuleReturnScope scalar_expression528 =null;

		Object string_literal525_tree=null;
		Object char_literal527_tree=null;
		Object char_literal529_tree=null;

		try {
			// JPA2.g:460:5: ( 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')' )
			// JPA2.g:460:7: 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal525=(Token)match(input,86,FOLLOW_86_in_coalesce_expression4200); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal525_tree = (Object)adaptor.create(string_literal525);
			adaptor.addChild(root_0, string_literal525_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_coalesce_expression4201);
			scalar_expression526=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression526.getTree());

			// JPA2.g:460:36: ( ',' scalar_expression )+
			int cnt126=0;
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==60) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// JPA2.g:460:37: ',' scalar_expression
					{
					char_literal527=(Token)match(input,60,FOLLOW_60_in_coalesce_expression4204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal527_tree = (Object)adaptor.create(char_literal527);
					adaptor.addChild(root_0, char_literal527_tree);
					}

					pushFollow(FOLLOW_scalar_expression_in_coalesce_expression4206);
					scalar_expression528=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression528.getTree());

					}
					break;

				default :
					if ( cnt126 >= 1 ) break loop126;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(126, input);
					throw eee;
				}
				cnt126++;
			}

			char_literal529=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_coalesce_expression4209); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal529_tree = (Object)adaptor.create(char_literal529);
			adaptor.addChild(root_0, char_literal529_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coalesce_expression"


	public static class nullif_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nullif_expression"
	// JPA2.g:461:1: nullif_expression : 'NULLIF(' scalar_expression ',' scalar_expression ')' ;
	public final JPA2Parser.nullif_expression_return nullif_expression() throws RecognitionException {
		JPA2Parser.nullif_expression_return retval = new JPA2Parser.nullif_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal530=null;
		Token char_literal532=null;
		Token char_literal534=null;
		ParserRuleReturnScope scalar_expression531 =null;
		ParserRuleReturnScope scalar_expression533 =null;

		Object string_literal530_tree=null;
		Object char_literal532_tree=null;
		Object char_literal534_tree=null;

		try {
			// JPA2.g:462:5: ( 'NULLIF(' scalar_expression ',' scalar_expression ')' )
			// JPA2.g:462:7: 'NULLIF(' scalar_expression ',' scalar_expression ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal530=(Token)match(input,118,FOLLOW_118_in_nullif_expression4220); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal530_tree = (Object)adaptor.create(string_literal530);
			adaptor.addChild(root_0, string_literal530_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_nullif_expression4221);
			scalar_expression531=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression531.getTree());

			char_literal532=(Token)match(input,60,FOLLOW_60_in_nullif_expression4223); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal532_tree = (Object)adaptor.create(char_literal532);
			adaptor.addChild(root_0, char_literal532_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_nullif_expression4225);
			scalar_expression533=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression533.getTree());

			char_literal534=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nullif_expression4226); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal534_tree = (Object)adaptor.create(char_literal534);
			adaptor.addChild(root_0, char_literal534_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nullif_expression"


	public static class extension_functions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extension_functions"
	// JPA2.g:464:1: extension_functions : ( 'CAST(' function_arg WORD ( '(' INT_NUMERAL ( ',' INT_NUMERAL )* ')' )* ')' | 'EXTRACT(' date_part 'FROM' function_arg ')' | '@ENUM' '(' enum_value_literal ')' -> ^( T_ENUM_MACROS[$enum_value_literal.text] ) );
	public final JPA2Parser.extension_functions_return extension_functions() throws RecognitionException {
		JPA2Parser.extension_functions_return retval = new JPA2Parser.extension_functions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal535=null;
		Token WORD537=null;
		Token char_literal538=null;
		Token INT_NUMERAL539=null;
		Token char_literal540=null;
		Token INT_NUMERAL541=null;
		Token char_literal542=null;
		Token char_literal543=null;
		Token string_literal544=null;
		Token string_literal546=null;
		Token char_literal548=null;
		Token string_literal549=null;
		Token char_literal550=null;
		Token char_literal552=null;
		ParserRuleReturnScope function_arg536 =null;
		ParserRuleReturnScope date_part545 =null;
		ParserRuleReturnScope function_arg547 =null;
		ParserRuleReturnScope enum_value_literal551 =null;

		Object string_literal535_tree=null;
		Object WORD537_tree=null;
		Object char_literal538_tree=null;
		Object INT_NUMERAL539_tree=null;
		Object char_literal540_tree=null;
		Object INT_NUMERAL541_tree=null;
		Object char_literal542_tree=null;
		Object char_literal543_tree=null;
		Object string_literal544_tree=null;
		Object string_literal546_tree=null;
		Object char_literal548_tree=null;
		Object string_literal549_tree=null;
		Object char_literal550_tree=null;
		Object char_literal552_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_enum_value_literal=new RewriteRuleSubtreeStream(adaptor,"rule enum_value_literal");

		try {
			// JPA2.g:465:5: ( 'CAST(' function_arg WORD ( '(' INT_NUMERAL ( ',' INT_NUMERAL )* ')' )* ')' | 'EXTRACT(' date_part 'FROM' function_arg ')' | '@ENUM' '(' enum_value_literal ')' -> ^( T_ENUM_MACROS[$enum_value_literal.text] ) )
			int alt129=3;
			switch ( input.LA(1) ) {
			case 85:
				{
				alt129=1;
				}
				break;
			case 100:
				{
				alt129=2;
				}
				break;
			case 76:
				{
				alt129=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// JPA2.g:465:7: 'CAST(' function_arg WORD ( '(' INT_NUMERAL ( ',' INT_NUMERAL )* ')' )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal535=(Token)match(input,85,FOLLOW_85_in_extension_functions4238); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal535_tree = (Object)adaptor.create(string_literal535);
					adaptor.addChild(root_0, string_literal535_tree);
					}

					pushFollow(FOLLOW_function_arg_in_extension_functions4240);
					function_arg536=function_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_arg536.getTree());

					WORD537=(Token)match(input,WORD,FOLLOW_WORD_in_extension_functions4242); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD537_tree = (Object)adaptor.create(WORD537);
					adaptor.addChild(root_0, WORD537_tree);
					}

					// JPA2.g:465:33: ( '(' INT_NUMERAL ( ',' INT_NUMERAL )* ')' )*
					loop128:
					while (true) {
						int alt128=2;
						int LA128_0 = input.LA(1);
						if ( (LA128_0==LPAREN) ) {
							alt128=1;
						}

						switch (alt128) {
						case 1 :
							// JPA2.g:465:34: '(' INT_NUMERAL ( ',' INT_NUMERAL )* ')'
							{
							char_literal538=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_extension_functions4245); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal538_tree = (Object)adaptor.create(char_literal538);
							adaptor.addChild(root_0, char_literal538_tree);
							}

							INT_NUMERAL539=(Token)match(input,INT_NUMERAL,FOLLOW_INT_NUMERAL_in_extension_functions4246); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							INT_NUMERAL539_tree = (Object)adaptor.create(INT_NUMERAL539);
							adaptor.addChild(root_0, INT_NUMERAL539_tree);
							}

							// JPA2.g:465:49: ( ',' INT_NUMERAL )*
							loop127:
							while (true) {
								int alt127=2;
								int LA127_0 = input.LA(1);
								if ( (LA127_0==60) ) {
									alt127=1;
								}

								switch (alt127) {
								case 1 :
									// JPA2.g:465:50: ',' INT_NUMERAL
									{
									char_literal540=(Token)match(input,60,FOLLOW_60_in_extension_functions4249); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal540_tree = (Object)adaptor.create(char_literal540);
									adaptor.addChild(root_0, char_literal540_tree);
									}

									INT_NUMERAL541=(Token)match(input,INT_NUMERAL,FOLLOW_INT_NUMERAL_in_extension_functions4251); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									INT_NUMERAL541_tree = (Object)adaptor.create(INT_NUMERAL541);
									adaptor.addChild(root_0, INT_NUMERAL541_tree);
									}

									}
									break;

								default :
									break loop127;
								}
							}

							char_literal542=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_extension_functions4256); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal542_tree = (Object)adaptor.create(char_literal542);
							adaptor.addChild(root_0, char_literal542_tree);
							}

							}
							break;

						default :
							break loop128;
						}
					}

					char_literal543=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_extension_functions4260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal543_tree = (Object)adaptor.create(char_literal543);
					adaptor.addChild(root_0, char_literal543_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:466:7: 'EXTRACT(' date_part 'FROM' function_arg ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal544=(Token)match(input,100,FOLLOW_100_in_extension_functions4268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal544_tree = (Object)adaptor.create(string_literal544);
					adaptor.addChild(root_0, string_literal544_tree);
					}

					pushFollow(FOLLOW_date_part_in_extension_functions4270);
					date_part545=date_part();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_part545.getTree());

					string_literal546=(Token)match(input,101,FOLLOW_101_in_extension_functions4272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal546_tree = (Object)adaptor.create(string_literal546);
					adaptor.addChild(root_0, string_literal546_tree);
					}

					pushFollow(FOLLOW_function_arg_in_extension_functions4274);
					function_arg547=function_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_arg547.getTree());

					char_literal548=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_extension_functions4276); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal548_tree = (Object)adaptor.create(char_literal548);
					adaptor.addChild(root_0, char_literal548_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:467:7: '@ENUM' '(' enum_value_literal ')'
					{
					string_literal549=(Token)match(input,76,FOLLOW_76_in_extension_functions4284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(string_literal549);

					char_literal550=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_extension_functions4286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(char_literal550);

					pushFollow(FOLLOW_enum_value_literal_in_extension_functions4288);
					enum_value_literal551=enum_value_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enum_value_literal.add(enum_value_literal551.getTree());
					char_literal552=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_extension_functions4290); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal552);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 467:42: -> ^( T_ENUM_MACROS[$enum_value_literal.text] )
					{
						// JPA2.g:467:45: ^( T_ENUM_MACROS[$enum_value_literal.text] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new EnumConditionNode(T_ENUM_MACROS, (enum_value_literal551!=null?input.toString(enum_value_literal551.start,enum_value_literal551.stop):null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extension_functions"


	public static class date_part_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_part"
	// JPA2.g:469:10: fragment date_part : ( 'EPOCH' | 'YEAR' | 'QUARTER' | 'MONTH' | 'WEEK' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' );
	public final JPA2Parser.date_part_return date_part() throws RecognitionException {
		JPA2Parser.date_part_return retval = new JPA2Parser.date_part_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set553=null;

		Object set553_tree=null;

		try {
			// JPA2.g:470:5: ( 'EPOCH' | 'YEAR' | 'QUARTER' | 'MONTH' | 'WEEK' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set553=input.LT(1);
			if ( input.LA(1)==91||input.LA(1)==97||input.LA(1)==103||input.LA(1)==112||input.LA(1)==114||input.LA(1)==122||input.LA(1)==124||input.LA(1)==138||input.LA(1)==141 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set553));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_part"


	public static class input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input_parameter"
	// JPA2.g:473:1: input_parameter : ( '?' numeric_literal -> ^( T_PARAMETER[] '?' numeric_literal ) | NAMED_PARAMETER -> ^( T_PARAMETER[] NAMED_PARAMETER ) | '${' WORD '}' -> ^( T_PARAMETER[] '${' WORD '}' ) );
	public final JPA2Parser.input_parameter_return input_parameter() throws RecognitionException {
		JPA2Parser.input_parameter_return retval = new JPA2Parser.input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal554=null;
		Token NAMED_PARAMETER556=null;
		Token string_literal557=null;
		Token WORD558=null;
		Token char_literal559=null;
		ParserRuleReturnScope numeric_literal555 =null;

		Object char_literal554_tree=null;
		Object NAMED_PARAMETER556_tree=null;
		Object string_literal557_tree=null;
		Object WORD558_tree=null;
		Object char_literal559_tree=null;
		RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
		RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_NAMED_PARAMETER=new RewriteRuleTokenStream(adaptor,"token NAMED_PARAMETER");
		RewriteRuleSubtreeStream stream_numeric_literal=new RewriteRuleSubtreeStream(adaptor,"rule numeric_literal");

		try {
			// JPA2.g:474:5: ( '?' numeric_literal -> ^( T_PARAMETER[] '?' numeric_literal ) | NAMED_PARAMETER -> ^( T_PARAMETER[] NAMED_PARAMETER ) | '${' WORD '}' -> ^( T_PARAMETER[] '${' WORD '}' ) )
			int alt130=3;
			switch ( input.LA(1) ) {
			case 71:
				{
				alt130=1;
				}
				break;
			case NAMED_PARAMETER:
				{
				alt130=2;
				}
				break;
			case 57:
				{
				alt130=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// JPA2.g:474:7: '?' numeric_literal
					{
					char_literal554=(Token)match(input,71,FOLLOW_71_in_input_parameter4357); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal554);

					pushFollow(FOLLOW_numeric_literal_in_input_parameter4359);
					numeric_literal555=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_literal.add(numeric_literal555.getTree());
					// AST REWRITE
					// elements: numeric_literal, 71
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 474:27: -> ^( T_PARAMETER[] '?' numeric_literal )
					{
						// JPA2.g:474:30: ^( T_PARAMETER[] '?' numeric_literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_71.nextNode());
						adaptor.addChild(root_1, stream_numeric_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:475:7: NAMED_PARAMETER
					{
					NAMED_PARAMETER556=(Token)match(input,NAMED_PARAMETER,FOLLOW_NAMED_PARAMETER_in_input_parameter4382); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMED_PARAMETER.add(NAMED_PARAMETER556);

					// AST REWRITE
					// elements: NAMED_PARAMETER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 475:23: -> ^( T_PARAMETER[] NAMED_PARAMETER )
					{
						// JPA2.g:475:26: ^( T_PARAMETER[] NAMED_PARAMETER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_NAMED_PARAMETER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:476:7: '${' WORD '}'
					{
					string_literal557=(Token)match(input,57,FOLLOW_57_in_input_parameter4403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(string_literal557);

					WORD558=(Token)match(input,WORD,FOLLOW_WORD_in_input_parameter4405); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WORD.add(WORD558);

					char_literal559=(Token)match(input,144,FOLLOW_144_in_input_parameter4407); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_144.add(char_literal559);

					// AST REWRITE
					// elements: WORD, 57, 144
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 476:21: -> ^( T_PARAMETER[] '${' WORD '}' )
					{
						// JPA2.g:476:24: ^( T_PARAMETER[] '${' WORD '}' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_57.nextNode());
						adaptor.addChild(root_1, stream_WORD.nextNode());
						adaptor.addChild(root_1, stream_144.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input_parameter"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// JPA2.g:478:1: literal : WORD ;
	public final JPA2Parser.literal_return literal() throws RecognitionException {
		JPA2Parser.literal_return retval = new JPA2Parser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD560=null;

		Object WORD560_tree=null;

		try {
			// JPA2.g:479:5: ( WORD )
			// JPA2.g:479:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD560=(Token)match(input,WORD,FOLLOW_WORD_in_literal4435); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD560_tree = (Object)adaptor.create(WORD560);
			adaptor.addChild(root_0, WORD560_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class constructor_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_name"
	// JPA2.g:481:1: constructor_name : WORD ;
	public final JPA2Parser.constructor_name_return constructor_name() throws RecognitionException {
		JPA2Parser.constructor_name_return retval = new JPA2Parser.constructor_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD561=null;

		Object WORD561_tree=null;

		try {
			// JPA2.g:482:5: ( WORD )
			// JPA2.g:482:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD561=(Token)match(input,WORD,FOLLOW_WORD_in_constructor_name4447); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD561_tree = (Object)adaptor.create(WORD561);
			adaptor.addChild(root_0, WORD561_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_name"


	public static class enum_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_literal"
	// JPA2.g:484:1: enum_literal : WORD ;
	public final JPA2Parser.enum_literal_return enum_literal() throws RecognitionException {
		JPA2Parser.enum_literal_return retval = new JPA2Parser.enum_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD562=null;

		Object WORD562_tree=null;

		try {
			// JPA2.g:485:5: ( WORD )
			// JPA2.g:485:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD562=(Token)match(input,WORD,FOLLOW_WORD_in_enum_literal4459); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD562_tree = (Object)adaptor.create(WORD562);
			adaptor.addChild(root_0, WORD562_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_literal"


	public static class boolean_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_literal"
	// JPA2.g:487:1: boolean_literal : ( 'true' | 'false' );
	public final JPA2Parser.boolean_literal_return boolean_literal() throws RecognitionException {
		JPA2Parser.boolean_literal_return retval = new JPA2Parser.boolean_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set563=null;

		Object set563_tree=null;

		try {
			// JPA2.g:488:5: ( 'true' | 'false' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set563=input.LT(1);
			if ( (input.LA(1) >= 142 && input.LA(1) <= 143) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set563));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_literal"


	public static class field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field"
	// JPA2.g:492:1: field : ( WORD | 'SELECT' | 'FROM' | 'GROUP' | 'ORDER' | 'MAX' | 'MIN' | 'SUM' | 'AVG' | 'COUNT' | 'AS' | 'MEMBER' | date_part );
	public final JPA2Parser.field_return field() throws RecognitionException {
		JPA2Parser.field_return retval = new JPA2Parser.field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD564=null;
		Token string_literal565=null;
		Token string_literal566=null;
		Token string_literal567=null;
		Token string_literal568=null;
		Token string_literal569=null;
		Token string_literal570=null;
		Token string_literal571=null;
		Token string_literal572=null;
		Token string_literal573=null;
		Token string_literal574=null;
		Token string_literal575=null;
		ParserRuleReturnScope date_part576 =null;

		Object WORD564_tree=null;
		Object string_literal565_tree=null;
		Object string_literal566_tree=null;
		Object string_literal567_tree=null;
		Object string_literal568_tree=null;
		Object string_literal569_tree=null;
		Object string_literal570_tree=null;
		Object string_literal571_tree=null;
		Object string_literal572_tree=null;
		Object string_literal573_tree=null;
		Object string_literal574_tree=null;
		Object string_literal575_tree=null;

		try {
			// JPA2.g:493:5: ( WORD | 'SELECT' | 'FROM' | 'GROUP' | 'ORDER' | 'MAX' | 'MIN' | 'SUM' | 'AVG' | 'COUNT' | 'AS' | 'MEMBER' | date_part )
			int alt131=13;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt131=1;
				}
				break;
			case 125:
				{
				alt131=2;
				}
				break;
			case 101:
				{
				alt131=3;
				}
				break;
			case GROUP:
				{
				alt131=4;
				}
				break;
			case ORDER:
				{
				alt131=5;
				}
				break;
			case MAX:
				{
				alt131=6;
				}
				break;
			case MIN:
				{
				alt131=7;
				}
				break;
			case SUM:
				{
				alt131=8;
				}
				break;
			case AVG:
				{
				alt131=9;
				}
				break;
			case COUNT:
				{
				alt131=10;
				}
				break;
			case 81:
				{
				alt131=11;
				}
				break;
			case 111:
				{
				alt131=12;
				}
				break;
			case 91:
			case 97:
			case 103:
			case 112:
			case 114:
			case 122:
			case 124:
			case 138:
			case 141:
				{
				alt131=13;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}
			switch (alt131) {
				case 1 :
					// JPA2.g:493:7: WORD
					{
					root_0 = (Object)adaptor.nil();


					WORD564=(Token)match(input,WORD,FOLLOW_WORD_in_field4492); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD564_tree = (Object)adaptor.create(WORD564);
					adaptor.addChild(root_0, WORD564_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:493:14: 'SELECT'
					{
					root_0 = (Object)adaptor.nil();


					string_literal565=(Token)match(input,125,FOLLOW_125_in_field4496); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal565_tree = (Object)adaptor.create(string_literal565);
					adaptor.addChild(root_0, string_literal565_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:493:25: 'FROM'
					{
					root_0 = (Object)adaptor.nil();


					string_literal566=(Token)match(input,101,FOLLOW_101_in_field4500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal566_tree = (Object)adaptor.create(string_literal566);
					adaptor.addChild(root_0, string_literal566_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:493:34: 'GROUP'
					{
					root_0 = (Object)adaptor.nil();


					string_literal567=(Token)match(input,GROUP,FOLLOW_GROUP_in_field4504); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal567_tree = (Object)adaptor.create(string_literal567);
					adaptor.addChild(root_0, string_literal567_tree);
					}

					}
					break;
				case 5 :
					// JPA2.g:493:44: 'ORDER'
					{
					root_0 = (Object)adaptor.nil();


					string_literal568=(Token)match(input,ORDER,FOLLOW_ORDER_in_field4508); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal568_tree = (Object)adaptor.create(string_literal568);
					adaptor.addChild(root_0, string_literal568_tree);
					}

					}
					break;
				case 6 :
					// JPA2.g:493:54: 'MAX'
					{
					root_0 = (Object)adaptor.nil();


					string_literal569=(Token)match(input,MAX,FOLLOW_MAX_in_field4512); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal569_tree = (Object)adaptor.create(string_literal569);
					adaptor.addChild(root_0, string_literal569_tree);
					}

					}
					break;
				case 7 :
					// JPA2.g:493:62: 'MIN'
					{
					root_0 = (Object)adaptor.nil();


					string_literal570=(Token)match(input,MIN,FOLLOW_MIN_in_field4516); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal570_tree = (Object)adaptor.create(string_literal570);
					adaptor.addChild(root_0, string_literal570_tree);
					}

					}
					break;
				case 8 :
					// JPA2.g:493:70: 'SUM'
					{
					root_0 = (Object)adaptor.nil();


					string_literal571=(Token)match(input,SUM,FOLLOW_SUM_in_field4520); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal571_tree = (Object)adaptor.create(string_literal571);
					adaptor.addChild(root_0, string_literal571_tree);
					}

					}
					break;
				case 9 :
					// JPA2.g:493:78: 'AVG'
					{
					root_0 = (Object)adaptor.nil();


					string_literal572=(Token)match(input,AVG,FOLLOW_AVG_in_field4524); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal572_tree = (Object)adaptor.create(string_literal572);
					adaptor.addChild(root_0, string_literal572_tree);
					}

					}
					break;
				case 10 :
					// JPA2.g:493:86: 'COUNT'
					{
					root_0 = (Object)adaptor.nil();


					string_literal573=(Token)match(input,COUNT,FOLLOW_COUNT_in_field4528); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal573_tree = (Object)adaptor.create(string_literal573);
					adaptor.addChild(root_0, string_literal573_tree);
					}

					}
					break;
				case 11 :
					// JPA2.g:493:96: 'AS'
					{
					root_0 = (Object)adaptor.nil();


					string_literal574=(Token)match(input,81,FOLLOW_81_in_field4532); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal574_tree = (Object)adaptor.create(string_literal574);
					adaptor.addChild(root_0, string_literal574_tree);
					}

					}
					break;
				case 12 :
					// JPA2.g:493:103: 'MEMBER'
					{
					root_0 = (Object)adaptor.nil();


					string_literal575=(Token)match(input,111,FOLLOW_111_in_field4536); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal575_tree = (Object)adaptor.create(string_literal575);
					adaptor.addChild(root_0, string_literal575_tree);
					}

					}
					break;
				case 13 :
					// JPA2.g:493:114: date_part
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_part_in_field4540);
					date_part576=date_part();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_part576.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable"
	// JPA2.g:495:1: identification_variable : WORD ;
	public final JPA2Parser.identification_variable_return identification_variable() throws RecognitionException {
		JPA2Parser.identification_variable_return retval = new JPA2Parser.identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD577=null;

		Object WORD577_tree=null;

		try {
			// JPA2.g:496:5: ( WORD )
			// JPA2.g:496:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD577=(Token)match(input,WORD,FOLLOW_WORD_in_identification_variable4552); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD577_tree = (Object)adaptor.create(WORD577);
			adaptor.addChild(root_0, WORD577_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable"


	public static class parameter_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameter_name"
	// JPA2.g:498:1: parameter_name : WORD ( '.' WORD )* ;
	public final JPA2Parser.parameter_name_return parameter_name() throws RecognitionException {
		JPA2Parser.parameter_name_return retval = new JPA2Parser.parameter_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD578=null;
		Token char_literal579=null;
		Token WORD580=null;

		Object WORD578_tree=null;
		Object char_literal579_tree=null;
		Object WORD580_tree=null;

		try {
			// JPA2.g:499:5: ( WORD ( '.' WORD )* )
			// JPA2.g:499:7: WORD ( '.' WORD )*
			{
			root_0 = (Object)adaptor.nil();


			WORD578=(Token)match(input,WORD,FOLLOW_WORD_in_parameter_name4564); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD578_tree = (Object)adaptor.create(WORD578);
			adaptor.addChild(root_0, WORD578_tree);
			}

			// JPA2.g:499:12: ( '.' WORD )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==62) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// JPA2.g:499:13: '.' WORD
					{
					char_literal579=(Token)match(input,62,FOLLOW_62_in_parameter_name4567); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal579_tree = (Object)adaptor.create(char_literal579);
					adaptor.addChild(root_0, char_literal579_tree);
					}

					WORD580=(Token)match(input,WORD,FOLLOW_WORD_in_parameter_name4570); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD580_tree = (Object)adaptor.create(WORD580);
					adaptor.addChild(root_0, WORD580_tree);
					}

					}
					break;

				default :
					break loop132;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_name"


	public static class escape_character_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "escape_character"
	// JPA2.g:502:1: escape_character : ( '\\'.\\'' | STRING_LITERAL );
	public final JPA2Parser.escape_character_return escape_character() throws RecognitionException {
		JPA2Parser.escape_character_return retval = new JPA2Parser.escape_character_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set581=null;

		Object set581_tree=null;

		try {
			// JPA2.g:503:5: ( '\\'.\\'' | STRING_LITERAL )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set581=input.LT(1);
			if ( input.LA(1)==STRING_LITERAL||input.LA(1)==TRIM_CHARACTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set581));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "escape_character"


	public static class trim_character_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trim_character"
	// JPA2.g:504:1: trim_character : TRIM_CHARACTER ;
	public final JPA2Parser.trim_character_return trim_character() throws RecognitionException {
		JPA2Parser.trim_character_return retval = new JPA2Parser.trim_character_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRIM_CHARACTER582=null;

		Object TRIM_CHARACTER582_tree=null;

		try {
			// JPA2.g:505:5: ( TRIM_CHARACTER )
			// JPA2.g:505:7: TRIM_CHARACTER
			{
			root_0 = (Object)adaptor.nil();


			TRIM_CHARACTER582=(Token)match(input,TRIM_CHARACTER,FOLLOW_TRIM_CHARACTER_in_trim_character4600); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TRIM_CHARACTER582_tree = (Object)adaptor.create(TRIM_CHARACTER582);
			adaptor.addChild(root_0, TRIM_CHARACTER582_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trim_character"


	public static class string_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string_literal"
	// JPA2.g:506:1: string_literal : STRING_LITERAL ;
	public final JPA2Parser.string_literal_return string_literal() throws RecognitionException {
		JPA2Parser.string_literal_return retval = new JPA2Parser.string_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL583=null;

		Object STRING_LITERAL583_tree=null;

		try {
			// JPA2.g:507:5: ( STRING_LITERAL )
			// JPA2.g:507:7: STRING_LITERAL
			{
			root_0 = (Object)adaptor.nil();


			STRING_LITERAL583=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal4611); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING_LITERAL583_tree = (Object)adaptor.create(STRING_LITERAL583);
			adaptor.addChild(root_0, STRING_LITERAL583_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_literal"


	public static class numeric_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numeric_literal"
	// JPA2.g:508:1: numeric_literal : ( '0x' )? INT_NUMERAL ;
	public final JPA2Parser.numeric_literal_return numeric_literal() throws RecognitionException {
		JPA2Parser.numeric_literal_return retval = new JPA2Parser.numeric_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal584=null;
		Token INT_NUMERAL585=null;

		Object string_literal584_tree=null;
		Object INT_NUMERAL585_tree=null;

		try {
			// JPA2.g:509:5: ( ( '0x' )? INT_NUMERAL )
			// JPA2.g:509:7: ( '0x' )? INT_NUMERAL
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:509:7: ( '0x' )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==64) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// JPA2.g:509:8: '0x'
					{
					string_literal584=(Token)match(input,64,FOLLOW_64_in_numeric_literal4623); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal584_tree = (Object)adaptor.create(string_literal584);
					adaptor.addChild(root_0, string_literal584_tree);
					}

					}
					break;

			}

			INT_NUMERAL585=(Token)match(input,INT_NUMERAL,FOLLOW_INT_NUMERAL_in_numeric_literal4627); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INT_NUMERAL585_tree = (Object)adaptor.create(INT_NUMERAL585);
			adaptor.addChild(root_0, INT_NUMERAL585_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numeric_literal"


	public static class single_valued_object_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_object_field"
	// JPA2.g:510:1: single_valued_object_field : WORD ;
	public final JPA2Parser.single_valued_object_field_return single_valued_object_field() throws RecognitionException {
		JPA2Parser.single_valued_object_field_return retval = new JPA2Parser.single_valued_object_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD586=null;

		Object WORD586_tree=null;

		try {
			// JPA2.g:511:5: ( WORD )
			// JPA2.g:511:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD586=(Token)match(input,WORD,FOLLOW_WORD_in_single_valued_object_field4639); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD586_tree = (Object)adaptor.create(WORD586);
			adaptor.addChild(root_0, WORD586_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_object_field"


	public static class single_valued_embeddable_object_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_embeddable_object_field"
	// JPA2.g:512:1: single_valued_embeddable_object_field : WORD ;
	public final JPA2Parser.single_valued_embeddable_object_field_return single_valued_embeddable_object_field() throws RecognitionException {
		JPA2Parser.single_valued_embeddable_object_field_return retval = new JPA2Parser.single_valued_embeddable_object_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD587=null;

		Object WORD587_tree=null;

		try {
			// JPA2.g:513:5: ( WORD )
			// JPA2.g:513:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD587=(Token)match(input,WORD,FOLLOW_WORD_in_single_valued_embeddable_object_field4650); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD587_tree = (Object)adaptor.create(WORD587);
			adaptor.addChild(root_0, WORD587_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_embeddable_object_field"


	public static class collection_valued_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_valued_field"
	// JPA2.g:514:1: collection_valued_field : WORD ;
	public final JPA2Parser.collection_valued_field_return collection_valued_field() throws RecognitionException {
		JPA2Parser.collection_valued_field_return retval = new JPA2Parser.collection_valued_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD588=null;

		Object WORD588_tree=null;

		try {
			// JPA2.g:515:5: ( WORD )
			// JPA2.g:515:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD588=(Token)match(input,WORD,FOLLOW_WORD_in_collection_valued_field4661); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD588_tree = (Object)adaptor.create(WORD588);
			adaptor.addChild(root_0, WORD588_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_valued_field"


	public static class entity_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_name"
	// JPA2.g:516:1: entity_name : WORD ;
	public final JPA2Parser.entity_name_return entity_name() throws RecognitionException {
		JPA2Parser.entity_name_return retval = new JPA2Parser.entity_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD589=null;

		Object WORD589_tree=null;

		try {
			// JPA2.g:517:5: ( WORD )
			// JPA2.g:517:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD589=(Token)match(input,WORD,FOLLOW_WORD_in_entity_name4672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD589_tree = (Object)adaptor.create(WORD589);
			adaptor.addChild(root_0, WORD589_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_name"


	public static class subtype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subtype"
	// JPA2.g:518:1: subtype : WORD ;
	public final JPA2Parser.subtype_return subtype() throws RecognitionException {
		JPA2Parser.subtype_return retval = new JPA2Parser.subtype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD590=null;

		Object WORD590_tree=null;

		try {
			// JPA2.g:519:5: ( WORD )
			// JPA2.g:519:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD590=(Token)match(input,WORD,FOLLOW_WORD_in_subtype4683); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD590_tree = (Object)adaptor.create(WORD590);
			adaptor.addChild(root_0, WORD590_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subtype"


	public static class entity_type_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_type_literal"
	// JPA2.g:520:1: entity_type_literal : WORD ;
	public final JPA2Parser.entity_type_literal_return entity_type_literal() throws RecognitionException {
		JPA2Parser.entity_type_literal_return retval = new JPA2Parser.entity_type_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD591=null;

		Object WORD591_tree=null;

		try {
			// JPA2.g:521:5: ( WORD )
			// JPA2.g:521:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD591=(Token)match(input,WORD,FOLLOW_WORD_in_entity_type_literal4694); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD591_tree = (Object)adaptor.create(WORD591);
			adaptor.addChild(root_0, WORD591_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_type_literal"


	public static class function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_name"
	// JPA2.g:522:1: function_name : STRING_LITERAL ;
	public final JPA2Parser.function_name_return function_name() throws RecognitionException {
		JPA2Parser.function_name_return retval = new JPA2Parser.function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL592=null;

		Object STRING_LITERAL592_tree=null;

		try {
			// JPA2.g:523:5: ( STRING_LITERAL )
			// JPA2.g:523:7: STRING_LITERAL
			{
			root_0 = (Object)adaptor.nil();


			STRING_LITERAL592=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_function_name4705); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING_LITERAL592_tree = (Object)adaptor.create(STRING_LITERAL592);
			adaptor.addChild(root_0, STRING_LITERAL592_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_name"


	public static class state_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "state_field"
	// JPA2.g:524:1: state_field : WORD ;
	public final JPA2Parser.state_field_return state_field() throws RecognitionException {
		JPA2Parser.state_field_return retval = new JPA2Parser.state_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD593=null;

		Object WORD593_tree=null;

		try {
			// JPA2.g:525:5: ( WORD )
			// JPA2.g:525:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD593=(Token)match(input,WORD,FOLLOW_WORD_in_state_field4716); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD593_tree = (Object)adaptor.create(WORD593);
			adaptor.addChild(root_0, WORD593_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "state_field"


	public static class result_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "result_variable"
	// JPA2.g:526:1: result_variable : WORD ;
	public final JPA2Parser.result_variable_return result_variable() throws RecognitionException {
		JPA2Parser.result_variable_return retval = new JPA2Parser.result_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD594=null;

		Object WORD594_tree=null;

		try {
			// JPA2.g:527:5: ( WORD )
			// JPA2.g:527:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD594=(Token)match(input,WORD,FOLLOW_WORD_in_result_variable4727); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD594_tree = (Object)adaptor.create(WORD594);
			adaptor.addChild(root_0, WORD594_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "result_variable"


	public static class superquery_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "superquery_identification_variable"
	// JPA2.g:528:1: superquery_identification_variable : WORD ;
	public final JPA2Parser.superquery_identification_variable_return superquery_identification_variable() throws RecognitionException {
		JPA2Parser.superquery_identification_variable_return retval = new JPA2Parser.superquery_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD595=null;

		Object WORD595_tree=null;

		try {
			// JPA2.g:529:5: ( WORD )
			// JPA2.g:529:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD595=(Token)match(input,WORD,FOLLOW_WORD_in_superquery_identification_variable4738); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD595_tree = (Object)adaptor.create(WORD595);
			adaptor.addChild(root_0, WORD595_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "superquery_identification_variable"


	public static class date_time_timestamp_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_time_timestamp_literal"
	// JPA2.g:530:1: date_time_timestamp_literal : WORD ;
	public final JPA2Parser.date_time_timestamp_literal_return date_time_timestamp_literal() throws RecognitionException {
		JPA2Parser.date_time_timestamp_literal_return retval = new JPA2Parser.date_time_timestamp_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD596=null;

		Object WORD596_tree=null;

		try {
			// JPA2.g:531:5: ( WORD )
			// JPA2.g:531:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD596=(Token)match(input,WORD,FOLLOW_WORD_in_date_time_timestamp_literal4749); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD596_tree = (Object)adaptor.create(WORD596);
			adaptor.addChild(root_0, WORD596_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_time_timestamp_literal"


	public static class pattern_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pattern_value"
	// JPA2.g:532:1: pattern_value : string_literal ;
	public final JPA2Parser.pattern_value_return pattern_value() throws RecognitionException {
		JPA2Parser.pattern_value_return retval = new JPA2Parser.pattern_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope string_literal597 =null;


		try {
			// JPA2.g:533:5: ( string_literal )
			// JPA2.g:533:7: string_literal
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_string_literal_in_pattern_value4760);
			string_literal597=string_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, string_literal597.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pattern_value"


	public static class collection_valued_input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_valued_input_parameter"
	// JPA2.g:534:1: collection_valued_input_parameter : input_parameter ;
	public final JPA2Parser.collection_valued_input_parameter_return collection_valued_input_parameter() throws RecognitionException {
		JPA2Parser.collection_valued_input_parameter_return retval = new JPA2Parser.collection_valued_input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope input_parameter598 =null;


		try {
			// JPA2.g:535:5: ( input_parameter )
			// JPA2.g:535:7: input_parameter
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_input_parameter_in_collection_valued_input_parameter4771);
			input_parameter598=input_parameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter598.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_valued_input_parameter"


	public static class single_valued_input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_input_parameter"
	// JPA2.g:536:1: single_valued_input_parameter : input_parameter ;
	public final JPA2Parser.single_valued_input_parameter_return single_valued_input_parameter() throws RecognitionException {
		JPA2Parser.single_valued_input_parameter_return retval = new JPA2Parser.single_valued_input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope input_parameter599 =null;


		try {
			// JPA2.g:537:5: ( input_parameter )
			// JPA2.g:537:7: input_parameter
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_input_parameter_in_single_valued_input_parameter4782);
			input_parameter599=input_parameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter599.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_input_parameter"


	public static class enum_value_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_value_literal"
	// JPA2.g:538:1: enum_value_literal : WORD ( '.' WORD )* ;
	public final JPA2Parser.enum_value_literal_return enum_value_literal() throws RecognitionException {
		JPA2Parser.enum_value_literal_return retval = new JPA2Parser.enum_value_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD600=null;
		Token char_literal601=null;
		Token WORD602=null;

		Object WORD600_tree=null;
		Object char_literal601_tree=null;
		Object WORD602_tree=null;

		try {
			// JPA2.g:539:5: ( WORD ( '.' WORD )* )
			// JPA2.g:539:7: WORD ( '.' WORD )*
			{
			root_0 = (Object)adaptor.nil();


			WORD600=(Token)match(input,WORD,FOLLOW_WORD_in_enum_value_literal4793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD600_tree = (Object)adaptor.create(WORD600);
			adaptor.addChild(root_0, WORD600_tree);
			}

			// JPA2.g:539:12: ( '.' WORD )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==62) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// JPA2.g:539:13: '.' WORD
					{
					char_literal601=(Token)match(input,62,FOLLOW_62_in_enum_value_literal4796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal601_tree = (Object)adaptor.create(char_literal601);
					adaptor.addChild(root_0, char_literal601_tree);
					}

					WORD602=(Token)match(input,WORD,FOLLOW_WORD_in_enum_value_literal4799); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD602_tree = (Object)adaptor.create(WORD602);
					adaptor.addChild(root_0, WORD602_tree);
					}

					}
					break;

				default :
					break loop134;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_value_literal"

	// $ANTLR start synpred21_JPA2
	public final void synpred21_JPA2_fragment() throws RecognitionException {
		// JPA2.g:121:48: ( field )
		// JPA2.g:121:48: field
		{
		pushFollow(FOLLOW_field_in_synpred21_JPA2904);
		field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_JPA2

	// $ANTLR start synpred30_JPA2
	public final void synpred30_JPA2_fragment() throws RecognitionException {
		// JPA2.g:139:48: ( field )
		// JPA2.g:139:48: field
		{
		pushFollow(FOLLOW_field_in_synpred30_JPA21094);
		field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred30_JPA2

	// $ANTLR start synpred33_JPA2
	public final void synpred33_JPA2_fragment() throws RecognitionException {
		// JPA2.g:156:7: ( scalar_expression )
		// JPA2.g:156:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred33_JPA21220);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred33_JPA2

	// $ANTLR start synpred34_JPA2
	public final void synpred34_JPA2_fragment() throws RecognitionException {
		// JPA2.g:157:7: ( simple_entity_expression )
		// JPA2.g:157:7: simple_entity_expression
		{
		pushFollow(FOLLOW_simple_entity_expression_in_synpred34_JPA21228);
		simple_entity_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred34_JPA2

	// $ANTLR start synpred43_JPA2
	public final void synpred43_JPA2_fragment() throws RecognitionException {
		// JPA2.g:169:7: ( path_expression ( ( '+' | '-' | '*' | '/' ) scalar_expression )? )
		// JPA2.g:169:7: path_expression ( ( '+' | '-' | '*' | '/' ) scalar_expression )?
		{
		pushFollow(FOLLOW_path_expression_in_synpred43_JPA21353);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:169:23: ( ( '+' | '-' | '*' | '/' ) scalar_expression )?
		int alt141=2;
		int LA141_0 = input.LA(1);
		if ( ((LA141_0 >= 58 && LA141_0 <= 59)||LA141_0==61||LA141_0==63) ) {
			alt141=1;
		}
		switch (alt141) {
			case 1 :
				// JPA2.g:169:24: ( '+' | '-' | '*' | '/' ) scalar_expression
				{
				if ( (input.LA(1) >= 58 && input.LA(1) <= 59)||input.LA(1)==61||input.LA(1)==63 ) {
					input.consume();
					state.errorRecovery=false;
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}
				pushFollow(FOLLOW_scalar_expression_in_synpred43_JPA21372);
				scalar_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred43_JPA2

	// $ANTLR start synpred44_JPA2
	public final void synpred44_JPA2_fragment() throws RecognitionException {
		// JPA2.g:170:7: ( identification_variable )
		// JPA2.g:170:7: identification_variable
		{
		pushFollow(FOLLOW_identification_variable_in_synpred44_JPA21382);
		identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred44_JPA2

	// $ANTLR start synpred45_JPA2
	public final void synpred45_JPA2_fragment() throws RecognitionException {
		// JPA2.g:171:7: ( scalar_expression )
		// JPA2.g:171:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred45_JPA21400);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred45_JPA2

	// $ANTLR start synpred46_JPA2
	public final void synpred46_JPA2_fragment() throws RecognitionException {
		// JPA2.g:172:7: ( aggregate_expression )
		// JPA2.g:172:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred46_JPA21408);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred46_JPA2

	// $ANTLR start synpred49_JPA2
	public final void synpred49_JPA2_fragment() throws RecognitionException {
		// JPA2.g:178:7: ( path_expression )
		// JPA2.g:178:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred49_JPA21465);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred49_JPA2

	// $ANTLR start synpred50_JPA2
	public final void synpred50_JPA2_fragment() throws RecognitionException {
		// JPA2.g:179:7: ( scalar_expression )
		// JPA2.g:179:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred50_JPA21473);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred50_JPA2

	// $ANTLR start synpred51_JPA2
	public final void synpred51_JPA2_fragment() throws RecognitionException {
		// JPA2.g:180:7: ( aggregate_expression )
		// JPA2.g:180:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred51_JPA21481);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred51_JPA2

	// $ANTLR start synpred53_JPA2
	public final void synpred53_JPA2_fragment() throws RecognitionException {
		// JPA2.g:183:7: ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' )
		// JPA2.g:183:7: aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')'
		{
		pushFollow(FOLLOW_aggregate_expression_function_name_in_synpred53_JPA21500);
		aggregate_expression_function_name();
		state._fsp--;
		if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred53_JPA21502); if (state.failed) return;

		// JPA2.g:183:45: ( DISTINCT )?
		int alt142=2;
		int LA142_0 = input.LA(1);
		if ( (LA142_0==DISTINCT) ) {
			alt142=1;
		}
		switch (alt142) {
			case 1 :
				// JPA2.g:183:46: DISTINCT
				{
				match(input,DISTINCT,FOLLOW_DISTINCT_in_synpred53_JPA21504); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_path_expression_in_synpred53_JPA21508);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred53_JPA21509); if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_JPA2

	// $ANTLR start synpred55_JPA2
	public final void synpred55_JPA2_fragment() throws RecognitionException {
		// JPA2.g:185:7: ( 'COUNT' '(' ( DISTINCT )? count_argument ')' )
		// JPA2.g:185:7: 'COUNT' '(' ( DISTINCT )? count_argument ')'
		{
		match(input,COUNT,FOLLOW_COUNT_in_synpred55_JPA21543); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred55_JPA21545); if (state.failed) return;

		// JPA2.g:185:18: ( DISTINCT )?
		int alt143=2;
		int LA143_0 = input.LA(1);
		if ( (LA143_0==DISTINCT) ) {
			alt143=1;
		}
		switch (alt143) {
			case 1 :
				// JPA2.g:185:19: DISTINCT
				{
				match(input,DISTINCT,FOLLOW_DISTINCT_in_synpred55_JPA21547); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_count_argument_in_synpred55_JPA21551);
		count_argument();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred55_JPA21553); if (state.failed) return;

		}

	}
	// $ANTLR end synpred55_JPA2

	// $ANTLR start synpred65_JPA2
	public final void synpred65_JPA2_fragment() throws RecognitionException {
		// JPA2.g:208:7: ( path_expression )
		// JPA2.g:208:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred65_JPA21814);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred65_JPA2

	// $ANTLR start synpred66_JPA2
	public final void synpred66_JPA2_fragment() throws RecognitionException {
		// JPA2.g:208:25: ( general_identification_variable )
		// JPA2.g:208:25: general_identification_variable
		{
		pushFollow(FOLLOW_general_identification_variable_in_synpred66_JPA21818);
		general_identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred66_JPA2

	// $ANTLR start synpred67_JPA2
	public final void synpred67_JPA2_fragment() throws RecognitionException {
		// JPA2.g:208:59: ( result_variable )
		// JPA2.g:208:59: result_variable
		{
		pushFollow(FOLLOW_result_variable_in_synpred67_JPA21822);
		result_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_JPA2

	// $ANTLR start synpred68_JPA2
	public final void synpred68_JPA2_fragment() throws RecognitionException {
		// JPA2.g:208:77: ( scalar_expression )
		// JPA2.g:208:77: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred68_JPA21826);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred68_JPA2

	// $ANTLR start synpred77_JPA2
	public final void synpred77_JPA2_fragment() throws RecognitionException {
		// JPA2.g:223:7: ( general_derived_path '.' single_valued_object_field )
		// JPA2.g:223:7: general_derived_path '.' single_valued_object_field
		{
		pushFollow(FOLLOW_general_derived_path_in_synpred77_JPA22016);
		general_derived_path();
		state._fsp--;
		if (state.failed) return;

		match(input,62,FOLLOW_62_in_synpred77_JPA22017); if (state.failed) return;

		pushFollow(FOLLOW_single_valued_object_field_in_synpred77_JPA22018);
		single_valued_object_field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred77_JPA2

	// $ANTLR start synpred82_JPA2
	public final void synpred82_JPA2_fragment() throws RecognitionException {
		// JPA2.g:241:7: ( path_expression )
		// JPA2.g:241:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred82_JPA22170);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred82_JPA2

	// $ANTLR start synpred83_JPA2
	public final void synpred83_JPA2_fragment() throws RecognitionException {
		// JPA2.g:242:7: ( scalar_expression )
		// JPA2.g:242:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred83_JPA22178);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred83_JPA2

	// $ANTLR start synpred84_JPA2
	public final void synpred84_JPA2_fragment() throws RecognitionException {
		// JPA2.g:243:7: ( aggregate_expression )
		// JPA2.g:243:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred84_JPA22186);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred84_JPA2

	// $ANTLR start synpred85_JPA2
	public final void synpred85_JPA2_fragment() throws RecognitionException {
		// JPA2.g:246:7: ( arithmetic_expression )
		// JPA2.g:246:7: arithmetic_expression
		{
		pushFollow(FOLLOW_arithmetic_expression_in_synpred85_JPA22205);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred85_JPA2

	// $ANTLR start synpred86_JPA2
	public final void synpred86_JPA2_fragment() throws RecognitionException {
		// JPA2.g:247:7: ( string_expression )
		// JPA2.g:247:7: string_expression
		{
		pushFollow(FOLLOW_string_expression_in_synpred86_JPA22213);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred86_JPA2

	// $ANTLR start synpred87_JPA2
	public final void synpred87_JPA2_fragment() throws RecognitionException {
		// JPA2.g:248:7: ( enum_expression )
		// JPA2.g:248:7: enum_expression
		{
		pushFollow(FOLLOW_enum_expression_in_synpred87_JPA22221);
		enum_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred87_JPA2

	// $ANTLR start synpred88_JPA2
	public final void synpred88_JPA2_fragment() throws RecognitionException {
		// JPA2.g:249:7: ( datetime_expression )
		// JPA2.g:249:7: datetime_expression
		{
		pushFollow(FOLLOW_datetime_expression_in_synpred88_JPA22229);
		datetime_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred88_JPA2

	// $ANTLR start synpred89_JPA2
	public final void synpred89_JPA2_fragment() throws RecognitionException {
		// JPA2.g:250:7: ( boolean_expression )
		// JPA2.g:250:7: boolean_expression
		{
		pushFollow(FOLLOW_boolean_expression_in_synpred89_JPA22237);
		boolean_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred89_JPA2

	// $ANTLR start synpred90_JPA2
	public final void synpred90_JPA2_fragment() throws RecognitionException {
		// JPA2.g:251:7: ( case_expression )
		// JPA2.g:251:7: case_expression
		{
		pushFollow(FOLLOW_case_expression_in_synpred90_JPA22245);
		case_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred90_JPA2

	// $ANTLR start synpred93_JPA2
	public final void synpred93_JPA2_fragment() throws RecognitionException {
		// JPA2.g:258:8: ( 'NOT' )
		// JPA2.g:258:8: 'NOT'
		{
		match(input,NOT,FOLLOW_NOT_in_synpred93_JPA22305); if (state.failed) return;

		}

	}
	// $ANTLR end synpred93_JPA2

	// $ANTLR start synpred94_JPA2
	public final void synpred94_JPA2_fragment() throws RecognitionException {
		// JPA2.g:260:7: ( simple_cond_expression )
		// JPA2.g:260:7: simple_cond_expression
		{
		pushFollow(FOLLOW_simple_cond_expression_in_synpred94_JPA22320);
		simple_cond_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred94_JPA2

	// $ANTLR start synpred95_JPA2
	public final void synpred95_JPA2_fragment() throws RecognitionException {
		// JPA2.g:264:7: ( comparison_expression )
		// JPA2.g:264:7: comparison_expression
		{
		pushFollow(FOLLOW_comparison_expression_in_synpred95_JPA22357);
		comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred95_JPA2

	// $ANTLR start synpred96_JPA2
	public final void synpred96_JPA2_fragment() throws RecognitionException {
		// JPA2.g:265:7: ( between_expression )
		// JPA2.g:265:7: between_expression
		{
		pushFollow(FOLLOW_between_expression_in_synpred96_JPA22365);
		between_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred96_JPA2

	// $ANTLR start synpred97_JPA2
	public final void synpred97_JPA2_fragment() throws RecognitionException {
		// JPA2.g:266:7: ( in_expression )
		// JPA2.g:266:7: in_expression
		{
		pushFollow(FOLLOW_in_expression_in_synpred97_JPA22373);
		in_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred97_JPA2

	// $ANTLR start synpred98_JPA2
	public final void synpred98_JPA2_fragment() throws RecognitionException {
		// JPA2.g:267:7: ( like_expression )
		// JPA2.g:267:7: like_expression
		{
		pushFollow(FOLLOW_like_expression_in_synpred98_JPA22381);
		like_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred98_JPA2

	// $ANTLR start synpred99_JPA2
	public final void synpred99_JPA2_fragment() throws RecognitionException {
		// JPA2.g:268:7: ( null_comparison_expression )
		// JPA2.g:268:7: null_comparison_expression
		{
		pushFollow(FOLLOW_null_comparison_expression_in_synpred99_JPA22389);
		null_comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred99_JPA2

	// $ANTLR start synpred100_JPA2
	public final void synpred100_JPA2_fragment() throws RecognitionException {
		// JPA2.g:269:7: ( empty_collection_comparison_expression )
		// JPA2.g:269:7: empty_collection_comparison_expression
		{
		pushFollow(FOLLOW_empty_collection_comparison_expression_in_synpred100_JPA22397);
		empty_collection_comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred100_JPA2

	// $ANTLR start synpred101_JPA2
	public final void synpred101_JPA2_fragment() throws RecognitionException {
		// JPA2.g:270:7: ( collection_member_expression )
		// JPA2.g:270:7: collection_member_expression
		{
		pushFollow(FOLLOW_collection_member_expression_in_synpred101_JPA22405);
		collection_member_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred101_JPA2

	// $ANTLR start synpred120_JPA2
	public final void synpred120_JPA2_fragment() throws RecognitionException {
		// JPA2.g:299:7: ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression )
		// JPA2.g:299:7: arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression
		{
		pushFollow(FOLLOW_arithmetic_expression_in_synpred120_JPA22658);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:299:29: ( 'NOT' )?
		int alt145=2;
		int LA145_0 = input.LA(1);
		if ( (LA145_0==NOT) ) {
			alt145=1;
		}
		switch (alt145) {
			case 1 :
				// JPA2.g:299:30: 'NOT'
				{
				match(input,NOT,FOLLOW_NOT_in_synpred120_JPA22661); if (state.failed) return;

				}
				break;

		}

		match(input,82,FOLLOW_82_in_synpred120_JPA22665); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred120_JPA22667);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,AND,FOLLOW_AND_in_synpred120_JPA22669); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred120_JPA22671);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred120_JPA2

	// $ANTLR start synpred122_JPA2
	public final void synpred122_JPA2_fragment() throws RecognitionException {
		// JPA2.g:300:7: ( string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression )
		// JPA2.g:300:7: string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression
		{
		pushFollow(FOLLOW_string_expression_in_synpred122_JPA22679);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:300:25: ( 'NOT' )?
		int alt146=2;
		int LA146_0 = input.LA(1);
		if ( (LA146_0==NOT) ) {
			alt146=1;
		}
		switch (alt146) {
			case 1 :
				// JPA2.g:300:26: 'NOT'
				{
				match(input,NOT,FOLLOW_NOT_in_synpred122_JPA22682); if (state.failed) return;

				}
				break;

		}

		match(input,82,FOLLOW_82_in_synpred122_JPA22686); if (state.failed) return;

		pushFollow(FOLLOW_string_expression_in_synpred122_JPA22688);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,AND,FOLLOW_AND_in_synpred122_JPA22690); if (state.failed) return;

		pushFollow(FOLLOW_string_expression_in_synpred122_JPA22692);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred122_JPA2

	// $ANTLR start synpred133_JPA2
	public final void synpred133_JPA2_fragment() throws RecognitionException {
		// JPA2.g:316:42: ( string_expression )
		// JPA2.g:316:42: string_expression
		{
		pushFollow(FOLLOW_string_expression_in_synpred133_JPA22873);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred133_JPA2

	// $ANTLR start synpred134_JPA2
	public final void synpred134_JPA2_fragment() throws RecognitionException {
		// JPA2.g:316:62: ( pattern_value )
		// JPA2.g:316:62: pattern_value
		{
		pushFollow(FOLLOW_pattern_value_in_synpred134_JPA22877);
		pattern_value();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred134_JPA2

	// $ANTLR start synpred136_JPA2
	public final void synpred136_JPA2_fragment() throws RecognitionException {
		// JPA2.g:318:8: ( path_expression )
		// JPA2.g:318:8: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred136_JPA22900);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred136_JPA2

	// $ANTLR start synpred144_JPA2
	public final void synpred144_JPA2_fragment() throws RecognitionException {
		// JPA2.g:328:7: ( identification_variable )
		// JPA2.g:328:7: identification_variable
		{
		pushFollow(FOLLOW_identification_variable_in_synpred144_JPA23002);
		identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred144_JPA2

	// $ANTLR start synpred151_JPA2
	public final void synpred151_JPA2_fragment() throws RecognitionException {
		// JPA2.g:336:7: ( string_expression ( comparison_operator | 'REGEXP' ) ( string_expression | all_or_any_expression ) )
		// JPA2.g:336:7: string_expression ( comparison_operator | 'REGEXP' ) ( string_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_string_expression_in_synpred151_JPA23071);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:336:25: ( comparison_operator | 'REGEXP' )
		int alt148=2;
		int LA148_0 = input.LA(1);
		if ( ((LA148_0 >= 65 && LA148_0 <= 70)) ) {
			alt148=1;
		}
		else if ( (LA148_0==123) ) {
			alt148=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 148, 0, input);
			throw nvae;
		}

		switch (alt148) {
			case 1 :
				// JPA2.g:336:26: comparison_operator
				{
				pushFollow(FOLLOW_comparison_operator_in_synpred151_JPA23074);
				comparison_operator();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:336:48: 'REGEXP'
				{
				match(input,123,FOLLOW_123_in_synpred151_JPA23078); if (state.failed) return;

				}
				break;

		}

		// JPA2.g:336:58: ( string_expression | all_or_any_expression )
		int alt149=2;
		int LA149_0 = input.LA(1);
		if ( (LA149_0==AVG||LA149_0==COUNT||(LA149_0 >= LOWER && LA149_0 <= NAMED_PARAMETER)||(LA149_0 >= STRING_LITERAL && LA149_0 <= SUM)||LA149_0==WORD||LA149_0==57||LA149_0==71||LA149_0==76||(LA149_0 >= 84 && LA149_0 <= 87)||LA149_0==100||LA149_0==102||LA149_0==118||LA149_0==129||LA149_0==133||LA149_0==136) ) {
			alt149=1;
		}
		else if ( ((LA149_0 >= 79 && LA149_0 <= 80)||LA149_0==127) ) {
			alt149=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 149, 0, input);
			throw nvae;
		}

		switch (alt149) {
			case 1 :
				// JPA2.g:336:59: string_expression
				{
				pushFollow(FOLLOW_string_expression_in_synpred151_JPA23082);
				string_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:336:79: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred151_JPA23086);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred151_JPA2

	// $ANTLR start synpred154_JPA2
	public final void synpred154_JPA2_fragment() throws RecognitionException {
		// JPA2.g:337:7: ( boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) )
		// JPA2.g:337:7: boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_boolean_expression_in_synpred154_JPA23095);
		boolean_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:337:39: ( boolean_expression | all_or_any_expression )
		int alt150=2;
		int LA150_0 = input.LA(1);
		if ( (LA150_0==LPAREN||LA150_0==NAMED_PARAMETER||LA150_0==WORD||LA150_0==57||LA150_0==71||LA150_0==76||(LA150_0 >= 84 && LA150_0 <= 86)||LA150_0==100||LA150_0==102||LA150_0==118||(LA150_0 >= 142 && LA150_0 <= 143)) ) {
			alt150=1;
		}
		else if ( ((LA150_0 >= 79 && LA150_0 <= 80)||LA150_0==127) ) {
			alt150=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 150, 0, input);
			throw nvae;
		}

		switch (alt150) {
			case 1 :
				// JPA2.g:337:40: boolean_expression
				{
				pushFollow(FOLLOW_boolean_expression_in_synpred154_JPA23106);
				boolean_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:337:61: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred154_JPA23110);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred154_JPA2

	// $ANTLR start synpred157_JPA2
	public final void synpred157_JPA2_fragment() throws RecognitionException {
		// JPA2.g:338:7: ( enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) )
		// JPA2.g:338:7: enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_enum_expression_in_synpred157_JPA23119);
		enum_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:338:34: ( enum_expression | all_or_any_expression )
		int alt151=2;
		int LA151_0 = input.LA(1);
		if ( (LA151_0==LPAREN||LA151_0==NAMED_PARAMETER||LA151_0==WORD||LA151_0==57||LA151_0==71||LA151_0==84||LA151_0==86||LA151_0==118) ) {
			alt151=1;
		}
		else if ( ((LA151_0 >= 79 && LA151_0 <= 80)||LA151_0==127) ) {
			alt151=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 151, 0, input);
			throw nvae;
		}

		switch (alt151) {
			case 1 :
				// JPA2.g:338:35: enum_expression
				{
				pushFollow(FOLLOW_enum_expression_in_synpred157_JPA23128);
				enum_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:338:53: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred157_JPA23132);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred157_JPA2

	// $ANTLR start synpred159_JPA2
	public final void synpred159_JPA2_fragment() throws RecognitionException {
		// JPA2.g:339:7: ( datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) )
		// JPA2.g:339:7: datetime_expression comparison_operator ( datetime_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_datetime_expression_in_synpred159_JPA23141);
		datetime_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_comparison_operator_in_synpred159_JPA23143);
		comparison_operator();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:339:47: ( datetime_expression | all_or_any_expression )
		int alt152=2;
		int LA152_0 = input.LA(1);
		if ( (LA152_0==AVG||LA152_0==COUNT||(LA152_0 >= LPAREN && LA152_0 <= NAMED_PARAMETER)||LA152_0==SUM||LA152_0==WORD||LA152_0==57||LA152_0==71||LA152_0==76||(LA152_0 >= 84 && LA152_0 <= 86)||(LA152_0 >= 88 && LA152_0 <= 90)||LA152_0==100||LA152_0==102||LA152_0==118) ) {
			alt152=1;
		}
		else if ( ((LA152_0 >= 79 && LA152_0 <= 80)||LA152_0==127) ) {
			alt152=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 152, 0, input);
			throw nvae;
		}

		switch (alt152) {
			case 1 :
				// JPA2.g:339:48: datetime_expression
				{
				pushFollow(FOLLOW_datetime_expression_in_synpred159_JPA23146);
				datetime_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:339:70: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred159_JPA23150);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred159_JPA2

	// $ANTLR start synpred162_JPA2
	public final void synpred162_JPA2_fragment() throws RecognitionException {
		// JPA2.g:340:7: ( entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) )
		// JPA2.g:340:7: entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_entity_expression_in_synpred162_JPA23159);
		entity_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:340:38: ( entity_expression | all_or_any_expression )
		int alt153=2;
		int LA153_0 = input.LA(1);
		if ( (LA153_0==NAMED_PARAMETER||LA153_0==WORD||LA153_0==57||LA153_0==71) ) {
			alt153=1;
		}
		else if ( ((LA153_0 >= 79 && LA153_0 <= 80)||LA153_0==127) ) {
			alt153=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 153, 0, input);
			throw nvae;
		}

		switch (alt153) {
			case 1 :
				// JPA2.g:340:39: entity_expression
				{
				pushFollow(FOLLOW_entity_expression_in_synpred162_JPA23170);
				entity_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:340:59: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred162_JPA23174);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred162_JPA2

	// $ANTLR start synpred164_JPA2
	public final void synpred164_JPA2_fragment() throws RecognitionException {
		// JPA2.g:341:7: ( entity_type_expression ( '=' | '<>' ) entity_type_expression )
		// JPA2.g:341:7: entity_type_expression ( '=' | '<>' ) entity_type_expression
		{
		pushFollow(FOLLOW_entity_type_expression_in_synpred164_JPA23183);
		entity_type_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 67 && input.LA(1) <= 68) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_entity_type_expression_in_synpred164_JPA23193);
		entity_type_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred164_JPA2

	// $ANTLR start synpred172_JPA2
	public final void synpred172_JPA2_fragment() throws RecognitionException {
		// JPA2.g:352:7: ( arithmetic_term ( '+' | '-' ) arithmetic_term )
		// JPA2.g:352:7: arithmetic_term ( '+' | '-' ) arithmetic_term
		{
		pushFollow(FOLLOW_arithmetic_term_in_synpred172_JPA23274);
		arithmetic_term();
		state._fsp--;
		if (state.failed) return;

		if ( input.LA(1)==59||input.LA(1)==61 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arithmetic_term_in_synpred172_JPA23284);
		arithmetic_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred172_JPA2

	// $ANTLR start synpred174_JPA2
	public final void synpred174_JPA2_fragment() throws RecognitionException {
		// JPA2.g:355:7: ( arithmetic_factor ( '*' | '/' ) arithmetic_factor )
		// JPA2.g:355:7: arithmetic_factor ( '*' | '/' ) arithmetic_factor
		{
		pushFollow(FOLLOW_arithmetic_factor_in_synpred174_JPA23303);
		arithmetic_factor();
		state._fsp--;
		if (state.failed) return;

		if ( input.LA(1)==58||input.LA(1)==63 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arithmetic_factor_in_synpred174_JPA23314);
		arithmetic_factor();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred174_JPA2

	// $ANTLR start synpred179_JPA2
	public final void synpred179_JPA2_fragment() throws RecognitionException {
		// JPA2.g:362:7: ( '(' arithmetic_expression ')' )
		// JPA2.g:362:7: '(' arithmetic_expression ')'
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred179_JPA23372); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred179_JPA23373);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred179_JPA23374); if (state.failed) return;

		}

	}
	// $ANTLR end synpred179_JPA2

	// $ANTLR start synpred182_JPA2
	public final void synpred182_JPA2_fragment() throws RecognitionException {
		// JPA2.g:365:7: ( aggregate_expression )
		// JPA2.g:365:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred182_JPA23398);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred182_JPA2

	// $ANTLR start synpred184_JPA2
	public final void synpred184_JPA2_fragment() throws RecognitionException {
		// JPA2.g:367:7: ( function_invocation )
		// JPA2.g:367:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred184_JPA23414);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred184_JPA2

	// $ANTLR start synpred190_JPA2
	public final void synpred190_JPA2_fragment() throws RecognitionException {
		// JPA2.g:375:7: ( aggregate_expression )
		// JPA2.g:375:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred190_JPA23473);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred190_JPA2

	// $ANTLR start synpred192_JPA2
	public final void synpred192_JPA2_fragment() throws RecognitionException {
		// JPA2.g:377:7: ( function_invocation )
		// JPA2.g:377:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred192_JPA23489);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred192_JPA2

	// $ANTLR start synpred194_JPA2
	public final void synpred194_JPA2_fragment() throws RecognitionException {
		// JPA2.g:381:7: ( path_expression )
		// JPA2.g:381:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred194_JPA23516);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred194_JPA2

	// $ANTLR start synpred197_JPA2
	public final void synpred197_JPA2_fragment() throws RecognitionException {
		// JPA2.g:384:7: ( aggregate_expression )
		// JPA2.g:384:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred197_JPA23540);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred197_JPA2

	// $ANTLR start synpred199_JPA2
	public final void synpred199_JPA2_fragment() throws RecognitionException {
		// JPA2.g:386:7: ( function_invocation )
		// JPA2.g:386:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred199_JPA23556);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred199_JPA2

	// $ANTLR start synpred201_JPA2
	public final void synpred201_JPA2_fragment() throws RecognitionException {
		// JPA2.g:388:7: ( date_time_timestamp_literal )
		// JPA2.g:388:7: date_time_timestamp_literal
		{
		pushFollow(FOLLOW_date_time_timestamp_literal_in_synpred201_JPA23572);
		date_time_timestamp_literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred201_JPA2

	// $ANTLR start synpred239_JPA2
	public final void synpred239_JPA2_fragment() throws RecognitionException {
		// JPA2.g:439:7: ( literal )
		// JPA2.g:439:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred239_JPA24027);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred239_JPA2

	// $ANTLR start synpred241_JPA2
	public final void synpred241_JPA2_fragment() throws RecognitionException {
		// JPA2.g:441:7: ( input_parameter )
		// JPA2.g:441:7: input_parameter
		{
		pushFollow(FOLLOW_input_parameter_in_synpred241_JPA24043);
		input_parameter();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred241_JPA2

	// Delegated rules

	public final boolean synpred179_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred179_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred134_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred94_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred94_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred99_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred85_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred93_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred120_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred120_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred157_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred157_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred98_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred144_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred144_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred30_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred174_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred174_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred136_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred133_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred133_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred95_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred95_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred162_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred162_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred88_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred100_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred90_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred96_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred96_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred192_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred192_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred89_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred89_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred97_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred97_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred101_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred154_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred201_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred201_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred66_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred66_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred241_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred241_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred172_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred172_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred164_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred164_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred159_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred159_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred239_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred239_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred197_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred194_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred194_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred34_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA41 dfa41 = new DFA41(this);
	static final String DFA41_eotS =
		"\30\uffff";
	static final String DFA41_eofS =
		"\30\uffff";
	static final String DFA41_minS =
		"\1\6\1\27\2\uffff\1\13\1\67\1\37\1\uffff\1\6\15\37\1\0\1\6";
	static final String DFA41_maxS =
		"\1\146\1\27\2\uffff\2\67\1\76\1\uffff\1\u008d\15\76\1\0\1\u008d";
	static final String DFA41_acceptS =
		"\2\uffff\1\1\1\3\3\uffff\1\2\20\uffff";
	static final String DFA41_specialS =
		"\26\uffff\1\0\1\uffff}>";
	static final String[] DFA41_transitionS = {
			"\1\2\2\uffff\1\1\16\uffff\2\2\11\uffff\1\2\102\uffff\1\3",
			"\1\4",
			"",
			"",
			"\1\5\53\uffff\1\6",
			"\1\6",
			"\1\7\36\uffff\1\10",
			"",
			"\1\21\2\uffff\1\22\4\uffff\1\14\11\uffff\1\16\1\17\3\uffff\1\15\1\uffff"+
			"\1\26\3\uffff\1\20\23\uffff\1\11\31\uffff\1\23\11\uffff\1\25\5\uffff"+
			"\1\25\3\uffff\1\13\1\uffff\1\25\7\uffff\1\24\1\25\1\uffff\1\25\7\uffff"+
			"\1\25\1\uffff\1\25\1\12\14\uffff\1\25\2\uffff\1\25",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\26\36\uffff\1\27",
			"\1\uffff",
			"\1\21\2\uffff\1\22\4\uffff\1\14\11\uffff\1\16\1\17\3\uffff\1\15\1\uffff"+
			"\1\26\3\uffff\1\20\23\uffff\1\11\31\uffff\1\23\11\uffff\1\25\5\uffff"+
			"\1\25\3\uffff\1\13\1\uffff\1\25\7\uffff\1\24\1\25\1\uffff\1\25\7\uffff"+
			"\1\25\1\uffff\1\25\1\12\14\uffff\1\25\2\uffff\1\25"
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "182:1: aggregate_expression : ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA41_22 = input.LA(1);
						 
						int index41_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_JPA2()) ) {s = 2;}
						else if ( (synpred55_JPA2()) ) {s = 7;}
						 
						input.seek(index41_22);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 41, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_select_statement_in_ql_statement445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_statement_in_ql_statement449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_delete_statement_in_ql_statement453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_select_statement468 = new BitSet(new long[]{0x2A80000C07C40A40L,0x40CA515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_select_clause_in_select_statement470 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_from_clause_in_select_statement472 = new BitSet(new long[]{0x000000002000C002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_where_clause_in_select_statement475 = new BitSet(new long[]{0x000000002000C002L});
	public static final BitSet FOLLOW_groupby_clause_in_select_statement480 = new BitSet(new long[]{0x0000000020008002L});
	public static final BitSet FOLLOW_having_clause_in_select_statement485 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_orderby_clause_in_select_statement490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_135_in_update_statement548 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_update_clause_in_update_statement550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_where_clause_in_update_statement553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_delete_statement589 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_delete_clause_in_delete_statement591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_where_clause_in_delete_statement594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_from_clause632 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_from_clause634 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_from_clause637 = new BitSet(new long[]{0x0080000000010000L});
	public static final BitSet FOLLOW_identification_variable_declaration_or_collection_member_declaration_in_from_clause639 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_identification_variable_declaration_or_collection_member_declaration673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_declaration_in_identification_variable_declaration_or_collection_member_declaration682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_variable_declaration_in_identification_variable_declaration706 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_joined_clause_in_identification_variable_declaration708 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_joined_clause_in_join_section739 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_join_in_joined_clause747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fetch_join_in_joined_clause751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_range_variable_declaration763 = new BitSet(new long[]{0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_range_variable_declaration766 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_range_variable_declaration770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_spec_in_join799 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_join_association_path_expression_in_join801 = new BitSet(new long[]{0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_join804 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_join808 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_121_in_join811 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_expression_in_join813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_spec_in_fetch_join847 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FETCH_in_fetch_join849 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_join_association_path_expression_in_fetch_join851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_join_spec865 = new BitSet(new long[]{0x0000000040080000L});
	public static final BitSet FOLLOW_OUTER_in_join_spec869 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INNER_in_join_spec875 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_JOIN_in_join_spec880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_join_association_path_expression894 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_join_association_path_expression896 = new BitSet(new long[]{0x0080000823004242L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression899 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_join_association_path_expression900 = new BitSet(new long[]{0x0080000823004242L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_join_association_path_expression939 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_join_association_path_expression941 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_join_association_path_expression943 = new BitSet(new long[]{0x0080000823004240L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression946 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_join_association_path_expression947 = new BitSet(new long[]{0x0080000823004240L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_join_association_path_expression954 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_subtype_in_join_association_path_expression956 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_join_association_path_expression958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_join_association_path_expression991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_collection_member_declaration1004 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_collection_member_declaration1005 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_collection_member_declaration1007 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_collection_member_declaration1009 = new BitSet(new long[]{0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_collection_member_declaration1012 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_collection_member_declaration1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_field_identification_variable_in_qualified_identification_variable1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_qualified_identification_variable1053 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_qualified_identification_variable1054 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_qualified_identification_variable1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_map_field_identification_variable1062 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_map_field_identification_variable1063 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_map_field_identification_variable1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_137_in_map_field_identification_variable1068 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_map_field_identification_variable1069 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_map_field_identification_variable1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_path_expression1084 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_path_expression1086 = new BitSet(new long[]{0x0080000823004242L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_path_expression1089 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_path_expression1090 = new BitSet(new long[]{0x0080000823004242L,0x340580A208020000L,0x0000000000002400L});
	public static final BitSet FOLLOW_field_in_path_expression1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_general_identification_variable1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_field_identification_variable_in_general_identification_variable1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_update_clause1154 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SET_in_update_clause1156 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_update_item_in_update_clause1158 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_update_clause1161 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_update_item_in_update_clause1163 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_update_item1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_update_item1207 = new BitSet(new long[]{0x2A80000C07C40240L,0x4062515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_new_value_in_update_item1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_new_value1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_new_value1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_new_value1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_delete_clause1250 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_delete_clause1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_select_clause1280 = new BitSet(new long[]{0x2A80000C07C40240L,0x40CA515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_select_item_in_select_clause1284 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_select_clause1287 = new BitSet(new long[]{0x2A80000C07C40240L,0x40CA515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_select_item_in_select_clause1289 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_item1332 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_select_item1336 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_result_variable_in_select_item1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_select_expression1353 = new BitSet(new long[]{0xAC00000000000002L});
	public static final BitSet FOLLOW_set_in_select_expression1356 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_select_expression1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_select_expression1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_select_expression1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_select_expression1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_select_expression1416 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_select_expression1418 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_select_expression1419 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_select_expression1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_expression_in_select_expression1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_constructor_expression1439 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_constructor_name_in_constructor_expression1441 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_constructor_expression1443 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_constructor_item_in_constructor_expression1445 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_constructor_expression1448 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_constructor_item_in_constructor_expression1450 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_constructor_expression1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_constructor_item1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_constructor_item1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_constructor_item1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_constructor_item1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_function_name_in_aggregate_expression1500 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_aggregate_expression1502 = new BitSet(new long[]{0x0080000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_aggregate_expression1504 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_aggregate_expression1508 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregate_expression1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggregate_expression1543 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_aggregate_expression1545 = new BitSet(new long[]{0x0080000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_aggregate_expression1547 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_count_argument_in_aggregate_expression1551 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregate_expression1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_aggregate_expression1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_count_argument1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_count_argument1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_140_in_where_clause1642 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_expression_in_where_clause1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause1666 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BY_in_groupby_clause1668 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause1670 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_groupby_clause1673 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause1675 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_groupby_item1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_groupby_item1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause1724 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_expression_in_having_clause1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause1737 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BY_in_orderby_clause1739 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042555007F05081L,0x000000000000C363L});
	public static final BitSet FOLLOW_orderby_item_in_orderby_clause1741 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_orderby_clause1744 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042555007F05081L,0x000000000000C363L});
	public static final BitSet FOLLOW_orderby_item_in_orderby_clause1746 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_orderby_variable_in_orderby_item1780 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_sort_in_orderby_item1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_orderby_variable1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_identification_variable_in_orderby_variable1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_variable_in_orderby_variable1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_orderby_variable1826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_orderby_variable1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subquery1860 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_125_in_subquery1862 = new BitSet(new long[]{0x2A80000C07C40A40L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_simple_select_clause_in_subquery1864 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_subquery_from_clause_in_subquery1866 = new BitSet(new long[]{0x000000008000C000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_where_clause_in_subquery1869 = new BitSet(new long[]{0x000000008000C000L});
	public static final BitSet FOLLOW_groupby_clause_in_subquery1874 = new BitSet(new long[]{0x0000000080008000L});
	public static final BitSet FOLLOW_having_clause_in_subquery1879 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_subquery1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_subquery_from_clause1935 = new BitSet(new long[]{0x0080000000010000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1937 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_subquery_from_clause1940 = new BitSet(new long[]{0x0080000000010000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1942 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_subselect_identification_variable_declaration1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_path_expression_in_subselect_identification_variable_declaration1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_subselect_identification_variable_declaration1990 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_subselect_identification_variable_declaration1992 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_join_in_subselect_identification_variable_declaration1995 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_derived_collection_member_declaration_in_subselect_identification_variable_declaration2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_derived_path_expression2016 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_derived_path_expression2017 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_derived_path_expression2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_derived_path_expression2026 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_derived_path_expression2027 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_collection_valued_field_in_derived_path_expression2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_derived_path_in_general_derived_path2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_treated_derived_path_in_general_derived_path2047 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_general_derived_path2049 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_general_derived_path2050 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_superquery_identification_variable_in_simple_derived_path2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_treated_derived_path2085 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_general_derived_path_in_treated_derived_path2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_treated_derived_path2088 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_subtype_in_treated_derived_path2090 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_treated_derived_path2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_derived_collection_member_declaration2103 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_superquery_identification_variable_in_derived_collection_member_declaration2105 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_derived_collection_member_declaration2106 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_derived_collection_member_declaration2108 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_derived_collection_member_declaration2110 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_collection_valued_field_in_derived_collection_member_declaration2113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_simple_select_clause2126 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_simple_select_expression_in_simple_select_clause2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_simple_select_expression2170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_select_expression2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_simple_select_expression2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_select_expression2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_scalar_expression2205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_scalar_expression2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_scalar_expression2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_scalar_expression2229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_scalar_expression2237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_scalar_expression2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_scalar_expression2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_term_in_conditional_expression2265 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_OR_in_conditional_expression2269 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_term_in_conditional_expression2271 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_conditional_factor_in_conditional_term2285 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_conditional_term2289 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_factor_in_conditional_term2291 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_conditional_factor2305 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_primary_in_conditional_factor2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_cond_expression_in_conditional_primary2320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditional_primary2344 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_primary2345 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_conditional_primary2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_expression_in_simple_cond_expression2357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_between_expression_in_simple_cond_expression2365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_expression_in_simple_cond_expression2373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_expression_in_simple_cond_expression2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_comparison_expression_in_simple_cond_expression2389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_collection_comparison_expression_in_simple_cond_expression2397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_expression_in_simple_cond_expression2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exists_expression_in_simple_cond_expression2413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_macro_expression_in_simple_cond_expression2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_between_macro_expression_in_date_macro_expression2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_before_macro_expression_in_date_macro_expression2442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_after_macro_expression_in_date_macro_expression2450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_equals_macro_expression_in_date_macro_expression2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_today_macro_expression_in_date_macro_expression2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_date_between_macro_expression2478 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_between_macro_expression2480 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_between_macro_expression2482 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_between_macro_expression2484 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_date_between_macro_expression2486 = new BitSet(new long[]{0x3800000000000000L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2489 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_numeric_literal_in_date_between_macro_expression2497 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_between_macro_expression2501 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_date_between_macro_expression2503 = new BitSet(new long[]{0x3800000000000000L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2506 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_numeric_literal_in_date_between_macro_expression2514 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_between_macro_expression2518 = new BitSet(new long[]{0x0000000000000000L,0x1005008008000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2520 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_between_macro_expression2543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_date_before_macro_expression2555 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_before_macro_expression2557 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_before_macro_expression2559 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_before_macro_expression2561 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_path_expression_in_date_before_macro_expression2564 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_before_macro_expression2568 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_before_macro_expression2571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_date_after_macro_expression2583 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_after_macro_expression2585 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_after_macro_expression2587 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_after_macro_expression2589 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_path_expression_in_date_after_macro_expression2592 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_after_macro_expression2596 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_after_macro_expression2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_date_equals_macro_expression2611 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_equals_macro_expression2613 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_equals_macro_expression2615 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_date_equals_macro_expression2617 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_path_expression_in_date_equals_macro_expression2620 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_equals_macro_expression2624 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_equals_macro_expression2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_date_today_macro_expression2639 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_today_macro_expression2641 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_today_macro_expression2643 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_today_macro_expression2645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2658 = new BitSet(new long[]{0x0000000008000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_between_expression2665 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2667 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2669 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2679 = new BitSet(new long[]{0x0000000008000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_between_expression2686 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2688 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2690 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2700 = new BitSet(new long[]{0x0000000008000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_between_expression2707 = new BitSet(new long[]{0x0280000807800240L,0x0040005007701080L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2709 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2711 = new BitSet(new long[]{0x0280000807800240L,0x0040005007701080L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_in_expression2725 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_type_discriminator_in_in_expression2729 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_identification_variable_in_in_expression2733 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_NOT_in_in_expression2737 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_in_expression2741 = new BitSet(new long[]{0x0200000004800000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LPAREN_in_in_expression2757 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_in_item_in_in_expression2759 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_in_expression2762 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_in_item_in_in_expression2764 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_in_expression2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_in_expression2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_valued_input_parameter_in_in_expression2800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_in_expression2816 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_in_expression2818 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_in_expression2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_in_item2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_valued_input_parameter_in_in_item2852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_like_expression2863 = new BitSet(new long[]{0x0000000008000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NOT_in_like_expression2866 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_like_expression2870 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_like_expression2873 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_pattern_value_in_like_expression2877 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_input_parameter_in_like_expression2881 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_like_expression2884 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_escape_character_in_like_expression2886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_null_comparison_expression2900 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_input_parameter_in_null_comparison_expression2904 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_join_association_path_expression_in_null_comparison_expression2908 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_null_comparison_expression2911 = new BitSet(new long[]{0x0000000008000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NOT_in_null_comparison_expression2914 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_null_comparison_expression2918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_empty_collection_comparison_expression2929 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_empty_collection_comparison_expression2931 = new BitSet(new long[]{0x0000000008000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_NOT_in_empty_collection_comparison_expression2934 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_empty_collection_comparison_expression2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_or_value_expression_in_collection_member_expression2949 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NOT_in_collection_member_expression2953 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_collection_member_expression2957 = new BitSet(new long[]{0x0080000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_120_in_collection_member_expression2960 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_collection_member_expression2964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_entity_or_value_expression2975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_or_value_expression_in_entity_or_value_expression2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_entity_or_value_expression2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_entity_or_value_expression3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_simple_entity_or_value_expression3010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_simple_entity_or_value_expression3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_exists_expression3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_exists_expression3034 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_subquery_in_exists_expression3036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_all_or_any_expression3047 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_subquery_in_all_or_any_expression3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_comparison_expression3071 = new BitSet(new long[]{0x0000000000000000L,0x080000000000007EL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression3074 = new BitSet(new long[]{0x0280000C07C00240L,0x8040005000F19080L,0x0000000000000122L});
	public static final BitSet FOLLOW_123_in_comparison_expression3078 = new BitSet(new long[]{0x0280000C07C00240L,0x8040005000F19080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_comparison_expression3082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_comparison_expression3095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_comparison_expression3097 = new BitSet(new long[]{0x0280000004800000L,0x8040005000719080L,0x000000000000C000L});
	public static final BitSet FOLLOW_boolean_expression_in_comparison_expression3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_comparison_expression3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_comparison_expression3121 = new BitSet(new long[]{0x0280000004800000L,0x8040000000518080L});
	public static final BitSet FOLLOW_enum_expression_in_comparison_expression3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_comparison_expression3141 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007EL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression3143 = new BitSet(new long[]{0x0280000807800240L,0x8040005007719080L});
	public static final BitSet FOLLOW_datetime_expression_in_comparison_expression3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_expression_in_comparison_expression3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_comparison_expression3161 = new BitSet(new long[]{0x0280000004000000L,0x8000000000018080L});
	public static final BitSet FOLLOW_entity_expression_in_comparison_expression3170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_comparison_expression3183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_comparison_expression3185 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L,0x0000000000000040L});
	public static final BitSet FOLLOW_entity_type_expression_in_comparison_expression3193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_comparison_expression3201 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007EL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression3203 = new BitSet(new long[]{0x2A80000807840240L,0xC04251500071D081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_comparison_expression3206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3274 = new BitSet(new long[]{0x2800000000000000L});
	public static final BitSet FOLLOW_set_in_arithmetic_expression3276 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3303 = new BitSet(new long[]{0x8400000000000000L});
	public static final BitSet FOLLOW_set_in_arithmetic_term3305 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_primary_in_arithmetic_factor3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_arithmetic_primary3356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_literal_in_arithmetic_primary3364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arithmetic_primary3372 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_arithmetic_primary3373 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_arithmetic_primary3374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_arithmetic_primary3382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_numerics_in_arithmetic_primary3390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_arithmetic_primary3398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_arithmetic_primary3406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_arithmetic_primary3414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_extension_functions_in_arithmetic_primary3422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_arithmetic_primary3430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_string_expression3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_string_expression3449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_string_expression3457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_strings_in_string_expression3465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_string_expression3473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_string_expression3481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_string_expression3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_extension_functions_in_string_expression3497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_string_expression3505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_datetime_expression3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_datetime_expression3524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_datetime_in_datetime_expression3532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_datetime_expression3540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_datetime_expression3548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_datetime_expression3556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_extension_functions_in_datetime_expression3564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_time_timestamp_literal_in_datetime_expression3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_datetime_expression3580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_boolean_expression3591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_literal_in_boolean_expression3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_boolean_expression3607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_expression3615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_boolean_expression3623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_extension_functions_in_boolean_expression3631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_boolean_expression3639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_enum_expression3650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_literal_in_enum_expression3658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_enum_expression3666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_enum_expression3674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_enum_expression3682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_entity_expression3693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_entity_expression3701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_entity_expression3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_simple_entity_expression3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_discriminator_in_entity_type_expression3731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_literal_in_entity_type_expression3739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_entity_type_expression3747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_134_in_type_discriminator3758 = new BitSet(new long[]{0x0280000004000000L,0x0000040000000080L,0x0000000000000200L});
	public static final BitSet FOLLOW_general_identification_variable_in_type_discriminator3761 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_path_expression_in_type_discriminator3765 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_type_discriminator3769 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_type_discriminator3772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_functions_returning_numerics3783 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3784 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_functions_returning_numerics3793 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3795 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_numerics3796 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3798 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_numerics3800 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3801 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_functions_returning_numerics3812 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3813 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_128_in_functions_returning_numerics3822 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3823 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_functions_returning_numerics3832 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3833 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_numerics3834 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3836 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_126_in_functions_returning_numerics3845 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_functions_returning_numerics3846 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_functions_returning_numerics3855 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_functions_returning_numerics3856 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_functions_returning_strings3895 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3896 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_strings3897 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3899 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_strings3902 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3904 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_functions_returning_strings3915 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3917 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_strings3918 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_strings3920 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_functions_returning_strings3923 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_strings3925 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_133_in_functions_returning_strings3936 = new BitSet(new long[]{0x0280001C07C00240L,0x0040087000F81080L,0x000000000000012AL});
	public static final BitSet FOLLOW_trim_specification_in_functions_returning_strings3939 = new BitSet(new long[]{0x0000001000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_trim_character_in_functions_returning_strings3944 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_functions_returning_strings3948 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3952 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOWER_in_functions_returning_strings3962 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_functions_returning_strings3964 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3965 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_136_in_functions_returning_strings3974 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3975 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_function_invocation4006 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_function_name_in_function_invocation4007 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_function_invocation4010 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_function_arg_in_function_invocation4012 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_invocation4016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_function_arg4027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_function_arg4035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_function_arg4043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_function_arg4051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_case_expression_in_case_expression4062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_expression_in_case_expression4070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_coalesce_expression_in_case_expression4078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullif_expression_in_case_expression4086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_general_case_expression4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_when_clause_in_general_case_expression4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_when_clause_in_general_case_expression4102 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_93_in_general_case_expression4106 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_general_case_expression4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_general_case_expression4110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_139_in_when_clause4121 = new BitSet(new long[]{0x2A80000C0FC40240L,0x4042515807F07F81L,0x000000000000C173L});
	public static final BitSet FOLLOW_conditional_expression_in_when_clause4123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_when_clause4125 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_when_clause4127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_simple_case_expression4138 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_case_operand_in_simple_case_expression4140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case_expression4142 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case_expression4145 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_93_in_simple_case_expression4149 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_case_expression4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_simple_case_expression4153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_case_operand4164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_discriminator_in_case_operand4172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_139_in_simple_when_clause4183 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_when_clause4185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_simple_when_clause4187 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_when_clause4189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_coalesce_expression4200 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_coalesce_expression4201 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_coalesce_expression4204 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_coalesce_expression4206 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_coalesce_expression4209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_nullif_expression4220 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_nullif_expression4221 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_nullif_expression4223 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_nullif_expression4225 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_nullif_expression4226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_extension_functions4238 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_function_arg_in_extension_functions4240 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_extension_functions4242 = new BitSet(new long[]{0x0000000080800000L});
	public static final BitSet FOLLOW_LPAREN_in_extension_functions4245 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_INT_NUMERAL_in_extension_functions4246 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_60_in_extension_functions4249 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_INT_NUMERAL_in_extension_functions4251 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_extension_functions4256 = new BitSet(new long[]{0x0000000080800000L});
	public static final BitSet FOLLOW_RPAREN_in_extension_functions4260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_extension_functions4268 = new BitSet(new long[]{0x0000000000000000L,0x1405008208000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_date_part_in_extension_functions4270 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_extension_functions4272 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_function_arg_in_extension_functions4274 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_extension_functions4276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_extension_functions4284 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_extension_functions4286 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_enum_value_literal_in_extension_functions4288 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_extension_functions4290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_input_parameter4357 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_numeric_literal_in_input_parameter4359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMED_PARAMETER_in_input_parameter4382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_input_parameter4403 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_input_parameter4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_144_in_input_parameter4407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_literal4435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_constructor_name4447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_enum_literal4459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_field4492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_field4496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_field4500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_field4504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_field4508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_field4512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_field4516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUM_in_field4520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AVG_in_field4524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_field4528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_field4532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_field4536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_part_in_field4540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identification_variable4552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_parameter_name4564 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_parameter_name4567 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_parameter_name4570 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_TRIM_CHARACTER_in_trim_character4600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal4611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_numeric_literal4623 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_INT_NUMERAL_in_numeric_literal4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_single_valued_object_field4639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_single_valued_embeddable_object_field4650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_collection_valued_field4661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_entity_name4672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_subtype4683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_entity_type_literal4694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_function_name4705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_state_field4716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_result_variable4727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_superquery_identification_variable4738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_date_time_timestamp_literal4749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_pattern_value4760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_collection_valued_input_parameter4771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_single_valued_input_parameter4782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_enum_value_literal4793 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_enum_value_literal4796 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WORD_in_enum_value_literal4799 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_field_in_synpred21_JPA2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_synpred30_JPA21094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred33_JPA21220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_synpred34_JPA21228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred43_JPA21353 = new BitSet(new long[]{0xAC00000000000002L});
	public static final BitSet FOLLOW_set_in_synpred43_JPA21356 = new BitSet(new long[]{0x2A80000C07C40240L,0x4042515007F05081L,0x000000000000C163L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred43_JPA21372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_synpred44_JPA21382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred45_JPA21400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred46_JPA21408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred49_JPA21465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred50_JPA21473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred51_JPA21481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_function_name_in_synpred53_JPA21500 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred53_JPA21502 = new BitSet(new long[]{0x0080000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_synpred53_JPA21504 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_path_expression_in_synpred53_JPA21508 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred53_JPA21509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_synpred55_JPA21543 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred55_JPA21545 = new BitSet(new long[]{0x0080000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_synpred55_JPA21547 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_count_argument_in_synpred55_JPA21551 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred55_JPA21553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred65_JPA21814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_identification_variable_in_synpred66_JPA21818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_variable_in_synpred67_JPA21822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred68_JPA21826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_synpred77_JPA22016 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_synpred77_JPA22017 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_synpred77_JPA22018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred82_JPA22170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred83_JPA22178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred84_JPA22186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred85_JPA22205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred86_JPA22213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_synpred87_JPA22221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred88_JPA22229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred89_JPA22237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_synpred90_JPA22245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_synpred93_JPA22305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_cond_expression_in_synpred94_JPA22320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_expression_in_synpred95_JPA22357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_between_expression_in_synpred96_JPA22365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_expression_in_synpred97_JPA22373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_expression_in_synpred98_JPA22381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_comparison_expression_in_synpred99_JPA22389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_collection_comparison_expression_in_synpred100_JPA22397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_expression_in_synpred101_JPA22405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred120_JPA22658 = new BitSet(new long[]{0x0000000008000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOT_in_synpred120_JPA22661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_synpred120_JPA22665 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred120_JPA22667 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_synpred120_JPA22669 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred120_JPA22671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred122_JPA22679 = new BitSet(new long[]{0x0000000008000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOT_in_synpred122_JPA22682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_synpred122_JPA22686 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_synpred122_JPA22688 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_synpred122_JPA22690 = new BitSet(new long[]{0x0280000C07C00240L,0x0040005000F01080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_synpred122_JPA22692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred133_JPA22873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pattern_value_in_synpred134_JPA22877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred136_JPA22900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_synpred144_JPA23002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred151_JPA23071 = new BitSet(new long[]{0x0000000000000000L,0x080000000000007EL});
	public static final BitSet FOLLOW_comparison_operator_in_synpred151_JPA23074 = new BitSet(new long[]{0x0280000C07C00240L,0x8040005000F19080L,0x0000000000000122L});
	public static final BitSet FOLLOW_123_in_synpred151_JPA23078 = new BitSet(new long[]{0x0280000C07C00240L,0x8040005000F19080L,0x0000000000000122L});
	public static final BitSet FOLLOW_string_expression_in_synpred151_JPA23082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred151_JPA23086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred154_JPA23095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_synpred154_JPA23097 = new BitSet(new long[]{0x0280000004800000L,0x8040005000719080L,0x000000000000C000L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred154_JPA23106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred154_JPA23110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_synpred157_JPA23119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_synpred157_JPA23121 = new BitSet(new long[]{0x0280000004800000L,0x8040000000518080L});
	public static final BitSet FOLLOW_enum_expression_in_synpred157_JPA23128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred157_JPA23132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred159_JPA23141 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007EL});
	public static final BitSet FOLLOW_comparison_operator_in_synpred159_JPA23143 = new BitSet(new long[]{0x0280000807800240L,0x8040005007719080L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred159_JPA23146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred159_JPA23150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_expression_in_synpred162_JPA23159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_synpred162_JPA23161 = new BitSet(new long[]{0x0280000004000000L,0x8000000000018080L});
	public static final BitSet FOLLOW_entity_expression_in_synpred162_JPA23170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred162_JPA23174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_synpred164_JPA23183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_set_in_synpred164_JPA23185 = new BitSet(new long[]{0x0280000004000000L,0x0000000000000080L,0x0000000000000040L});
	public static final BitSet FOLLOW_entity_type_expression_in_synpred164_JPA23193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_synpred172_JPA23274 = new BitSet(new long[]{0x2800000000000000L});
	public static final BitSet FOLLOW_set_in_synpred172_JPA23276 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_term_in_synpred172_JPA23284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_synpred174_JPA23303 = new BitSet(new long[]{0x8400000000000000L});
	public static final BitSet FOLLOW_set_in_synpred174_JPA23305 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_factor_in_synpred174_JPA23314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred179_JPA23372 = new BitSet(new long[]{0x2A80000807840240L,0x4042515000705081L,0x0000000000000001L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred179_JPA23373 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred179_JPA23374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred182_JPA23398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred184_JPA23414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred190_JPA23473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred192_JPA23489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred194_JPA23516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred197_JPA23540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred199_JPA23556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_time_timestamp_literal_in_synpred201_JPA23572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred239_JPA24027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_synpred241_JPA24043 = new BitSet(new long[]{0x0000000000000002L});

	@Override
	public void emitErrorMessage(String msg) {
		//do nothing
	}

	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		throw new MismatchedTokenException(ttype, input);
	}
}
