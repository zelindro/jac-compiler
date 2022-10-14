# Generated from Tiny.g4 by ANTLR 4.9.3
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6")
        buf.write("%\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2")
        buf.write("\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\31\n\4\3\5\3")
        buf.write("\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b")
        buf.write("\n\2\2\2!\2\f\3\2\2\2\4\17\3\2\2\2\6\23\3\2\2\2\b\32\3")
        buf.write("\2\2\2\n!\3\2\2\2\f\r\b\2\1\2\r\16\5\4\3\2\16\3\3\2\2")
        buf.write("\2\17\20\b\3\1\2\20\21\5\6\4\2\21\22\b\3\1\2\22\5\3\2")
        buf.write("\2\2\23\30\5\b\5\2\24\25\7\3\2\2\25\26\5\6\4\2\26\27\b")
        buf.write("\4\1\2\27\31\3\2\2\2\30\24\3\2\2\2\30\31\3\2\2\2\31\7")
        buf.write("\3\2\2\2\32\37\5\n\6\2\33\34\7\4\2\2\34\35\5\b\5\2\35")
        buf.write("\36\b\5\1\2\36 \3\2\2\2\37\33\3\2\2\2\37 \3\2\2\2 \t\3")
        buf.write("\2\2\2!\"\7\5\2\2\"#\b\6\1\2#\13\3\2\2\2\4\30\37")
        return buf.getvalue()


class TinyParser ( Parser ):

    grammarFileName = "Tiny.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'*'" ]

    symbolicNames = [ "<INVALID>", "PLUS", "TIMES", "NUMBER", "SPACE" ]

    RULE_program = 0
    RULE_main = 1
    RULE_expression = 2
    RULE_term = 3
    RULE_factor = 4

    ruleNames =  [ "program", "main", "expression", "term", "factor" ]

    EOF = Token.EOF
    PLUS=1
    TIMES=2
    NUMBER=3
    SPACE=4

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
            return self.getTypedRuleContext(TinyParser.MainContext,0)


        def getRuleIndex(self):
            return TinyParser.RULE_program




    def program(self):

        localctx = TinyParser.ProgramContext(self, self._ctx, self.state)
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
                
            self.state = 11
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

        def expression(self):
            return self.getTypedRuleContext(TinyParser.ExpressionContext,0)


        def getRuleIndex(self):
            return TinyParser.RULE_main




    def main(self):

        localctx = TinyParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_main)
        try:
            self.enterOuterAlt(localctx, 1)
            if 1:
                    print('.method public static main([Ljava/lang/String;)V\n')
                    print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
                
            self.state = 14
            self.expression()
            if 1:
                    print('    invokevirtual java/io/PrintStream/println(I)V\n')
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


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def term(self):
            return self.getTypedRuleContext(TinyParser.TermContext,0)


        def expression(self):
            return self.getTypedRuleContext(TinyParser.ExpressionContext,0)


        def PLUS(self):
            return self.getToken(TinyParser.PLUS, 0)

        def getRuleIndex(self):
            return TinyParser.RULE_expression




    def expression(self):

        localctx = TinyParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17
            self.term()
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==TinyParser.PLUS:
                self.state = 18
                localctx.op = self.match(TinyParser.PLUS)
                self.state = 19
                self.expression()
                if 1:
                        print('    iadd')
                    


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

        def factor(self):
            return self.getTypedRuleContext(TinyParser.FactorContext,0)


        def term(self):
            return self.getTypedRuleContext(TinyParser.TermContext,0)


        def TIMES(self):
            return self.getToken(TinyParser.TIMES, 0)

        def getRuleIndex(self):
            return TinyParser.RULE_term




    def term(self):

        localctx = TinyParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.factor()
            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==TinyParser.TIMES:
                self.state = 25
                localctx.op = self.match(TinyParser.TIMES)
                self.state = 26
                self.term()
                if 1:
                        print('    imul')
                    


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
            return self.getToken(TinyParser.NUMBER, 0)

        def getRuleIndex(self):
            return TinyParser.RULE_factor




    def factor(self):

        localctx = TinyParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_factor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            localctx._NUMBER = self.match(TinyParser.NUMBER)
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





