# Generated from Jac.g4 by ANTLR 4.9.3
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


from antlr_denter.DenterHelper import DenterHelper
from JacParser import JacParser



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 ")
        buf.write("\u00c2\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t")
        buf.write("\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17")
        buf.write("\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24")
        buf.write("\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31")
        buf.write("\3\31\3\31\3\32\6\32\u0097\n\32\r\32\16\32\u0098\3\33")
        buf.write("\6\33\u009c\n\33\r\33\16\33\u009d\3\34\3\34\7\34\u00a2")
        buf.write("\n\34\f\34\16\34\u00a5\13\34\3\34\3\34\3\35\3\35\7\35")
        buf.write("\u00ab\n\35\f\35\16\35\u00ae\13\35\3\35\3\35\3\36\5\36")
        buf.write("\u00b3\n\36\3\36\3\36\7\36\u00b7\n\36\f\36\16\36\u00ba")
        buf.write("\13\36\3\37\6\37\u00bd\n\37\r\37\16\37\u00be\3\37\3\37")
        buf.write("\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27")
        buf.write("\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30")
        buf.write("/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5\3\2$$\3\2")
        buf.write("\f\f\4\2\13\13\"\"\2\u00c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7")
        buf.write("\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2")
        buf.write("\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2")
        buf.write("\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2")
        buf.write("\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2")
        buf.write("\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63")
        buf.write("\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2")
        buf.write("\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7H\3\2\2\2\tN\3\2")
        buf.write("\2\2\13W\3\2\2\2\r]\3\2\2\2\17e\3\2\2\2\21m\3\2\2\2\23")
        buf.write("q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33y\3\2")
        buf.write("\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2")
        buf.write("\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2+\u008b")
        buf.write("\3\2\2\2-\u008d\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2")
        buf.write("\2\63\u0096\3\2\2\2\65\u009b\3\2\2\2\67\u009f\3\2\2\2")
        buf.write("9\u00a8\3\2\2\2;\u00b2\3\2\2\2=\u00bc\3\2\2\2?@\7k\2\2")
        buf.write("@A\7h\2\2A\4\3\2\2\2BC\7y\2\2CD\7j\2\2DE\7k\2\2EF\7n\2")
        buf.write("\2FG\7g\2\2G\6\3\2\2\2HI\7d\2\2IJ\7t\2\2JK\7g\2\2KL\7")
        buf.write("c\2\2LM\7m\2\2M\b\3\2\2\2NO\7e\2\2OP\7q\2\2PQ\7p\2\2Q")
        buf.write("R\7v\2\2RS\7k\2\2ST\7p\2\2TU\7w\2\2UV\7g\2\2V\n\3\2\2")
        buf.write("\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\f\3")
        buf.write("\2\2\2]^\7t\2\2^_\7g\2\2_`\7c\2\2`a\7f\2\2ab\7k\2\2bc")
        buf.write("\7p\2\2cd\7v\2\2d\16\3\2\2\2ef\7t\2\2fg\7g\2\2gh\7c\2")
        buf.write("\2hi\7f\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2l\20\3\2\2\2mn\7")
        buf.write("f\2\2no\7g\2\2op\7h\2\2p\22\3\2\2\2qr\7-\2\2r\24\3\2\2")
        buf.write("\2st\7/\2\2t\26\3\2\2\2uv\7,\2\2v\30\3\2\2\2wx\7\61\2")
        buf.write("\2x\32\3\2\2\2yz\7\'\2\2z\34\3\2\2\2{|\7*\2\2|\36\3\2")
        buf.write("\2\2}~\7+\2\2~ \3\2\2\2\177\u0080\7?\2\2\u0080\"\3\2\2")
        buf.write("\2\u0081\u0082\7<\2\2\u0082$\3\2\2\2\u0083\u0084\7.\2")
        buf.write("\2\u0084&\3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7?\2")
        buf.write("\2\u0087(\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7?\2")
        buf.write("\2\u008a*\3\2\2\2\u008b\u008c\7@\2\2\u008c,\3\2\2\2\u008d")
        buf.write("\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f.\3\2\2\2\u0090")
        buf.write("\u0091\7>\2\2\u0091\60\3\2\2\2\u0092\u0093\7>\2\2\u0093")
        buf.write("\u0094\7?\2\2\u0094\62\3\2\2\2\u0095\u0097\4c|\2\u0096")
        buf.write("\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2")
        buf.write("\u0098\u0099\3\2\2\2\u0099\64\3\2\2\2\u009a\u009c\4\62")
        buf.write(";\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b")
        buf.write("\3\2\2\2\u009d\u009e\3\2\2\2\u009e\66\3\2\2\2\u009f\u00a3")
        buf.write("\7$\2\2\u00a0\u00a2\n\2\2\2\u00a1\u00a0\3\2\2\2\u00a2")
        buf.write("\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2")
        buf.write("\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7")
        buf.write("$\2\2\u00a78\3\2\2\2\u00a8\u00ac\7%\2\2\u00a9\u00ab\n")
        buf.write("\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa")
        buf.write("\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae")
        buf.write("\u00ac\3\2\2\2\u00af\u00b0\b\35\2\2\u00b0:\3\2\2\2\u00b1")
        buf.write("\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2")
        buf.write("\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\7\f\2\2\u00b5\u00b7")
        buf.write("\7\"\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8")
        buf.write("\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9<\3\2\2\2\u00ba")
        buf.write("\u00b8\3\2\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2")
        buf.write("\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3")
        buf.write("\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\37\2\2\u00c1")
        buf.write(">\3\2\2\2\n\2\u0098\u009d\u00a3\u00ac\u00b2\u00b8\u00be")
        buf.write("\3\b\2\2")
        return buf.getvalue()


class JacLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    IF = 1
    WHILE = 2
    BREAK = 3
    CONTINUE = 4
    PRINT = 5
    READINT = 6
    READSTR = 7
    DEF = 8
    PLUS = 9
    MINUS = 10
    TIMES = 11
    OVER = 12
    REM = 13
    OP_PAR = 14
    CL_PAR = 15
    ATTRIB = 16
    COLON = 17
    COMMA = 18
    EQ = 19
    NE = 20
    GT = 21
    GE = 22
    LT = 23
    LE = 24
    NAME = 25
    NUMBER = 26
    STRING = 27
    COMMENT = 28
    NL = 29
    SPACE = 30

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'while'", "'break'", "'continue'", "'print'", "'readint'", 
            "'readstr'", "'def'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
            "')'", "'='", "':'", "','", "'=='", "'!='", "'>'", "'>='", "'<'", 
            "'<='" ]

    symbolicNames = [ "<INVALID>",
            "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", "READSTR", 
            "DEF", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", "CL_PAR", 
            "ATTRIB", "COLON", "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", 
            "NAME", "NUMBER", "STRING", "COMMENT", "NL", "SPACE" ]

    ruleNames = [ "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", 
                  "READSTR", "DEF", "PLUS", "MINUS", "TIMES", "OVER", "REM", 
                  "OP_PAR", "CL_PAR", "ATTRIB", "COLON", "COMMA", "EQ", 
                  "NE", "GT", "GE", "LT", "LE", "NAME", "NUMBER", "STRING", 
                  "COMMENT", "NL", "SPACE" ]

    grammarFileName = "Jac.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


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


