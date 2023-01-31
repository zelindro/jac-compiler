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
		IF=1, ELSE=2, WHILE=3, BREAK=4, CONTINUE=5, PRINT=6, READINT=7, READSTR=8, 
		DEF=9, INT=10, RETURN=11, PLUS=12, MINUS=13, TIMES=14, OVER=15, REM=16, 
		OP_PAR=17, CL_PAR=18, ATTRIB=19, COLON=20, COMMA=21, EQ=22, NE=23, GT=24, 
		GE=25, LT=26, LE=27, NAME=28, NUMBER=29, STRING=30, COMMENT=31, NL=32, 
		SPACE=33, INDENT=34, DEDENT=35;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_main = 3, 
		RULE_statement = 4, RULE_st_print = 5, RULE_st_attrib = 6, RULE_st_if = 7, 
		RULE_st_while = 8, RULE_st_break = 9, RULE_st_continue = 10, RULE_st_call = 11, 
		RULE_st_return = 12, RULE_arguments = 13, RULE_comparison_if = 14, RULE_comparison_while = 15, 
		RULE_expression = 16, RULE_term = 17, RULE_factor = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "main", "statement", "st_print", 
			"st_attrib", "st_if", "st_while", "st_break", "st_continue", "st_call", 
			"st_return", "arguments", "comparison_if", "comparison_while", "expression", 
			"term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'break'", "'continue'", "'print'", 
			"'readint'", "'readstr'", "'def'", "'int'", "'return'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'='", "':'", "','", "'=='", "'!='", 
			"'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", "PRINT", "READINT", 
			"READSTR", "DEF", "INT", "RETURN", "PLUS", "MINUS", "TIMES", "OVER", 
			"REM", "OP_PAR", "CL_PAR", "ATTRIB", "COLON", "COMMA", "EQ", "NE", "GT", 
			"GE", "LT", "LE", "NAME", "NUMBER", "STRING", "COMMENT", "NL", "SPACE", 
			"INDENT", "DEDENT"
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
			    
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(39);
				function();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode DEF() { return getToken(JacParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JacParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(JacParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(JacParser.CL_PAR, 0); }
		public TerminalNode COLON() { return getToken(JacParser.COLON, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(JacParser.INT, 0); }
		public List<TerminalNode> INDENT() { return getTokens(JacParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(JacParser.INDENT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(JacParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(JacParser.DEDENT, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(DEF);
			setState(48);
			((FunctionContext)_localctx).NAME = match(NAME);
			setState(49);
			match(OP_PAR);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(50);
				parameters();
				}
			}

			setState(53);
			match(CL_PAR);
			setState(54);
			match(COLON);
			if 1:
			        global type, function_table, param_table, symbol_table, has_return
			    
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(56);
				match(INT);
				if 1:
				        type = 'I'
				    
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(60);
				match(INDENT);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if 1:
			        I = ''
			        for j in range(0, len(symbol_table)):
			            I = I + 'I'
			        param_table.append(len(symbol_table))
			        if (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null)+type not in function_table:
			            print('.method public static ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '(' + I + ')' + type)
			            function_table.append((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + type)
			        else:
			            sys.stderr.write('Error in function: "' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '" is already declared\n')
			            update_error()
			    
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					statement();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEDENT) {
				{
				{
				setState(73);
				match(DEDENT);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if 1:
			        #sys.stderr.write('Type = ' + str(type) + '\n')
			        #sys.stderr.write('has_return = ' + str(has_return) + '\n')
			        if type == 'I' and has_return == False:
			            sys.stderr.write('Error in function: "' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '" must return a integer value\n')
			            update_error()
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
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((ParametersContext)_localctx).NAME = match(NAME);
			if 1:
			        symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
			        used_table.append(False)
			        symbol_type.append('i')
			    
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				((ParametersContext)_localctx).NAME = match(NAME);
				if 1:
				        if (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) in symbol_table:
				            sys.stderr.write('Error in parameter: names must be unique\n')
				            update_error()
				        else:
				            symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
				            used_table.append(False)
				            symbol_type.append('i')
				    
				}
				}
				setState(90);
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
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			if 1:
			        print('.method public static main([Ljava/lang/String;)V')
			    
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				statement();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << RETURN) | (1L << NAME) | (1L << NL))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
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
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public St_returnContext st_return() {
			return getRuleContext(St_returnContext.class,0);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				st_print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				st_attrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				st_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				st_while();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				st_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				st_continue();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				st_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				st_return();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(110);
			match(PRINT);
			setState(111);
			match(OP_PAR);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << READINT) | (1L << READSTR) | (1L << RETURN) | (1L << OP_PAR) | (1L << NAME) | (1L << NUMBER) | (1L << STRING) | (1L << NL))) != 0)) {
				{
				if 1:
				        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
				    
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(113);
					statement();
					}
					break;
				}
				setState(116);
				((St_printContext)_localctx).e1 = expression();
				if 1:
				        if ((St_printContext)_localctx).e1.type == 'i':
				            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
				        elif ((St_printContext)_localctx).e1.type == 's':
				            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
				        else:
				            sys.stderr.write('**HELP**\n')
				            exit(1)
				    
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					if 1:
					        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
					    
					setState(120);
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
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(130);
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
			setState(133);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(134);
			match(ATTRIB);
			setState(135);
			((St_attribContext)_localctx).expression = expression();
			if 1:
			        if (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) not in symbol_table:
			            symbol_table.append((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))
			            symbol_type.append(((St_attribContext)_localctx).expression.type)
			            used_table.append(False)
			        if symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] == 'i':
			            if symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] != ((St_attribContext)_localctx).expression.type:
			                sys.stderr.write('Error in attribution: integer variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" must receive a integer expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 'error' or ((St_attribContext)_localctx).expression.type == 's':
			                sys.stderr.write('Error in attribution: integer variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" cannot receive a string expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 'i':
			                emit('    istore ' +  str(symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))), -1)
			            else:
			                sys.stderr.write('Error in expression: invalid type of expression\n')
			                update_error()
			        elif symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] == 's':
			            if symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] != ((St_attribContext)_localctx).expression.type:
			                sys.stderr.write('Error in attribution: string variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" must receive a string expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 'error' or ((St_attribContext)_localctx).expression.type == 'i':
			                sys.stderr.write('Error in attribution: string variable "' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + '" cannot receive a integer expression\n')
			                update_error()
			            elif ((St_attribContext)_localctx).expression.type == 's':
			                emit('    astore ' +  str(symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))), -1)
			            else:
			                sys.stderr.write('Error in expression: invalid type of expression\n')
			                update_error()
			        elif symbol_type[symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))] == 'void':
			            sys.stderr.write('Error in atribuition: a void function does not return a value\n')
			            update_error()
			        else:
			            sys.stderr.write('Error in expression: invalid type of token\n')
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

	public static class St_ifContext extends ParserRuleContext {
		public Comparison_ifContext cmp;
		public TerminalNode IF() { return getToken(JacParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(JacParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JacParser.COLON, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(JacParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(JacParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(JacParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(JacParser.DEDENT, i);
		}
		public Comparison_ifContext comparison_if() {
			return getRuleContext(Comparison_ifContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JacParser.ELSE, 0); }
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
			setState(138);
			match(IF);
			setState(139);
			((St_ifContext)_localctx).cmp = comparison_if();
			setState(140);
			match(COLON);
			if 1:
			        global if_max
			        has_else = False
			        emit(((St_ifContext)_localctx).cmp.type + ' NOT_IF_' + str(if_max), -2)
			        local_if = if_max
			        if_max += 1
			    
			setState(142);
			match(INDENT);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				statement();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << RETURN) | (1L << NAME) | (1L << NL))) != 0) );
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(148);
				match(DEDENT);
				setState(149);
				match(ELSE);
				setState(150);
				match(COLON);
				setState(151);
				match(INDENT);
				if 1:
				        has_else = True
				        print('goto END_ELSE_' + str(local_if))
				        print('NOT_IF_' + str(local_if) + ':')
				        if_counter()
				    
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					statement();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << RETURN) | (1L << NAME) | (1L << NL))) != 0) );
				}
				break;
			}
			if 1:
			        if has_else:
			            print('END_ELSE_' + str(local_if) + ':')
			        else:
			            print('NOT_IF_' + str(local_if) + ':')
			        if_counter()
			    
			setState(161);
			match(DEDENT);
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
			setState(163);
			match(WHILE);
			if 1:
			        global while_max
			        local_while = while_max
			        print('BEGIN_WHILE_' + str(local_while) + ':')
			        inside_while.append(local_while)
			    
			setState(165);
			comparison_while();
			setState(166);
			match(COLON);
			if 1:
			        while_max += 1
			    
			setState(168);
			match(INDENT);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				statement();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << PRINT) | (1L << RETURN) | (1L << NAME) | (1L << NL))) != 0) );
			setState(174);
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
			setState(177);
			match(BREAK);
			if 1:
			        if len(inside_while) == 0:
			            sys.stderr.write('Error: break outside while\n')
			            update_error()
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
			setState(180);
			match(CONTINUE);
			if 1:
			        if len(inside_while) == 0:
			            sys.stderr.write('Error: continue outside while\n')
			            update_error()
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
			setState(183);
			((St_callContext)_localctx).NAME = match(NAME);
			setState(184);
			match(OP_PAR);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READINT) | (1L << READSTR) | (1L << OP_PAR) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(185);
				arguments();
				}
			}

			setState(188);
			match(CL_PAR);
			if 1:
			        global function_table, arg_max, function_error, has_return
			        I = ''
			        if (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null)+'I' in function_table or (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null)+'V' in function_table :
			            if (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null)+'I' in function_table:
			                currentType = 'I'
			            else:
			                currentType = 'V'

			            if function_error == True:
			                if currentType == 'I':
			                    sys.stderr.write('Error in function call: function "' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '" needs to return a value\n')
			                else:
			                    sys.stderr.write('Error in function call: all arguments must be integer\n')
			                update_error()
			            if param_table[function_table.index((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null)+currentType)] != arg_max:
			                sys.stderr.write('Error in function call: wrong number of arguments\n')
			                update_error()
			            for j in range(0, arg_max):
			                I += 'I'
			            print('    invokestatic Test/' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '(' + I + ')' + currentType)
			        else:
			            sys.stderr.write('Error in function call: function "' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '" not declared\n')
			            update_error()
			        arg_max = 0
			    
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

	public static class St_returnContext extends ParserRuleContext {
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(JacParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_return; }
	}

	public final St_returnContext st_return() throws RecognitionException {
		St_returnContext _localctx = new St_returnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(RETURN);
			setState(192);
			((St_returnContext)_localctx).e = expression();
			if 1:
			        global has_return
			        if function_table[len(function_table)-1].endswith('V'):
			            sys.stderr.write('Error in return: void function cannot return a value\n')
			            update_error()
			        else:
			            if ((St_returnContext)_localctx).e.type == 'i':
			                print('    ireturn')
			            else:
			                sys.stderr.write('Error in return: function must return an integer value\n')
			                update_error()
			            has_return = True    
			    
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
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			if 1:
			        global arg_max, function_error
			        arg_max = 0
			    
			setState(196);
			((ArgumentsContext)_localctx).e1 = expression();
			if 1:
			        arg_max += 1
			        if ((ArgumentsContext)_localctx).e1.type != 'i':
			            update_error()
			            function_error = True
			    
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				((ArgumentsContext)_localctx).e2 = expression();
				if 1:
				        arg_max += 1
				        if ((ArgumentsContext)_localctx).e2.type != 'i':
				            function_error = True
				            update_error()
				    
				}
				}
				setState(206);
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
		enterRule(_localctx, 28, RULE_comparison_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((Comparison_ifContext)_localctx).e1 = expression();
			setState(208);
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
			setState(209);
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
		enterRule(_localctx, 30, RULE_comparison_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((Comparison_whileContext)_localctx).e1 = expression();
			setState(213);
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
			setState(214);
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
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ExpressionContext)_localctx).t1 = term();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(218);
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
				setState(219);
				((ExpressionContext)_localctx).t2 = term();
				if 1: 
				        if ((ExpressionContext)_localctx).t1.type != ((ExpressionContext)_localctx).t2.type or ((ExpressionContext)_localctx).t1.type != 'i' or ((ExpressionContext)_localctx).t2.type != 'i':
				            sys.stderr.write('Error in expression: operator cannot combine different types\n')
				            update_error()
				        if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == JacParser.PLUS:
				            emit('    iadd', -1)
				        if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == JacParser.MINUS:
				            emit('    isub', -1)
				    
				}
				}
				setState(226);
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
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((TermContext)_localctx).f1 = factor();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) {
				{
				{
				setState(230);
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
				setState(231);
				((TermContext)_localctx).f2 = factor();
				if 1:
				        if ((TermContext)_localctx).f1.type != ((TermContext)_localctx).f2.type or ((TermContext)_localctx).f1.type != 'i' or ((TermContext)_localctx).f2.type != 'i':
				            sys.stderr.write('Error in term: operator cannot combine different types\n')
				            update_error()
				        else:
				            if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == JacParser.TIMES:
				                emit('    imul', -1)
				            if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == JacParser.OVER:
				                emit('    idiv', -1)
				            if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == JacParser.REM:
				                emit('    irem', -1)
				    
				}
				}
				setState(238);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode READINT() { return getToken(JacParser.READINT, 0); }
		public TerminalNode READSTR() { return getToken(JacParser.READSTR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				if 1:
				        global symbol_table, function_table, function_error
				        emit('    ldc ' + str((((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null)), +1)
				        _localctx.type = 'i'
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((FactorContext)_localctx).STRING = match(STRING);
				if 1:
				        emit('    ldc ' + str((((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null)), +1)
				        _localctx.type = 's'
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(OP_PAR);
				setState(246);
				((FactorContext)_localctx).e = expression();
				setState(247);
				match(CL_PAR);
				if 1:
				        _localctx.type = ((FactorContext)_localctx).e.type
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(251);
				match(OP_PAR);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READINT) | (1L << READSTR) | (1L << OP_PAR) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(252);
					arguments();
					}
				}

				setState(255);
				match(CL_PAR);
				if 1:
				        global arg_max
				        I = ''
				        if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)+'I' in function_table:
				            currentType = 'I'
				        else:
				            currentType = 'V'

				        if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)+currentType in function_table:
				            if function_table[function_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)+currentType)].endswith('V'):
				                update_error()
				                function_error = True
				                _localctx.type = 'void'
				            else:
				                for i in range(arg_max):
				                    I += 'I'
				                print('    invokestatic Test/' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + '(' + I + ')' + currentType)
				                _localctx.type = 'i'
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				((FactorContext)_localctx).NAME = match(NAME);
				if 1:
				        if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
				            sys.stderr.write('Error in factor: Variable ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' is not declared\n')
				            _localctx.type = 'error'
				            exit(1)
				        else:
				            if symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] == 'i':
				                emit('    iload ' +  str(symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))), +1)
				                used_table[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] = True
				                _localctx.type = symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))]
				            elif symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] == 's':
				                emit('    aload ' +  str(symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))), +1)
				                used_table[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))] = True
				                _localctx.type = symbol_type[symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))]
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(READINT);
				setState(260);
				match(OP_PAR);
				setState(261);
				match(CL_PAR);
				if 1:
				        emit('invokestatic Runtime/readInt()I', +1)
				        _localctx.type = 'i'
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				match(READSTR);
				setState(264);
				match(OP_PAR);
				setState(265);
				match(CL_PAR);
				if 1:
				        emit('invokestatic Runtime/readString()Ljava/lang/String;', +1)
				        _localctx.type = 's'
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\7\3@\n\3\f\3\16\3C"+
		"\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\6\5`\n\5\r\5"+
		"\16\5a\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3"+
		"\7\3\7\5\7u\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13"+
		"\7\5\7\u0083\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\6\t\u0093\n\t\r\t\16\t\u0094\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u009d\n\t"+
		"\r\t\16\t\u009e\5\t\u00a1\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u00ad\n\n\r\n\16\n\u00ae\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\5\r\u00bd\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00e1\n\22\f\22\16\22\u00e4\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ed\n\23\f\23\16\23\u00f0\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0100\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\24\2\2"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\30\35\3\2\16\17"+
		"\3\2\20\22\2\u011e\2(\3\2\2\2\4\61\3\2\2\2\6S\3\2\2\2\b]\3\2\2\2\nn\3"+
		"\2\2\2\fp\3\2\2\2\16\u0087\3\2\2\2\20\u008c\3\2\2\2\22\u00a5\3\2\2\2\24"+
		"\u00b3\3\2\2\2\26\u00b6\3\2\2\2\30\u00b9\3\2\2\2\32\u00c1\3\2\2\2\34\u00c5"+
		"\3\2\2\2\36\u00d1\3\2\2\2 \u00d6\3\2\2\2\"\u00db\3\2\2\2$\u00e7\3\2\2"+
		"\2&\u010d\3\2\2\2(,\b\2\1\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-"+
		"\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\5\b\5\2\60\3\3\2\2\2\61\62\7\13\2\2\62"+
		"\63\7\36\2\2\63\65\7\23\2\2\64\66\5\6\4\2\65\64\3\2\2\2\65\66\3\2\2\2"+
		"\66\67\3\2\2\2\678\7\24\2\289\7\26\2\29<\b\3\1\2:;\7\f\2\2;=\b\3\1\2<"+
		":\3\2\2\2<=\3\2\2\2=A\3\2\2\2>@\7$\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2A"+
		"B\3\2\2\2BD\3\2\2\2CA\3\2\2\2DH\b\3\1\2EG\5\n\6\2FE\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7%\2\2LK\3\2\2\2MP\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\b\3\1\2R\5\3\2\2\2ST\7\36\2"+
		"\2TZ\b\4\1\2UV\7\27\2\2VW\7\36\2\2WY\b\4\1\2XU\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]_\b\5\1\2^`\5\n\6\2_^\3\2\2\2`"+
		"a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\5\1\2d\t\3\2\2\2eo\7\"\2\2"+
		"fo\5\f\7\2go\5\16\b\2ho\5\20\t\2io\5\22\n\2jo\5\24\13\2ko\5\26\f\2lo\5"+
		"\30\r\2mo\5\32\16\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2"+
		"nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\13\3\2\2\2pq\7\b\2\2q\u0082"+
		"\7\23\2\2rt\b\7\1\2su\5\n\6\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\"\22\2"+
		"w\177\b\7\1\2xy\7\27\2\2yz\b\7\1\2z{\5\"\22\2{|\b\7\1\2|~\3\2\2\2}x\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082r\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\b\7\1\2\u0086\r\3\2\2\2\u0087"+
		"\u0088\7\36\2\2\u0088\u0089\7\25\2\2\u0089\u008a\5\"\22\2\u008a\u008b"+
		"\b\b\1\2\u008b\17\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\36\20\2\u008e"+
		"\u008f\7\26\2\2\u008f\u0090\b\t\1\2\u0090\u0092\7$\2\2\u0091\u0093\5\n"+
		"\6\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u00a0\3\2\2\2\u0096\u0097\7%\2\2\u0097\u0098\7\4"+
		"\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7$\2\2\u009a\u009c\b\t\1\2\u009b"+
		"\u009d\5\n\6\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\t\1\2\u00a3\u00a4\7%"+
		"\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\b\n\1\2\u00a7\u00a8"+
		"\5 \21\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\b\n\1\2\u00aa\u00ac\7$\2\2\u00ab"+
		"\u00ad\5\n\6\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1"+
		"\u00b2\b\n\1\2\u00b2\23\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\b\13\1"+
		"\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\b\f\1\2\u00b8\27\3"+
		"\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bc\7\23\2\2\u00bb\u00bd\5\34\17\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\7\24\2\2\u00bf\u00c0\b\r\1\2\u00c0\31\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2"+
		"\u00c3\5\"\22\2\u00c3\u00c4\b\16\1\2\u00c4\33\3\2\2\2\u00c5\u00c6\b\17"+
		"\1\2\u00c6\u00c7\5\"\22\2\u00c7\u00ce\b\17\1\2\u00c8\u00c9\7\27\2\2\u00c9"+
		"\u00ca\5\"\22\2\u00ca\u00cb\b\17\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\35\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\t\2\2"+
		"\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\b\20\1\2\u00d5\37\3\2\2\2\u00d6\u00d7"+
		"\5\"\22\2\u00d7\u00d8\t\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\b\21\1"+
		"\2\u00da!\3\2\2\2\u00db\u00e2\5$\23\2\u00dc\u00dd\t\3\2\2\u00dd\u00de"+
		"\5$\23\2\u00de\u00df\b\22\1\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\22\1\2\u00e6#\3\2\2\2\u00e7"+
		"\u00ee\5&\24\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\b\23"+
		"\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\b\23\1\2\u00f2%\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4\u010e"+
		"\b\24\1\2\u00f5\u00f6\7 \2\2\u00f6\u010e\b\24\1\2\u00f7\u00f8\7\23\2\2"+
		"\u00f8\u00f9\5\"\22\2\u00f9\u00fa\7\24\2\2\u00fa\u00fb\b\24\1\2\u00fb"+
		"\u010e\3\2\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00ff\7\23\2\2\u00fe\u0100\5"+
		"\34\17\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7\24\2\2\u0102\u010e\b\24\1\2\u0103\u0104\7\36\2\2\u0104\u010e"+
		"\b\24\1\2\u0105\u0106\7\t\2\2\u0106\u0107\7\23\2\2\u0107\u0108\7\24\2"+
		"\2\u0108\u010e\b\24\1\2\u0109\u010a\7\n\2\2\u010a\u010b\7\23\2\2\u010b"+
		"\u010c\7\24\2\2\u010c\u010e\b\24\1\2\u010d\u00f3\3\2\2\2\u010d\u00f5\3"+
		"\2\2\2\u010d\u00f7\3\2\2\2\u010d\u00fc\3\2\2\2\u010d\u0103\3\2\2\2\u010d"+
		"\u0105\3\2\2\2\u010d\u0109\3\2\2\2\u010e\'\3\2\2\2\30,\65<AHNZant\177"+
		"\u0082\u0094\u009e\u00a0\u00ae\u00bc\u00ce\u00e2\u00ee\u00ff\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}