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

stack_cur = 0 
stack_max = 0
if_max = 1
while_max = 1

def emit(bytecode, delta):
    global stack_cur, stack_max
    stack_cur += delta
    if stack_cur > stack_max:
        stack_max = stack_cur
    print('    ' + bytecode + '    ; delta=' + str(delta))

def if_counter():
    global if_max
    if_max += 1



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35")
        buf.write("\u008a\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2")
        buf.write("\3\2\3\2\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3\4\3\4\3")
        buf.write("\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3")
        buf.write("\5\7\5\66\n\5\f\5\16\59\13\5\5\5;\n\5\3\5\3\5\3\5\3\6")
        buf.write("\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7J\n\7\r\7\16\7")
        buf.write("K\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\6\bW\n\b\r\b\16")
        buf.write("\bX\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3")
        buf.write("\n\3\13\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13")
        buf.write("\13\3\f\3\f\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\3")
        buf.write("\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n")
        buf.write("\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\24")
        buf.write("\31\3\2\t\n\3\2\13\r\2\u008a\2\32\3\2\2\2\4\35\3\2\2\2")
        buf.write("\6)\3\2\2\2\b+\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16P\3\2\2")
        buf.write("\2\20]\3\2\2\2\22b\3\2\2\2\24g\3\2\2\2\26q\3\2\2\2\30")
        buf.write("\u0087\3\2\2\2\32\33\b\2\1\2\33\34\5\4\3\2\34\3\3\2\2")
        buf.write("\2\35\37\b\3\1\2\36 \5\6\4\2\37\36\3\2\2\2 !\3\2\2\2!")
        buf.write("\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\b\3\1\2$\5\3\2\2\2")
        buf.write("%*\5\b\5\2&*\5\n\6\2\'*\5\f\7\2(*\5\16\b\2)%\3\2\2\2)")
        buf.write("&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\7\7\2\2,:")
        buf.write("\7\16\2\2-.\b\5\1\2./\5\24\13\2/\67\b\5\1\2\60\61\7\23")
        buf.write("\2\2\61\62\b\5\1\2\62\63\5\24\13\2\63\64\b\5\1\2\64\66")
        buf.write("\3\2\2\2\65\60\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3")
        buf.write("\2\2\28;\3\2\2\29\67\3\2\2\2:-\3\2\2\2:;\3\2\2\2;<\3\2")
        buf.write("\2\2<=\7\17\2\2=>\b\5\1\2>\t\3\2\2\2?@\7\32\2\2@A\7\22")
        buf.write("\2\2AB\5\24\13\2BC\b\6\1\2C\13\3\2\2\2DE\7\3\2\2EF\5\20")
        buf.write("\t\2FG\b\7\1\2GI\7\20\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2")
        buf.write("\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\21\2\2NO\b\7\1\2")
        buf.write("O\r\3\2\2\2PQ\7\4\2\2QR\b\b\1\2RS\5\22\n\2ST\b\b\1\2T")
        buf.write("V\7\20\2\2UW\5\6\4\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3")
        buf.write("\2\2\2YZ\3\2\2\2Z[\7\21\2\2[\\\b\b\1\2\\\17\3\2\2\2]^")
        buf.write("\5\24\13\2^_\t\2\2\2_`\5\24\13\2`a\b\t\1\2a\21\3\2\2\2")
        buf.write("bc\5\24\13\2cd\t\2\2\2de\5\24\13\2ef\b\n\1\2f\23\3\2\2")
        buf.write("\2gn\5\26\f\2hi\t\3\2\2ij\5\26\f\2jk\b\13\1\2km\3\2\2")
        buf.write("\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\25\3\2\2\2")
        buf.write("pn\3\2\2\2qx\5\30\r\2rs\t\4\2\2st\5\30\r\2tu\b\f\1\2u")
        buf.write("w\3\2\2\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\27")
        buf.write("\3\2\2\2zx\3\2\2\2{|\7\33\2\2|\u0088\b\r\1\2}~\7\16\2")
        buf.write("\2~\177\5\24\13\2\177\u0080\7\17\2\2\u0080\u0088\3\2\2")
        buf.write("\2\u0081\u0082\7\32\2\2\u0082\u0088\b\r\1\2\u0083\u0084")
        buf.write("\7\b\2\2\u0084\u0085\7\16\2\2\u0085\u0086\7\17\2\2\u0086")
        buf.write("\u0088\b\r\1\2\u0087{\3\2\2\2\u0087}\3\2\2\2\u0087\u0081")
        buf.write("\3\2\2\2\u0087\u0083\3\2\2\2\u0088\31\3\2\2\2\13!)\67")
        buf.write(":KXnx\u0087")
        return buf.getvalue()


class JacParser ( Parser ):

    grammarFileName = "Jac.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'if'", "'while'", "'break'", "'continue'", 
                     "'print'", "'readint'", "'+'", "'-'", "'*'", "'/'", 
                     "'%'", "'('", "')'", "'{'", "'}'", "'='", "','", "'=='", 
                     "'!='", "'>'", "'>='", "'<'", "'<='" ]

    symbolicNames = [ "<INVALID>", "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", 
                      "READINT", "PLUS", "MINUS", "TIMES", "OVER", "REM", 
                      "OP_PAR", "CL_PAR", "OP_CUR", "CL_CUR", "ATTRIB", 
                      "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", "NAME", 
                      "NUMBER", "SPACE", "COMMENT" ]

    RULE_program = 0
    RULE_main = 1
    RULE_statement = 2
    RULE_st_print = 3
    RULE_st_attrib = 4
    RULE_st_if = 5
    RULE_st_while = 6
    RULE_comparison_if = 7
    RULE_comparison_while = 8
    RULE_expression = 9
    RULE_term = 10
    RULE_factor = 11

    ruleNames =  [ "program", "main", "statement", "st_print", "st_attrib", 
                   "st_if", "st_while", "comparison_if", "comparison_while", 
                   "expression", "term", "factor" ]

    EOF = Token.EOF
    IF=1
    WHILE=2
    BREAK=3
    CONTINUE=4
    PRINT=5
    READINT=6
    PLUS=7
    MINUS=8
    TIMES=9
    OVER=10
    REM=11
    OP_PAR=12
    CL_PAR=13
    OP_CUR=14
    CL_CUR=15
    ATTRIB=16
    COMMA=17
    EQ=18
    NE=19
    GT=20
    GE=21
    LT=22
    LE=23
    NAME=24
    NUMBER=25
    SPACE=26
    COMMENT=27

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


        def getRuleIndex(self):
            return JacParser.RULE_program




    def program(self):

        localctx = JacParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
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
                
            self.state = 25
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
                    print('.method public static main([Ljava/lang/String;)V\n')
                
            self.state = 29 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 28
                self.statement()
                self.state = 31 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME))) != 0)):
                    break

            if 1:
                    print('    return')
                    if (len(symbol_table) > 0):
                        print('.limit locals ' + str(len(symbol_table)))
                    print('.limit stack ' + str(stack_max))
                    print('.end method')
                    print('\n; symbol_table:', symbol_table)
                
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

        def st_print(self):
            return self.getTypedRuleContext(JacParser.St_printContext,0)


        def st_attrib(self):
            return self.getTypedRuleContext(JacParser.St_attribContext,0)


        def st_if(self):
            return self.getTypedRuleContext(JacParser.St_ifContext,0)


        def st_while(self):
            return self.getTypedRuleContext(JacParser.St_whileContext,0)


        def getRuleIndex(self):
            return JacParser.RULE_statement




    def statement(self):

        localctx = JacParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 39
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JacParser.PRINT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 35
                self.st_print()
                pass
            elif token in [JacParser.NAME]:
                self.enterOuterAlt(localctx, 2)
                self.state = 36
                self.st_attrib()
                pass
            elif token in [JacParser.IF]:
                self.enterOuterAlt(localctx, 3)
                self.state = 37
                self.st_if()
                pass
            elif token in [JacParser.WHILE]:
                self.enterOuterAlt(localctx, 4)
                self.state = 38
                self.st_while()
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


    class St_printContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

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
        self.enterRule(localctx, 6, self.RULE_st_print)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(JacParser.PRINT)
            self.state = 42
            self.match(JacParser.OP_PAR)
            self.state = 56
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.READINT) | (1 << JacParser.OP_PAR) | (1 << JacParser.NAME) | (1 << JacParser.NUMBER))) != 0):
                if 1:
                        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                    
                self.state = 44
                self.expression()
                if 1:
                        emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
                    
                self.state = 53
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==JacParser.COMMA:
                    self.state = 46
                    self.match(JacParser.COMMA)
                    if 1:
                            emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                        
                    self.state = 48
                    self.expression()
                    if 1:
                            emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
                        
                    self.state = 55
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 58
            self.match(JacParser.CL_PAR)
            if 1:
                    emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
                    emit('    invokevirtual java/io/PrintStream/println()V\n', -1)
                
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
        self.enterRule(localctx, 8, self.RULE_st_attrib)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            localctx._NAME = self.match(JacParser.NAME)
            self.state = 62
            self.match(JacParser.ATTRIB)
            self.state = 63
            self.expression()
            if 1:
                    if (None if localctx._NAME is None else localctx._NAME.text) not in symbol_table:
                        symbol_table.append((None if localctx._NAME is None else localctx._NAME.text))
                    emit('    istore ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                
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

        def IF(self):
            return self.getToken(JacParser.IF, 0)

        def comparison_if(self):
            return self.getTypedRuleContext(JacParser.Comparison_ifContext,0)


        def OP_CUR(self):
            return self.getToken(JacParser.OP_CUR, 0)

        def CL_CUR(self):
            return self.getToken(JacParser.CL_CUR, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_st_if




    def st_if(self):

        localctx = JacParser.St_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_st_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(JacParser.IF)
            self.state = 67
            self.comparison_if()
            if 1:
                    global if_max
                    local_if = if_max
                    if_max += 1
                
            self.state = 69
            self.match(JacParser.OP_CUR)
            self.state = 71 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 70
                self.statement()
                self.state = 73 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME))) != 0)):
                    break

            self.state = 75
            self.match(JacParser.CL_CUR)
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


        def OP_CUR(self):
            return self.getToken(JacParser.OP_CUR, 0)

        def CL_CUR(self):
            return self.getToken(JacParser.CL_CUR, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JacParser.StatementContext)
            else:
                return self.getTypedRuleContext(JacParser.StatementContext,i)


        def getRuleIndex(self):
            return JacParser.RULE_st_while




    def st_while(self):

        localctx = JacParser.St_whileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_st_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(JacParser.WHILE)
            if 1:
                    global while_max
                    local_while = while_max
                    print('BEGIN_WHILE_' + str(local_while) + ':')  
                
            self.state = 80
            self.comparison_while()
            if 1:
                    while_max += 1
                
            self.state = 82
            self.match(JacParser.OP_CUR)
            self.state = 84 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 83
                self.statement()
                self.state = 86 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.IF) | (1 << JacParser.WHILE) | (1 << JacParser.PRINT) | (1 << JacParser.NAME))) != 0)):
                    break

            self.state = 88
            self.match(JacParser.CL_CUR)
            if 1:
                    emit('goto BEGIN_WHILE_' + str(local_while), 0)
                    print('END_WHILE_' + str(local_while) + ':')
                
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
            self.op = None # Token

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
        self.enterRule(localctx, 14, self.RULE_comparison_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 91
            self.expression()
            self.state = 92
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 93
            self.expression()
            if 1:
                    if (0 if localctx.op is None else localctx.op.type) == JacParser.EQ:
                        emit('if_icmpne NOT_IF_'+str(if_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.NE:
                        emit('if_icmpeq NOT_IF_'+str(if_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GT:
                        emit('if_icmple NOT_IF_'+str(if_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.GE:
                        emit('if_icmplt NOT_IF_'+str(if_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LT:
                        emit('if_icmpge NOT_IF_'+str(if_max), -2)
                    elif (0 if localctx.op is None else localctx.op.type) == JacParser.LE:
                        emit('if_icmpgt NOT_IF_'+str(if_max), -2)
                
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
            self.op = None # Token

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
        self.enterRule(localctx, 16, self.RULE_comparison_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.expression()
            self.state = 97
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.EQ) | (1 << JacParser.NE) | (1 << JacParser.GT) | (1 << JacParser.GE) | (1 << JacParser.LT) | (1 << JacParser.LE))) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 98
            self.expression()
            if 1:
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
            self.op = None # Token

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
        self.enterRule(localctx, 18, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 101
            self.term()
            self.state = 108
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.PLUS or _la==JacParser.MINUS:
                self.state = 102
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==JacParser.PLUS or _la==JacParser.MINUS):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 103
                self.term()
                if 1:
                        if (0 if localctx.op is None else localctx.op.type) == JacParser.PLUS:
                            emit('    iadd', -1)
                        else:
                            emit('    isub', -1)
                    
                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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
            self.op = None # Token

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
        self.enterRule(localctx, 20, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 111
            self.factor()
            self.state = 118
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0):
                self.state = 112
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JacParser.TIMES) | (1 << JacParser.OVER) | (1 << JacParser.REM))) != 0)):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 113
                self.factor()
                if 1:
                        if   (0 if localctx.op is None else localctx.op.type) == JacParser.TIMES:
                            emit('    imul', -1)
                        elif (0 if localctx.op is None else localctx.op.type) == JacParser.OVER:
                            emit('    idiv', -1)
                        else:
                            emit('    irem', -1)
                    
                self.state = 120
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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
            self._NUMBER = None # Token
            self._NAME = None # Token

        def NUMBER(self):
            return self.getToken(JacParser.NUMBER, 0)

        def OP_PAR(self):
            return self.getToken(JacParser.OP_PAR, 0)

        def expression(self):
            return self.getTypedRuleContext(JacParser.ExpressionContext,0)


        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def NAME(self):
            return self.getToken(JacParser.NAME, 0)

        def READINT(self):
            return self.getToken(JacParser.READINT, 0)

        def getRuleIndex(self):
            return JacParser.RULE_factor




    def factor(self):

        localctx = JacParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_factor)
        try:
            self.state = 133
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JacParser.NUMBER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 121
                localctx._NUMBER = self.match(JacParser.NUMBER)
                if 1:
                        emit('    ldc ' + str((None if localctx._NUMBER is None else localctx._NUMBER.text)), +1)
                    
                pass
            elif token in [JacParser.OP_PAR]:
                self.enterOuterAlt(localctx, 2)
                self.state = 123
                self.match(JacParser.OP_PAR)
                self.state = 124
                self.expression()
                self.state = 125
                self.match(JacParser.CL_PAR)
                pass
            elif token in [JacParser.NAME]:
                self.enterOuterAlt(localctx, 3)
                self.state = 127
                localctx._NAME = self.match(JacParser.NAME)
                if 1:
                        emit('    iload ' +  str(symbol_table.index((None if localctx._NAME is None else localctx._NAME.text))), +1)
                    
                pass
            elif token in [JacParser.READINT]:
                self.enterOuterAlt(localctx, 4)
                self.state = 129
                self.match(JacParser.READINT)
                self.state = 130
                self.match(JacParser.OP_PAR)
                self.state = 131
                self.match(JacParser.CL_PAR)
                if 1:
                        emit('    invokestatic Runtime/readInt()I', +1)
                    
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





