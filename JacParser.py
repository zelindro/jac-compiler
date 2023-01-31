# Generated from Jac.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


import sys;

symbol_table = []
symbol_type = []
used_table = []
function_table = []
inside_while = []
param_table = []

stack_cur = 0
stack_max = 0
if_max = 1
while_max = 1
arg_max = 0

has_error = False
function_error = False
has_return = False

type = 'V'

def emit(bytecode, delta):
    global stack_cur, stack_max
    stack_cur += delta
    if stack_cur > stack_max:
        stack_max = stack_cur
    print('    ' + bytecode + '    ; delta=' + str(delta))

def if_counter():
    global if_max
    if_max += 1

def reset_counters():
    global stack_max, symbol_table, symbol_type, used_table, has_return, type
    stack_max = 0
    symbol_table = []
    symbol_type = []
    used_table = []
    has_return = False
    type = 'V'

def update_error():
    global has_error
    has_error = True


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%")
        buf.write("\u0110\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3")
        buf.write("\3\3\3\3\3\3\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3")
        buf.write("\3\7\3@\n\3\f\3\16\3C\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J")
        buf.write("\13\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\3\3\3\4\3\4\3\4")
        buf.write("\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\6\5`\n\5\r\5")
        buf.write("\16\5a\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6")
        buf.write("o\n\6\3\7\3\7\3\7\3\7\5\7u\n\7\3\7\3\7\3\7\3\7\3\7\3\7")
        buf.write("\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\5\7\u0083\n\7\3\7\3")
        buf.write("\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t")
        buf.write("\u0093\n\t\r\t\16\t\u0094\3\t\3\t\3\t\3\t\3\t\3\t\6\t")
        buf.write("\u009d\n\t\r\t\16\t\u009e\5\t\u00a1\n\t\3\t\3\t\3\t\3")
        buf.write("\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00ad\n\n\r\n\16\n\u00ae")
        buf.write("\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5")
        buf.write("\r\u00bd\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17")
        buf.write("\3\17\3\17\3\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0")
        buf.write("\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3")
        buf.write("\21\3\22\3\22\3\22\3\22\3\22\7\22\u00e1\n\22\f\22\16\22")
        buf.write("\u00e4\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00ed")
        buf.write("\n\23\f\23\16\23\u00f0\13\23\3\23\3\23\3\24\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0100")
        buf.write("\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24")
        buf.write("\3\24\3\24\5\24\u010e\n\24\3\24\2\2\25\2\4\6\b\n\f\16")
        buf.write("\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\30\35\3\2\16\17")
        buf.write("\3\2\20\22\2\u011e\2(\3\2\2\2\4\61\3\2\2\2\6S\3\2\2\2")
        buf.write("\b]\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16\u0087\3\2\2\2\20")
        buf.write("\u008c\3\2\2\2\22\u00a5\3\2\2\2\24\u00b3\3\2\2\2\26\u00b6")
        buf.write("\3\2\2\2\30\u00b9\3\2\2\2\32\u00c1\3\2\2\2\34\u00c5\3")
        buf.write("\2\2\2\36\u00d1\3\2\2\2 \u00d6\3\2\2\2\"\u00db\3\2\2\2")
        buf.write("$\u00e7\3\2\2\2&\u010d\3\2\2\2(,\b\2\1\2)+\5\4\3\2*)\3")
        buf.write("\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2")
        buf.write("\2/\60\5\b\5\2\60\3\3\2\2\2\61\62\7\13\2\2\62\63\7\36")
        buf.write("\2\2\63\65\7\23\2\2\64\66\5\6\4\2\65\64\3\2\2\2\65\66")
        buf.write("\3\2\2\2\66\67\3\2\2\2\678\7\24\2\289\7\26\2\29<\b\3\1")
        buf.write("\2:;\7\f\2\2;=\b\3\1\2<:\3\2\2\2<=\3\2\2\2=A\3\2\2\2>")
        buf.write("@\7$\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2")
        buf.write("\2\2CA\3\2\2\2DH\b\3\1\2EG\5\n\6\2FE\3\2\2\2GJ\3\2\2\2")
        buf.write("HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7%\2\2LK\3")
        buf.write("\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2")
        buf.write("\2QR\b\3\1\2R\5\3\2\2\2ST\7\36\2\2TZ\b\4\1\2UV\7\27\2")
        buf.write("\2VW\7\36\2\2WY\b\4\1\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2")
        buf.write("Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]_\b\5\1\2^`\5\n\6\2_")
        buf.write("^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b")
        buf.write("\5\1\2d\t\3\2\2\2eo\7\"\2\2fo\5\f\7\2go\5\16\b\2ho\5\20")
        buf.write("\t\2io\5\22\n\2jo\5\24\13\2ko\5\26\f\2lo\5\30\r\2mo\5")
        buf.write("\32\16\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2")
        buf.write("\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\13\3\2\2")
        buf.write("\2pq\7\b\2\2q\u0082\7\23\2\2rt\b\7\1\2su\5\n\6\2ts\3\2")
        buf.write("\2\2tu\3\2\2\2uv\3\2\2\2vw\5\"\22\2w\177\b\7\1\2xy\7\27")
        buf.write("\2\2yz\b\7\1\2z{\5\"\22\2{|\b\7\1\2|~\3\2\2\2}x\3\2\2")
        buf.write("\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080")
        buf.write("\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082r\3\2\2\2\u0082")
        buf.write("\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\24\2")
        buf.write("\2\u0085\u0086\b\7\1\2\u0086\r\3\2\2\2\u0087\u0088\7\36")
        buf.write("\2\2\u0088\u0089\7\25\2\2\u0089\u008a\5\"\22\2\u008a\u008b")
        buf.write("\b\b\1\2\u008b\17\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e")
        buf.write("\5\36\20\2\u008e\u008f\7\26\2\2\u008f\u0090\b\t\1\2\u0090")
        buf.write("\u0092\7$\2\2\u0091\u0093\5\n\6\2\u0092\u0091\3\2\2\2")
        buf.write("\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3")
        buf.write("\2\2\2\u0095\u00a0\3\2\2\2\u0096\u0097\7%\2\2\u0097\u0098")
        buf.write("\7\4\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7$\2\2\u009a")
        buf.write("\u009c\b\t\1\2\u009b\u009d\5\n\6\2\u009c\u009b\3\2\2\2")
        buf.write("\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3")
        buf.write("\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0\u00a1")
        buf.write("\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\t\1\2\u00a3")
        buf.write("\u00a4\7%\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6")
        buf.write("\u00a7\b\n\1\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\26\2")
        buf.write("\2\u00a9\u00aa\b\n\1\2\u00aa\u00ac\7$\2\2\u00ab\u00ad")
        buf.write("\5\n\6\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae")
        buf.write("\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2")
        buf.write("\u00b0\u00b1\7%\2\2\u00b1\u00b2\b\n\1\2\u00b2\23\3\2\2")
        buf.write("\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\b\13\1\2\u00b5\25\3")
        buf.write("\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\b\f\1\2\u00b8\27")
        buf.write("\3\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bc\7\23\2\2\u00bb")
        buf.write("\u00bd\5\34\17\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2")
        buf.write("\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0")
        buf.write("\b\r\1\2\u00c0\31\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3")
        buf.write("\5\"\22\2\u00c3\u00c4\b\16\1\2\u00c4\33\3\2\2\2\u00c5")
        buf.write("\u00c6\b\17\1\2\u00c6\u00c7\5\"\22\2\u00c7\u00ce\b\17")
        buf.write("\1\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb")
        buf.write("\b\17\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd")
        buf.write("\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2")
        buf.write("\u00cf\35\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\"")
        buf.write("\22\2\u00d2\u00d3\t\2\2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5")
        buf.write("\b\20\1\2\u00d5\37\3\2\2\2\u00d6\u00d7\5\"\22\2\u00d7")
        buf.write("\u00d8\t\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\b\21\1")
        buf.write("\2\u00da!\3\2\2\2\u00db\u00e2\5$\23\2\u00dc\u00dd\t\3")
        buf.write("\2\2\u00dd\u00de\5$\23\2\u00de\u00df\b\22\1\2\u00df\u00e1")
        buf.write("\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2")
        buf.write("\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2")
        buf.write("\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\22\1\2\u00e6#\3\2\2")
        buf.write("\2\u00e7\u00ee\5&\24\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea")
        buf.write("\5&\24\2\u00ea\u00eb\b\23\1\2\u00eb\u00ed\3\2\2\2\u00ec")
        buf.write("\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2")
        buf.write("\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3")
        buf.write("\2\2\2\u00f1\u00f2\b\23\1\2\u00f2%\3\2\2\2\u00f3\u00f4")
        buf.write("\7\37\2\2\u00f4\u010e\b\24\1\2\u00f5\u00f6\7 \2\2\u00f6")
        buf.write("\u010e\b\24\1\2\u00f7\u00f8\7\23\2\2\u00f8\u00f9\5\"\22")
        buf.write("\2\u00f9\u00fa\7\24\2\2\u00fa\u00fb\b\24\1\2\u00fb\u010e")
        buf.write("\3\2\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00ff\7\23\2\2\u00fe")
        buf.write("\u0100\5\34\17\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2")
        buf.write("\2\u0100\u0101\3\2\2\2\u0101\u0102\7\24\2\2\u0102\u010e")
        buf.write("\b\24\1\2\u0103\u0104\7\36\2\2\u0104\u010e\b\24\1\2\u0105")
        buf.write("\u0106\7\t\2\2\u0106\u0107\7\23\2\2\u0107\u0108\7\24\2")
        buf.write("\2\u0108\u010e\b\24\1\2\u0109\u010a\7\n\2\2\u010a\u010b")
        buf.write("\7\23\2\2\u010b\u010c\7\24\2\2\u010c\u010e\b\24\1\2\u010d")
        buf.write("\u00f3\3\2\2\2\u010d\u00f5\3\2\2\2\u010d\u00f7\3\2\2\2")
        buf.write("\u010d\u00fc\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0105\3")
        buf.write("\2\2\2\u010d\u0109\3\2\2\2\u010e\'\3\2\2\2\30,\65<AHN")
        buf.write("Zant\177\u0082\u0094\u009e\u00a0\u00ae\u00bc\u00ce\u00e2")
        buf.write("\u00ee\u00ff\u010d")
        return buf.getvalue()


class JacParser ( Parser ):

    grammarFileName = "Jac.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'if'", "'else'", "'while'", "'break'", 
                     "'continue'", "'print'", "'readint'", "'readstr'", 
                     "'def'", "'int'", "'return'", "'+'", "'-'", "'*'", 
                     "'/'", "'%'", "'('", "')'", "'='", "':'", "','", "'=='", 
                     "'!='", "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>", "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", 
                      "PRINT", "READINT", "READSTR", "DEF", "INT", "RETURN", 
                      "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
                      "CL_PAR", "ATTRIB", "COLON", "COMMA", "EQ", "NE", 
                      "GT", "GE", "LT", "LE", "NAME", "NUMBER", "STRING", 
                      "COMMENT", "NL", "SPACE", "INDENT", "DEDENT" ]

    RULE_program = 0
    RULE_function = 1
    RULE_parameters = 2
    RULE_main = 3
    RULE_statement = 4
    RULE_st_print = 5
    RULE_st_attrib = 6
    RULE_st_if = 7
    RULE_st_while = 8
    RULE_st_break = 9
    RULE_st_continue = 10
    RULE_st_call = 11
    RULE_st_return = 12
    RULE_arguments = 13
    RULE_comparison_if = 14
    RULE_comparison_while = 15
    RULE_expression = 16
    RULE_term = 17
    RULE_factor = 18

    ruleNames =  [ "program", "function", "parameters", "main", "statement", 
                   "st_print", "st_attrib", "st_if", "st_while", "st_break", 
                   "st_continue", "st_call", "st_return", "arguments", "comparison_if", 
                   "comparison_while", "expression", "term", "factor" ]

    EOF = Token.EOF
    IF=1
    ELSE=2
    WHILE=3
    BREAK=4
    CONTINUE=5
    PRINT=6
    READINT=7
    READSTR=8
    DEF=9
    INT=10
    RETURN=11
    PLUS=12
    MINUS=13
    TIMES=14
    OVER=15
    REM=16
    OP_PAR=17
    CL_PAR=18
    ATTRIB=19
    COLON=20
    COMMA=21
    EQ=22
    NE=23
    GT=24
    GE=25
    LT=26
    LE=27
    NAME=28
    NUMBER=29
    STRING=30
    COMMENT=31
    NL=32
    SPACE=33
    INDENT=34
    DEDENT=35

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def main(self):
            return self.getTypedRuleContext(JacParser.MainContext,0)


        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.FunctionContext)
            else:
                return self.getTypedRuleContext(JacParser.FunctionContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_program




    def program(self):

        localctx = JacParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    print('.source Test.src')
                    print('.class  public Test')
                    print('.super  java/lang/Object\n')
                    print('.method public <init>()V')
                    print('    aload_0')
                    print('    invokenonvirtual java/lang/Object/<init>()V')
                    print('    return')
                    print('.end method\n')
                
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.DEF:
                self.state = 39
                self.function()
                self.state = 44
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 45
            self.main()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NAME = None # Token

        def DEF(self):
            return self.getToken(JacParser.DEF, 0)

        def NAME(self):
            return self.getToken(JacParser.NAME, 0)

        def OP_PAR(self):
            return self.getToken(JacParser.OP_PAR, 0)

        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def COLON(self):
            return self.getToken(JacParser.COLON, 0)

        def parameters(self):
            return self.getTypedRuleContext(JacParser.ParametersContext,0)


        def INT(self):
            return self.getToken(JacParser.INT, 0)

        def INDENT(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.INDENT)
            else:
                return self.getToken(JacParser.INDENT, i)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def DEDENT(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.DEDENT)
            else:
                return self.getToken(JacParser.DEDENT, i)

        def getRuleIndex(self):
            return JacParser.RULE_function




    def function(self):

        localctx = JacParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_function)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(JacParser.DEF)
            self.state = 48
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 49
            self.match(JacParser.OP_PAR)
            self.state = 51
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==JacParser.NAME:
                self.state = 50
                self.parameters()


            self.state = 53
            self.match(JacParser.CL_PAR)
            self.state = 54
            self.match(JacParser.COLON)
            if 1:
                    global type, function_table, param_table, symbol_table, has_return
                
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==JacParser.INT:
                self.state = 56
                self.match(JacParser.INT)
                if 1:
                        type = 'I'
                    


            self.state = 63
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.INDENT:
                self.state = 60
                self.match(JacParser.INDENT)
                self.state = 65
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            if 1:
                    I = ''
                    for j in range(0, len(symbol_table)):
                        I = I + 'I'
                    param_table.append(len(symbol_table))
                    if (None if localctx._NAME is None else localctx._NAME.text)+type not in function_table:
                        print('.method public static ' + (None if localctx._NAME is None else localctx._NAME.text) + '(' + I + ')' + type)
                        function_table.append((None if localctx._NAME is None else localctx._NAME.text) + type)
                    else:
                        sys.stderr.write('Error in function: "' + (None if localctx._NAME is None else localctx._NAME.text) + '" is already declared\n')
                        update_error()
                
            self.state = 70
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 67
                    self.statement() 
                self.state = 72
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 76
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.DEDENT:
                self.state = 73
                self.match(JacParser.DEDENT)
                self.state = 78
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            if 1:
                    #sys.stderr.write('Type = ' + str(type) + '\n')
                    #sys.stderr.write('has_return = ' + str(has_return) + '\n')
                    if type == 'I' and has_return == False:
                        sys.stderr.write('Error in function: "' + (None if localctx._NAME is None else localctx._NAME.text) + '" must return a integer value\n')
                        update_error()
                    print('return')
                    if (len(symbol_table) > 0):
                        print('.limit locals ' + str(len(symbol_table)))
                    print('.limit stack ' + str(stack_max))
                    print('.end method\n')

                    reset_counters()
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametersContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NAME = None # Token

        def NAME(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.NAME)
            else:
                return self.getToken(JacParser.NAME, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.COMMA)
            else:
                return self.getToken(JacParser.COMMA, i)

        def getRuleIndex(self):
            return JacParser.RULE_parameters




    def parameters(self):

        localctx = JacParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            localctx._NAME = self.match(JacParser.NAME)
            if 1:
                    symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                    used_table.append(False)
                    symbol_type.append('i')
                
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.COMMA:
                self.state = 83
                self.match(JacParser.COMMA)
                self.state = 84
                localctx._NAME = self.match(JacParser.NAME)
                if 1:
                        if (None if localctx._NAME is None else localctx._NAME.text) in symbol_table:
                            sys.stderr.write('Error in parameter: names must be unique\n')
                            update_error()
                        else:
                            symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                            used_table.append(False)
                            symbol_type.append('i')
                    
                self.state = 90
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_main




    def main(self):

        localctx = JacParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_main)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    print('.method public static main([Ljava/lang/String;)V')
                
            self.state = 93 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 92
                self.statement()
                self.state = 95 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.RETURN) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                    break

            if 1:
                    global has_error
                    print('return')
                    if (len(symbol_table) > 0):
                        print('.limit locals ' + str(len(symbol_table)))
                    print('.limit stack ' + str(stack_max))
                    print('.end method')
                    print('\n; symbol_table:', symbol_table)
                    print('\n; symbol_type:', symbol_type)
                    print('\n; used_table:', used_table)
                    if has_error == True:
                        exit(1) 
                    if (False in used_table):
                        sys.stderr.write('Warning: unused variables: ' + str([symbol_table[i] for i in range(len(used_table)) if not used_table[i]]) + '\n')
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NL(self):
            return self.getToken(JacParser.NL, 0)

        def st_print(self):
            return self.getTypedRuleContext(JacParser.St_printContext,0)


        def st_attrib(self):
            return self.getTypedRuleContext(JacParser.St_attribContext,0)


        def st_if(self):
            return self.getTypedRuleContext(JacParser.St_ifContext,0)


        def st_while(self):
            return self.getTypedRuleContext(JacParser.St_whileContext,0)


        def st_break(self):
            return self.getTypedRuleContext(JacParser.St_breakContext,0)


        def st_continue(self):
            return self.getTypedRuleContext(JacParser.St_continueContext,0)


        def st_call(self):
            return self.getTypedRuleContext(JacParser.St_callContext,0)


        def st_return(self):
            return self.getTypedRuleContext(JacParser.St_returnContext,0)


        def getRuleIndex(self):
            return JacParser.RULE_statement




    def statement(self):

        localctx = JacParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_statement)
        try:
            self.state = 108
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 99
                self.match(JacParser.NL)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 100
                self.st_print()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 101
                self.st_attrib()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 102
                self.st_if()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 103
                self.st_while()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 104
                self.st_break()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 105
                self.st_continue()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 106
                self.st_call()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 107
                self.st_return()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_printContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.e1 = None # ExpressionContext
            self.e2 = None # ExpressionContext

        def PRINT(self):
            return self.getToken(JacParser.PRINT, 0)

        def OP_PAR(self):
            return self.getToken(JacParser.OP_PAR, 0)

        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(JacParser.ExpressionContext,i)


        def statement(self):
            return self.getTypedRuleContext(JacParser.StatementContext,0)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.COMMA)
            else:
                return self.getToken(JacParser.COMMA, i)

        def getRuleIndex(self):
            return JacParser.RULE_st_print




    def st_print(self):

        localctx = JacParser.St_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_st_print)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            self.match(JacParser.PRINT)
            self.state = 111
            self.match(JacParser.OP_PAR)
            self.state = 128
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.READINT) | (1 << JacParser.READSTR) | (1 << JacParser.RETURN) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER) | (1 << JacParser.STRING) | (1 << JacParser.NL))) != 0):
                if 1:
                        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                    
                self.state = 114
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                if la_ == 1:
                    self.state = 113
                    self.statement()


                self.state = 116
                localctx.e1 = self.expression()
                if 1:
                        if localctx.e1.type == 'i':
                            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
                        elif localctx.e1.type == 's':
                            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
                        else:
                            sys.stderr.write('**HELP**\n')
                            exit(1)
                    
                self.state = 125
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==JacParser.COMMA:
                    self.state = 118
                    self.match(JacParser.COMMA)
                    if 1:
                            emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                        
                    self.state = 120
                    localctx.e2 = self.expression()
                    if 1:
                            if localctx.e2.type == 'i':
                                emit('invokevirtual java/io/PrintStream/print(I)V', -2)
                            elif localctx.e2.type == 's':
                                emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
                            else:
                                sys.stderr.write('**HELP**\n')
                                exit(1)
                        
                    self.state = 127
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 130
            self.match(JacParser.CL_PAR)
            if 1:
                    emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                    emit('invokevirtual java/io/PrintStream/println()V', -1)
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_attribContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NAME = None # Token
            self._expression = None # ExpressionContext

        def NAME(self):
            return self.getToken(JacParser.NAME, 0)

        def ATTRIB(self):
            return self.getToken(JacParser.ATTRIB, 0)

        def expression(self):
            return self.getTypedRuleContext(JacParser.ExpressionContext,0)


        def getRuleIndex(self):
            return JacParser.RULE_st_attrib




    def st_attrib(self):

        localctx = JacParser.St_attribContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_st_attrib)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 133
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 134
            self.match(JacParser.ATTRIB)
            self.state = 135
            localctx._expression = self.expression()
            if 1:
                    if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                        symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                        symbol_type.append(localctx._expression.type)
                        used_table.append(False)
                    if symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 'i':
                        if symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] != localctx._expression.type:
                            sys.stderr.write('Error in attribution: integer variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" must receive a integer expression\n')
                            update_error()
                        elif localctx._expression.type == 'error' or localctx._expression.type == 's':
                            sys.stderr.write('Error in attribution: integer variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" cannot receive a string expression\n')
                            update_error()
                        elif localctx._expression.type == 'i':
                            emit('    istore ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), -1)
                        else:
                            sys.stderr.write('Error in expression: invalid type of expression\n')
                            update_error()
                    elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 's':
                        if symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] != localctx._expression.type:
                            sys.stderr.write('Error in attribution: string variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" must receive a string expression\n')
                            update_error()
                        elif localctx._expression.type == 'error' or localctx._expression.type == 'i':
                            sys.stderr.write('Error in attribution: string variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" cannot receive a integer expression\n')
                            update_error()
                        elif localctx._expression.type == 's':
                            emit('    astore ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), -1)
                        else:
                            sys.stderr.write('Error in expression: invalid type of expression\n')
                            update_error()
                    elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 'void':
                        sys.stderr.write('Error in atribuition: a void function does not return a value\n')
                        update_error()
                    else:
                        sys.stderr.write('Error in expression: invalid type of token\n')
                        update_error()
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_ifContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.cmp = None # Comparison_ifContext

        def IF(self):
            return self.getToken(JacParser.IF, 0)

        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.COLON)
            else:
                return self.getToken(JacParser.COLON, i)

        def INDENT(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.INDENT)
            else:
                return self.getToken(JacParser.INDENT, i)

        def DEDENT(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.DEDENT)
            else:
                return self.getToken(JacParser.DEDENT, i)

        def comparison_if(self):
            return self.getTypedRuleContext(JacParser.Comparison_ifContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def ELSE(self):
            return self.getToken(JacParser.ELSE, 0)

        def getRuleIndex(self):
            return JacParser.RULE_st_if




    def st_if(self):

        localctx = JacParser.St_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_st_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(JacParser.IF)
            self.state = 139
            localctx.cmp = self.comparison_if()
            self.state = 140
            self.match(JacParser.COLON)
            if 1:
                    global if_max
                    has_else = False
                    emit(localctx.cmp.type + ' NOT_IF_' + str(if_max), -2)
                    local_if = if_max
                    if_max += 1
                
            self.state = 142
            self.match(JacParser.INDENT)
            self.state = 144 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 143
                self.statement()
                self.state = 146 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.RETURN) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                    break

            self.state = 158
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.state = 148
                self.match(JacParser.DEDENT)
                self.state = 149
                self.match(JacParser.ELSE)
                self.state = 150
                self.match(JacParser.COLON)
                self.state = 151
                self.match(JacParser.INDENT)
                if 1:
                        has_else = True
                        print('goto END_ELSE_' + str(local_if))
                        print('NOT_IF_' + str(local_if) + ':')
                        if_counter()
                    
                self.state = 154 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 153
                    self.statement()
                    self.state = 156 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.RETURN) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                        break



            if 1:
                    if has_else:
                        print('END_ELSE_' + str(local_if) + ':')
                    else:
                        print('NOT_IF_' + str(local_if) + ':')
                    if_counter()
                
            self.state = 161
            self.match(JacParser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_whileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(JacParser.WHILE, 0)

        def comparison_while(self):
            return self.getTypedRuleContext(JacParser.Comparison_whileContext,0)


        def COLON(self):
            return self.getToken(JacParser.COLON, 0)

        def INDENT(self):
            return self.getToken(JacParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(JacParser.DEDENT, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_st_while




    def st_while(self):

        localctx = JacParser.St_whileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_st_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 163
            self.match(JacParser.WHILE)
            if 1:
                    global while_max
                    local_while = while_max
                    print('BEGIN_WHILE_' + str(local_while) + ':')
                    inside_while.append(local_while)
                
            self.state = 165
            self.comparison_while()
            self.state = 166
            self.match(JacParser.COLON)
            if 1:
                    while_max += 1
                
            self.state = 168
            self.match(JacParser.INDENT)
            self.state = 170 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 169
                self.statement()
                self.state = 172 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.RETURN) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                    break

            self.state = 174
            self.match(JacParser.DEDENT)
            if 1:
                    emit('goto BEGIN_WHILE_' + str(local_while), 0)
                    print('END_WHILE_' + str(local_while) + ':')
                    inside_while.pop()
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_breakContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BREAK(self):
            return self.getToken(JacParser.BREAK, 0)

        def getRuleIndex(self):
            return JacParser.RULE_st_break




    def st_break(self):

        localctx = JacParser.St_breakContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_st_break)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.match(JacParser.BREAK)
            if 1:
                    if len(inside_while) == 0:
                        sys.stderr.write('Error: break outside while\n')
                        update_error()
                    emit('goto END_WHILE_' + str(while_max-1), 0)
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_continueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONTINUE(self):
            return self.getToken(JacParser.CONTINUE, 0)

        def getRuleIndex(self):
            return JacParser.RULE_st_continue




    def st_continue(self):

        localctx = JacParser.St_continueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_st_continue)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(JacParser.CONTINUE)
            if 1:
                    if len(inside_while) == 0:
                        sys.stderr.write('Error: continue outside while\n')
                        update_error()
                    emit('goto BEGIN_WHILE_' + str(while_max-1), 0)
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NAME = None # Token

        def NAME(self):
            return self.getToken(JacParser.NAME, 0)

        def OP_PAR(self):
            return self.getToken(JacParser.OP_PAR, 0)

        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def arguments(self):
            return self.getTypedRuleContext(JacParser.ArgumentsContext,0)


        def getRuleIndex(self):
            return JacParser.RULE_st_call




    def st_call(self):

        localctx = JacParser.St_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_st_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 183
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 184
            self.match(JacParser.OP_PAR)
            self.state = 186
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.READINT) | (1 << JacParser.READSTR) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER) | (1 << JacParser.STRING))) != 0):
                self.state = 185
                self.arguments()


            self.state = 188
            self.match(JacParser.CL_PAR)
            if 1:
                    global function_table, arg_max, function_error, has_return
                    I = ''
                    if (None if localctx._NAME is None else localctx._NAME.text)+'I' in function_table or (None if localctx._NAME is None else localctx._NAME.text)+'V' in function_table :
                        if (None if localctx._NAME is None else localctx._NAME.text)+'I' in function_table:
                            currentType = 'I'
                        else:
                            currentType = 'V'

                        if function_error == True:
                            if currentType == 'I':
                                sys.stderr.write('Error in function call: function "' + (None if localctx._NAME is None else localctx._NAME.text) + '" needs to return a value\n')
                            else:
                                sys.stderr.write('Error in function call: all arguments must be integer\n')
                            update_error()
                        if param_table[function_table.index((None if localctx._NAME is None else localctx._NAME.text)+currentType)] != arg_max:
                            sys.stderr.write('Error in function call: wrong number of arguments\n')
                            update_error()
                        for j in range(0, arg_max):
                            I += 'I'
                        print('    invokestatic Test/' + (None if localctx._NAME is None else localctx._NAME.text) + '(' + I + ')' + currentType)
                    else:
                        sys.stderr.write('Error in function call: function "' + (None if localctx._NAME is None else localctx._NAME.text) + '" not declared\n')
                        update_error()
                    arg_max = 0
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class St_returnContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.e = None # ExpressionContext

        def RETURN(self):
            return self.getToken(JacParser.RETURN, 0)

        def expression(self):
            return self.getTypedRuleContext(JacParser.ExpressionContext,0)


        def getRuleIndex(self):
            return JacParser.RULE_st_return




    def st_return(self):

        localctx = JacParser.St_returnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_st_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 191
            self.match(JacParser.RETURN)
            self.state = 192
            localctx.e = self.expression()
            if 1:
                    global has_return
                    if function_table[len(function_table)-1].endswith('V'):
                        sys.stderr.write('Error in return: void function cannot return a value\n')
                        update_error()
                    else:
                        if localctx.e.type == 'i':
                            print('    ireturn')
                        else:
                            sys.stderr.write('Error in return: function must return an integer value\n')
                            update_error()
                        has_return = True    
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.e1 = None # ExpressionContext
            self.e2 = None # ExpressionContext

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(JacParser.ExpressionContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.COMMA)
            else:
                return self.getToken(JacParser.COMMA, i)

        def getRuleIndex(self):
            return JacParser.RULE_arguments




    def arguments(self):

        localctx = JacParser.ArgumentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_arguments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    global arg_max, function_error
                    arg_max = 0
                
            self.state = 196
            localctx.e1 = self.expression()
            if 1:
                    arg_max += 1
                    if localctx.e1.type != 'i':
                        update_error()
                        function_error = True
                
            self.state = 204
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.COMMA:
                self.state = 198
                self.match(JacParser.COMMA)
                self.state = 199
                localctx.e2 = self.expression()
                if 1:
                        arg_max += 1
                        if localctx.e2.type != 'i':
                            function_error = True
                            update_error()
                    
                self.state = 206
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comparison_ifContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.type = None
            self.e1 = None # ExpressionContext
            self.op = None # Token
            self.e2 = None # ExpressionContext

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(JacParser.ExpressionContext,i)


        def EQ(self):
            return self.getToken(JacParser.EQ, 0)

        def NE(self):
            return self.getToken(JacParser.NE, 0)

        def GT(self):
            return self.getToken(JacParser.GT, 0)

        def GE(self):
            return self.getToken(JacParser.GE, 0)

        def LT(self):
            return self.getToken(JacParser.LT, 0)

        def LE(self):
            return self.getToken(JacParser.LE, 0)

        def getRuleIndex(self):
            return JacParser.RULE_comparison_if




    def comparison_if(self):

        localctx = JacParser.Comparison_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_comparison_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 207
            localctx.e1 = self.expression()
            self.state = 208
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 209
            localctx.e2 = self.expression()
            if 1:
                    if localctx.e1.type != localctx.e2.type:
                        sys.stderr.write('Error in comparison: operator cannot use string type\n')
                        update_error()
                    if (0 if localctx.op is None else localctx.op.type) == JacParser.EQ:
                        localctx.type = 'if_icmpne'
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.NE:
                        localctx.type = 'if_icmpeq'
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GT:
                        localctx.type = 'if_icmple'
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GE:
                        localctx.type = 'if_icmplt'
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LT:
                        localctx.type = 'if_icmpge'
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LE:
                        localctx.type = 'if_icmpgt'
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comparison_whileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.e1 = None # ExpressionContext
            self.op = None # Token
            self.e2 = None # ExpressionContext

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(JacParser.ExpressionContext,i)


        def EQ(self):
            return self.getToken(JacParser.EQ, 0)

        def NE(self):
            return self.getToken(JacParser.NE, 0)

        def GT(self):
            return self.getToken(JacParser.GT, 0)

        def GE(self):
            return self.getToken(JacParser.GE, 0)

        def LT(self):
            return self.getToken(JacParser.LT, 0)

        def LE(self):
            return self.getToken(JacParser.LE, 0)

        def getRuleIndex(self):
            return JacParser.RULE_comparison_while




    def comparison_while(self):

        localctx = JacParser.Comparison_whileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_comparison_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 212
            localctx.e1 = self.expression()
            self.state = 213
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 214
            localctx.e2 = self.expression()
            if 1:
                    if localctx.e1.type != localctx.e2.type:
                        sys.stderr.write('Error in comparison: operator cannot use string type\n')
                        update_error()
                    if (0 if localctx.op is None else localctx.op.type) == JacParser.EQ:
                        emit('if_icmpne END_WHILE_'+str(while_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.NE:
                        emit('if_icmpeq END_WHILE_'+str(while_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GT:
                        emit('if_icmple END_WHILE_'+str(while_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GE:
                        emit('if_icmplt END_WHILE_'+str(while_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LT:
                        emit('if_icmpge END_WHILE_'+str(while_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LE:
                        emit('if_icmpgt END_WHILE_'+str(while_max), -2)
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.type = None
            self.t1 = None # TermContext
            self.op = None # Token
            self.t2 = None # TermContext

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.TermContext)
            else:
                return self.getTypedRuleContext(JacParser.TermContext,i)


        def PLUS(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.PLUS)
            else:
                return self.getToken(JacParser.PLUS, i)

        def MINUS(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.MINUS)
            else:
                return self.getToken(JacParser.MINUS, i)

        def getRuleIndex(self):
            return JacParser.RULE_expression




    def expression(self):

        localctx = JacParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            localctx.t1 = self.term()
            self.state = 224
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.PLUS or _la==JacParser.MINUS:
                self.state = 218
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==JacParser.PLUS or _la==JacParser.MINUS):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 219
                localctx.t2 = self.term()
                if 1: 
                        if localctx.t1.type != localctx.t2.type or localctx.t1.type != 'i' or localctx.t2.type != 'i':
                            sys.stderr.write('Error in expression: operator cannot combine different types\n')
                            update_error()
                        if (0 if localctx.op is None else localctx.op.type) == JacParser.PLUS:
                            emit('    iadd', -1)
                        if (0 if localctx.op is None else localctx.op.type) == JacParser.MINUS:
                            emit('    isub', -1)
                    
                self.state = 226
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            if 1:
                    localctx.type = localctx.t1.type
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.type = None
            self.f1 = None # FactorContext
            self.op = None # Token
            self.f2 = None # FactorContext

        def factor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.FactorContext)
            else:
                return self.getTypedRuleContext(JacParser.FactorContext,i)


        def TIMES(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.TIMES)
            else:
                return self.getToken(JacParser.TIMES, i)

        def OVER(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.OVER)
            else:
                return self.getToken(JacParser.OVER, i)

        def REM(self, i:int=None):
            if i is None:
                return self.getTokens(JacParser.REM)
            else:
                return self.getToken(JacParser.REM, i)

        def getRuleIndex(self):
            return JacParser.RULE_term




    def term(self):

        localctx = JacParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 229
            localctx.f1 = self.factor()
            self.state = 236
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0):
                self.state = 230
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 231
                localctx.f2 = self.factor()
                if 1:
                        if localctx.f1.type != localctx.f2.type or localctx.f1.type != 'i' or localctx.f2.type != 'i':
                            sys.stderr.write('Error in term: operator cannot combine different types\n')
                            update_error()
                        else:
                            if (0 if localctx.op is None else localctx.op.type) == JacParser.TIMES:
                                emit('    imul', -1)
                            if (0 if localctx.op is None else localctx.op.type) == JacParser.OVER:
                                emit('    idiv', -1)
                            if (0 if localctx.op is None else localctx.op.type) == JacParser.REM:
                                emit('    irem', -1)
                    
                self.state = 238
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            if 1:
                    localctx.type = localctx.f1.type
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.type = None
            self._NUMBER = None # Token
            self._STRING = None # Token
            self.e = None # ExpressionContext
            self._NAME = None # Token

        def NUMBER(self):
            return self.getToken(JacParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(JacParser.STRING, 0)

        def OP_PAR(self):
            return self.getToken(JacParser.OP_PAR, 0)

        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def expression(self):
            return self.getTypedRuleContext(JacParser.ExpressionContext,0)


        def NAME(self):
            return self.getToken(JacParser.NAME, 0)

        def arguments(self):
            return self.getTypedRuleContext(JacParser.ArgumentsContext,0)


        def READINT(self):
            return self.getToken(JacParser.READINT, 0)

        def READSTR(self):
            return self.getToken(JacParser.READSTR, 0)

        def getRuleIndex(self):
            return JacParser.RULE_factor




    def factor(self):

        localctx = JacParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_factor)
        self._la = 0 # Token type
        try:
            self.state = 267
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 241
                localctx._NUMBER = self.match(JacParser.NUMBER)
                if 1:
                        global symbol_table, function_table, function_error
                        emit('    ldc ' + str((None if localctx._NUMBER is None else localctx._NUMBER.text)), +1)
                        localctx.type = 'i'
                    
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 243
                localctx._STRING = self.match(JacParser.STRING)
                if 1:
                        emit('    ldc ' + str((None if localctx._STRING is None else localctx._STRING.text)), +1)
                        localctx.type = 's'
                    
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 245
                self.match(JacParser.OP_PAR)
                self.state = 246
                localctx.e = self.expression()
                self.state = 247
                self.match(JacParser.CL_PAR)
                if 1:
                        localctx.type = localctx.e.type
                    
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 250
                localctx._NAME = self.match(JacParser.NAME)
                self.state = 251
                self.match(JacParser.OP_PAR)
                self.state = 253
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.READINT) | (1 << JacParser.READSTR) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER) | (1 << JacParser.STRING))) != 0):
                    self.state = 252
                    self.arguments()


                self.state = 255
                self.match(JacParser.CL_PAR)
                if 1:
                        global arg_max
                        I = ''
                        if (None if localctx._NAME is None else localctx._NAME.text)+'I' in function_table:
                            currentType = 'I'
                        else:
                            currentType = 'V'

                        if (None if localctx._NAME is None else localctx._NAME.text)+currentType in function_table:
                            if function_table[function_table.index((None if localctx._NAME is None else localctx._NAME.text)+currentType)].endswith('V'):
                                update_error()
                                function_error = True
                                localctx.type = 'void'
                            else:
                                for i in range(arg_max):
                                    I += 'I'
                                print('    invokestatic Test/' + (None if localctx._NAME is None else localctx._NAME.text) + '(' + I + ')' + currentType)
                                localctx.type = 'i'
                    
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 257
                localctx._NAME = self.match(JacParser.NAME)
                if 1:
                        if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                            sys.stderr.write('Error in factor: Variable ' + (None if localctx._NAME is None else localctx._NAME.text) + ' is not declared\n')
                            localctx.type = 'error'
                            exit(1)
                        else:
                            if symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 'i':
                                emit('    iload ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                                used_table[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] = True
                                localctx.type = symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))]
                            elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 's':
                                emit('    aload ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                                used_table[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] = True
                                localctx.type = symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))]
                    
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 259
                self.match(JacParser.READINT)
                self.state = 260
                self.match(JacParser.OP_PAR)
                self.state = 261
                self.match(JacParser.CL_PAR)
                if 1:
                        emit('invokestatic Runtime/readInt()I', +1)
                        localctx.type = 'i'
                    
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 263
                self.match(JacParser.READSTR)
                self.state = 264
                self.match(JacParser.OP_PAR)
                self.state = 265
                self.match(JacParser.CL_PAR)
                if 1:
                        emit('invokestatic Runtime/readString()Ljava/lang/String;', +1)
                        localctx.type = 's'
                    
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





