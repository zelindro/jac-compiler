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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t")
        buf.write("+\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3")
        buf.write("\5\3\6\3\6\3\7\6\7!\n\7\r\7\16\7\"\3\b\6\b&\n\b\r\b\16")
        buf.write("\b\'\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\3")
        buf.write("\5\2\13\f\17\17\"\"\2,\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2")
        buf.write("\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2")
        buf.write("\3\21\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13")
        buf.write("\35\3\2\2\2\r \3\2\2\2\17%\3\2\2\2\21\22\7r\2\2\22\23")
        buf.write("\7t\2\2\23\24\7k\2\2\24\25\7p\2\2\25\26\7v\2\2\26\4\3")
        buf.write("\2\2\2\27\30\7-\2\2\30\6\3\2\2\2\31\32\7,\2\2\32\b\3\2")
        buf.write("\2\2\33\34\7*\2\2\34\n\3\2\2\2\35\36\7+\2\2\36\f\3\2\2")
        buf.write("\2\37!\4\62;\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3")
        buf.write("\2\2\2#\16\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3")
        buf.write("\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\b\2\2*\20\3\2\2\2\5\2")
        buf.write("\"\'\3\b\2\2")
        return buf.getvalue()


class JacLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PRINT = 1
    PLUS = 2
    TIMES = 3
    OP_PAR = 4
    CL_PAR = 5
    NUMBER = 6
    SPACE = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'print'", "'+'", "'*'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>",
            "PRINT", "PLUS", "TIMES", "OP_PAR", "CL_PAR", "NUMBER", "SPACE" ]

    ruleNames = [ "PRINT", "PLUS", "TIMES", "OP_PAR", "CL_PAR", "NUMBER", 
                  "SPACE" ]

    grammarFileName = "Jac.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


