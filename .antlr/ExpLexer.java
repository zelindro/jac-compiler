// Generated from \\wsl.localhost\Ubuntu-20.04\home\zelindro\workspace\jac-compiler\Exp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, EQ=14, NE=15, GT=16, 
		GE=17, LT=18, LE=19, CONTINUE=20, BREAK=21, OP_BRA=22, CL_BRA=23, DOT=24, 
		PRINT=25, READ_INT=26, READ_STR=27, IF=28, ELSE=29, WHILE=30, PUSH=31, 
		LENGTH=32, DEF=33, RETURN=34, INT=35, NUMBER=36, STRING=37, NAME=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "CONTINUE", "BREAK", "OP_BRA", "CL_BRA", "DOT", "PRINT", 
			"READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "PUSH", "LENGTH", "DEF", 
			"RETURN", "INT", "NUMBER", "STRING", "NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'continue'", 
			"'break'", "'['", "']'", "'.'", "'print'", "'read_int'", "'read_str'", 
			"'if'", "'else'", "'while'", "'push'", "'length'", "'def'", "'return'", 
			"'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "CONTINUE", "BREAK", "OP_BRA", "CL_BRA", "DOT", "PRINT", 
			"READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "PUSH", "LENGTH", "DEF", 
			"RETURN", "INT", "NUMBER", "STRING", "NAME"
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


	public ExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\2\3\2\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\6%\u00dd\n%\r%\16%\u00de\3"+
		"&\3&\7&\u00e3\n&\f&\16&\u00e6\13&\3&\3&\3\'\6\'\u00eb\n\'\r\'\16\'\u00ec"+
		"\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\5\3\2\f\f\5\2\13\f\17\17\"\"\3\2$$\2\u00f2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\t"+
		"a\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25"+
		"m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2"+
		"!{\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'\u0082\3\2\2\2)\u0085\3\2\2\2+\u008e"+
		"\3\2\2\2-\u0094\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2"+
		"\2\65\u00a0\3\2\2\2\67\u00a9\3\2\2\29\u00b2\3\2\2\2;\u00b5\3\2\2\2=\u00ba"+
		"\3\2\2\2?\u00c0\3\2\2\2A\u00c5\3\2\2\2C\u00cc\3\2\2\2E\u00d0\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00dc\3\2\2\2K\u00e0\3\2\2\2M\u00ea\3\2\2\2OS\7%\2\2P"+
		"R\n\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2"+
		"VW\b\2\2\2W\4\3\2\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]^\b\3\2\2^\6\3\2\2\2_`\7-\2\2`\b\3\2\2\2ab\7/\2\2b\n\3\2"+
		"\2\2cd\7,\2\2d\f\3\2\2\2ef\7\61\2\2f\16\3\2\2\2gh\7\'\2\2h\20\3\2\2\2"+
		"ij\7*\2\2j\22\3\2\2\2kl\7+\2\2l\24\3\2\2\2mn\7?\2\2n\26\3\2\2\2op\7.\2"+
		"\2p\30\3\2\2\2qr\7}\2\2r\32\3\2\2\2st\7\177\2\2t\34\3\2\2\2uv\7?\2\2v"+
		"w\7?\2\2w\36\3\2\2\2xy\7#\2\2yz\7?\2\2z \3\2\2\2{|\7@\2\2|\"\3\2\2\2}"+
		"~\7@\2\2~\177\7?\2\2\177$\3\2\2\2\u0080\u0081\7>\2\2\u0081&\3\2\2\2\u0082"+
		"\u0083\7>\2\2\u0083\u0084\7?\2\2\u0084(\3\2\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2"+
		"\u008a\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d*\3\2\2"+
		"\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7m\2\2\u0093,\3\2\2\2\u0094\u0095\7]\2\2\u0095.\3"+
		"\2\2\2\u0096\u0097\7_\2\2\u0097\60\3\2\2\2\u0098\u0099\7\60\2\2\u0099"+
		"\62\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7a\2\2"+
		"\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\66\3\2"+
		"\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad"+
		"\7f\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b18\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf>\3\2\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7j\2\2"+
		"\u00c4@\3\2\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2"+
		"\2\u00c8\u00c9\7i\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7j\2\2\u00cbB\3\2"+
		"\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7h\2\2\u00cfD\3"+
		"\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7p\2\2\u00d6F\3\2\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00daH\3\2\2\2\u00db"+
		"\u00dd\4\62;\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00dfJ\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1\u00e3"+
		"\n\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$"+
		"\2\2\u00e8L\3\2\2\2\u00e9\u00eb\4c|\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00edN\3\2\2\2\b\2S["+
		"\u00de\u00e4\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}