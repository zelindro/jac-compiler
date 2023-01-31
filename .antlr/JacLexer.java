// Generated from \\wsl.localhost\Ubuntu-20.04\home\zelindro\workspace\jac-compiler\Jac.g4 by ANTLR 4.9.2

from antlr_denter.DenterHelper import DenterHelper
from JacParser import JacParser

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JacLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, BREAK=4, CONTINUE=5, PRINT=6, READINT=7, READSTR=8, 
		DEF=9, INT=10, RETURN=11, PLUS=12, MINUS=13, TIMES=14, OVER=15, REM=16, 
		OP_PAR=17, CL_PAR=18, ATTRIB=19, COLON=20, COMMA=21, EQ=22, NE=23, GT=24, 
		GE=25, LT=26, LE=27, NAME=28, NUMBER=29, STRING=30, COMMENT=31, NL=32, 
		SPACE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", "READSTR", 
			"DEF", "INT", "RETURN", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COLON", "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", 
			"NAME", "NUMBER", "STRING", "COMMENT", "NL", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'break'", "'continue'", "'print'", 
			"'readint'", "'readstr'", "'def'", "'int'", "'return'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'='", "':'", "','", "'=='", "'!='", 
			"'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", 
			"READSTR", "DEF", "INT", "RETURN", "PLUS", "MINUS", "TIMES", "OVER", 
			"REM", "OP_PAR", "CL_PAR", "ATTRIB", "COLON", "COMMA", "EQ", "NE", "GT", 
			"GE", "LT", "LE", "NAME", "NUMBER", "STRING", "COMMENT", "NL", "SPACE"
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


	class JacDenter(DenterHelper):
	    def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
	        super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
	        self.lexer: JacLexer = lexer
	    def pull_token(self):
	        return super(JacLexer, self.lexer).nextToken()
	denter = None
	def nextToken(self):
	    if not self.denter:
	        self.denter = self.JacDenter(self, self.NL, JacParser.INDENT, JacParser.DEDENT, False)
	    return self.denter.next_token()


	public JacLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jac.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00ad\n\35\r\35\16\35"+
		"\u00ae\3\36\6\36\u00b2\n\36\r\36\16\36\u00b3\3\37\3\37\7\37\u00b8\n\37"+
		"\f\37\16\37\u00bb\13\37\3\37\3\37\3 \3 \7 \u00c1\n \f \16 \u00c4\13 \3"+
		" \3 \3!\5!\u00c9\n!\3!\3!\7!\u00cd\n!\f!\16!\u00d0\13!\3\"\6\"\u00d3\n"+
		"\"\r\"\16\"\u00d4\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\5\3\2$$\3\2\f\f\4\2\13\13\""+
		"\"\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5H\3\2\2\2\7M\3\2\2\2\tS\3\2\2\2\13Y\3\2\2\2\rb\3\2\2\2\17h\3\2\2\2\21"+
		"p\3\2\2\2\23x\3\2\2\2\25|\3\2\2\2\27\u0080\3\2\2\2\31\u0087\3\2\2\2\33"+
		"\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0091"+
		"\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099\3\2\2\2"+
		"-\u009b\3\2\2\2/\u009e\3\2\2\2\61\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65\u00a6"+
		"\3\2\2\2\67\u00a8\3\2\2\29\u00ac\3\2\2\2;\u00b1\3\2\2\2=\u00b5\3\2\2\2"+
		"?\u00be\3\2\2\2A\u00c8\3\2\2\2C\u00d2\3\2\2\2EF\7k\2\2FG\7h\2\2G\4\3\2"+
		"\2\2HI\7g\2\2IJ\7n\2\2JK\7u\2\2KL\7g\2\2L\6\3\2\2\2MN\7y\2\2NO\7j\2\2"+
		"OP\7k\2\2PQ\7n\2\2QR\7g\2\2R\b\3\2\2\2ST\7d\2\2TU\7t\2\2UV\7g\2\2VW\7"+
		"c\2\2WX\7m\2\2X\n\3\2\2\2YZ\7e\2\2Z[\7q\2\2[\\\7p\2\2\\]\7v\2\2]^\7k\2"+
		"\2^_\7p\2\2_`\7w\2\2`a\7g\2\2a\f\3\2\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef"+
		"\7p\2\2fg\7v\2\2g\16\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7f\2\2lm\7k"+
		"\2\2mn\7p\2\2no\7v\2\2o\20\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7c\2\2st\7f\2\2"+
		"tu\7u\2\2uv\7v\2\2vw\7t\2\2w\22\3\2\2\2xy\7f\2\2yz\7g\2\2z{\7h\2\2{\24"+
		"\3\2\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\26\3\2\2\2\u0080\u0081\7t\2"+
		"\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7p\2\2\u0086\30\3\2\2\2\u0087\u0088\7-\2\2\u0088\32"+
		"\3\2\2\2\u0089\u008a\7/\2\2\u008a\34\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\36\3\2\2\2\u008d\u008e\7\61\2\2\u008e \3\2\2\2\u008f\u0090\7\'\2\2\u0090"+
		"\"\3\2\2\2\u0091\u0092\7*\2\2\u0092$\3\2\2\2\u0093\u0094\7+\2\2\u0094"+
		"&\3\2\2\2\u0095\u0096\7?\2\2\u0096(\3\2\2\2\u0097\u0098\7<\2\2\u0098*"+
		"\3\2\2\2\u0099\u009a\7.\2\2\u009a,\3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d"+
		"\7?\2\2\u009d.\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7?\2\2\u00a0\60"+
		"\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\66\3\2\2\2\u00a8"+
		"\u00a9\7>\2\2\u00a9\u00aa\7?\2\2\u00aa8\3\2\2\2\u00ab\u00ad\4c|\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af:\3\2\2\2\u00b0\u00b2\4\62;\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4<\3\2\2\2\u00b5"+
		"\u00b9\7$\2\2\u00b6\u00b8\n\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd>\3\2\2\2\u00be\u00c2\7%\2\2\u00bf"+
		"\u00c1\n\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\b \2\2\u00c6@\3\2\2\2\u00c7\u00c9\7\17\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\7\f\2\2\u00cb\u00cd"+
		"\7\"\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cfB\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\t\4\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\"\2\2\u00d7D\3\2\2\2\n\2\u00ae"+
		"\u00b3\u00b9\u00c2\u00c8\u00ce\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}