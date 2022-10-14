# Generated from Tiny.g4 by ANTLR 4.9.3
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6")
        buf.write("\33\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3")
        buf.write("\3\3\4\6\4\21\n\4\r\4\16\4\22\3\5\6\5\26\n\5\r\5\16\5")
        buf.write("\27\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3\2\3\5\2\13\f\17\17")
        buf.write("\"\"\2\34\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\3\13\3\2\2\2\5\r\3\2\2\2\7\20\3\2\2\2\t\25\3\2\2")
        buf.write("\2\13\f\7-\2\2\f\4\3\2\2\2\r\16\7,\2\2\16\6\3\2\2\2\17")
        buf.write("\21\4\62;\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2")
        buf.write("\22\23\3\2\2\2\23\b\3\2\2\2\24\26\t\2\2\2\25\24\3\2\2")
        buf.write("\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2")
        buf.write("\2\2\31\32\b\5\2\2\32\n\3\2\2\2\5\2\22\27\3\b\2\2")
        return buf.getvalue()


class TinyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    PLUS = 1
    TIMES = 2
    NUMBER = 3
    SPACE = 4

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'*'" ]

    symbolicNames = [ "<INVALID>",
            "PLUS", "TIMES", "NUMBER", "SPACE" ]

    ruleNames = [ "PLUS", "TIMES", "NUMBER", "SPACE" ]

    grammarFileName = "Tiny.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


