# Generated from Jac.g4 by ANTLR 4.9.3
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21")
        buf.write("[\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3")
        buf.write("\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6")
        buf.write("\rC\n\r\r\r\16\rD\3\16\6\16H\n\16\r\16\16\16I\3\17\6\17")
        buf.write("M\n\17\r\17\16\17N\3\17\3\17\3\20\3\20\7\20U\n\20\f\20")
        buf.write("\16\20X\13\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r")
        buf.write("\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3")
        buf.write("\2\4\5\2\13\f\17\17\"\"\3\2\f\f\2^\2\3\3\2\2\2\2\5\3\2")
        buf.write("\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2")
        buf.write("\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2")
        buf.write("\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37")
        buf.write("\3\2\2\2\3!\3\2\2\2\5\'\3\2\2\2\7/\3\2\2\2\t\61\3\2\2")
        buf.write("\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2")
        buf.write("\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31B\3\2\2\2\33")
        buf.write("G\3\2\2\2\35L\3\2\2\2\37R\3\2\2\2!\"\7r\2\2\"#\7t\2\2")
        buf.write("#$\7k\2\2$%\7p\2\2%&\7v\2\2&\4\3\2\2\2\'(\7t\2\2()\7g")
        buf.write("\2\2)*\7c\2\2*+\7f\2\2+,\7k\2\2,-\7p\2\2-.\7v\2\2.\6\3")
        buf.write("\2\2\2/\60\7-\2\2\60\b\3\2\2\2\61\62\7/\2\2\62\n\3\2\2")
        buf.write("\2\63\64\7,\2\2\64\f\3\2\2\2\65\66\7\61\2\2\66\16\3\2")
        buf.write("\2\2\678\7\'\2\28\20\3\2\2\29:\7*\2\2:\22\3\2\2\2;<\7")
        buf.write("+\2\2<\24\3\2\2\2=>\7?\2\2>\26\3\2\2\2?@\7.\2\2@\30\3")
        buf.write("\2\2\2AC\4c|\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2")
        buf.write("E\32\3\2\2\2FH\4\62;\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2I")
        buf.write("J\3\2\2\2J\34\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL")
        buf.write("\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\17\2\2Q\36\3\2\2\2RV")
        buf.write("\7%\2\2SU\n\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2")
        buf.write("\2\2WY\3\2\2\2XV\3\2\2\2YZ\b\20\2\2Z \3\2\2\2\7\2DINV")
        buf.write("\3\b\2\2")
        return buf.getvalue()


class JacLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PRINT = 1
    READINT = 2
    PLUS = 3
    MINUS = 4
    TIMES = 5
    OVER = 6
    REM = 7
    OP_PAR = 8
    CL_PAR = 9
    ATTRIB = 10
    COMMA = 11
    NAME = 12
    NUMBER = 13
    SPACE = 14
    COMMENT = 15

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'print'", "'readint'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
            "')'", "'='", "','" ]

    symbolicNames = [ "<INVALID>",
            "PRINT", "READINT", "PLUS", "MINUS", "TIMES", "OVER", "REM", 
            "OP_PAR", "CL_PAR", "ATTRIB", "COMMA", "NAME", "NUMBER", "SPACE", 
            "COMMENT" ]

    ruleNames = [ "PRINT", "READINT", "PLUS", "MINUS", "TIMES", "OVER", 
                  "REM", "OP_PAR", "CL_PAR", "ATTRIB", "COMMA", "NAME", 
                  "NUMBER", "SPACE", "COMMENT" ]

    grammarFileName = "Jac.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


