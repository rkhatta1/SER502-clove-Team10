// Generated from e:/ASU/SER502/Project/SER502-clove-Team10/gm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, EQUAL=22, NOTEQUAL=23, LESST=24, 
		GREATERT=25, LESSTEQUAL=26, GREATERTEQUAL=27, MOD=28, DIVIDE=29, MULTIPLY=30, 
		ADD=31, SUBTRACT=32, AND=33, OR=34, NOT=35, ID=36, NUM=37, Str=38, WS=39, 
		COMMENT=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_relational_expr = 2, RULE_condition = 3, 
		RULE_declarativeStatement = 4, RULE_assignmentStatement = 5, RULE_idAssignmentStatement = 6, 
		RULE_printStatement = 7, RULE_conditionStatement = 8, RULE_whileStatement = 9, 
		RULE_ternaryOperator = 10, RULE_forLoop = 11, RULE_forEachLoop = 12, RULE_ifStatements = 13, 
		RULE_elseStatements = 14, RULE_expr = 15, RULE_bool = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "relational_expr", "condition", "declarativeStatement", 
			"assignmentStatement", "idAssignmentStatement", "printStatement", "conditionStatement", 
			"whileStatement", "ternaryOperator", "forLoop", "forEachLoop", "ifStatements", 
			"elseStatements", "expr", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'int'", "'='", "'Str'", "'bool'", "'print'", 
			"'if'", "'{'", "'}'", "'else'", "'while'", "'?'", "':'", "'for'", "'in'", 
			"'range'", "','", "'true'", "'false'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'%'", "'/'", "'*'", "'+'", "'-'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "EQUAL", 
			"NOTEQUAL", "LESST", "GREATERT", "LESSTEQUAL", "GREATERTEQUAL", "MOD", 
			"DIVIDE", "MULTIPLY", "ADD", "SUBTRACT", "AND", "OR", "NOT", "ID", "NUM", 
			"Str", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				setState(35);
				match(T__0);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Relational_exprContext relational_expr() {
			return getRuleContext(Relational_exprContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeclarativeStatementContext declarativeStatement() {
			return getRuleContext(DeclarativeStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IdAssignmentStatementContext idAssignmentStatement() {
			return getRuleContext(IdAssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TernaryOperatorContext ternaryOperator() {
			return getRuleContext(TernaryOperatorContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForEachLoopContext forEachLoop() {
			return getRuleContext(ForEachLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				relational_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				condition(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				declarativeStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				idAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				printStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				conditionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				whileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(50);
				ternaryOperator();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(51);
				forLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(52);
				forEachLoop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_exprContext extends ParserRuleContext {
		public Relational_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expr; }
	 
		public Relational_exprContext() { }
		public void copyFrom(Relational_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends Relational_exprContext {
		public Token relationalOp;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(gmParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(gmParser.NOTEQUAL, 0); }
		public TerminalNode LESST() { return getToken(gmParser.LESST, 0); }
		public TerminalNode GREATERT() { return getToken(gmParser.GREATERT, 0); }
		public TerminalNode LESSTEQUAL() { return getToken(gmParser.LESSTEQUAL, 0); }
		public TerminalNode GREATERTEQUAL() { return getToken(gmParser.GREATERTEQUAL, 0); }
		public RelationalExpressionContext(Relational_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisRelationalExpressionContext extends Relational_exprContext {
		public Relational_exprContext relational_expr() {
			return getRuleContext(Relational_exprContext.class,0);
		}
		public ParenthesisRelationalExpressionContext(Relational_exprContext ctx) { copyFrom(ctx); }
	}

	public final Relational_exprContext relational_expr() throws RecognitionException {
		Relational_exprContext _localctx = new Relational_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relational_expr);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ParenthesisRelationalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__1);
				setState(56);
				relational_expr();
				setState(57);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new RelationalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				expr(0);
				setState(60);
				((RelationalExpressionContext)_localctx).relationalOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
					((RelationalExpressionContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionParentesisContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionParentesisContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNotContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(gmParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionNotContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionRelationalExpressionContext extends ConditionContext {
		public Relational_exprContext relational_expr() {
			return getRuleContext(Relational_exprContext.class,0);
		}
		public ConditionRelationalExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolIdOperationContext extends ConditionContext {
		public Token booleanOp;
		public List<TerminalNode> ID() { return getTokens(gmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gmParser.ID, i);
		}
		public TerminalNode AND() { return getToken(gmParser.AND, 0); }
		public TerminalNode OR() { return getToken(gmParser.OR, 0); }
		public TerminalNode NOT() { return getToken(gmParser.NOT, 0); }
		public BoolIdOperationContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolConditionContext extends ConditionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolConditionContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionConnectorContext extends ConditionContext {
		public Token booleanOp;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(gmParser.AND, 0); }
		public TerminalNode OR() { return getToken(gmParser.OR, 0); }
		public ConditionConnectorContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanNotIDContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(gmParser.NOT, 0); }
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public BooleanNotIDContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ConditionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(T__1);
				setState(67);
				condition(0);
				setState(68);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new ConditionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(NOT);
				setState(71);
				condition(6);
				}
				break;
			case 3:
				{
				_localctx = new ConditionRelationalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				relational_expr();
				}
				break;
			case 4:
				{
				_localctx = new BoolIdOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(ID);
				setState(74);
				((BoolIdOperationContext)_localctx).booleanOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
					((BoolIdOperationContext)_localctx).booleanOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new BooleanNotIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(NOT);
				setState(77);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new BoolConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionConnectorContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(81);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(82);
					((ConditionConnectorContext)_localctx).booleanOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((ConditionConnectorContext)_localctx).booleanOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(83);
					condition(6);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarativeStatementContext extends ParserRuleContext {
		public DeclarativeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarativeStatement; }
	 
		public DeclarativeStatementContext() { }
		public void copyFrom(DeclarativeStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends DeclarativeStatementContext {
		public Token dtype;
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public DeclarationStatementContext(DeclarativeStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolInitializationStatementContext extends DeclarativeStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoolInitializationStatementContext(DeclarativeStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntInitializationStatementContext extends DeclarativeStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public TerminalNode NUM() { return getToken(gmParser.NUM, 0); }
		public IntInitializationStatementContext(DeclarativeStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringInitializationStatementContext extends DeclarativeStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public TerminalNode Str() { return getToken(gmParser.Str, 0); }
		public StringInitializationStatementContext(DeclarativeStatementContext ctx) { copyFrom(ctx); }
	}

	public final DeclarativeStatementContext declarativeStatement() throws RecognitionException {
		DeclarativeStatementContext _localctx = new DeclarativeStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarativeStatement);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntInitializationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__3);
				setState(90);
				match(ID);
				setState(91);
				match(T__4);
				setState(92);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new StringInitializationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__5);
				setState(94);
				match(ID);
				setState(95);
				match(T__4);
				setState(96);
				match(Str);
				}
				break;
			case 3:
				_localctx = new BoolInitializationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(ID);
				setState(99);
				match(T__4);
				setState(100);
				condition(0);
				}
				break;
			case 4:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				((DeclarationStatementContext)_localctx).dtype = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 208L) != 0)) ) {
					((DeclarationStatementContext)_localctx).dtype = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	 
		public AssignmentStatementContext() { }
		public void copyFrom(AssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementOperationContext extends AssignmentStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public List<TerminalNode> ADD() { return getTokens(gmParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(gmParser.ADD, i);
		}
		public IncrementOperationContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends AssignmentStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatementContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrementOperationContext extends AssignmentStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public List<TerminalNode> SUBTRACT() { return getTokens(gmParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(gmParser.SUBTRACT, i);
		}
		public DecrementOperationContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryAssignContext extends AssignmentStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public TernaryOperatorContext ternaryOperator() {
			return getRuleContext(TernaryOperatorContext.class,0);
		}
		public TernaryAssignContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStatement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				setState(106);
				match(T__4);
				setState(107);
				expr(0);
				}
				break;
			case 2:
				_localctx = new IncrementOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				setState(109);
				match(ADD);
				setState(110);
				match(ADD);
				}
				break;
			case 3:
				_localctx = new DecrementOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(ID);
				setState(112);
				match(SUBTRACT);
				setState(113);
				match(SUBTRACT);
				}
				break;
			case 4:
				_localctx = new TernaryAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(ID);
				setState(115);
				match(T__4);
				setState(116);
				ternaryOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdAssignmentStatementContext extends ParserRuleContext {
		public IdAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAssignmentStatement; }
	 
		public IdAssignmentStatementContext() { }
		public void copyFrom(IdAssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntIDInitializationContext extends IdAssignmentStatementContext {
		public List<TerminalNode> ID() { return getTokens(gmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gmParser.ID, i);
		}
		public IntIDInitializationContext(IdAssignmentStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringIDInitializationContext extends IdAssignmentStatementContext {
		public List<TerminalNode> ID() { return getTokens(gmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gmParser.ID, i);
		}
		public StringIDInitializationContext(IdAssignmentStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolIDInitializationContext extends IdAssignmentStatementContext {
		public List<TerminalNode> ID() { return getTokens(gmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gmParser.ID, i);
		}
		public BoolIDInitializationContext(IdAssignmentStatementContext ctx) { copyFrom(ctx); }
	}

	public final IdAssignmentStatementContext idAssignmentStatement() throws RecognitionException {
		IdAssignmentStatementContext _localctx = new IdAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idAssignmentStatement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new IntIDInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__3);
				setState(120);
				match(ID);
				setState(121);
				match(T__4);
				setState(122);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new StringIDInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__5);
				setState(124);
				match(ID);
				setState(125);
				match(T__4);
				setState(126);
				match(ID);
				}
				break;
			case T__6:
				_localctx = new BoolIDInitializationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__6);
				setState(128);
				match(ID);
				setState(129);
				match(T__4);
				setState(130);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintIdentifierContext extends PrintStatementContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public PrintIdentifierContext(PrintStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpressionContext extends PrintStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExpressionContext(PrintStatementContext ctx) { copyFrom(ctx); }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStatement);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__7);
				setState(134);
				match(T__1);
				setState(135);
				match(ID);
				setState(136);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__7);
				setState(138);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionStatementContext extends ParserRuleContext {
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
	 
		public ConditionStatementContext() { }
		public void copyFrom(ConditionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfconditionContext extends ConditionStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<IfStatementsContext> ifStatements() {
			return getRuleContexts(IfStatementsContext.class);
		}
		public IfStatementsContext ifStatements(int i) {
			return getRuleContext(IfStatementsContext.class,i);
		}
		public List<ElseStatementsContext> elseStatements() {
			return getRuleContexts(ElseStatementsContext.class);
		}
		public ElseStatementsContext elseStatements(int i) {
			return getRuleContext(ElseStatementsContext.class,i);
		}
		public IfconditionContext(ConditionStatementContext ctx) { copyFrom(ctx); }
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionStatement);
		int _la;
		try {
			_localctx = new IfconditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(142);
			condition(0);
			setState(143);
			match(T__9);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				ifStatements();
				setState(145);
				match(T__0);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
			setState(151);
			match(T__10);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(152);
				match(T__11);
				setState(153);
				match(T__9);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					elseStatements();
					setState(155);
					match(T__0);
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
				setState(161);
				match(T__10);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends WhileStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(WhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__12);
			setState(169);
			condition(0);
			setState(170);
			match(T__9);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				statement();
				setState(172);
				match(T__0);
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
			setState(178);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryOperatorContext extends ParserRuleContext {
		public TernaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOperator; }
	 
		public TernaryOperatorContext() { }
		public void copyFrom(TernaryOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryContext extends TernaryOperatorContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TernaryContext(TernaryOperatorContext ctx) { copyFrom(ctx); }
	}

	public final TernaryOperatorContext ternaryOperator() throws RecognitionException {
		TernaryOperatorContext _localctx = new TernaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ternaryOperator);
		try {
			_localctx = new TernaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			condition(0);
			setState(181);
			match(T__13);
			setState(182);
			statement();
			setState(183);
			match(T__14);
			setState(184);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	 
		public ForLoopContext() { }
		public void copyFrom(ForLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TraditionalForLoopContext extends ForLoopContext {
		public Relational_exprContext relational_expr() {
			return getRuleContext(Relational_exprContext.class,0);
		}
		public List<AssignmentStatementContext> assignmentStatement() {
			return getRuleContexts(AssignmentStatementContext.class);
		}
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public DeclarativeStatementContext declarativeStatement() {
			return getRuleContext(DeclarativeStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TraditionalForLoopContext(ForLoopContext ctx) { copyFrom(ctx); }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forLoop);
		int _la;
		try {
			_localctx = new TraditionalForLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__15);
			setState(187);
			match(T__1);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__6:
				{
				setState(188);
				declarativeStatement();
				}
				break;
			case ID:
				{
				setState(189);
				assignmentStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			match(T__0);
			setState(193);
			relational_expr();
			setState(194);
			match(T__0);
			setState(195);
			assignmentStatement();
			setState(196);
			match(T__2);
			setState(197);
			match(T__9);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				statement();
				setState(199);
				match(T__0);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
			setState(205);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForEachLoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public List<TerminalNode> NUM() { return getTokens(gmParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gmParser.NUM, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForEachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachLoop; }
	}

	public final ForEachLoopContext forEachLoop() throws RecognitionException {
		ForEachLoopContext _localctx = new ForEachLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__15);
			setState(208);
			match(ID);
			setState(209);
			match(T__16);
			setState(210);
			match(T__17);
			setState(211);
			match(T__1);
			setState(212);
			match(NUM);
			setState(213);
			match(T__18);
			setState(214);
			match(NUM);
			setState(215);
			match(T__2);
			setState(216);
			match(T__9);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				statement();
				setState(218);
				match(T__0);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 240521389012L) != 0) );
			setState(224);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatements; }
	}

	public final IfStatementsContext ifStatements() throws RecognitionException {
		IfStatementsContext _localctx = new IfStatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatements; }
	}

	public final ElseStatementsContext elseStatements() throws RecognitionException {
		ElseStatementsContext _localctx = new ElseStatementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(gmParser.ID, 0); }
		public IdExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumExpressionContext extends ExprContext {
		public TerminalNode NUM() { return getToken(gmParser.NUM, 0); }
		public NumExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ExprContext {
		public Token operation;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(gmParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(gmParser.MULTIPLY, 0); }
		public TerminalNode MOD() { return getToken(gmParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(gmParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(gmParser.SUBTRACT, 0); }
		public ArithmeticExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ParentesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				match(T__1);
				setState(232);
				expr(0);
				setState(233);
				match(T__2);
				}
				break;
			case NUM:
				{
				_localctx = new NumExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240);
						((ArithmeticExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243);
						((ArithmeticExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((ArithmeticExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003"+
		"\f\u0003X\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0094\b\b\u000b\b\f"+
		"\b\u0095\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u009e"+
		"\b\b\u000b\b\f\b\u009f\u0001\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00af\b\t"+
		"\u000b\t\f\t\u00b0\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00bf\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00ca\b\u000b"+
		"\u000b\u000b\f\u000b\u00cb\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u00dd\b\f\u000b\f\f\f\u00de\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ee\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00f6\b\u000f\n\u000f\f\u000f\u00f9\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0000\u0002\u0006\u001e\u0011\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0007"+
		"\u0001\u0000\u0016\u001b\u0001\u0000!#\u0001\u0000!\"\u0002\u0000\u0004"+
		"\u0004\u0006\u0007\u0001\u0000\u001c\u001e\u0001\u0000\u001f \u0001\u0000"+
		"\u0014\u0015\u0112\u0000%\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000"+
		"\u0000\u0004?\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\b"+
		"g\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000"+
		"\u0000\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000"+
		"\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014\u00b4\u0001\u0000"+
		"\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000\u0018\u00cf\u0001\u0000"+
		"\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000\u001c\u00e4\u0001\u0000"+
		"\u0000\u0000\u001e\u00ed\u0001\u0000\u0000\u0000 \u00fa\u0001\u0000\u0000"+
		"\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0001\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%\"\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%"+
		"\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001\u0000"+
		"\u0000\u0000)6\u0003\u001e\u000f\u0000*6\u0003\u0004\u0002\u0000+6\u0003"+
		"\u0006\u0003\u0000,6\u0003\b\u0004\u0000-6\u0003\n\u0005\u0000.6\u0003"+
		"\f\u0006\u0000/6\u0003\u000e\u0007\u000006\u0003\u0010\b\u000016\u0003"+
		"\u0012\t\u000026\u0003\u0014\n\u000036\u0003\u0016\u000b\u000046\u0003"+
		"\u0018\f\u00005)\u0001\u0000\u0000\u00005*\u0001\u0000\u0000\u00005+\u0001"+
		"\u0000\u0000\u00005,\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u0000"+
		"5.\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u000050\u0001\u0000\u0000"+
		"\u000051\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u0000"+
		"78\u0005\u0002\u0000\u000089\u0003\u0004\u0002\u00009:\u0005\u0003\u0000"+
		"\u0000:@\u0001\u0000\u0000\u0000;<\u0003\u001e\u000f\u0000<=\u0007\u0000"+
		"\u0000\u0000=>\u0003\u001e\u000f\u0000>@\u0001\u0000\u0000\u0000?7\u0001"+
		"\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000"+
		"\u0000AB\u0006\u0003\uffff\uffff\u0000BC\u0005\u0002\u0000\u0000CD\u0003"+
		"\u0006\u0003\u0000DE\u0005\u0003\u0000\u0000EP\u0001\u0000\u0000\u0000"+
		"FG\u0005#\u0000\u0000GP\u0003\u0006\u0003\u0006HP\u0003\u0004\u0002\u0000"+
		"IJ\u0005$\u0000\u0000JK\u0007\u0001\u0000\u0000KP\u0005$\u0000\u0000L"+
		"M\u0005#\u0000\u0000MP\u0005$\u0000\u0000NP\u0003 \u0010\u0000OA\u0001"+
		"\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000"+
		"OI\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PV\u0001\u0000\u0000\u0000QR\n\u0005\u0000\u0000RS\u0007\u0002\u0000"+
		"\u0000SU\u0003\u0006\u0003\u0006TQ\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0007"+
		"\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0004\u0000"+
		"\u0000Z[\u0005$\u0000\u0000[\\\u0005\u0005\u0000\u0000\\h\u0005%\u0000"+
		"\u0000]^\u0005\u0006\u0000\u0000^_\u0005$\u0000\u0000_`\u0005\u0005\u0000"+
		"\u0000`h\u0005&\u0000\u0000ab\u0005\u0007\u0000\u0000bc\u0005$\u0000\u0000"+
		"cd\u0005\u0005\u0000\u0000dh\u0003\u0006\u0003\u0000ef\u0007\u0003\u0000"+
		"\u0000fh\u0005$\u0000\u0000gY\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000"+
		"\u0000ga\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000h\t\u0001\u0000"+
		"\u0000\u0000ij\u0005$\u0000\u0000jk\u0005\u0005\u0000\u0000kv\u0003\u001e"+
		"\u000f\u0000lm\u0005$\u0000\u0000mn\u0005\u001f\u0000\u0000nv\u0005\u001f"+
		"\u0000\u0000op\u0005$\u0000\u0000pq\u0005 \u0000\u0000qv\u0005 \u0000"+
		"\u0000rs\u0005$\u0000\u0000st\u0005\u0005\u0000\u0000tv\u0003\u0014\n"+
		"\u0000ui\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000uo\u0001\u0000"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000v\u000b\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0004\u0000\u0000xy\u0005$\u0000\u0000yz\u0005\u0005\u0000\u0000"+
		"z\u0084\u0005$\u0000\u0000{|\u0005\u0006\u0000\u0000|}\u0005$\u0000\u0000"+
		"}~\u0005\u0005\u0000\u0000~\u0084\u0005$\u0000\u0000\u007f\u0080\u0005"+
		"\u0007\u0000\u0000\u0080\u0081\u0005$\u0000\u0000\u0081\u0082\u0005\u0005"+
		"\u0000\u0000\u0082\u0084\u0005$\u0000\u0000\u0083w\u0001\u0000\u0000\u0000"+
		"\u0083{\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0084"+
		"\r\u0001\u0000\u0000\u0000\u0085\u0086\u0005\b\u0000\u0000\u0086\u0087"+
		"\u0005\u0002\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088\u008c\u0005"+
		"\u0003\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008c\u0003\u001e"+
		"\u000f\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0005\t\u0000"+
		"\u0000\u008e\u008f\u0003\u0006\u0003\u0000\u008f\u0093\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0003\u001a\r\u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u00a5\u0005\u000b\u0000\u0000\u0098\u0099\u0005\f\u0000\u0000\u0099\u009d"+
		"\u0005\n\u0000\u0000\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u009c\u0005"+
		"\u0001\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009a\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u000b\u0000\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u0098\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u00aa\u0003\u0006"+
		"\u0003\u0000\u00aa\u00ae\u0005\n\u0000\u0000\u00ab\u00ac\u0003\u0002\u0001"+
		"\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00af\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000"+
		"\u0000\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u0006\u0003"+
		"\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6\u00b7\u0003\u0002\u0001"+
		"\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0003\u0002\u0001"+
		"\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000"+
		"\u0000\u00bb\u00be\u0005\u0002\u0000\u0000\u00bc\u00bf\u0003\b\u0004\u0000"+
		"\u00bd\u00bf\u0003\n\u0005\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0001\u0000\u0000\u00c1\u00c2\u0003\u0004\u0002\u0000\u00c2"+
		"\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c4\u0003\n\u0005\u0000\u00c4\u00c5"+
		"\u0005\u0003\u0000\u0000\u00c5\u00c9\u0005\n\u0000\u0000\u00c6\u00c7\u0003"+
		"\u0002\u0001\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u000b\u0000\u0000\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0010\u0000\u0000\u00d0\u00d1\u0005$\u0000\u0000\u00d1\u00d2\u0005\u0011"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0012\u0000\u0000\u00d3\u00d4\u0005\u0002"+
		"\u0000\u0000\u00d4\u00d5\u0005%\u0000\u0000\u00d5\u00d6\u0005\u0013\u0000"+
		"\u0000\u00d6\u00d7\u0005%\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000"+
		"\u00d8\u00dc\u0005\n\u0000\u0000\u00d9\u00da\u0003\u0002\u0001\u0000\u00da"+
		"\u00db\u0005\u0001\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u000b\u0000\u0000\u00e1"+
		"\u0019\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0002\u0001\u0000\u00e3"+
		"\u001b\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0002\u0001\u0000\u00e5"+
		"\u001d\u0001\u0000\u0000\u0000\u00e6\u00e7\u0006\u000f\uffff\uffff\u0000"+
		"\u00e7\u00e8\u0005\u0002\u0000\u0000\u00e8\u00e9\u0003\u001e\u000f\u0000"+
		"\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00ee\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0005%\u0000\u0000\u00ec\u00ee\u0005$\u0000\u0000\u00ed\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f7\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\n\u0004\u0000\u0000\u00f0\u00f1\u0007\u0004\u0000\u0000\u00f1\u00f6\u0003"+
		"\u001e\u000f\u0005\u00f2\u00f3\n\u0003\u0000\u0000\u00f3\u00f4\u0007\u0005"+
		"\u0000\u0000\u00f4\u00f6\u0003\u001e\u000f\u0004\u00f5\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u001f\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0007\u0006\u0000\u0000\u00fb!\u0001\u0000\u0000"+
		"\u0000\u0013\'5?OVgu\u0083\u008b\u0095\u009f\u00a5\u00b0\u00be\u00cb\u00de"+
		"\u00ed\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}