# Generated from Jac.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


# symbol_table = []


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("<\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\3\2\3\3\3\3\6\3\26\n\3\r\3\16\3\27\3\3\3")
        buf.write("\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6")
        buf.write("\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\3\7\3\7\3\7\3\7\7\7\64")
        buf.write("\n\7\f\7\16\7\67\13\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n")
        buf.write("\f\16\2\2\2\67\2\20\3\2\2\2\4\23\3\2\2\2\6\33\3\2\2\2")
        buf.write("\b\35\3\2\2\2\n$\3\2\2\2\f.\3\2\2\2\168\3\2\2\2\20\21")
        buf.write("\b\2\1\2\21\22\5\4\3\2\22\3\3\2\2\2\23\25\b\3\1\2\24\26")
        buf.write("\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27")
        buf.write("\30\3\2\2\2\30\31\3\2\2\2\31\32\b\3\1\2\32\5\3\2\2\2\33")
        buf.write("\34\5\b\5\2\34\7\3\2\2\2\35\36\7\3\2\2\36\37\7\6\2\2\37")
        buf.write(" \b\5\1\2 !\5\n\6\2!\"\7\7\2\2\"#\b\5\1\2#\t\3\2\2\2$")
        buf.write("+\5\f\7\2%&\7\4\2\2&\'\5\f\7\2\'(\b\6\1\2(*\3\2\2\2)%")
        buf.write("\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3")
        buf.write("\2\2\2.\65\5\16\b\2/\60\7\5\2\2\60\61\5\16\b\2\61\62\b")
        buf.write("\7\1\2\62\64\3\2\2\2\63/\3\2\2\2\64\67\3\2\2\2\65\63\3")
        buf.write("\2\2\2\65\66\3\2\2\2\66\r\3\2\2\2\67\65\3\2\2\289\7\b")
        buf.write("\2\29:\b\b\1\2:\17\3\2\2\2\5\27+\65")
        return buf.getvalue()


class JacParser ( Parser ):

    grammarFileName = "Jac.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'print'", "'+'", "'*'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "PRINT", "PLUS", "TIMES", "OP_PAR", "CL_PAR", 
                      "NUMBER", "SPACE" ]

    RULE_program = 0
    RULE_main = 1
    RULE_statement = 2
    RULE_st_print = 3
    RULE_expression = 4
    RULE_term = 5
    RULE_factor = 6

    ruleNames =  [ "program", "main", "statement", "st_print", "expression", 
                   "term", "factor" ]

    EOF = Token.EOF
    PRINT=1
    PLUS=2
    TIMES=3
    OP_PAR=4
    CL_PAR=5
    NUMBER=6
    SPACE=7

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
                
            self.state = 15
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
                
            self.state = 19 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 18
                self.statement()
                self.state = 21 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==JacParser.PRINT):
                    break

            if 1:
                    print('    return')
                    print('.limit stack 10')
                    print('.end method')
                    # print('\n; symbol_table:', symbol_table)
                
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


        def getRuleIndex(self):
            return JacParser.RULE_statement




    def statement(self):

        localctx = JacParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.st_print()
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

        def expression(self):
            return self.getTypedRuleContext(JacParser.ExpressionContext,0)


        def CL_PAR(self):
            return self.getToken(JacParser.CL_PAR, 0)

        def getRuleIndex(self):
            return JacParser.RULE_st_print




    def st_print(self):

        localctx = JacParser.St_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_st_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(JacParser.PRINT)
            self.state = 28
            self.match(JacParser.OP_PAR)
            if 1:
                    print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
                
            self.state = 30
            self.expression()
            self.state = 31
            self.match(JacParser.CL_PAR)
            if 1:
                    print('    invokevirtual java/io/PrintStream/println(I)V\n')
                
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

        def getRuleIndex(self):
            return JacParser.RULE_expression




    def expression(self):

        localctx = JacParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.term()
            self.state = 41
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.PLUS:
                self.state = 35
                localctx.op = self.match(JacParser.PLUS)
                self.state = 36
                self.term()
                if 1:
                        print('    iadd')
                    
                self.state = 43
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

        def getRuleIndex(self):
            return JacParser.RULE_term




    def term(self):

        localctx = JacParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.factor()
            self.state = 51
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JacParser.TIMES:
                self.state = 45
                localctx.op = self.match(JacParser.TIMES)
                self.state = 46
                self.factor()
                if 1:
                        print('    imul')
                    
                self.state = 53
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

        def NUMBER(self):
            return self.getToken(JacParser.NUMBER, 0)

        def getRuleIndex(self):
            return JacParser.RULE_factor




    def factor(self):

        localctx = JacParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_factor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            localctx._NUMBER = self.match(JacParser.NUMBER)
            if 1:
                    print('    ldc ' + (None if localctx._NUMBER is None else localctx._NUMBER.text))
                    # symbol_table.append((None if localctx._NUMBER is None else localctx._NUMBER.text))
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





