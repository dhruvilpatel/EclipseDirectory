// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, BOOLVALUE=2, DIGIT=3, LETTER=4, RELATEOPERATOR=5, PLUS=6, MINUS=7, 
		MULTIPLY=8, DIVIDE=9, MOD=10, LPAREN=11, RPAREN=12, FOR=13, IF=14, ELSE=15, 
		STARTBLOCK=16, ENDBLOCK=17, PRINT=18, AND=19, OR=20, EQUAL=21, SEMI=22, 
		BOOL=23, IN=24, STEP=25, TO=26, WHITESPACE=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'int'", "BOOLVALUE", "DIGIT", "LETTER", "RELATEOPERATOR", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'for'", "'if'", "'else'", 
		"'{'", "'}'", "'print'", "'and'", "'or'", "'='", "';'", "'bool'", "'in'", 
		"'step'", "'to'", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_statement1 = 3, 
		RULE_statement2 = 4, RULE_declaration = 5, RULE_assignment = 6, RULE_print = 7, 
		RULE_loop = 8, RULE_control = 9, RULE_booleanExpression = 10, RULE_expression = 11, 
		RULE_term = 12, RULE_factor = 13, RULE_number = 14, RULE_identifier = 15, 
		RULE_temp = 16;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "statement1", "statement2", "declaration", 
		"assignment", "print", "loop", "control", "booleanExpression", "expression", 
		"term", "factor", "number", "identifier", "temp"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); statementList();
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); statement();
				setState(37); statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); statement();
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

	public static class StatementContext extends ParserRuleContext {
		public Statement2Context statement2() {
			return getRuleContext(Statement2Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public Statement1Context statement1() {
			return getRuleContext(Statement1Context.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case TYPE:
			case LETTER:
			case PRINT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); statement1();
				setState(43); match(SEMI);
				}
				break;
			case FOR:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); statement2();
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

	public static class Statement1Context extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement1(this);
		}
	}

	public final Statement1Context statement1() throws RecognitionException {
		Statement1Context _localctx = new Statement1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement1);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); declaration();
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

	public static class Statement2Context extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public Statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement2(this);
		}
	}

	public final Statement2Context statement2() throws RecognitionException {
		Statement2Context _localctx = new Statement2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement2);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); control();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(HelloParser.TYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(TYPE);
				setState(58); identifier();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(BOOL);
				setState(60); identifier();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVALUE() { return getToken(HelloParser.BOOLVALUE, 0); }
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(HelloParser.TYPE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(TYPE);
				setState(64); identifier();
				setState(65); match(EQUAL);
				setState(66); expression();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); identifier();
				setState(69); match(EQUAL);
				setState(70); expression();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(BOOL);
				setState(73); identifier();
				setState(74); match(EQUAL);
				setState(75); match(BOOLVALUE);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(PRINT);
			setState(80); match(LPAREN);
			setState(81); expression();
			setState(82); match(RPAREN);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode STARTBLOCK() { return getToken(HelloParser.STARTBLOCK, 0); }
		public TerminalNode STEP() { return getToken(HelloParser.STEP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode IN() { return getToken(HelloParser.IN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(HelloParser.FOR, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public TerminalNode ENDBLOCK() { return getToken(HelloParser.ENDBLOCK, 0); }
		public TerminalNode TO() { return getToken(HelloParser.TO, 0); }
		public TerminalNode TYPE() { return getToken(HelloParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(FOR);
				setState(85); match(LPAREN);
				setState(86); match(TYPE);
				setState(87); identifier();
				setState(88); match(IN);
				setState(89); expression();
				setState(90); match(TO);
				setState(91); expression();
				setState(92); match(RPAREN);
				setState(93); match(STARTBLOCK);
				setState(94); statementList();
				setState(95); match(ENDBLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(FOR);
				setState(98); match(LPAREN);
				setState(99); match(TYPE);
				setState(100); identifier();
				setState(101); match(IN);
				setState(102); expression();
				setState(103); match(TO);
				setState(104); expression();
				setState(105); match(STEP);
				setState(106); expression();
				setState(107); match(RPAREN);
				setState(108); match(STARTBLOCK);
				setState(109); statementList();
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

	public static class ControlContext extends ParserRuleContext {
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public List<TerminalNode> STARTBLOCK() { return getTokens(HelloParser.STARTBLOCK); }
		public TerminalNode STARTBLOCK(int i) {
			return getToken(HelloParser.STARTBLOCK, i);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<TerminalNode> ENDBLOCK() { return getTokens(HelloParser.ENDBLOCK); }
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode ENDBLOCK(int i) {
			return getToken(HelloParser.ENDBLOCK, i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitControl(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_control);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(IF);
				setState(114); match(LPAREN);
				setState(115); booleanExpression(0);
				setState(116); match(RPAREN);
				setState(117); match(STARTBLOCK);
				setState(118); statementList();
				setState(119); match(ENDBLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(IF);
				setState(122); match(LPAREN);
				setState(123); booleanExpression(0);
				setState(124); match(RPAREN);
				setState(125); match(STARTBLOCK);
				setState(126); statementList();
				setState(127); match(ENDBLOCK);
				setState(128); match(ELSE);
				setState(129); match(STARTBLOCK);
				setState(130); statementList();
				setState(131); match(ENDBLOCK);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode BOOLVALUE() { return getToken(HelloParser.BOOLVALUE, 0); }
		public TerminalNode RELATEOPERATOR() { return getToken(HelloParser.RELATEOPERATOR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			switch (_input.LA(1)) {
			case DIGIT:
			case LETTER:
			case LPAREN:
				{
				setState(136); expression();
				setState(137); match(RELATEOPERATOR);
				setState(138); expression();
				}
				break;
			case BOOLVALUE:
				{
				setState(140); match(BOOLVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144); match(AND);
						setState(145); booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147); match(OR);
						setState(148); booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); term();
				setState(155); match(PLUS);
				setState(156); expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); term();
				setState(159); match(MINUS);
				setState(160); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(HelloParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(HelloParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); factor();
				setState(166); match(MULTIPLY);
				setState(167); term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); factor();
				setState(170); match(DIVIDE);
				setState(171); term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); factor();
				setState(174); match(MOD);
				setState(175); term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177); factor();
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

	public static class FactorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(LPAREN);
				setState(181); expression();
				setState(182); match(RPAREN);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); number();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); identifier();
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(HelloParser.DIGIT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(DIGIT);
				setState(189); number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(DIGIT);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(HelloParser.LETTER, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(LETTER);
				setState(194); temp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(LETTER);
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

	public static class TempContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(HelloParser.LETTER, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(HelloParser.DIGIT, 0); }
		public TempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTemp(this);
		}
	}

	public final TempContext temp() throws RecognitionException {
		TempContext _localctx = new TempContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_temp);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(LETTER);
				setState(199); temp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(DIGIT);
				setState(201); temp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); match(LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); match(DIGIT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\5\5\66\n\5\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0098\n\f\f\f\16\f\u009b\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\5\20\u00c2\n\20\3\21\3\21\3\21\5"+
		"\21\u00c7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cf\n\22\3\22\2\3"+
		"\26\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u00d8\2$\3\2\2\2"+
		"\4*\3\2\2\2\6\60\3\2\2\2\b\65\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16O\3\2\2"+
		"\2\20Q\3\2\2\2\22q\3\2\2\2\24\u0087\3\2\2\2\26\u008f\3\2\2\2\30\u00a5"+
		"\3\2\2\2\32\u00b4\3\2\2\2\34\u00bc\3\2\2\2\36\u00c1\3\2\2\2 \u00c6\3\2"+
		"\2\2\"\u00ce\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&\'\5\6\4\2\'(\5\4\3\2(+\3\2"+
		"\2\2)+\5\6\4\2*&\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\5\b\5\2-.\7\30\2\2.\61"+
		"\3\2\2\2/\61\5\n\6\2\60,\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\66\5\16\b"+
		"\2\63\66\5\20\t\2\64\66\5\f\7\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2"+
		"\2\2\66\t\3\2\2\2\67:\5\22\n\28:\5\24\13\29\67\3\2\2\298\3\2\2\2:\13\3"+
		"\2\2\2;<\7\3\2\2<@\5 \21\2=>\7\31\2\2>@\5 \21\2?;\3\2\2\2?=\3\2\2\2@\r"+
		"\3\2\2\2AB\7\3\2\2BC\5 \21\2CD\7\27\2\2DE\5\30\r\2EP\3\2\2\2FG\5 \21\2"+
		"GH\7\27\2\2HI\5\30\r\2IP\3\2\2\2JK\7\31\2\2KL\5 \21\2LM\7\27\2\2MN\7\4"+
		"\2\2NP\3\2\2\2OA\3\2\2\2OF\3\2\2\2OJ\3\2\2\2P\17\3\2\2\2QR\7\24\2\2RS"+
		"\7\r\2\2ST\5\30\r\2TU\7\16\2\2U\21\3\2\2\2VW\7\17\2\2WX\7\r\2\2XY\7\3"+
		"\2\2YZ\5 \21\2Z[\7\32\2\2[\\\5\30\r\2\\]\7\34\2\2]^\5\30\r\2^_\7\16\2"+
		"\2_`\7\22\2\2`a\5\4\3\2ab\7\23\2\2br\3\2\2\2cd\7\17\2\2de\7\r\2\2ef\7"+
		"\3\2\2fg\5 \21\2gh\7\32\2\2hi\5\30\r\2ij\7\34\2\2jk\5\30\r\2kl\7\33\2"+
		"\2lm\5\30\r\2mn\7\16\2\2no\7\22\2\2op\5\4\3\2pr\3\2\2\2qV\3\2\2\2qc\3"+
		"\2\2\2r\23\3\2\2\2st\7\20\2\2tu\7\r\2\2uv\5\26\f\2vw\7\16\2\2wx\7\22\2"+
		"\2xy\5\4\3\2yz\7\23\2\2z\u0088\3\2\2\2{|\7\20\2\2|}\7\r\2\2}~\5\26\f\2"+
		"~\177\7\16\2\2\177\u0080\7\22\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7\23"+
		"\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\4\3\2\u0085"+
		"\u0086\7\23\2\2\u0086\u0088\3\2\2\2\u0087s\3\2\2\2\u0087{\3\2\2\2\u0088"+
		"\25\3\2\2\2\u0089\u008a\b\f\1\2\u008a\u008b\5\30\r\2\u008b\u008c\7\7\2"+
		"\2\u008c\u008d\5\30\r\2\u008d\u0090\3\2\2\2\u008e\u0090\7\4\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0099\3\2\2\2\u0091\u0092\f\5"+
		"\2\2\u0092\u0093\7\25\2\2\u0093\u0098\5\26\f\6\u0094\u0095\f\4\2\2\u0095"+
		"\u0096\7\26\2\2\u0096\u0098\5\26\f\5\u0097\u0091\3\2\2\2\u0097\u0094\3"+
		"\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\27\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7\b"+
		"\2\2\u009e\u009f\5\30\r\2\u009f\u00a6\3\2\2\2\u00a0\u00a1\5\32\16\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\5"+
		"\32\16\2\u00a5\u009c\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\31\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5\32"+
		"\16\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\13\2\2\u00ad"+
		"\u00ae\5\32\16\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1"+
		"\7\f\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\5\34\17"+
		"\2\u00b4\u00a7\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\5\30\r\2\u00b8"+
		"\u00b9\7\16\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bd\5\36\20\2\u00bb\u00bd"+
		"\5 \21\2\u00bc\u00b6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\35\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\u00c2\5\36\20\2\u00c0\u00c2\7\5"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\37\3\2\2\2\u00c3\u00c4"+
		"\7\6\2\2\u00c4\u00c7\5\"\22\2\u00c5\u00c7\7\6\2\2\u00c6\u00c3\3\2\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00cf\5"+
		"\"\22\2\u00ca\u00cb\7\5\2\2\u00cb\u00cf\5\"\22\2\u00cc\u00cf\7\6\2\2\u00cd"+
		"\u00cf\7\5\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf#\3\2\2\2\23*\60\659?Oq\u0087\u008f\u0097"+
		"\u0099\u00a5\u00b4\u00bc\u00c1\u00c6\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}