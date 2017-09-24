// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, BOOLVALUE=2, DIGIT=3, LETTER=4, RELATEOPERATOR=5, PLUS=6, MINUS=7, 
		MULTIPLY=8, DIVIDE=9, MOD=10, LPAREN=11, RPAREN=12, FOR=13, IF=14, ELSE=15, 
		STARTBLOCK=16, ENDBLOCK=17, PRINT=18, AND=19, OR=20, EQUAL=21, SEMI=22, 
		BOOL=23, IN=24, STEP=25, TO=26, WHITESPACE=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"TYPE", "BOOLVALUE", "DIGIT", "LETTER", "RELATEOPERATOR", "PLUS", "MINUS", 
		"MULTIPLY", "DIVIDE", "MOD", "LPAREN", "RPAREN", "FOR", "IF", "ELSE", 
		"STARTBLOCK", "ENDBLOCK", "PRINT", "AND", "OR", "EQUAL", "SEMI", "BOOL", 
		"IN", "STEP", "TO", "WHITESPACE"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u0098\n\34\r\34"+
		"\16\34\u0099\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\35\3\2\5\5\2C\\aac|\4\2>>@@\5\2\13\f\16\17\"\"\u00a2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5F\3"+
		"\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3"+
		"\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35"+
		"i\3\2\2\2\37l\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'{\3\2\2\2)\177\3"+
		"\2\2\2+\u0082\3\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u008b\3\2\2\2\63"+
		"\u008e\3\2\2\2\65\u0093\3\2\2\2\67\u0097\3\2\2\29:\7k\2\2:;\7p\2\2;<\7"+
		"v\2\2<\4\3\2\2\2=>\7V\2\2>?\7t\2\2?@\7w\2\2@G\7g\2\2AB\7H\2\2BC\7c\2\2"+
		"CD\7n\2\2DE\7u\2\2EG\7g\2\2F=\3\2\2\2FA\3\2\2\2G\6\3\2\2\2HI\4\62;\2I"+
		"\b\3\2\2\2JK\t\2\2\2K\n\3\2\2\2LM\7?\2\2MV\7?\2\2NO\7#\2\2OV\7?\2\2PQ"+
		"\7>\2\2QV\7?\2\2RS\7@\2\2SV\7?\2\2TV\t\3\2\2UL\3\2\2\2UN\3\2\2\2UP\3\2"+
		"\2\2UR\3\2\2\2UT\3\2\2\2V\f\3\2\2\2WX\7-\2\2X\16\3\2\2\2YZ\7/\2\2Z\20"+
		"\3\2\2\2[\\\7,\2\2\\\22\3\2\2\2]^\7\61\2\2^\24\3\2\2\2_`\7\'\2\2`\26\3"+
		"\2\2\2ab\7*\2\2b\30\3\2\2\2cd\7+\2\2d\32\3\2\2\2ef\7h\2\2fg\7q\2\2gh\7"+
		"t\2\2h\34\3\2\2\2ij\7k\2\2jk\7h\2\2k\36\3\2\2\2lm\7g\2\2mn\7n\2\2no\7"+
		"u\2\2op\7g\2\2p \3\2\2\2qr\7}\2\2r\"\3\2\2\2st\7\177\2\2t$\3\2\2\2uv\7"+
		"r\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z&\3\2\2\2{|\7c\2\2|}\7p\2\2"+
		"}~\7f\2\2~(\3\2\2\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081*\3\2\2\2"+
		"\u0082\u0083\7?\2\2\u0083,\3\2\2\2\u0084\u0085\7=\2\2\u0085.\3\2\2\2\u0086"+
		"\u0087\7d\2\2\u0087\u0088\7q\2\2\u0088\u0089\7q\2\2\u0089\u008a\7n\2\2"+
		"\u008a\60\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\62\3\2\2"+
		"\2\u008e\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7r\2\2\u0092\64\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095\66"+
		"\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\34"+
		"\2\2\u009c8\3\2\2\2\6\2FU\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}