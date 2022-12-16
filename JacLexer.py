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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37")
        buf.write("\u00af\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4")
        buf.write("\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b")
        buf.write("\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3")
        buf.write("\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23")
        buf.write("\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27")
        buf.write("\3\30\3\30\3\31\3\31\3\31\3\32\6\32\u008d\n\32\r\32\16")
        buf.write("\32\u008e\3\33\6\33\u0092\n\33\r\33\16\33\u0093\3\34\3")
        buf.write("\34\7\34\u0098\n\34\f\34\16\34\u009b\13\34\3\34\3\34\3")
        buf.write("\35\5\35\u00a0\n\35\3\35\3\35\7\35\u00a4\n\35\f\35\16")
        buf.write("\35\u00a7\13\35\3\36\6\36\u00aa\n\36\r\36\16\36\u00ab")
        buf.write("\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23")
        buf.write("\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25")
        buf.write(")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\4")
        buf.write("\3\2\f\f\4\2\13\13\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2")
        buf.write("\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17")
        buf.write("\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3")
        buf.write("\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2")
        buf.write("\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3")
        buf.write("\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2")
        buf.write("\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3")
        buf.write("\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7F\3\2\2\2\tL\3\2\2\2\13")
        buf.write("U\3\2\2\2\r[\3\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2")
        buf.write("\2\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35")
        buf.write("q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'")
        buf.write("{\3\2\2\2)~\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0086")
        buf.write("\3\2\2\2\61\u0088\3\2\2\2\63\u008c\3\2\2\2\65\u0091\3")
        buf.write("\2\2\2\67\u0095\3\2\2\29\u009f\3\2\2\2;\u00a9\3\2\2\2")
        buf.write("=>\7k\2\2>?\7h\2\2?\4\3\2\2\2@A\7y\2\2AB\7j\2\2BC\7k\2")
        buf.write("\2CD\7n\2\2DE\7g\2\2E\6\3\2\2\2FG\7d\2\2GH\7t\2\2HI\7")
        buf.write("g\2\2IJ\7c\2\2JK\7m\2\2K\b\3\2\2\2LM\7e\2\2MN\7q\2\2N")
        buf.write("O\7p\2\2OP\7v\2\2PQ\7k\2\2QR\7p\2\2RS\7w\2\2ST\7g\2\2")
        buf.write("T\n\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2")
        buf.write("\2Z\f\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7f\2\2_`")
        buf.write("\7k\2\2`a\7p\2\2ab\7v\2\2b\16\3\2\2\2cd\7-\2\2d\20\3\2")
        buf.write("\2\2ef\7/\2\2f\22\3\2\2\2gh\7,\2\2h\24\3\2\2\2ij\7\61")
        buf.write("\2\2j\26\3\2\2\2kl\7\'\2\2l\30\3\2\2\2mn\7<\2\2n\32\3")
        buf.write("\2\2\2op\7*\2\2p\34\3\2\2\2qr\7+\2\2r\36\3\2\2\2st\7}")
        buf.write("\2\2t \3\2\2\2uv\7\177\2\2v\"\3\2\2\2wx\7?\2\2x$\3\2\2")
        buf.write("\2yz\7.\2\2z&\3\2\2\2{|\7?\2\2|}\7?\2\2}(\3\2\2\2~\177")
        buf.write("\7#\2\2\177\u0080\7?\2\2\u0080*\3\2\2\2\u0081\u0082\7")
        buf.write("@\2\2\u0082,\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7")
        buf.write("?\2\2\u0085.\3\2\2\2\u0086\u0087\7>\2\2\u0087\60\3\2\2")
        buf.write("\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a\62\3\2")
        buf.write("\2\2\u008b\u008d\4c|\2\u008c\u008b\3\2\2\2\u008d\u008e")
        buf.write("\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f")
        buf.write("\64\3\2\2\2\u0090\u0092\4\62;\2\u0091\u0090\3\2\2\2\u0092")
        buf.write("\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2")
        buf.write("\u0094\66\3\2\2\2\u0095\u0099\7%\2\2\u0096\u0098\n\2\2")
        buf.write("\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097")
        buf.write("\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b")
        buf.write("\u0099\3\2\2\2\u009c\u009d\b\34\2\2\u009d8\3\2\2\2\u009e")
        buf.write("\u00a0\7\17\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2")
        buf.write("\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\7\f\2\2\u00a2\u00a4")
        buf.write("\7\"\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5")
        buf.write("\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6:\3\2\2\2\u00a7")
        buf.write("\u00a5\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2")
        buf.write("\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3")
        buf.write("\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\36\2\2\u00ae")
        buf.write("<\3\2\2\2\t\2\u008e\u0093\u0099\u009f\u00a5\u00ab\3\b")
        buf.write("\2\2")
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
    PLUS = 7
    MINUS = 8
    TIMES = 9
    OVER = 10
    REM = 11
    COLON = 12
    OP_PAR = 13
    CL_PAR = 14
    OP_CUR = 15
    CL_CUR = 16
    ATTRIB = 17
    COMMA = 18
    EQ = 19
    NE = 20
    GT = 21
    GE = 22
    LT = 23
    LE = 24
    NAME = 25
    NUMBER = 26
    COMMENT = 27
    NL = 28
    SPACE = 29

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'while'", "'break'", "'continue'", "'print'", "'readint'", 
            "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'('", "')'", "'{'", 
            "'}'", "'='", "','", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>",
            "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", "PLUS", 
            "MINUS", "TIMES", "OVER", "REM", "COLON", "OP_PAR", "CL_PAR", 
            "OP_CUR", "CL_CUR", "ATTRIB", "COMMA", "EQ", "NE", "GT", "GE", 
            "LT", "LE", "NAME", "NUMBER", "COMMENT", "NL", "SPACE" ]

    ruleNames = [ "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", 
                  "PLUS", "MINUS", "TIMES", "OVER", "REM", "COLON", "OP_PAR", 
                  "CL_PAR", "OP_CUR", "CL_CUR", "ATTRIB", "COMMA", "EQ", 
                  "NE", "GT", "GE", "LT", "LE", "NAME", "NUMBER", "COMMENT", 
                  "NL", "SPACE" ]

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


