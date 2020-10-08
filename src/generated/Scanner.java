// Generated from C:/Users/Baxi/Desktop/compi_semana5\Scanner.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMMA=1, TWO_P=2, L_PARENT=3, R_PARENT=4, VIR=5, ASSING=6, SUM=7, SUB=8, 
		MUL=9, DIV=10, NOT_EQUAL=11, GT=12, LT=13, LE=14, GE=15, EQUAL=16, IF=17, 
		THEN=18, ELSE=19, WHILE=20, DO=21, LET=22, IN=23, BEGIN=24, END=25, CONST=26, 
		VAR=27, IDENT=28, LITERAL=29, WS=30, BLOCK_COMMENT=31, COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMMA", "TWO_P", "L_PARENT", "R_PARENT", "VIR", "ASSING", "SUM", "SUB", 
			"MUL", "DIV", "NOT_EQUAL", "GT", "LT", "LE", "GE", "EQUAL", "IF", "THEN", 
			"ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", "CONST", "VAR", "ZERO", 
			"IDENT", "LITERAL", "LETTER", "DIGIT", "WS", "BLOCK_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'('", "')'", "'~'", "':='", "'+'", "'-'", "'*'", 
			"'/'", "'/='", "'>'", "'<'", "'<='", "'>='", "'=='", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'let'", "'in'", "'begin'", "'end'", "'const'", 
			"'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMMA", "TWO_P", "L_PARENT", "R_PARENT", "VIR", "ASSING", "SUM", 
			"SUB", "MUL", "DIV", "NOT_EQUAL", "GT", "LT", "LE", "GE", "EQUAL", "IF", 
			"THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", "CONST", 
			"VAR", "IDENT", "LITERAL", "WS", "BLOCK_COMMENT", "COMMENT"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u00a5\n\36\f\36\16\36\u00a8\13"+
		"\36\3\37\3\37\7\37\u00ac\n\37\f\37\16\37\u00af\13\37\3 \3 \3!\3!\3\"\6"+
		"\"\u00b6\n\"\r\"\16\"\u00b7\3\"\3\"\3#\3#\3#\3#\7#\u00c0\n#\f#\16#\u00c3"+
		"\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00ce\n$\f$\16$\u00d1\13$\3$\5$\u00d4"+
		"\n$\3$\3$\3$\3$\3\u00c1\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\2;\36=\37?\2A\2C E!G\"\3\2\7\3\2\62\62\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00dc\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2"+
		"\2\2\rS\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27^\3"+
		"\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37h\3\2\2\2!k\3\2\2\2#n\3\2"+
		"\2\2%q\3\2\2\2\'v\3\2\2\2){\3\2\2\2+\u0081\3\2\2\2-\u0084\3\2\2\2/\u0088"+
		"\3\2\2\2\61\u008b\3\2\2\2\63\u0091\3\2\2\2\65\u0095\3\2\2\2\67\u009b\3"+
		"\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2\2=\u00a9\3\2\2\2?\u00b0\3\2\2\2A\u00b2"+
		"\3\2\2\2C\u00b5\3\2\2\2E\u00bb\3\2\2\2G\u00c9\3\2\2\2IJ\7=\2\2J\4\3\2"+
		"\2\2KL\7<\2\2L\6\3\2\2\2MN\7*\2\2N\b\3\2\2\2OP\7+\2\2P\n\3\2\2\2QR\7\u0080"+
		"\2\2R\f\3\2\2\2ST\7<\2\2TU\7?\2\2U\16\3\2\2\2VW\7-\2\2W\20\3\2\2\2XY\7"+
		"/\2\2Y\22\3\2\2\2Z[\7,\2\2[\24\3\2\2\2\\]\7\61\2\2]\26\3\2\2\2^_\7\61"+
		"\2\2_`\7?\2\2`\30\3\2\2\2ab\7@\2\2b\32\3\2\2\2cd\7>\2\2d\34\3\2\2\2ef"+
		"\7>\2\2fg\7?\2\2g\36\3\2\2\2hi\7@\2\2ij\7?\2\2j \3\2\2\2kl\7?\2\2lm\7"+
		"?\2\2m\"\3\2\2\2no\7k\2\2op\7h\2\2p$\3\2\2\2qr\7v\2\2rs\7j\2\2st\7g\2"+
		"\2tu\7p\2\2u&\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z(\3\2\2\2{|"+
		"\7y\2\2|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080*\3\2\2\2"+
		"\u0081\u0082\7f\2\2\u0082\u0083\7q\2\2\u0083,\3\2\2\2\u0084\u0085\7n\2"+
		"\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087.\3\2\2\2\u0088\u0089\7"+
		"k\2\2\u0089\u008a\7p\2\2\u008a\60\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090"+
		"\62\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094"+
		"\64\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\66\3\2\2\2\u009b\u009c\7x\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7t\2\2\u009e8\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0"+
		":\3\2\2\2\u00a1\u00a6\5? \2\u00a2\u00a5\5? \2\u00a3\u00a5\5A!\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7<\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ad"+
		"\5A!\2\u00aa\u00ac\5A!\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae>\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b1\t\3\2\2\u00b1@\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3B\3\2\2\2"+
		"\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\"\2\2\u00ba"+
		"D\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c1\3\2\2\2"+
		"\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\7,\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b#"+
		"\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cf"+
		"\3\2\2\2\u00cc\u00ce\n\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b$"+
		"\2\2\u00d8H\3\2\2\2\n\2\u00a4\u00a6\u00ad\u00b7\u00c1\u00cf\u00d3\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}