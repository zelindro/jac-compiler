// Generated from \\wsl.localhost\Ubuntu-20.04\home\zelindro\workspace\jac-compiler\Jac.g4 by ANTLR 4.9.2

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JacParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, BREAK=3, CONTINUE=4, PRINT=5, READINT=6, READSTR=7, DEF=8, 
		PLUS=9, MINUS=10, TIMES=11, OVER=12, REM=13, OP_PAR=14, CL_PAR=15, ATTRIB=16, 
		COLON=17, COMMA=18, EQ=19, NE=20, GT=21, GE=22, LT=23, LE=24, NAME=25, 
		NUMBER=26, STRING=27, COMMENT=28, NL=29, SPACE=30, INDENT=31, DEDENT=32;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_statement = 4, RULE_st_print = 5, RULE_st_attrib = 6, RULE_st_if = 7, 
		RULE_st_while = 8, RULE_st_break = 9, RULE_st_continue = 10, RULE_st_call = 11, 
		RULE_arguments = 12, RULE_comparison_if = 13, RULE_comparison_while = 14, 
		RULE_expression = 15, RULE_term = 16, RULE_factor = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "parameters", "statement", "st_print", 
			"st_attrib", "st_if", "st_while", "st_break", "st_continue", "st_call", 
			"arguments", "comparison_if", "comparison_while", "expression", "term", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'break'", "'continue'", "'print'", "'readint'", 
			"'readstr'", "'def'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", 
			"'='", "':'", "','", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", "READSTR", 
			"DEF", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COLON", "COMMA", "EQ", "NE", "GT", "GE", "LT", "LE", "NAME", "NUMBER", 
			"STRING", "COMMENT", "NL", "SPACE", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jac.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JacParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			if 1:
			        print('.source Test.src')
			        print('.class  public Test')
			        print('.super  java/lang/Object\n')
			        print('.method public <init>()V')
			        print('    aload_0')
			        print('    invokenonvirtual java/lang/Object/<init>()V')
			        print('    return')
			        print('.end method\n')
			    
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(37);
				function();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			if 1:
			        print('.method public static main([Ljava/lang/String;)V')
			    
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << NAME) | (1L << NL))) != 0) );
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
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode DEF() { return getToken(JacParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JacParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(JacParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(JacParser.CL_PAR, 0); }
		public TerminalNode COLON() { return getToken(JacParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(JacParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JacParser.DEDENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(DEF);
			setState(54);
			((FunctionContext)_localctx).NAME = match(NAME);
			setState(55);
			match(OP_PAR);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(56);
				parameters();
				}
			}

			setState(59);
			match(CL_PAR);
			setState(60);
			match(COLON);
			if 1:
			        global function_table, param_table, symbol_table
			        assin = True

			        if (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) not in function_table:
			            function_table.append((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null))
			        else:
			            sys.stderr.write('Error: function ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + ' already declared\n')
			            update_error()
			    
			setState(62);
			match(INDENT);
			if 1:
			        I = ''
			        for l in range(0, len(symbol_table)):
			            I = I + 'I'
			        param_table.append(len(symbol_table))
			        if (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'I' not in function_table and (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'V' not in function_table:
			            print('.method public static ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '(' + I + ')V')
			    
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(DEDENT);
			if 1:
			        print('return')
			        if (len(symbol_table) > 0):
			            print('.limit locals ' + str(len(symbol_table)))
			        print('.limit stack ' + str(stack_max))
			        print('.end method\n')

			        reset_counters()
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(JacParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JacParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JacParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((ParametersContext)_localctx).NAME = match(NAME);
			if 1:
			        symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
			        used_table.append(False)
			        symbol_type.append('i')
			    
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				((ParametersContext)_localctx).NAME = match(NAME);
				if 1:
				        if (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) in symbol_table:
				            sys.stderr.write('Error: variable ' + (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) + ' already declared\n')
				            update_error()
				        else:
				            symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
				            used_table.append(False)
				            symbol_type.append('i')
				    
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public TerminalNode NL() { return getToken(JacParser.NL, 0); }
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_breakContext st_break() {
			return getRuleContext(St_breakContext.class,0);
		}
		public St_continueContext st_continue() {
			return getRuleContext(St_continueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				st_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				st_print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				st_attrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				st_if();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				st_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				st_break();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				st_continue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(JacParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(JacParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(JacParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JacParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PRINT);
			setState(94);
			match(OP_PAR);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READINT) | (1L << READSTR) | (1L << OP_PAR) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				if 1:
				        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
				    
				setState(96);
				((St_printContext)_localctx).e1 = expression();
				if 1:
				        if ((St_printContext)_localctx).e1.type == 'i':
				            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
				        elif ((St_printContext)_localctx).e1.type == 's':
				            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
				        else:
				            sys.stderr.write('**HELP**\n')
				            exit(1)
				    
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					if 1:
					        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
					    
					setState(100);
					((St_printContext)_localctx).e2 = expression();
					if 1:
					        if ((St_printContext)_localctx).e2.type == 'i':
					            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
					        elif ((St_printContext)_localctx).e2.type == 's':
					            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
					        else:
					            sys.stderr.write('**HELP**\n')
					            exit(1)
					    
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(CL_PAR);
			if 1:
			        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
			        emit('invokevirtual java/io/PrintStream/println()V', -1)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_attribContext extends ParserRuleContext {
		public Token NAME;
		public ExpressionContext expression;
		public TerminalNode NAME() { return getToken(JacParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(JacParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(114);
			match(ATTRIB);
			setState(115);
			((St_attribContext)_localctx).expression = expression();
			if 1:
			        if (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) not in symbol_table:
			            symbol_table.append((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))
			            symbol_type.append(((St_attribContext)_localctx).expression.type)
			            used_table.append(False)

			        if symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] == 'i':
			            if ((St_attribContext)_localctx).expression.type == 'error' or ((St_attribContext)_localctx).expression.type == 's':
			                sys.stderr.write('Error in attribution: integer variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" cannot receive a string expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 'i':
			                emit('    istore ' +  str(symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))), -1)
			            else:
			                sys.stderr.write('**HELP NAME ATTRIB**')
			                exit(1)
			        elif symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] == 's':
			            if ((St_attribContext)_localctx).expression.type == 'error' or ((St_attribContext)_localctx).expression.type == 'i':
			                sys.stderr.write('Error in attribution: integer variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" cannot receive a integer expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 's':
			                emit('    astore ' +  str(symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))), -1)
			            else:
			                sys.stderr.write('**HELP NAME ATTRIB**')
			                exit(1)
			        else:
			            sys.stderr.write('**HELP NAME ATTRIB**')
			            exit(1)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_ifContext extends ParserRuleContext {
		public Comparison_ifContext cmp;
		public TerminalNode IF() { return getToken(JacParser.IF, 0); }
		public TerminalNode COLON() { return getToken(JacParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(JacParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JacParser.DEDENT, 0); }
		public Comparison_ifContext comparison_if() {
			return getRuleContext(Comparison_ifContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			((St_ifContext)_localctx).cmp = comparison_if();
			setState(120);
			match(COLON);
			if 1:
			        global if_max
			        emit(((St_ifContext)_localctx).cmp.type + ' NOT_IF_' + str(if_max), -2)
			        local_if = if_max
			        if_max += 1
			    
			setState(122);
			match(INDENT);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << NAME) | (1L << NL))) != 0) );
			setState(128);
			match(DEDENT);
			if 1:
			        print('NOT_IF_' + str(local_if) + ':')
			        if_counter()
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JacParser.WHILE, 0); }
		public Comparison_whileContext comparison_while() {
			return getRuleContext(Comparison_whileContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JacParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(JacParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JacParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			if 1:
			        global while_max
			        local_while = while_max
			        print('BEGIN_WHILE_' + str(local_while) + ':')
			        inside_while.append(local_while)
			    
			setState(133);
			comparison_while();
			setState(134);
			match(COLON);
			if 1:
			        while_max += 1
			    
			setState(136);
			match(INDENT);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << NAME) | (1L << NL))) != 0) );
			setState(142);
			match(DEDENT);
			if 1:
			        emit('goto BEGIN_WHILE_' + str(local_while), 0)
			        print('END_WHILE_' + str(local_while) + ':')
			        inside_while.pop()
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JacParser.BREAK, 0); }
		public St_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_break; }
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(BREAK);
			if 1:
			        if len(inside_while) == 0:
			            sys.stderr.write('Error: break outside while\n')
			            exit(1)
			        emit('goto END_WHILE_' + str(while_max-1), 0)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JacParser.CONTINUE, 0); }
		public St_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_continue; }
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONTINUE);
			if 1:
			        if len(inside_while) == 0:
			            sys.stderr.write('Error: continue outside while\n')
			            exit(1)
			        emit('goto BEGIN_WHILE_' + str(while_max-1), 0)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_callContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(JacParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(JacParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(JacParser.CL_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((St_callContext)_localctx).NAME = match(NAME);
			setState(152);
			match(OP_PAR);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READINT) | (1L << READSTR) | (1L << OP_PAR) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(153);
				arguments();
				}
			}

			setState(156);
			match(CL_PAR);
			if 1:
			        global function_table, arg_max, function_error
			        I = ''
			        if (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) in function_table:
			            if param_table[function_table.index((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null))] != arg_max:
			                sys.stderr.write('Error in function call: wrong number of arguments\n')
			                update_error()
			            if function_error:
			                sys.stderr.write('Error in function call: wrong type of arguments\n')
			                update_error()
			            for j in range(0, arg_max):
			                I += 'I'
			            print('    invokestatic Test/' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '(' + I + ')V')
			        else:
			            sys.stderr.write('Error in function call: function "' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '" not declared\n')
			            update_error()
			        
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JacParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			if 1:
			        global arg_max, function_error
			        arg_max = 0
			    
			setState(160);
			((ArgumentsContext)_localctx).e1 = expression();
			if 1:
			        arg_max += 1
			        if ((ArgumentsContext)_localctx).e1.type != 'i':
			            function_error = True
			    
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				((ArgumentsContext)_localctx).e2 = expression();
				if 1:
				        arg_max += 1
				        if ((ArgumentsContext)_localctx).e2.type != 'i':
				            function_error = True
				    
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_ifContext extends ParserRuleContext {
		public  type;
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JacParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JacParser.NE, 0); }
		public TerminalNode GT() { return getToken(JacParser.GT, 0); }
		public TerminalNode GE() { return getToken(JacParser.GE, 0); }
		public TerminalNode LT() { return getToken(JacParser.LT, 0); }
		public TerminalNode LE() { return getToken(JacParser.LE, 0); }
		public Comparison_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_if; }
	}

	public final Comparison_ifContext comparison_if() throws RecognitionException {
		Comparison_ifContext _localctx = new Comparison_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((Comparison_ifContext)_localctx).e1 = expression();
			setState(172);
			((Comparison_ifContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((Comparison_ifContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			((Comparison_ifContext)_localctx).e2 = expression();
			if 1:
			        if ((Comparison_ifContext)_localctx).e1.type != ((Comparison_ifContext)_localctx).e2.type:
			            sys.stderr.write('Error in comparison: operator cannot use string type\n')
			            update_error()

			        if (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.EQ:
			            _localctx.type = 'if_icmpne'
			        elif (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.NE:
			            _localctx.type = 'if_icmpeq'
			        elif (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.GT:
			            _localctx.type = 'if_icmple'
			        elif (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.GE:
			            _localctx.type = 'if_icmplt'
			        elif (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.LT:
			            _localctx.type = 'if_icmpge'
			        elif (((Comparison_ifContext)_localctx).op!=null?((Comparison_ifContext)_localctx).op.getType():0) == JacParser.LE:
			            _localctx.type = 'if_icmpgt'
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_whileContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JacParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JacParser.NE, 0); }
		public TerminalNode GT() { return getToken(JacParser.GT, 0); }
		public TerminalNode GE() { return getToken(JacParser.GE, 0); }
		public TerminalNode LT() { return getToken(JacParser.LT, 0); }
		public TerminalNode LE() { return getToken(JacParser.LE, 0); }
		public Comparison_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_while; }
	}

	public final Comparison_whileContext comparison_while() throws RecognitionException {
		Comparison_whileContext _localctx = new Comparison_whileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((Comparison_whileContext)_localctx).e1 = expression();
			setState(177);
			((Comparison_whileContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((Comparison_whileContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			((Comparison_whileContext)_localctx).e2 = expression();
			if 1:
			        if ((Comparison_whileContext)_localctx).e1.type != ((Comparison_whileContext)_localctx).e2.type:
			            sys.stderr.write('Error in comparison: operator cannot use string type\n')
			            update_error()

			        if (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.EQ:
			            emit('if_icmpne END_WHILE_'+str(while_max), -2)
			        elif (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.NE:
			            emit('if_icmpeq END_WHILE_'+str(while_max), -2)
			        elif (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.GT:
			            emit('if_icmple END_WHILE_'+str(while_max), -2)
			        elif (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.GE:
			            emit('if_icmplt END_WHILE_'+str(while_max), -2)
			        elif (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.LT:
			            emit('if_icmpge END_WHILE_'+str(while_max), -2)
			        elif (((Comparison_whileContext)_localctx).op!=null?((Comparison_whileContext)_localctx).op.getType():0) == JacParser.LE:
			            emit('if_icmpgt END_WHILE_'+str(while_max), -2)
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public  type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JacParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JacParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JacParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JacParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((ExpressionContext)_localctx).t1 = term();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(182);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				((ExpressionContext)_localctx).t2 = term();
				if 1:
				        if ((ExpressionContext)_localctx).t1.type != ((ExpressionContext)_localctx).t2.type or ((ExpressionContext)_localctx).t1.type == 's' or ((ExpressionContext)_localctx).t2.type == 's':
				            sys.stderr.write('Error in expression: operator cannot use string type\n')
				            update_error()

				        else:
				            if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == JacParser.PLUS:
				                emit('    iadd', -1)
				            else:
				                emit('    isub', -1)
				    
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if 1:
			        _localctx.type = ((ExpressionContext)_localctx).t1.type
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public  type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(JacParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(JacParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(JacParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(JacParser.OVER, i);
		}
		public List<TerminalNode> REM() { return getTokens(JacParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(JacParser.REM, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((TermContext)_localctx).f1 = factor();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) {
				{
				{
				setState(194);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				((TermContext)_localctx).f2 = factor();
				if 1:
				        if ((TermContext)_localctx).f1.type != ((TermContext)_localctx).f2.type or ((TermContext)_localctx).f1.type == 's' or ((TermContext)_localctx).f2.type == 's':
				            sys.stderr.write('Error in term: operator cannot use string type\n')
				            update_error()

				        else:
				            if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == JacParser.TIMES:
				                emit('    imul', -1)
				            elif (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == JacParser.OVER:
				                emit('    idiv', -1)
				            else:
				                emit('    irem', -1)
				    
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if 1:
			        _localctx.type = ((TermContext)_localctx).f1.type
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public  type;
		public Token NUMBER;
		public Token STRING;
		public ExpressionContext e;
		public Token NAME;
		public TerminalNode NUMBER() { return getToken(JacParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JacParser.STRING, 0); }
		public TerminalNode OP_PAR() { return getToken(JacParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(JacParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(JacParser.NAME, 0); }
		public TerminalNode READINT() { return getToken(JacParser.READINT, 0); }
		public TerminalNode READSTR() { return getToken(JacParser.READSTR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				if 1:
				        emit('    ldc ' + str((((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null)), +1)
				        _localctx.type = 'i'
				    
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((FactorContext)_localctx).STRING = match(STRING);
				if 1:
				        emit('    ldc ' + str((((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null)), +1)
				        _localctx.type = 's'
				    
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(OP_PAR);
				setState(210);
				((FactorContext)_localctx).e = expression();
				setState(211);
				match(CL_PAR);
				if 1:
				        _localctx.type = ((FactorContext)_localctx).e.type
				    
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				((FactorContext)_localctx).NAME = match(NAME);
				if 1:
				        if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
				            sys.stderr.write('Variable ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' is not defined\n')
				            _localctx.type = 'error'
				            sys.exit(1)
				        elif symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] == 'i':
				            emit('    iload ' +  str(symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))), +1)
				            used_table[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] = True
				            _localctx.type = symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))]
				        elif symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] == 's':
				            emit('    aload ' +  str(symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))), +1)
				            used_table[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] = True
				            _localctx.type = symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))]
				    
				}
				break;
			case READINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(READINT);
				setState(217);
				match(OP_PAR);
				setState(218);
				match(CL_PAR);
				if 1:
				        emit('invokestatic Runtime/readInt()I', +1)
				        _localctx.type = 'i'
				    
				}
				break;
			case READSTR:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(READSTR);
				setState(221);
				match(OP_PAR);
				setState(222);
				match(CL_PAR);
				if 1:
				        emit('invokestatic Runtime/readString()Ljava/lang/String;', +1)
				        _localctx.type = 's'
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\3\3\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5"+
		"\16\5T\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\5\7o\n\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\177\n\t\r\t\16\t\u0080"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u008d\n\n\r\n\16\n\u008e"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009d\n\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a9\n\16\f\16\16\16"+
		"\u00ac\13\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00bd\n\21\f\21\16\21\u00c0\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\23\2\2\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\5\3\2\25\32\3\2\13\f\3\2\r\17\2\u00eb\2"+
		"&\3\2\2\2\4/\3\2\2\2\6\67\3\2\2\2\bK\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16"+
		"s\3\2\2\2\20x\3\2\2\2\22\u0085\3\2\2\2\24\u0093\3\2\2\2\26\u0096\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u00a1\3\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3\2\2\2"+
		" \u00b7\3\2\2\2\"\u00c3\3\2\2\2$\u00e2\3\2\2\2&*\b\2\1\2\')\5\6\4\2(\'"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\5\4\3\2."+
		"\3\3\2\2\2/\61\b\3\1\2\60\62\5\n\6\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\3\1\2\66\5\3\2\2\2\678\7"+
		"\n\2\289\7\33\2\29;\7\20\2\2:<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2="+
		">\7\21\2\2>?\7\23\2\2?@\b\4\1\2@A\7!\2\2AE\b\4\1\2BD\5\n\6\2CB\3\2\2\2"+
		"DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\"\2\2IJ\b\4\1\2"+
		"J\7\3\2\2\2KL\7\33\2\2LR\b\5\1\2MN\7\24\2\2NO\7\33\2\2OQ\b\5\1\2PM\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2U^\5\30\r\2V^\7"+
		"\37\2\2W^\5\f\7\2X^\5\16\b\2Y^\5\20\t\2Z^\5\22\n\2[^\5\24\13\2\\^\5\26"+
		"\f\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2"+
		"\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7\7\2\2`n\7\20\2\2ab\b\7\1\2bc\5 \21\2c"+
		"k\b\7\1\2de\7\24\2\2ef\b\7\1\2fg\5 \21\2gh\b\7\1\2hj\3\2\2\2id\3\2\2\2"+
		"jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2na\3\2\2\2no\3\2\2\2"+
		"op\3\2\2\2pq\7\21\2\2qr\b\7\1\2r\r\3\2\2\2st\7\33\2\2tu\7\22\2\2uv\5 "+
		"\21\2vw\b\b\1\2w\17\3\2\2\2xy\7\3\2\2yz\5\34\17\2z{\7\23\2\2{|\b\t\1\2"+
		"|~\7!\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\"\2\2\u0083\u0084\b\t"+
		"\1\2\u0084\21\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\b\n\1\2\u0087\u0088"+
		"\5\36\20\2\u0088\u0089\7\23\2\2\u0089\u008a\b\n\1\2\u008a\u008c\7!\2\2"+
		"\u008b\u008d\5\n\6\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\"\2\2\u0091"+
		"\u0092\b\n\1\2\u0092\23\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095\b\13\1"+
		"\2\u0095\25\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098\b\f\1\2\u0098\27\3"+
		"\2\2\2\u0099\u009a\7\33\2\2\u009a\u009c\7\20\2\2\u009b\u009d\5\32\16\2"+
		"\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\7\21\2\2\u009f\u00a0\b\r\1\2\u00a0\31\3\2\2\2\u00a1\u00a2\b\16\1\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\u00aa\b\16\1\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\5"+
		" \21\2\u00a6\u00a7\b\16\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\t\2\2\2\u00af\u00b0"+
		"\5 \21\2\u00b0\u00b1\b\17\1\2\u00b1\35\3\2\2\2\u00b2\u00b3\5 \21\2\u00b3"+
		"\u00b4\t\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\b\20\1\2\u00b6\37\3\2\2"+
		"\2\u00b7\u00be\5\"\22\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba\5\"\22\2\u00ba"+
		"\u00bb\b\21\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\21\1\2\u00c2!\3\2\2\2\u00c3\u00ca\5$\23\2"+
		"\u00c4\u00c5\t\4\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\b\22\1\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\22"+
		"\1\2\u00ce#\3\2\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00e3\b\23\1\2\u00d1\u00d2"+
		"\7\35\2\2\u00d2\u00e3\b\23\1\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5 \21"+
		"\2\u00d5\u00d6\7\21\2\2\u00d6\u00d7\b\23\1\2\u00d7\u00e3\3\2\2\2\u00d8"+
		"\u00d9\7\33\2\2\u00d9\u00e3\b\23\1\2\u00da\u00db\7\b\2\2\u00db\u00dc\7"+
		"\20\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00e3\b\23\1\2\u00de\u00df\7\t\2\2"+
		"\u00df\u00e0\7\20\2\2\u00e0\u00e1\7\21\2\2\u00e1\u00e3\b\23\1\2\u00e2"+
		"\u00cf\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00d8\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3%\3\2\2\2\21*\63;ER"+
		"]kn\u0080\u008e\u009c\u00aa\u00be\u00ca\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}