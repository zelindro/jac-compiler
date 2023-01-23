grammar Exp;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
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
}
/*---------------- LEXER RULES ----------------*/
COMMENT: '#' ~('\n')*         -> skip ;
SPACE : (' '|'\t'|'\r'|'\n')+ -> skip ;

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;
OP_PAR: '(' ;
CL_PAR: ')' ;
ATTRIB: '=' ;
COMMA : ',' ;
OP_CUR: '{' ;
CL_CUR: '}' ;
EQ    : '==';
NE    : '!=';
GT    : '>' ;
GE    : '>=';
LT    : '<' ;
LE    : '<=';
CONTINUE: 'continue';
BREAK : 'break';
OP_BRA: '[' ;
CL_BRA: ']' ;
DOT   : '.' ;

PRINT: 'print' ;
READ_INT: 'read_int' ;
READ_STR: 'read_str' ;
IF   : 'if'    ;
ELSE : 'else'  ;
WHILE: 'while' ;
PUSH : 'push'  ;
LENGTH:'length';
DEF  : 'def'   ;
RETURN: 'return';
INT  : 'int'   ;

NUMBER: '0'..'9'+ ;
STRING: '"'~('"')*'"' ;

NAME: 'a'..'z'+ ;

/*---------------- PARSER RULES ----------------*/

program:
    {
print('.source Test.src')
print('.class  public Test')
print('.super  java/lang/Object\n')
print('.method public <init>()V')
print('    aload_0')
print('    invokenonvirtual java/lang/Object/<init>()V')
print('    return')
print('.end method\n')
    }
    ( function )* main ;


function: DEF NAME OP_PAR ( parameters )? CL_PAR 
( INT
    {
global assin, has_return
assin = True
    })?
OP_CUR
    {
global param_table, symbol_table, has_error, func_table
I = ''
for l in range(0, len(symbol_table)):
	I = I + 'I'
param_table.append(len(symbol_table))
if $NAME.text + 'I' not in func_table and $NAME.text + 'V' not in func_table:
	if assin:
		print('.method public static ' + $NAME.text + '(' + I + ')I')
		func_table.append($NAME.text + 'I')
	else:
		print('.method public static ' + $NAME.text + '(' + I + ')V')
		func_table.append($NAME.text + 'V')
else:
	print('Erro na linha ' + str($NAME.line) + ': não pode existir mais de uma função com o mesmo nome', file=sys.stderr)
	has_error = True
    }
( statement )* CL_CUR
    {
if assin and not has_return:
	print('Erro na linha ' + str($NAME.line) + ': faltando valor de return para a função ' + $NAME.text, file=sys.stderr)
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
    ;

parameters: NAME 
    {
symbol_table.append($NAME.text)
used_vars.append(False)
type_table.append('i')
    }
    ( COMMA NAME 
    {
global has_error
if $NAME.text not in symbol_table:
	symbol_table.append($NAME.text)
	used_vars.append(False)
	type_table.append('i')
else:
	print('Erro na linha ' + str($NAME.line) + '; nomes de parametros devem ser únicos', file=sys.stderr)
	has_error = True
    }
)*
    ;

main:
    {
print('.method public static main([Ljava/lang/String;)V\n')
    }
    ( statement )+
    {
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
    ;

statement: st_print | st_attrib | st_if | st_while | st_break | st_continue | st_array_new | st_array_push | st_array_set | st_call | st_return;

st_print: PRINT OP_PAR
    {
Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
    }
    e1 =  expression
    {
if $e1.type == 'i':
	Emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
elif $e1.type == 's':
	Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
elif $e1.type == 'a':
	print('    invokevirtual Array/string()Ljava/lang/String;')
	Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
else:
	print('Deu bug no print', file=sys.stderr)
    }
    ( COMMA 
    {
Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
    }
    e2 = expression 
    {
if $e2.type == 'i':
	Emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
elif $e2.type == 's':
	Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
elif $e2.type == 'a':
	print('    invokevirtual Array/string()Ljava/lang/String;')
	Emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
else:
	print('Deu bug no print', file=sys.stderr)
    }
    )*
    CL_PAR
    {
Emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
Emit('    invokevirtual java/io/PrintStream/println()V\n', -1)
    }
    ;

st_attrib: NAME ATTRIB e1 = expression 
    {
global has_error, symbol_table, type_table, used_vars
# 1. testar se a variável NAME já existe: se não existir inclui $NAME.text na symbol_table
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)
    type_table.append($e1.type)
    used_vars.append(False)

# 2. encontrar o index
index = symbol_table.index($NAME.text)

if type_table[index] == 'i':
	if $e1.type == 'error':
		pass
	elif $e1.type != 'i':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' é um inteiro e não pode receber uma string ou vetor', file=sys.stderr)
		has_error = True
	Emit('    istore ' + str(index), -1)
elif type_table[index] == 's':
	if $e1.type == 'error':
		pass
	elif $e1.type != 's':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' é uma string e não pode receber um inteiro ou vetor', file=sys.stderr)
		has_error = True
	Emit('    astore ' + str(index), -1)
elif type_table[index] == 'a':
	if $e1.type == 'error':
		pass
	elif $e1.type != 'a':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' é um vetor e não pode receber um inteiro ou string', file=sys.stderr)
		has_error = True
else:
	pass
    }
    ;

st_if: IF comparison 
    {
global if_count
has_else = False
if_local = if_count
if_count += 1
Emit(' NOT_IF_' + str(if_local), -2)
    }
OP_CUR ( statement )+
(CL_CUR ELSE OP_CUR
    {
has_else = True
print('    goto END_ELSE_' + str(if_local))
print('    NOT_IF_' + str(if_local) + ':')
    }
( statement )+ )?
    {
if not has_else: print('NOT_IF_' + str(if_local) + ':')
else: print('END_ELSE_' + str(if_local) + ':')
    }
CL_CUR
    ;

st_while: WHILE
    {
global while_count
global while_atual
while_local = while_count
while_atual = while_local
while_count += 1
print('BEGIN_WHILE_' + str(while_local) + ':')
    }
comparison
    {
Emit(' END_WHILE_' + str(while_local), 0)
    }
OP_CUR ( statement )+ CL_CUR
    {
Emit('    goto BEGIN_WHILE_' + str(while_local), 0)
print('END_WHILE_' + str(while_local) + ':')
while_atual = -1
    }
    ;
    

st_break: BREAK
    {
global has_error
global while_atual
if while_atual == -1:
	print('ERRO na linha ' + str($BREAK.line) + ': break não pode ser utilizado fora de laço de repetição', file=sys.stderr)
	has_error = True
print('    goto END_WHILE_' + str(while_atual))
    }
    ;

st_continue: CONTINUE
    {
global has_error
global while_atual
if while_atual == -1:
	print('ERRO na linha ' + str($CONTINUE.line) + ': continue não pode ser utilizado fora de laço de repetição', file=sys.stderr)
	has_error = True
print('    goto BEGIN_WHILE_' + str(while_atual))
    }
    ;

st_array_new: NAME ATTRIB OP_BRA CL_BRA
    {
global has_error
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)
    type_table.append('a')
    used_vars.append(False)

    index = symbol_table.index($NAME.text)

    Emit('    new Array', 1)
    Emit('    dup', 1)
    Emit('    invokespecial Array/<init>()V', -1)
    Emit('    astore ' + str(index), -1)
else:
    print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' já declarado', file=sys.stderr)
    has_error = True
    }
    ;

st_array_push: NAME DOT PUSH
    {
global has_error
if $NAME.text not in symbol_table:
    print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarado', file=sys.stderr)
    has_error = True
else:
    index = symbol_table.index($NAME.text)
    if type_table[index] != 'a':
        print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não é um vetor', file=sys.stderr)
        has_error = True
    Emit('    aload ' + str(index), 1)
    }
    OP_PAR expression CL_PAR
    {
Emit('    invokevirtual Array/push(I)V', -2)
    }
    ;

st_array_set: NAME
    {
global has_error
global erro
erro = False
if $NAME.text not in symbol_table:
	print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarado', file=sys.stderr)
	has_error = True
	erro = True
	index = -1
else:
	index = symbol_table.index($NAME.text)
	if type_table[index] != 'a':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não é um vetor', file=sys.stderr)
		has_error = True
		erro = True
	Emit('    aload ' + str(index), 1)
    }
    OP_BRA e1 = expression CL_BRA ATTRIB e2 = expression
    {
if type_table[index] == 'a' and not erro:
	if $e1.type != 'i' or $e2.type != 'i':
		print('Erro na linha ' + str($NAME.line) + ': um vetor não pode receber uma string como índice ou atribuição', file=sys.stderr)
		has_error = True
Emit('    invokevirtual Array/set(II)V', -3)
    }
    ;

st_call: NAME OP_PAR ( arguments )? CL_PAR
    {
global func_table, arg_count, has_error, func_error
I = ''
ind = 0
if $NAME.text + 'I' not in func_table and $NAME.text + 'V' not in func_table:
	print('Erro na linha ' + str($NAME.line) + ': função ' + $NAME.text + ' não foi declarada', file=sys.stderr)
	has_error = True
else:
	for func in func_table:
		if func == $NAME.text + 'I' or func == $NAME.text + 'V':
			break
		ind += 1
	
	if func_table[ind].endswith('I'):
		print('Erro na linha ' + str($NAME.line) + ': função ' + $NAME.text + ' é inteira, portanto não pode ter seu valor de retorno ignorado', file=sys.stderr)
		has_error = True
	else:
		if param_table[ind] != arg_count:
			print('Erro na linha ' + str($NAME.line) + ': número incorreto de argumentos', file=sys.stderr)
			has_error = True
		if func_error:
			print('Erro na linha ' + str($NAME.line) + ': todos os argumentos devem ser inteiros', file=sys.stderr)
		for l in range(0, arg_count):
			I = I + 'I'
		print('    invokestatic Test/' + $NAME.text + '(' + I + ')V')
arg_count = 0
    }
    ;

st_return: RETURN e1 = expression
    {
global has_error, has_return
if func_table[len(func_table) - 1].endswith('V'):
	print('Erro na linha ' + str($RETURN.line) + ': função void não pode retornar um valor', file=sys.stderr)
	has_error = True
if $e1.type == 'i':
	print('    ireturn')
else:
	print('Erro na linha ' + str($RETURN.line) + ': valor de retorno deve ser do tipo inteiro', file=sys.stderr)
	has_error = True
has_return = True
    }
    ;

arguments: 
    {
global arg_count
arg_count = 0
    }
e1 = expression 
    {
global has_error, func_error
arg_count += 1
if $e1.type != 'i':
	has_error = True
	func_error = True
    }
(COMMA e2 = expression
    {
arg_count += 1
if $e2.type != 'i':
	has_error = True
	func_error = True
    }
)*
    ;

comparison: e1 = expression op = (EQ | NE | GT | GE | LT | LE ) e2 = expression
    {
global has_error
if $e1.type != $e2.type or $e1.type == 'a' and $e2.type == 'a':
	print('Erro na linha ' + str($op.line) + ': não pode combinar tipos', file=sys.stderr)
	has_error = True
global if_count
if $op.type == ExpParser.EQ: print('    if_icmpne', end='')
if $op.type == ExpParser.NE: print('    if_icmpeq', end='')
if $op.type == ExpParser.GT: print('    if_icmple', end='')
if $op.type == ExpParser.GE: print('    if_icmplt', end='')
if $op.type == ExpParser.LT: print('    if_icmpge', end='')
if $op.type == ExpParser.LE: print('    if_icmpgt', end='')
    }
    ;


expression returns [type]: t1= term ( op = ( PLUS | MINUS ) t2 = term
    {
global has_error
if $t1.type != $t2.type or $t1.type == 'a' and $t2.type == 'a':
	print('Erro na linha ' + str($op.line) + ': não pode combinar tipos', file=sys.stderr)
	has_error = True
if $op.type == ExpParser.PLUS:  Emit('    iadd', -1)
if $op.type == ExpParser.MINUS: Emit('    isub', -1)
    }
    )* 
    {
$type = $t1.type
    }
;

term returns [type]: f1 = factor ( op = ( TIMES | OVER | REM ) f2 = factor
    {
global has_error
if $f1.type != $f2.type or $f1.type == 'a' and $f2.type == 'a':
	print('Erro na linha ' + str($op.line) + ': não pode combinar tipos', file=sys.stderr)
	has_error = True
if $op.type == ExpParser.TIMES: Emit('    imul', -1)
if $op.type == ExpParser.OVER:  Emit('    idiv', -1)
if $op.type == ExpParser.REM:   Emit('    irem', -1)
    }
    )* 
    {
$type = $f1.type
    }
;

factor returns [type]: NUMBER
    {
Emit('    ldc ' + $NUMBER.text, 1)
$type = 'i'
# symbol_table.append($NUMBER.text)
    } 
    | STRING
    {
Emit('    ldc ' + $STRING.text, 1)
$type = 's'
    }
    | OP_PAR expression CL_PAR
    {
$type = $expression.type
    }
    | NAME
    {
global has_error
if $NAME.text not in symbol_table:
	print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarada', file=sys.stderr)
	has_error = True
	$type = 'error'
else:
	index = symbol_table.index($NAME.text)
	used_vars[index] = True

	if type_table[index] == 'i':
		Emit('    iload ' + str(index), 1)
		$type = 'i'
	elif type_table[index] == 's':
		Emit('    aload ' + str(index), 1)
		$type = 's'
	elif type_table[index] == 'a':
		Emit('    aload ' + str(index), 1)
		$type = 'a'
    }
    | READ_INT OP_PAR CL_PAR
    {
Emit('    invokestatic Runtime/readInt()I', 1)
$type = 'i'
    }
    | READ_STR OP_PAR CL_PAR
    {
Emit('    invokestatic Runtime/readString()Ljava/lang/String;', 1)
$type = 's'
    }
    | NAME DOT LENGTH
    {
if $NAME.text not in symbol_table:
	print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarado', file=sys.stderr)
	has_error = True
	$type = 'error'
else:
	index = symbol_table.index($NAME.text)
	if type_table[index] != 'a':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não é um vetor', file=sys.stderr)
		has_error = True
	Emit('    aload ' + str(index), 1)
	print('    invokevirtual Array/length()I')
	$type = 'i'
    }
    | NAME
    {
if $NAME.text not in symbol_table:
	print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarado', file=sys.stderr)
	has_error = True
	$type = 'error'
else:
	index = symbol_table.index($NAME.text)
	if type_table[index] != 'a':
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não é um vetor', file=sys.stderr)
		has_error = True
	Emit('    aload ' + str(index), 1)
	$type = 'i'
    }
    OP_BRA expression CL_BRA
    {
Emit('    invokevirtual Array/get(I)I', -1)
    }
    | NAME OP_PAR ( arguments )? CL_PAR
    {
global arg_count
ind = 0
I = ''
if $NAME.text + 'I' not in func_table and $NAME.text + 'V' not in func_table:
	print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' não declarado', file=sys.stderr)
	has_error = True
	$type = 'error'
else:
	for func in func_table:
		if func == $NAME.text + 'I' or func == $NAME.text + 'V':
			break
		ind += 1
	if func_table[ind].endswith('V'):
		print('Erro na linha ' + str($NAME.line) + ': ' + $NAME.text + ' é uma função void, portanto não pode retornar um valor', file=sys.stderr)
		has_error = True
		$type = 'error'
	else:
		for l in range(0, arg_count):
			I = I + 'I'
		print('    invokestatic Test/' + $NAME.text + '(' + I + ')I')
		$type = 'i'
    }
    ;

