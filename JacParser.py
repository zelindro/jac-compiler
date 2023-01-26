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
assin = False

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
    global stack_max, symbol_table, symbol_type, used_table
    stack_max = 0
    symbol_table = []
    symbol_type = []
    used_table = []

def update_error():
    global has_error
    has_error = True


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"")
        buf.write("\u00e5\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\6\3\62")
        buf.write("\n\3\r\3\16\3\63\3\3\3\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\4")
        buf.write("\3\4\3\4\3\4\3\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3")
        buf.write("\4\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\6\3\6")
        buf.write("\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7")
        buf.write("\3\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\5\7o\n\7")
        buf.write("\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\6\t\177\n\t\r\t\16\t\u0080\3\t\3\t\3\t\3\n\3\n\3\n")
        buf.write("\3\n\3\n\3\n\3\n\6\n\u008d\n\n\r\n\16\n\u008e\3\n\3\n")
        buf.write("\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009d")
        buf.write("\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7")
        buf.write("\16\u00a9\n\16\f\16\16\16\u00ac\13\16\3\17\3\17\3\17\3")
        buf.write("\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21")
        buf.write("\3\21\7\21\u00bd\n\21\f\21\16\21\u00c0\13\21\3\21\3\21")
        buf.write("\3\22\3\22\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc")
        buf.write("\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3")
        buf.write("\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23")
        buf.write("\3\23\5\23\u00e3\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22")
        buf.write("\24\26\30\32\34\36 \"$\2\5\3\2\25\32\3\2\13\f\3\2\r\17")
        buf.write("\2\u00eb\2&\3\2\2\2\4/\3\2\2\2\6\67\3\2\2\2\bK\3\2\2\2")
        buf.write("\n]\3\2\2\2\f_\3\2\2\2\16s\3\2\2\2\20x\3\2\2\2\22\u0085")
        buf.write("\3\2\2\2\24\u0093\3\2\2\2\26\u0096\3\2\2\2\30\u0099\3")
        buf.write("\2\2\2\32\u00a1\3\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3\2")
        buf.write("\2\2 \u00b7\3\2\2\2\"\u00c3\3\2\2\2$\u00e2\3\2\2\2&*\b")
        buf.write("\2\1\2\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2")
        buf.write("\2\2+-\3\2\2\2,*\3\2\2\2-.\5\4\3\2.\3\3\2\2\2/\61\b\3")
        buf.write("\1\2\60\62\5\n\6\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3")
        buf.write("\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\3\1\2\66\5")
        buf.write("\3\2\2\2\678\7\n\2\289\7\33\2\29;\7\20\2\2:<\5\b\5\2;")
        buf.write(":\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\21\2\2>?\7\23\2\2?@")
        buf.write("\b\4\1\2@A\7!\2\2AE\b\4\1\2BD\5\n\6\2CB\3\2\2\2DG\3\2")
        buf.write("\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\"\2\2")
        buf.write("IJ\b\4\1\2J\7\3\2\2\2KL\7\33\2\2LR\b\5\1\2MN\7\24\2\2")
        buf.write("NO\7\33\2\2OQ\b\5\1\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS")
        buf.write("\3\2\2\2S\t\3\2\2\2TR\3\2\2\2U^\5\30\r\2V^\7\37\2\2W^")
        buf.write("\5\f\7\2X^\5\16\b\2Y^\5\20\t\2Z^\5\22\n\2[^\5\24\13\2")
        buf.write("\\^\5\26\f\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]")
        buf.write("Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_")
        buf.write("`\7\7\2\2`n\7\20\2\2ab\b\7\1\2bc\5 \21\2ck\b\7\1\2de\7")
        buf.write("\24\2\2ef\b\7\1\2fg\5 \21\2gh\b\7\1\2hj\3\2\2\2id\3\2")
        buf.write("\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2")
        buf.write("na\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\21\2\2qr\b\7\1\2r\r")
        buf.write("\3\2\2\2st\7\33\2\2tu\7\22\2\2uv\5 \21\2vw\b\b\1\2w\17")
        buf.write("\3\2\2\2xy\7\3\2\2yz\5\34\17\2z{\7\23\2\2{|\b\t\1\2|~")
        buf.write("\7!\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080")
        buf.write("~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082")
        buf.write("\u0083\7\"\2\2\u0083\u0084\b\t\1\2\u0084\21\3\2\2\2\u0085")
        buf.write("\u0086\7\4\2\2\u0086\u0087\b\n\1\2\u0087\u0088\5\36\20")
        buf.write("\2\u0088\u0089\7\23\2\2\u0089\u008a\b\n\1\2\u008a\u008c")
        buf.write("\7!\2\2\u008b\u008d\5\n\6\2\u008c\u008b\3\2\2\2\u008d")
        buf.write("\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2")
        buf.write("\u008f\u0090\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0092\b")
        buf.write("\n\1\2\u0092\23\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095")
        buf.write("\b\13\1\2\u0095\25\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098")
        buf.write("\b\f\1\2\u0098\27\3\2\2\2\u0099\u009a\7\33\2\2\u009a\u009c")
        buf.write("\7\20\2\2\u009b\u009d\5\32\16\2\u009c\u009b\3\2\2\2\u009c")
        buf.write("\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\21\2")
        buf.write("\2\u009f\u00a0\b\r\1\2\u00a0\31\3\2\2\2\u00a1\u00a2\b")
        buf.write("\16\1\2\u00a2\u00a3\5 \21\2\u00a3\u00aa\b\16\1\2\u00a4")
        buf.write("\u00a5\7\24\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\b\16\1")
        buf.write("\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac")
        buf.write("\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab")
        buf.write("\33\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5 \21\2\u00ae")
        buf.write("\u00af\t\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\b\17\1")
        buf.write("\2\u00b1\35\3\2\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\t")
        buf.write("\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\b\20\1\2\u00b6")
        buf.write("\37\3\2\2\2\u00b7\u00be\5\"\22\2\u00b8\u00b9\t\3\2\2\u00b9")
        buf.write("\u00ba\5\"\22\2\u00ba\u00bb\b\21\1\2\u00bb\u00bd\3\2\2")
        buf.write("\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc")
        buf.write("\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0")
        buf.write("\u00be\3\2\2\2\u00c1\u00c2\b\21\1\2\u00c2!\3\2\2\2\u00c3")
        buf.write("\u00ca\5$\23\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6\5$\23\2")
        buf.write("\u00c6\u00c7\b\22\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4")
        buf.write("\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca")
        buf.write("\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2")
        buf.write("\u00cd\u00ce\b\22\1\2\u00ce#\3\2\2\2\u00cf\u00d0\7\34")
        buf.write("\2\2\u00d0\u00e3\b\23\1\2\u00d1\u00d2\7\35\2\2\u00d2\u00e3")
        buf.write("\b\23\1\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5 \21\2\u00d5")
        buf.write("\u00d6\7\21\2\2\u00d6\u00d7\b\23\1\2\u00d7\u00e3\3\2\2")
        buf.write("\2\u00d8\u00d9\7\33\2\2\u00d9\u00e3\b\23\1\2\u00da\u00db")
        buf.write("\7\b\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\7\21\2\2\u00dd")
        buf.write("\u00e3\b\23\1\2\u00de\u00df\7\t\2\2\u00df\u00e0\7\20\2")
        buf.write("\2\u00e0\u00e1\7\21\2\2\u00e1\u00e3\b\23\1\2\u00e2\u00cf")
        buf.write("\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2")
        buf.write("\u00d8\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00de\3\2\2\2")
        buf.write("\u00e3%\3\2\2\2\21*\63;ER]kn\u0080\u008e\u009c\u00aa\u00be")
        buf.write("\u00ca\u00e2")
        return buf.getvalue()


class JacParser ( Parser ):

    grammarFileName = "Jac.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'if'", "'while'", "'break'", "'continue'", 
                     "'print'", "'readint'", "'readstr'", "'def'", "'+'", 
                     "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "':'", 
                     "','", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>", "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", 
                      "READINT", "READSTR", "DEF", "PLUS", "MINUS", "TIMES", 
                      "OVER", "REM", "OP_PAR", "CL_PAR", "ATTRIB", "COLON", 
                      "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", "NAME", 
                      "NUMBER", "STRING", "COMMENT", "NL", "SPACE", "INDENT", 
                      "DEDENT" ]

    RULE_program = 0
    RULE_main = 1
    RULE_function = 2
    RULE_parameters = 3
    RULE_statement = 4
    RULE_st_print = 5
    RULE_st_attrib = 6
    RULE_st_if = 7
    RULE_st_while = 8
    RULE_st_break = 9
    RULE_st_continue = 10
    RULE_st_call = 11
    RULE_arguments = 12
    RULE_comparison_if = 13
    RULE_comparison_while = 14
    RULE_expression = 15
    RULE_term = 16
    RULE_factor = 17

    ruleNames =  [ "program", "main", "function", "parameters", "statement", 
                   "st_print", "st_attrib", "st_if", "st_while", "st_break", 
                   "st_continue", "st_call", "arguments", "comparison_if", 
                   "comparison_while", "expression", "term", "factor" ]

    EOF = Token.EOF
    IF=1
    WHILE=2
    BREAK=3
    CONTINUE=4
    PRINT=5
    READINT=6
    READSTR=7
    DEF=8
    PLUS=9
    MINUS=10
    TIMES=11
    OVER=12
    REM=13
    OP_PAR=14
    CL_PAR=15
    ATTRIB=16
    COLON=17
    COMMA=18
    EQ=19
    NE=20
    GT=21
    GE=22
    LT=23
    LE=24
    NAME=25
    NUMBER=26
    STRING=27
    COMMENT=28
    NL=29
    SPACE=30
    INDENT=31
    DEDENT=32

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
                
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.DEF:
                self.state = 37
                self.function()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 43
            self.main()
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
        self.enterRule(localctx, 2, self.RULE_main)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    print('.method public static main([Ljava/lang/String;)V')
                
            self.state = 47 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 46
                self.statement()
                self.state = 49 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
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

        def INDENT(self):
            return self.getToken(JacParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(JacParser.DEDENT, 0)

        def parameters(self):
            return self.getTypedRuleContext(JacParser.ParametersContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_function




    def function(self):

        localctx = JacParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_function)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(JacParser.DEF)
            self.state = 54
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 55
            self.match(JacParser.OP_PAR)
            self.state = 57
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==JacParser.NAME:
                self.state = 56
                self.parameters()


            self.state = 59
            self.match(JacParser.CL_PAR)
            self.state = 60
            self.match(JacParser.COLON)
            if 1:
                    global function_table, param_table, symbol_table
                    assin = True

                    if (None if localctx._NAME is None else localctx._NAME.text) not in function_table:
                        function_table.append((None if localctx._NAME is None else localctx._NAME.text))
                    else:
                        sys.stderr.write('Error: function ' + (None if localctx._NAME is None else localctx._NAME.text) + ' already declared\n')
                        update_error()
                
            self.state = 62
            self.match(JacParser.INDENT)
            if 1:
                    I = ''
                    for l in range(0, len(symbol_table)):
                        I = I + 'I'
                    param_table.append(len(symbol_table))
                    if (None if localctx._NAME is None else localctx._NAME.text) + 'I' not in function_table and (None if localctx._NAME is None else localctx._NAME.text) + 'V' not in function_table:
                        print('.method public static ' + (None if localctx._NAME is None else localctx._NAME.text) + '(' + I + ')V')
                
            self.state = 67
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0):
                self.state = 64
                self.statement()
                self.state = 69
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 70
            self.match(JacParser.DEDENT)
            if 1:
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
        self.enterRule(localctx, 6, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            localctx._NAME = self.match(JacParser.NAME)
            if 1:
                    symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                    used_table.append(False)
                    symbol_type.append('i')
                
            self.state = 80
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.COMMA:
                self.state = 75
                self.match(JacParser.COMMA)
                self.state = 76
                localctx._NAME = self.match(JacParser.NAME)
                if 1:
                        if (None if localctx._NAME is None else localctx._NAME.text) in symbol_table:
                            sys.stderr.write('Error: variable ' + (None if localctx._NAME is None else localctx._NAME.text) + ' already declared\n')
                            update_error()
                        else:
                            symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                            used_table.append(False)
                            symbol_type.append('i')
                    
                self.state = 82
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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

        def st_call(self):
            return self.getTypedRuleContext(JacParser.St_callContext,0)


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


        def getRuleIndex(self):
            return JacParser.RULE_statement




    def statement(self):

        localctx = JacParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_statement)
        try:
            self.state = 91
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 83
                self.st_call()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 84
                self.match(JacParser.NL)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 85
                self.st_print()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 86
                self.st_attrib()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 87
                self.st_if()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 88
                self.st_while()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 89
                self.st_break()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 90
                self.st_continue()
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
            self.state = 93
            self.match(JacParser.PRINT)
            self.state = 94
            self.match(JacParser.OP_PAR)
            self.state = 108
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.READINT) | (1 << JacParser.READSTR) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER) | (1 << JacParser.STRING))) != 0):
                if 1:
                        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                    
                self.state = 96
                localctx.e1 = self.expression()
                if 1:
                        if localctx.e1.type == 'i':
                            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
                        elif localctx.e1.type == 's':
                            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
                        else:
                            sys.stderr.write('**HELP**\n')
                            exit(1)
                    
                self.state = 105
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==JacParser.COMMA:
                    self.state = 98
                    self.match(JacParser.COMMA)
                    if 1:
                            emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                        
                    self.state = 100
                    localctx.e2 = self.expression()
                    if 1:
                            if localctx.e2.type == 'i':
                                emit('invokevirtual java/io/PrintStream/print(I)V', -2)
                            elif localctx.e2.type == 's':
                                emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
                            else:
                                sys.stderr.write('**HELP**\n')
                                exit(1)
                        
                    self.state = 107
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 110
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
            self.state = 113
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 114
            self.match(JacParser.ATTRIB)
            self.state = 115
            localctx._expression = self.expression()
            if 1:
                    if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                        symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                        symbol_type.append(localctx._expression.type)
                        used_table.append(False)

                    if symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 'i':
                        if localctx._expression.type == 'error' or localctx._expression.type == 's':
                            sys.stderr.write('Error in attribution: integer variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" cannot receive a string expression\n')
                            update_error()
                        elif localctx._expression.type == 'i':
                            emit('    istore ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), -1)
                        else:
                            sys.stderr.write('**HELP NAME ATTRIB**')
                            exit(1)
                    elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 's':
                        if localctx._expression.type == 'error' or localctx._expression.type == 'i':
                            sys.stderr.write('Error in attribution: integer variable "' + (None if localctx._NAME is None else localctx._NAME.text) + '" cannot receive a integer expression\n')
                            update_error()
                        elif localctx._expression.type == 's':
                            emit('    astore ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), -1)
                        else:
                            sys.stderr.write('**HELP NAME ATTRIB**')
                            exit(1)
                    else:
                        sys.stderr.write('**HELP NAME ATTRIB**')
                        exit(1)
                
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

        def COLON(self):
            return self.getToken(JacParser.COLON, 0)

        def INDENT(self):
            return self.getToken(JacParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(JacParser.DEDENT, 0)

        def comparison_if(self):
            return self.getTypedRuleContext(JacParser.Comparison_ifContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_st_if




    def st_if(self):

        localctx = JacParser.St_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_st_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 118
            self.match(JacParser.IF)
            self.state = 119
            localctx.cmp = self.comparison_if()
            self.state = 120
            self.match(JacParser.COLON)
            if 1:
                    global if_max
                    emit(localctx.cmp.type + ' NOT_IF_' + str(if_max), -2)
                    local_if = if_max
                    if_max += 1
                
            self.state = 122
            self.match(JacParser.INDENT)
            self.state = 124 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 123
                self.statement()
                self.state = 126 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                    break

            self.state = 128
            self.match(JacParser.DEDENT)
            if 1:
                    print('NOT_IF_' + str(local_if) + ':')
                    if_counter()
                
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
            self.state = 131
            self.match(JacParser.WHILE)
            if 1:
                    global while_max
                    local_while = while_max
                    print('BEGIN_WHILE_' + str(local_while) + ':')
                    inside_while.append(local_while)
                
            self.state = 133
            self.comparison_while()
            self.state = 134
            self.match(JacParser.COLON)
            if 1:
                    while_max += 1
                
            self.state = 136
            self.match(JacParser.INDENT)
            self.state = 138 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 137
                self.statement()
                self.state = 140 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.BREAK) | (1 << JacParser.CONTINUE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME) | (1 << JacParser.NL))) != 0)):
                    break

            self.state = 142
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
            self.state = 145
            self.match(JacParser.BREAK)
            if 1:
                    if len(inside_while) == 0:
                        sys.stderr.write('Error: break outside while\n')
                        exit(1)
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
            self.state = 148
            self.match(JacParser.CONTINUE)
            if 1:
                    if len(inside_while) == 0:
                        sys.stderr.write('Error: continue outside while\n')
                        exit(1)
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
            self.state = 151
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 152
            self.match(JacParser.OP_PAR)
            self.state = 154
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.READINT) | (1 << JacParser.READSTR) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER) | (1 << JacParser.STRING))) != 0):
                self.state = 153
                self.arguments()


            self.state = 156
            self.match(JacParser.CL_PAR)
            if 1:
                    global function_table, arg_max, function_error
                    I = ''
                    if (None if localctx._NAME is None else localctx._NAME.text) in function_table:
                        if param_table[function_table.index((None if localctx._NAME is None else localctx._NAME.text))] != arg_max:
                            sys.stderr.write('Error in function call: wrong number of arguments\n')
                            update_error()
                        if function_error:
                            sys.stderr.write('Error in function call: wrong type of arguments\n')
                            update_error()
                        for j in range(0, arg_max):
                            I += 'I'
                        print('    invokestatic Test/' + (None if localctx._NAME is None else localctx._NAME.text) + '(' + I + ')V')
                    else:
                        sys.stderr.write('Error in function call: function "' + (None if localctx._NAME is None else localctx._NAME.text) + '" not declared\n')
                        update_error()
                    
                
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
        self.enterRule(localctx, 24, self.RULE_arguments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    global arg_max, function_error
                    arg_max = 0
                
            self.state = 160
            localctx.e1 = self.expression()
            if 1:
                    arg_max += 1
                    if localctx.e1.type != 'i':
                        function_error = True
                
            self.state = 168
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.COMMA:
                self.state = 162
                self.match(JacParser.COMMA)
                self.state = 163
                localctx.e2 = self.expression()
                if 1:
                        arg_max += 1
                        if localctx.e2.type != 'i':
                            function_error = True
                    
                self.state = 170
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
        self.enterRule(localctx, 26, self.RULE_comparison_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 171
            localctx.e1 = self.expression()
            self.state = 172
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 173
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
        self.enterRule(localctx, 28, self.RULE_comparison_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            localctx.e1 = self.expression()
            self.state = 177
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 178
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
        self.enterRule(localctx, 30, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 181
            localctx.t1 = self.term()
            self.state = 188
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.PLUS or _la==JacParser.MINUS:
                self.state = 182
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==JacParser.PLUS or _la==JacParser.MINUS):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 183
                localctx.t2 = self.term()
                if 1:
                        if localctx.t1.type != localctx.t2.type or localctx.t1.type == 's' or localctx.t2.type == 's':
                            sys.stderr.write('Error in expression: operator cannot use string type\n')
                            update_error()

                        else:
                            if (0 if localctx.op is None else localctx.op.type) == JacParser.PLUS:
                                emit('    iadd', -1)
                            else:
                                emit('    isub', -1)
                    
                self.state = 190
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
        self.enterRule(localctx, 32, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 193
            localctx.f1 = self.factor()
            self.state = 200
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0):
                self.state = 194
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 195
                localctx.f2 = self.factor()
                if 1:
                        if localctx.f1.type != localctx.f2.type or localctx.f1.type == 's' or localctx.f2.type == 's':
                            sys.stderr.write('Error in term: operator cannot use string type\n')
                            update_error()

                        else:
                            if (0 if localctx.op is None else localctx.op.type) == JacParser.TIMES:
                                emit('    imul', -1)
                            elif (0 if localctx.op is None else localctx.op.type) == JacParser.OVER:
                                emit('    idiv', -1)
                            else:
                                emit('    irem', -1)
                    
                self.state = 202
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

        def READINT(self):
            return self.getToken(JacParser.READINT, 0)

        def READSTR(self):
            return self.getToken(JacParser.READSTR, 0)

        def getRuleIndex(self):
            return JacParser.RULE_factor




    def factor(self):

        localctx = JacParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_factor)
        try:
            self.state = 224
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JacParser.NUMBER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 205
                localctx._NUMBER = self.match(JacParser.NUMBER)
                if 1:
                        emit('    ldc ' + str((None if localctx._NUMBER is None else localctx._NUMBER.text)), +1)
                        localctx.type = 'i'
                    
                pass
            elif token in [JacParser.STRING]:
                self.enterOuterAlt(localctx, 2)
                self.state = 207
                localctx._STRING = self.match(JacParser.STRING)
                if 1:
                        emit('    ldc ' + str((None if localctx._STRING is None else localctx._STRING.text)), +1)
                        localctx.type = 's'
                    
                pass
            elif token in [JacParser.OP_PAR]:
                self.enterOuterAlt(localctx, 3)
                self.state = 209
                self.match(JacParser.OP_PAR)
                self.state = 210
                localctx.e = self.expression()
                self.state = 211
                self.match(JacParser.CL_PAR)
                if 1:
                        localctx.type = localctx.e.type
                    
                pass
            elif token in [JacParser.NAME]:
                self.enterOuterAlt(localctx, 4)
                self.state = 214
                localctx._NAME = self.match(JacParser.NAME)
                if 1:
                        if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                            sys.stderr.write('Variable ' + (None if localctx._NAME is None else localctx._NAME.text) + ' is not defined\n')
                            localctx.type = 'error'
                            sys.exit(1)
                        elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 'i':
                            emit('    iload ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                            used_table[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] = True
                            localctx.type = symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))]
                        elif symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] == 's':
                            emit('    aload ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                            used_table[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))] = True
                            localctx.type = symbol_type[symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))]
                    
                pass
            elif token in [JacParser.READINT]:
                self.enterOuterAlt(localctx, 5)
                self.state = 216
                self.match(JacParser.READINT)
                self.state = 217
                self.match(JacParser.OP_PAR)
                self.state = 218
                self.match(JacParser.CL_PAR)
                if 1:
                        emit('invokestatic Runtime/readInt()I', +1)
                        localctx.type = 'i'
                    
                pass
            elif token in [JacParser.READSTR]:
                self.enterOuterAlt(localctx, 6)
                self.state = 220
                self.match(JacParser.READSTR)
                self.state = 221
                self.match(JacParser.OP_PAR)
                self.state = 222
                self.match(JacParser.CL_PAR)
                if 1:
                        emit('invokestatic Runtime/readString()Ljava/lang/String;', +1)
                        localctx.type = 's'
                    
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





