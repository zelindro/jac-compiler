// Generated from \\wsl.localhost\Ubuntu-20.04\home\zelindro\workspace\jac-compiler\Exp.g4 by ANTLR 4.9.2

symbol_table = []
type_table = []
func_table = []
used_vars = []
param_table = []
stack_cur = 0
stack_max = 0
if_count = 0
while_count = 0
while_atual = -1
arg_count = 0
has_error = False
func_error = False
assin = False
has_return = False

def Emit(val, effect):
	global stack_cur
	global stack_max
	stack_cur += effect
	if stack_cur > stack_max:
		stack_max = stack_cur

	print(val)

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, EQ=14, NE=15, GT=16, 
		GE=17, LT=18, LE=19, CONTINUE=20, BREAK=21, OP_BRA=22, CL_BRA=23, DOT=24, 
		PRINT=25, READ_INT=26, READ_STR=27, IF=28, ELSE=29, WHILE=30, PUSH=31, 
		LENGTH=32, DEF=33, RETURN=34, INT=35, NUMBER=36, STRING=37, NAME=38;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_main = 3, 
		RULE_statement = 4, RULE_st_print = 5, RULE_st_attrib = 6, RULE_st_if = 7, 
		RULE_st_while = 8, RULE_st_break = 9, RULE_st_continue = 10, RULE_st_array_new = 11, 
		RULE_st_array_push = 12, RULE_st_array_set = 13, RULE_st_call = 14, RULE_st_return = 15, 
		RULE_arguments = 16, RULE_comparison = 17, RULE_expression = 18, RULE_term = 19, 
		RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "main", "statement", "st_print", 
			"st_attrib", "st_if", "st_while", "st_break", "st_continue", "st_array_new", 
			"st_array_push", "st_array_set", "st_call", "st_return", "arguments", 
			"comparison", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'continue'", 
			"'break'", "'['", "']'", "'.'", "'print'", "'read_int'", "'read_str'", 
			"'if'", "'else'", "'while'", "'push'", "'length'", "'def'", "'return'", 
			"'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "CONTINUE", "BREAK", "OP_BRA", "CL_BRA", "DOT", "PRINT", 
			"READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "PUSH", "LENGTH", "DEF", 
			"RETURN", "INT", "NUMBER", "STRING", "NAME"
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
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpParser(TokenStream input) {
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

			print('.source Test.src')
			print('.class  public Test')
			print('.super  java/lang/Object\n')
			print('.method public <init>()V')
			print('    aload_0')
			print('    invokenonvirtual java/lang/Object/<init>()V')
			print('    return')
			print('.end method\n')
			    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(43);
				function();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public TerminalNode DEF() { return getToken(ExpParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(ExpParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(ExpParser.CL_CUR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(ExpParser.INT, 0); }
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
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(DEF);
			setState(52);
			((FunctionContext)_localctx).NAME = match(NAME);
			setState(53);
			match(OP_PAR);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(54);
				parameters();
				}
			}

			setState(57);
			match(CL_PAR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(58);
				match(INT);

				global assin, has_return
				assin = True
				    
				}
			}

			setState(62);
			match(OP_CUR);

			global param_table, symbol_table, has_error, func_table
			I = ''
			for l in range(0, len(symbol_table)):
				I = I + 'I'
			param_table.append(len(symbol_table))
			if (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'I' not in func_table and (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'V' not in func_table:
				if assin:
					print('.method public static ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '(' + I + ')I')
					func_table.append((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'I')
				else:
					print('.method public static ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + '(' + I + ')V')
					func_table.append((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + 'V')
			else:
				print('Erro na linha ' + str((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getLine():0)) + ': não pode existir mais de uma função com o mesmo nome', file=sys.stderr)
				has_error = True
			    
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NAME))) != 0)) {
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
			match(CL_CUR);

			if assin and not has_return:
				print('Erro na linha ' + str((((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getLine():0)) + ': faltando valor de return para a função ' + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null), file=sys.stderr)
				has_error = True
			global type_table, used_vars, stack_max, if_count, while_count
			print('    return')
			print('.limit stack ', stack_max)
			if len(symbol_table) != 0:
				print('.limit locals', len(symbol_table))
			print('.end method')

			symbol_table.clear()
			type_table.clear()
			used_vars.clear()
			stack_max = if_count = while_count = 0
			assin = False
			has_return = False
			    
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
		public List<TerminalNode> NAME() { return getTokens(ExpParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
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
			setState(73);
			((ParametersContext)_localctx).NAME = match(NAME);

			symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
			used_vars.append(False)
			type_table.append('i')
			    
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

				global has_error
				if (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) not in symbol_table:
					symbol_table.append((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null))
					used_vars.append(False)
					type_table.append('i')
				else:
					print('Erro na linha ' + str((((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getLine():0)) + '; nomes de parametros devem ser únicos', file=sys.stderr)
					has_error = True
				    
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

			print('.method public static main([Ljava/lang/String;)V\n')
			    
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NAME))) != 0) );

			global has_error, stack_max
			ind = 0
			for vars in used_vars:
				if vars == False:
					print('ERRO: ' + str(symbol_table[ind]) + ' declarada mas não usada', file=sys.stderr)
					has_error = True
				ind += 1

			print('    return')
			print('.limit stack ', stack_max)
			if len(symbol_table) != 0:
				print('.limit locals', len(symbol_table))
			print('.end method')
			print('\n; symbol_table:', symbol_table)

			if has_error:
				raise SystemExit('')
			    
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
		public St_array_newContext st_array_new() {
			return getRuleContext(St_array_newContext.class,0);
		}
		public St_array_pushContext st_array_push() {
			return getRuleContext(St_array_pushContext.class,0);
		}
		public St_array_setContext st_array_set() {
			return getRuleContext(St_array_setContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				st_break();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				st_continue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				st_array_new();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				st_array_push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				st_array_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				st_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
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
		public TerminalNode PRINT() { return getToken(ExpParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
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
			setState(104);
			match(PRINT);
			setState(105);
			match(OP_PAR);

			Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
			    
			setState(107);
			((St_printContext)_localctx).e1 = expression();

			if ((St_printContext)_localctx).e1.type == 'i':
				Emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
			elif ((St_printContext)_localctx).e1.type == 's':
				Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
			elif ((St_printContext)_localctx).e1.type == 'a':
				print('    invokevirtual Array/string()Ljava/lang/String;')
				Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
			else:
				print('Deu bug no print', file=sys.stderr)
			    
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);

				Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
				    
				setState(111);
				((St_printContext)_localctx).e2 = expression();

				if ((St_printContext)_localctx).e2.type == 'i':
					Emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
				elif ((St_printContext)_localctx).e2.type == 's':
					Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
				elif ((St_printContext)_localctx).e2.type == 'a':
					print('    invokevirtual Array/string()Ljava/lang/String;')
					Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
				else:
					print('Deu bug no print', file=sys.stderr)
				    
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(CL_PAR);

			Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
			Emit('    invokevirtual java/io/PrintStream/println()V\n', -1)
			    
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
		public ExpressionContext e1;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
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
			setState(122);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(123);
			match(ATTRIB);
			setState(124);
			((St_attribContext)_localctx).e1 = expression();

			global has_error, symbol_table, type_table, used_vars
			# 1. testar se a variável NAME já existe: se não existir inclui (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) na symbol_table
			if (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) not in symbol_table:
			    symbol_table.append((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))
			    type_table.append(((St_attribContext)_localctx).e1.type)
			    used_vars.append(False)

			# 2. encontrar o index
			index = symbol_table.index((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))

			if type_table[index] == 'i':
				if ((St_attribContext)_localctx).e1.type == 'error':
					pass
				elif ((St_attribContext)_localctx).e1.type != 'i':
					print('Erro na linha ' + str((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getLine():0)) + ': ' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + ' é um inteiro e não pode receber uma string ou vetor', file=sys.stderr)
					has_error = True
				Emit('    istore ' + str(index), -1)
			elif type_table[index] == 's':
				if ((St_attribContext)_localctx).e1.type == 'error':
					pass
				elif ((St_attribContext)_localctx).e1.type != 's':
					print('Erro na linha ' + str((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getLine():0)) + ': ' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + ' é uma string e não pode receber um inteiro ou vetor', file=sys.stderr)
					has_error = True
				Emit('    astore ' + str(index), -1)
			elif type_table[index] == 'a':
				if ((St_attribContext)_localctx).e1.type == 'error':
					pass
				elif ((St_attribContext)_localctx).e1.type != 'a':
					print('Erro na linha ' + str((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getLine():0)) + ': ' + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) + ' é um vetor e não pode receber um inteiro ou string', file=sys.stderr)
					has_error = True
			else:
				pass
			    
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
		public TerminalNode IF() { return getToken(ExpParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> OP_CUR() { return getTokens(ExpParser.OP_CUR); }
		public TerminalNode OP_CUR(int i) {
			return getToken(ExpParser.OP_CUR, i);
		}
		public List<TerminalNode> CL_CUR() { return getTokens(ExpParser.CL_CUR); }
		public TerminalNode CL_CUR(int i) {
			return getToken(ExpParser.CL_CUR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExpParser.ELSE, 0); }
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
			setState(127);
			match(IF);
			setState(128);
			comparison();

			global if_count
			has_else = False
			if_local = if_count
			if_count += 1
			Emit(' NOT_IF_' + str(if_local), -2)
			    
			setState(130);
			match(OP_CUR);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NAME))) != 0) );
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				match(CL_CUR);
				setState(137);
				match(ELSE);
				setState(138);
				match(OP_CUR);

				has_else = True
				print('    goto END_ELSE_' + str(if_local))
				print('    NOT_IF_' + str(if_local) + ':')
				    
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					statement();
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NAME))) != 0) );
				}
				break;
			}

			if not has_else: print('NOT_IF_' + str(if_local) + ':')
			else: print('END_ELSE_' + str(if_local) + ':')
			    
			setState(148);
			match(CL_CUR);
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
		public TerminalNode WHILE() { return getToken(ExpParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode OP_CUR() { return getToken(ExpParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(ExpParser.CL_CUR, 0); }
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
			setState(150);
			match(WHILE);

			global while_count
			global while_atual
			while_local = while_count
			while_atual = while_local
			while_count += 1
			print('BEGIN_WHILE_' + str(while_local) + ':')
			    
			setState(152);
			comparison();

			Emit(' END_WHILE_' + str(while_local), 0)
			    
			setState(154);
			match(OP_CUR);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NAME))) != 0) );
			setState(160);
			match(CL_CUR);

			Emit('    goto BEGIN_WHILE_' + str(while_local), 0)
			print('END_WHILE_' + str(while_local) + ':')
			while_atual = -1
			    
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
		public Token BREAK;
		public TerminalNode BREAK() { return getToken(ExpParser.BREAK, 0); }
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
			setState(163);
			((St_breakContext)_localctx).BREAK = match(BREAK);

			global has_error
			global while_atual
			if while_atual == -1:
				print('ERRO na linha ' + str((((St_breakContext)_localctx).BREAK!=null?((St_breakContext)_localctx).BREAK.getLine():0)) + ': break não pode ser utilizado fora de laço de repetição', file=sys.stderr)
				has_error = True
			print('    goto END_WHILE_' + str(while_atual))
			    
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
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(ExpParser.CONTINUE, 0); }
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
			setState(166);
			((St_continueContext)_localctx).CONTINUE = match(CONTINUE);

			global has_error
			global while_atual
			if while_atual == -1:
				print('ERRO na linha ' + str((((St_continueContext)_localctx).CONTINUE!=null?((St_continueContext)_localctx).CONTINUE.getLine():0)) + ': continue não pode ser utilizado fora de laço de repetição', file=sys.stderr)
				has_error = True
			print('    goto BEGIN_WHILE_' + str(while_atual))
			    
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

	public static class St_array_newContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public St_array_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_new; }
	}

	public final St_array_newContext st_array_new() throws RecognitionException {
		St_array_newContext _localctx = new St_array_newContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_array_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((St_array_newContext)_localctx).NAME = match(NAME);
			setState(170);
			match(ATTRIB);
			setState(171);
			match(OP_BRA);
			setState(172);
			match(CL_BRA);

			global has_error
			if (((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null) not in symbol_table:
			    symbol_table.append((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null))
			    type_table.append('a')
			    used_vars.append(False)

			    index = symbol_table.index((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null))

			    Emit('    new Array', 1)
			    Emit('    dup', 1)
			    Emit('    invokespecial Array/<init>()V', -1)
			    Emit('    astore ' + str(index), -1)
			else:
			    print('Erro na linha ' + str((((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getLine():0)) + ': ' + (((St_array_newContext)_localctx).NAME!=null?((St_array_newContext)_localctx).NAME.getText():null) + ' já declarado', file=sys.stderr)
			    has_error = True
			    
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

	public static class St_array_pushContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(ExpParser.PUSH, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public St_array_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_push; }
	}

	public final St_array_pushContext st_array_push() throws RecognitionException {
		St_array_pushContext _localctx = new St_array_pushContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_array_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((St_array_pushContext)_localctx).NAME = match(NAME);
			setState(176);
			match(DOT);
			setState(177);
			match(PUSH);

			global has_error
			if (((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null) not in symbol_table:
			    print('Erro na linha ' + str((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getLine():0)) + ': ' + (((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null) + ' não declarado', file=sys.stderr)
			    has_error = True
			else:
			    index = symbol_table.index((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null))
			    if type_table[index] != 'a':
			        print('Erro na linha ' + str((((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getLine():0)) + ': ' + (((St_array_pushContext)_localctx).NAME!=null?((St_array_pushContext)_localctx).NAME.getText():null) + ' não é um vetor', file=sys.stderr)
			        has_error = True
			    Emit('    aload ' + str(index), 1)
			    
			setState(179);
			match(OP_PAR);
			setState(180);
			expression();
			setState(181);
			match(CL_PAR);

			Emit('    invokevirtual Array/push(I)V', -2)
			    
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

	public static class St_array_setContext extends ParserRuleContext {
		public Token NAME;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(ExpParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_array_set; }
	}

	public final St_array_setContext st_array_set() throws RecognitionException {
		St_array_setContext _localctx = new St_array_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_st_array_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((St_array_setContext)_localctx).NAME = match(NAME);

			global has_error
			global erro
			erro = False
			if (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) not in symbol_table:
				print('Erro na linha ' + str((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0)) + ': ' + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) + ' não declarado', file=sys.stderr)
				has_error = True
				erro = True
				index = -1
			else:
				index = symbol_table.index((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null))
				if type_table[index] != 'a':
					print('Erro na linha ' + str((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0)) + ': ' + (((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getText():null) + ' não é um vetor', file=sys.stderr)
					has_error = True
					erro = True
				Emit('    aload ' + str(index), 1)
			    
			setState(186);
			match(OP_BRA);
			setState(187);
			((St_array_setContext)_localctx).e1 = expression();
			setState(188);
			match(CL_BRA);
			setState(189);
			match(ATTRIB);
			setState(190);
			((St_array_setContext)_localctx).e2 = expression();

			if type_table[index] == 'a' and not erro:
				if ((St_array_setContext)_localctx).e1.type != 'i' or ((St_array_setContext)_localctx).e2.type != 'i':
					print('Erro na linha ' + str((((St_array_setContext)_localctx).NAME!=null?((St_array_setContext)_localctx).NAME.getLine():0)) + ': um vetor não pode receber uma string como índice ou atribuição', file=sys.stderr)
					has_error = True
			Emit('    invokevirtual Array/set(II)V', -3)
			    
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
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
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
		enterRule(_localctx, 28, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((St_callContext)_localctx).NAME = match(NAME);
			setState(194);
			match(OP_PAR);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << NUMBER) | (1L << STRING) | (1L << NAME))) != 0)) {
				{
				setState(195);
				arguments();
				}
			}

			setState(198);
			match(CL_PAR);

			global func_table, arg_count, has_error, func_error
			I = ''
			ind = 0
			if (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + 'I' not in func_table and (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + 'V' not in func_table:
				print('Erro na linha ' + str((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getLine():0)) + ': função ' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + ' não foi declarada', file=sys.stderr)
				has_error = True
			else:
				for func in func_table:
					if func == (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + 'I' or func == (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + 'V':
						break
					ind += 1
				
				if func_table[ind].endswith('I'):
					print('Erro na linha ' + str((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getLine():0)) + ': função ' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + ' é inteira, portanto não pode ter seu valor de retorno ignorado', file=sys.stderr)
					has_error = True
				else:
					if param_table[ind] != arg_count:
						print('Erro na linha ' + str((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getLine():0)) + ': número incorreto de argumentos', file=sys.stderr)
						has_error = True
					if func_error:
						print('Erro na linha ' + str((((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getLine():0)) + ': todos os argumentos devem ser inteiros', file=sys.stderr)
					for l in range(0, arg_count):
						I = I + 'I'
					print('    invokestatic Test/' + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + '(' + I + ')V')
			arg_count = 0
			    
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
		public Token RETURN;
		public ExpressionContext e1;
		public TerminalNode RETURN() { return getToken(ExpParser.RETURN, 0); }
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
		enterRule(_localctx, 30, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((St_returnContext)_localctx).RETURN = match(RETURN);
			setState(202);
			((St_returnContext)_localctx).e1 = expression();

			global has_error, has_return
			if func_table[len(func_table) - 1].endswith('V'):
				print('Erro na linha ' + str((((St_returnContext)_localctx).RETURN!=null?((St_returnContext)_localctx).RETURN.getLine():0)) + ': função void não pode retornar um valor', file=sys.stderr)
				has_error = True
			if ((St_returnContext)_localctx).e1.type == 'i':
				print('    ireturn')
			else:
				print('Erro na linha ' + str((((St_returnContext)_localctx).RETURN!=null?((St_returnContext)_localctx).RETURN.getLine():0)) + ': valor de retorno deve ser do tipo inteiro', file=sys.stderr)
				has_error = True
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
		public List<TerminalNode> COMMA() { return getTokens(ExpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			global arg_count
			arg_count = 0
			    
			setState(206);
			((ArgumentsContext)_localctx).e1 = expression();

			global has_error, func_error
			arg_count += 1
			if ((ArgumentsContext)_localctx).e1.type != 'i':
				has_error = True
				func_error = True
			    
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				((ArgumentsContext)_localctx).e2 = expression();

				arg_count += 1
				if ((ArgumentsContext)_localctx).e2.type != 'i':
					has_error = True
					func_error = True
				    
				}
				}
				setState(216);
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

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ExpParser.NE, 0); }
		public TerminalNode GT() { return getToken(ExpParser.GT, 0); }
		public TerminalNode GE() { return getToken(ExpParser.GE, 0); }
		public TerminalNode LT() { return getToken(ExpParser.LT, 0); }
		public TerminalNode LE() { return getToken(ExpParser.LE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ComparisonContext)_localctx).e1 = expression();
			setState(218);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			((ComparisonContext)_localctx).e2 = expression();

			global has_error
			if ((ComparisonContext)_localctx).e1.type != ((ComparisonContext)_localctx).e2.type or ((ComparisonContext)_localctx).e1.type == 'a' and ((ComparisonContext)_localctx).e2.type == 'a':
				print('Erro na linha ' + str((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getLine():0)) + ': não pode combinar tipos', file=sys.stderr)
				has_error = True
			global if_count
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.EQ: print('    if_icmpne', end='')
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.NE: print('    if_icmpeq', end='')
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.GT: print('    if_icmple', end='')
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.GE: print('    if_icmplt', end='')
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.LT: print('    if_icmpge', end='')
			if (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == ExpParser.LE: print('    if_icmpgt', end='')
			    
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
		public List<TerminalNode> PLUS() { return getTokens(ExpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExpParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((ExpressionContext)_localctx).t1 = term();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(223);
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
				setState(224);
				((ExpressionContext)_localctx).t2 = term();

				global has_error
				if ((ExpressionContext)_localctx).t1.type != ((ExpressionContext)_localctx).t2.type or ((ExpressionContext)_localctx).t1.type == 'a' and ((ExpressionContext)_localctx).t2.type == 'a':
					print('Erro na linha ' + str((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0)) + ': não pode combinar tipos', file=sys.stderr)
					has_error = True
				if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == ExpParser.PLUS:  Emit('    iadd', -1)
				if (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == ExpParser.MINUS: Emit('    isub', -1)
				    
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

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
		public List<TerminalNode> TIMES() { return getTokens(ExpParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExpParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(ExpParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(ExpParser.OVER, i);
		}
		public List<TerminalNode> REM() { return getTokens(ExpParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(ExpParser.REM, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((TermContext)_localctx).f1 = factor();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REM))) != 0)) {
				{
				{
				setState(235);
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
				setState(236);
				((TermContext)_localctx).f2 = factor();

				global has_error
				if ((TermContext)_localctx).f1.type != ((TermContext)_localctx).f2.type or ((TermContext)_localctx).f1.type == 'a' and ((TermContext)_localctx).f2.type == 'a':
					print('Erro na linha ' + str((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0)) + ': não pode combinar tipos', file=sys.stderr)
					has_error = True
				if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.TIMES: Emit('    imul', -1)
				if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.OVER:  Emit('    idiv', -1)
				if (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == ExpParser.REM:   Emit('    irem', -1)
				    
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

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
		public ExpressionContext expression;
		public Token NAME;
		public TerminalNode NUMBER() { return getToken(ExpParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpParser.STRING, 0); }
		public TerminalNode OP_PAR() { return getToken(ExpParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(ExpParser.CL_PAR, 0); }
		public TerminalNode NAME() { return getToken(ExpParser.NAME, 0); }
		public TerminalNode READ_INT() { return getToken(ExpParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(ExpParser.READ_STR, 0); }
		public TerminalNode DOT() { return getToken(ExpParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(ExpParser.LENGTH, 0); }
		public TerminalNode OP_BRA() { return getToken(ExpParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(ExpParser.CL_BRA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((FactorContext)_localctx).NUMBER = match(NUMBER);

				Emit('    ldc ' + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), 1)
				_localctx.type = 'i'
				# symbol_table.append((((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null))
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((FactorContext)_localctx).STRING = match(STRING);

				Emit('    ldc ' + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), 1)
				_localctx.type = 's'
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(OP_PAR);
				setState(251);
				((FactorContext)_localctx).expression = expression();
				setState(252);
				match(CL_PAR);

				_localctx.type = ((FactorContext)_localctx).expression.type
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				((FactorContext)_localctx).NAME = match(NAME);

				global has_error
				if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
					print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não declarada', file=sys.stderr)
					has_error = True
					_localctx.type = 'error'
				else:
					index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
					used_vars[index] = True

					if type_table[index] == 'i':
						Emit('    iload ' + str(index), 1)
						_localctx.type = 'i'
					elif type_table[index] == 's':
						Emit('    aload ' + str(index), 1)
						_localctx.type = 's'
					elif type_table[index] == 'a':
						Emit('    aload ' + str(index), 1)
						_localctx.type = 'a'
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(READ_INT);
				setState(258);
				match(OP_PAR);
				setState(259);
				match(CL_PAR);

				Emit('    invokestatic Runtime/readInt()I', 1)
				_localctx.type = 'i'
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(READ_STR);
				setState(262);
				match(OP_PAR);
				setState(263);
				match(CL_PAR);

				Emit('    invokestatic Runtime/readString()Ljava/lang/String;', 1)
				_localctx.type = 's'
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(266);
				match(DOT);
				setState(267);
				match(LENGTH);

				if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
					print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não declarado', file=sys.stderr)
					has_error = True
					_localctx.type = 'error'
				else:
					index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
					if type_table[index] != 'a':
						print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não é um vetor', file=sys.stderr)
						has_error = True
					Emit('    aload ' + str(index), 1)
					print('    invokevirtual Array/length()I')
					_localctx.type = 'i'
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				((FactorContext)_localctx).NAME = match(NAME);

				if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) not in symbol_table:
					print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não declarado', file=sys.stderr)
					has_error = True
					_localctx.type = 'error'
				else:
					index = symbol_table.index((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))
					if type_table[index] != 'a':
						print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não é um vetor', file=sys.stderr)
						has_error = True
					Emit('    aload ' + str(index), 1)
					_localctx.type = 'i'
				    
				setState(271);
				match(OP_BRA);
				setState(272);
				expression();
				setState(273);
				match(CL_BRA);

				Emit('    invokevirtual Array/get(I)I', -1)
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(277);
				match(OP_PAR);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << NUMBER) | (1L << STRING) | (1L << NAME))) != 0)) {
					{
					setState(278);
					arguments();
					}
				}

				setState(281);
				match(CL_PAR);

				global arg_count
				ind = 0
				I = ''
				if (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + 'I' not in func_table and (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + 'V' not in func_table:
					print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' não declarado', file=sys.stderr)
					has_error = True
					_localctx.type = 'error'
				else:
					for func in func_table:
						if func == (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + 'I' or func == (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + 'V':
							break
						ind += 1
					if func_table[ind].endswith('V'):
						print('Erro na linha ' + str((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getLine():0)) + ': ' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + ' é uma função void, portanto não pode retornar um valor', file=sys.stderr)
						has_error = True
						_localctx.type = 'error'
					else:
						for l in range(0, arg_count):
							I = I + 'I'
						print('    invokestatic Test/' + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + '(' + I + ')I')
						_localctx.type = 'i'
				    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3"+
		"\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\5\3\5\6\5X\n\5\r\5\16\5Y\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\6\t\u0087\n\t\r\t\16\t\u0088\3\t\3\t\3\t\3\t\3\t\6\t\u0090\n"+
		"\t\r\t\16\t\u0091\5\t\u0094\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\6"+
		"\n\u009f\n\n\r\n\16\n\u00a0\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00c7\n\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00d7\n\22\f\22\16\22\u00da\13\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00e6\n\24\f\24\16\24\u00e9\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00f2\n\25\f\25\16\25\u00f5\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\26\3\26\5\26\u011e\n"+
		"\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2"+
		"\20\25\3\2\5\6\3\2\7\t\2\u012c\2,\3\2\2\2\4\65\3\2\2\2\6K\3\2\2\2\bU\3"+
		"\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16|\3\2\2\2\20\u0081\3\2\2\2\22\u0098\3\2"+
		"\2\2\24\u00a5\3\2\2\2\26\u00a8\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1\3\2\2"+
		"\2\34\u00ba\3\2\2\2\36\u00c3\3\2\2\2 \u00cb\3\2\2\2\"\u00cf\3\2\2\2$\u00db"+
		"\3\2\2\2&\u00e0\3\2\2\2(\u00ec\3\2\2\2*\u011d\3\2\2\2,\60\b\2\1\2-/\5"+
		"\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\5\b\5\2\64\3\3\2\2\2\65\66\7#\2\2\66\67\7(\2\2\679\7"+
		"\n\2\28:\5\6\4\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;>\7\13\2\2<=\7%\2\2=?\b"+
		"\3\1\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\16\2\2AE\b\3\1\2BD\5\n\6\2CB"+
		"\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\17\2\2"+
		"IJ\b\3\1\2J\5\3\2\2\2KL\7(\2\2LR\b\4\1\2MN\7\r\2\2NO\7(\2\2OQ\b\4\1\2"+
		"PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UW\b\5\1"+
		"\2VX\5\n\6\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\5"+
		"\1\2\\\t\3\2\2\2]i\5\f\7\2^i\5\16\b\2_i\5\20\t\2`i\5\22\n\2ai\5\24\13"+
		"\2bi\5\26\f\2ci\5\30\r\2di\5\32\16\2ei\5\34\17\2fi\5\36\20\2gi\5 \21\2"+
		"h]\3\2\2\2h^\3\2\2\2h_\3\2\2\2h`\3\2\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2"+
		"hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jk\7\33\2\2kl\7\n"+
		"\2\2lm\b\7\1\2mn\5&\24\2nv\b\7\1\2op\7\r\2\2pq\b\7\1\2qr\5&\24\2rs\b\7"+
		"\1\2su\3\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2yz\7\13\2\2z{\b\7\1\2{\r\3\2\2\2|}\7(\2\2}~\7\f\2\2~\177\5&\24\2\177"+
		"\u0080\b\b\1\2\u0080\17\3\2\2\2\u0081\u0082\7\36\2\2\u0082\u0083\5$\23"+
		"\2\u0083\u0084\b\t\1\2\u0084\u0086\7\16\2\2\u0085\u0087\5\n\6\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0093\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\7\37\2\2\u008c"+
		"\u008d\7\16\2\2\u008d\u008f\b\t\1\2\u008e\u0090\5\n\6\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\b\t\1\2\u0096\u0097\7\17\2\2\u0097\21\3\2\2\2\u0098\u0099"+
		"\7 \2\2\u0099\u009a\b\n\1\2\u009a\u009b\5$\23\2\u009b\u009c\b\n\1\2\u009c"+
		"\u009e\7\16\2\2\u009d\u009f\5\n\6\2\u009e\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\17\2\2\u00a3\u00a4\b\n\1\2\u00a4\23\3\2\2\2\u00a5\u00a6\7\27"+
		"\2\2\u00a6\u00a7\b\13\1\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9"+
		"\u00aa\b\f\1\2\u00aa\27\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00ad\7\f\2\2"+
		"\u00ad\u00ae\7\30\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\b\r\1\2\u00b0\31"+
		"\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\7!\2\2\u00b4"+
		"\u00b5\b\16\1\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\7"+
		"\13\2\2\u00b8\u00b9\b\16\1\2\u00b9\33\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb"+
		"\u00bc\b\17\1\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7"+
		"\31\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\b\17\1\2\u00c2"+
		"\35\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c6\7\n\2\2\u00c5\u00c7\5\"\22"+
		"\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\7\13\2\2\u00c9\u00ca\b\20\1\2\u00ca\37\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd\u00ce\b\21\1\2\u00ce!\3\2\2\2\u00cf\u00d0\b\22\1"+
		"\2\u00d0\u00d1\5&\24\2\u00d1\u00d8\b\22\1\2\u00d2\u00d3\7\r\2\2\u00d3"+
		"\u00d4\5&\24\2\u00d4\u00d5\b\22\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d2\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"#\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5&\24\2\u00dc\u00dd\t\2\2\2"+
		"\u00dd\u00de\5&\24\2\u00de\u00df\b\23\1\2\u00df%\3\2\2\2\u00e0\u00e7\5"+
		"(\25\2\u00e1\u00e2\t\3\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\b\24\1\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\b\24\1\2\u00eb\'\3\2\2\2\u00ec\u00f3\5*\26\2\u00ed\u00ee\t\4\2"+
		"\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\b\25\1\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\25\1\2\u00f7"+
		")\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9\u011e\b\26\1\2\u00fa\u00fb\7\'\2\2"+
		"\u00fb\u011e\b\26\1\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff"+
		"\7\13\2\2\u00ff\u0100\b\26\1\2\u0100\u011e\3\2\2\2\u0101\u0102\7(\2\2"+
		"\u0102\u011e\b\26\1\2\u0103\u0104\7\34\2\2\u0104\u0105\7\n\2\2\u0105\u0106"+
		"\7\13\2\2\u0106\u011e\b\26\1\2\u0107\u0108\7\35\2\2\u0108\u0109\7\n\2"+
		"\2\u0109\u010a\7\13\2\2\u010a\u011e\b\26\1\2\u010b\u010c\7(\2\2\u010c"+
		"\u010d\7\32\2\2\u010d\u010e\7\"\2\2\u010e\u011e\b\26\1\2\u010f\u0110\7"+
		"(\2\2\u0110\u0111\b\26\1\2\u0111\u0112\7\30\2\2\u0112\u0113\5&\24\2\u0113"+
		"\u0114\7\31\2\2\u0114\u0115\b\26\1\2\u0115\u011e\3\2\2\2\u0116\u0117\7"+
		"(\2\2\u0117\u0119\7\n\2\2\u0118\u011a\5\"\22\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\13\2\2\u011c\u011e\b"+
		"\26\1\2\u011d\u00f8\3\2\2\2\u011d\u00fa\3\2\2\2\u011d\u00fc\3\2\2\2\u011d"+
		"\u0101\3\2\2\2\u011d\u0103\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u010b\3\2"+
		"\2\2\u011d\u010f\3\2\2\2\u011d\u0116\3\2\2\2\u011e+\3\2\2\2\24\609>ER"+
		"Yhv\u0088\u0091\u0093\u00a0\u00c6\u00d8\u00e7\u00f3\u0119\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}