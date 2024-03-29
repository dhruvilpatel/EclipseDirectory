// Generated from Drink.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrinkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, OF=2, DRINKING_VESSEL=3, TEXT=4, WHITESPACE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'"
	};
	public static final String[] ruleNames = {
		"ARTICLE", "OF", "DRINKING_VESSEL", "TEXT", "WHITESPACE"
	};


	public DrinkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Drink.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\79\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4,\n\4\3\5\6\5/\n\5\r\5\16\5\60\3\6\6\6\64\n\6\r\6\16"+
		"\6\65\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\3\5\2\13\f\16\17\"\"@\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\23\3\2\2\2"+
		"\5\25\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\63\3\2\2\2\r\16\7v\2\2\16\17\7"+
		"j\2\2\17\24\7g\2\2\20\21\7c\2\2\21\24\7p\2\2\22\24\7c\2\2\23\r\3\2\2\2"+
		"\23\20\3\2\2\2\23\22\3\2\2\2\24\4\3\2\2\2\25\26\7q\2\2\26\27\7h\2\2\27"+
		"\6\3\2\2\2\30\31\7e\2\2\31\32\7w\2\2\32,\7r\2\2\33\34\7r\2\2\34\35\7k"+
		"\2\2\35\36\7p\2\2\36,\7v\2\2\37 \7u\2\2 !\7j\2\2!\"\7q\2\2\",\7v\2\2#"+
		"$\7o\2\2$%\7w\2\2%,\7i\2\2&\'\7i\2\2\'(\7n\2\2()\7c\2\2)*\7u\2\2*,\7u"+
		"\2\2+\30\3\2\2\2+\33\3\2\2\2+\37\3\2\2\2+#\3\2\2\2+&\3\2\2\2,\b\3\2\2"+
		"\2-/\4c|\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\n\3\2\2"+
		"\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\b\6\2\28\f\3\2\2\2\7\2\23+\60\65\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}