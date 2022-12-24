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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35")
        buf.write("\u00a7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5")
        buf.write("\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3")
        buf.write("\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n")
        buf.write("\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3")
        buf.write("\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24")
        buf.write("\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\6\30\u0085")
        buf.write("\n\30\r\30\16\30\u0086\3\31\6\31\u008a\n\31\r\31\16\31")
        buf.write("\u008b\3\32\3\32\7\32\u0090\n\32\f\32\16\32\u0093\13\32")
        buf.write("\3\32\3\32\3\33\5\33\u0098\n\33\3\33\3\33\7\33\u009c\n")
        buf.write("\33\f\33\16\33\u009f\13\33\3\34\6\34\u00a2\n\34\r\34\16")
        buf.write("\34\u00a3\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17")
        buf.write("\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23")
        buf.write("%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2")
        buf.write("\4\3\2\f\f\4\2\13\13\"\"\2\u00ac\2\3\3\2\2\2\2\5\3\2\2")
        buf.write("\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2")
        buf.write("\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27")
        buf.write("\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3")
        buf.write("\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2")
        buf.write(")\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2")
        buf.write("\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5")
        buf.write("<\3\2\2\2\7B\3\2\2\2\tH\3\2\2\2\13Q\3\2\2\2\rW\3\2\2\2")
        buf.write("\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3")
        buf.write("\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2")
        buf.write("!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'y\3\2\2\2){\3\2\2\2+~")
        buf.write("\3\2\2\2-\u0080\3\2\2\2/\u0084\3\2\2\2\61\u0089\3\2\2")
        buf.write("\2\63\u008d\3\2\2\2\65\u0097\3\2\2\2\67\u00a1\3\2\2\2")
        buf.write("9:\7k\2\2:;\7h\2\2;\4\3\2\2\2<=\7y\2\2=>\7j\2\2>?\7k\2")
        buf.write("\2?@\7n\2\2@A\7g\2\2A\6\3\2\2\2BC\7d\2\2CD\7t\2\2DE\7")
        buf.write("g\2\2EF\7c\2\2FG\7m\2\2G\b\3\2\2\2HI\7e\2\2IJ\7q\2\2J")
        buf.write("K\7p\2\2KL\7v\2\2LM\7k\2\2MN\7p\2\2NO\7w\2\2OP\7g\2\2")
        buf.write("P\n\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU\7p\2\2UV\7v\2")
        buf.write("\2V\f\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2Z[\7f\2\2[\\\7")
        buf.write("k\2\2\\]\7p\2\2]^\7v\2\2^\16\3\2\2\2_`\7-\2\2`\20\3\2")
        buf.write("\2\2ab\7/\2\2b\22\3\2\2\2cd\7,\2\2d\24\3\2\2\2ef\7\61")
        buf.write("\2\2f\26\3\2\2\2gh\7\'\2\2h\30\3\2\2\2ij\7<\2\2j\32\3")
        buf.write("\2\2\2kl\7*\2\2l\34\3\2\2\2mn\7+\2\2n\36\3\2\2\2op\7?")
        buf.write("\2\2p \3\2\2\2qr\7.\2\2r\"\3\2\2\2st\7?\2\2tu\7?\2\2u")
        buf.write("$\3\2\2\2vw\7#\2\2wx\7?\2\2x&\3\2\2\2yz\7@\2\2z(\3\2\2")
        buf.write("\2{|\7@\2\2|}\7?\2\2}*\3\2\2\2~\177\7>\2\2\177,\3\2\2")
        buf.write("\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082.\3\2\2")
        buf.write("\2\u0083\u0085\4c|\2\u0084\u0083\3\2\2\2\u0085\u0086\3")
        buf.write("\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\60")
        buf.write("\3\2\2\2\u0088\u008a\4\62;\2\u0089\u0088\3\2\2\2\u008a")
        buf.write("\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2")
        buf.write("\u008c\62\3\2\2\2\u008d\u0091\7%\2\2\u008e\u0090\n\2\2")
        buf.write("\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f")
        buf.write("\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093")
        buf.write("\u0091\3\2\2\2\u0094\u0095\b\32\2\2\u0095\64\3\2\2\2\u0096")
        buf.write("\u0098\7\17\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2")
        buf.write("\2\u0098\u0099\3\2\2\2\u0099\u009d\7\f\2\2\u009a\u009c")
        buf.write("\7\"\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d")
        buf.write("\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\66\3\2\2\2\u009f")
        buf.write("\u009d\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2")
        buf.write("\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3")
        buf.write("\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\34\2\2\u00a6")
        buf.write("8\3\2\2\2\t\2\u0086\u008b\u0091\u0097\u009d\u00a3\3\b")
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
    ATTRIB = 15
    COMMA = 16
    EQ = 17
    NE = 18
    GT = 19
    GE = 20
    LT = 21
    LE = 22
    NAME = 23
    NUMBER = 24
    COMMENT = 25
    NL = 26
    SPACE = 27

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "'while'", "'break'", "'continue'", "'print'", "'readint'", 
            "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'('", "')'", "'='", 
            "','", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>",
            "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", "PLUS", 
            "MINUS", "TIMES", "OVER", "REM", "COLON", "OP_PAR", "CL_PAR", 
            "ATTRIB", "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", "NAME", 
            "NUMBER", "COMMENT", "NL", "SPACE" ]

    ruleNames = [ "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", 
                  "PLUS", "MINUS", "TIMES", "OVER", "REM", "COLON", "OP_PAR", 
                  "CL_PAR", "ATTRIB", "COMMA", "EQ", "NE", "GT", "GE", "LT", 
                  "LE", "NAME", "NUMBER", "COMMENT", "NL", "SPACE" ]

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


