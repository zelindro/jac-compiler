grammar Jac;

/*---------------- LEXER INTERNALS ----------------*/
@lexer::header
{
from antlr_denter.DenterHelper import DenterHelper
from JacParser import JacParser
}

@lexer::members
{
class JacDenter(DenterHelper):
    def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
        super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
        self.lexer: JacLexer = lexer
    def pull_token(self):
        return super(JacLexer, self.lexer).nextToken()
denter = None
def nextToken(self):
    if not self.denter:
        self.denter = self.JacDenter(self, self.NL, JacParser.INDENT, JacParser.DEDENT, False)
    return self.denter.next_token()
}

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
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
}

/*---------------- LEXER RULES ----------------*/

tokens { INDENT, DEDENT }

IF       : 'if'       ;
WHILE    : 'while'    ;
BREAK    : 'break'    ;
CONTINUE : 'continue' ;
PRINT    : 'print'    ;
READINT  : 'readint'  ;
READSTR  : 'readstr'  ;
DEF      : 'def'      ;

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;

OP_PAR : '(' ;
CL_PAR : ')' ;
ATTRIB : '=' ;
COLON : ':' ;
COMMA  : ',' ;

EQ     : '==' ;
NE     : '!=' ;
GT     : '>'  ;
GE     : '>=' ;
LT     : '<'  ;
LE     : '<=' ;

NAME: 'a'..'z'+         ;
NUMBER: '0'..'9'+       ;
STRING: '"' ~('"')* '"' ;

COMMENT: '#' ~('\n')* -> skip ;
NL: ('\r'? '\n' ' '*)         ;
SPACE: (' '|'\t')+ -> skip    ;

/*---------------- PARSER RULES ----------------*/

program:
    {if 1:
        print('.source Test.src')
        print('.class  public Test')
        print('.super  java/lang/Object\n')
        print('.method public <init>()V')
        print('    aload_0')
        print('    invokenonvirtual java/lang/Object/<init>()V')
        print('    return')
        print('.end method\n')
    }    
    ( function )* main
    ;

main: 
    {if 1:
        print('.method public static main([Ljava/lang/String;)V')
    }
    ( statement )+
    {if 1:
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
    ;

function: DEF NAME OP_PAR ( parameters )? CL_PAR COLON
    {if 1:
        global function_table, param_table, symbol_table
        assin = True
        if $NAME.text not in function_table:
            function_table.append($NAME.text)
        else:
            sys.stderr.write('Error: function ' + $NAME.text + ' already declared\n')
            update_error()
    }
    INDENT*
    {if 1:
        I = ''
        for l in range(0, len(symbol_table)):
            I = I + 'I'
        param_table.append(len(symbol_table))
        if $NAME.text + 'I' not in function_table and $NAME.text + 'V' not in function_table:
            print('.method public static ' + $NAME.text + '(' + I + ')V')
    }
    ( statement )* DEDENT*
    {if 1:
        print('return')
        if (len(symbol_table) > 0):
            print('.limit locals ' + str(len(symbol_table)))
        print('.limit stack ' + str(stack_max))
        print('.end method\n')
        reset_counters()
    }
    ; 

parameters: 
    NAME
    {if 1:
        symbol_table.append($NAME.text)
        used_table.append(False)
        symbol_type.append('i')
    } 
    ( COMMA NAME
    {if 1:
        if $NAME.text in symbol_table:
            sys.stderr.write('Error: parameter names must be unique\n')
            update_error()
        else:
            symbol_table.append($NAME.text)
            used_table.append(False)
            symbol_type.append('i')
    }
    )*
    ;        

statement: st_call | NL | st_print | st_attrib | st_if | st_while | st_break | st_continue;

st_print:
    PRINT OP_PAR(
    {if 1:
        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    e1 = expression
    {if 1:
        if $e1.type == 'i':
            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
        elif $e1.type == 's':
            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
        else:
            sys.stderr.write('**HELP**\n')
            exit(1)
    }
    ( COMMA 
    {if 1:
        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    e2 = expression
    {if 1:
        if $e2.type == 'i':
            emit('invokevirtual java/io/PrintStream/print(I)V', -2)
        elif $e2.type == 's':
            emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
        else:
            sys.stderr.write('**HELP**\n')
            exit(1)
    }
    )*
    )? CL_PAR
    {if 1:
        emit('getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
        emit('invokevirtual java/io/PrintStream/println()V', -1)
    }
    ;

st_attrib: NAME ATTRIB expression
    {if 1:
        if $NAME.text not in symbol_table:
            symbol_table.append($NAME.text)
            symbol_type.append($expression.type)
            used_table.append(False)
        if symbol_type[symbol_table.index($NAME.text)] == 'i':
            if $expression.type == 'error' or $expression.type == 's':
                sys.stderr.write('Error in attribution: integer variable "' + $NAME.text + '" cannot receive a string expression\n')
                update_error()
            elif $expression.type == 'i':
                emit('    istore ' +  str(symbol_table.index($NAME.text)), -1)
            else:
                sys.stderr.write('**HELP NAME ATTRIB**')
                exit(1)
        elif symbol_type[symbol_table.index($NAME.text)] == 's':
            if $expression.type == 'error' or $expression.type == 'i':
                sys.stderr.write('Error in attribution: integer variable "' + $NAME.text + '" cannot receive a integer expression\n')
                update_error()
            elif $expression.type == 's':
                emit('    astore ' +  str(symbol_table.index($NAME.text)), -1)
            else:
                sys.stderr.write('**HELP NAME ATTRIB**')
                exit(1)
        else:
            sys.stderr.write('**HELP NAME ATTRIB**')
            exit(1)
    }
    ;

st_if: IF cmp = comparison_if COLON
    {if 1:
        global if_max
        emit($cmp.type + ' NOT_IF_' + str(if_max), -2)
        local_if = if_max
        if_max += 1
    }
    INDENT ( statement )+ DEDENT
    {if 1:
        print('NOT_IF_' + str(local_if) + ':')
        if_counter()
    }
    ;

st_while: WHILE
    {if 1:
        global while_max
        local_while = while_max
        print('BEGIN_WHILE_' + str(local_while) + ':')
        inside_while.append(local_while)
    }
    comparison_while COLON 
    {if 1:
        while_max += 1
    }
    INDENT ( statement )+ DEDENT
    {if 1:
        emit('goto BEGIN_WHILE_' + str(local_while), 0)
        print('END_WHILE_' + str(local_while) + ':')
        inside_while.pop()
    }
    ;

st_break: BREAK
    {if 1:
        if len(inside_while) == 0:
            sys.stderr.write('Error: break outside while\n')
            exit(1)
        emit('goto END_WHILE_' + str(while_max-1), 0)
    }
    ;

st_continue: CONTINUE
    {if 1:
        if len(inside_while) == 0:
            sys.stderr.write('Error: continue outside while\n')
            exit(1)
        emit('goto BEGIN_WHILE_' + str(while_max-1), 0)
    }
    ;

st_call: NAME OP_PAR ( arguments )? CL_PAR
    {if 1:
        global function_table, arg_max, function_error
        I = ''
        if $NAME.text in function_table:
            if param_table[function_table.index($NAME.text)] != arg_max:
                sys.stderr.write('Error in function call: wrong number of arguments\n')
                update_error()
            if function_error:
                sys.stderr.write('Error in function call: all arguments must be integer\n')
                update_error()
            for j in range(0, arg_max):
                I += 'I'
            print('    invokestatic Test/' + $NAME.text + '(' + I + ')V')
        else:
            sys.stderr.write('Error in function call: function "' + $NAME.text + '" not declared\n')
            update_error()
        arg_max = 0
    }
    ;

arguments: 
    {if 1:
        global arg_max, function_error
        arg_max = 0
    }
    e1 = expression
    {if 1:
        arg_max += 1
        if $e1.type != 'i':
            function_error = True
    }
    ( COMMA e2 = expression
    {if 1:
        arg_max += 1
        if $e2.type != 'i':
            function_error = True
    }
    )*
    ;

comparison_if returns [type]: e1 = expression op = ( EQ | NE | GT | GE | LT | LE ) e2 = expression
    {if 1:
        if $e1.type != $e2.type:
            sys.stderr.write('Error in comparison: operator cannot use string type\n')
            update_error()
        if $op.type == JacParser.EQ:
            $type = 'if_icmpne'
        elif $op.type == JacParser.NE:
            $type = 'if_icmpeq'
        elif $op.type == JacParser.GT:
            $type = 'if_icmple'
        elif $op.type == JacParser.GE:
            $type = 'if_icmplt'
        elif $op.type == JacParser.LT:
            $type = 'if_icmpge'
        elif $op.type == JacParser.LE:
            $type = 'if_icmpgt'
    }
    ;

comparison_while: e1 = expression op = ( EQ | NE | GT | GE | LT | LE ) e2 = expression
    {if 1:
        if $e1.type != $e2.type:
            sys.stderr.write('Error in comparison: operator cannot use string type\n')
            update_error()
        if $op.type == JacParser.EQ:
            emit('if_icmpne END_WHILE_'+str(while_max), -2)
        elif $op.type == JacParser.NE:
            emit('if_icmpeq END_WHILE_'+str(while_max), -2)
        elif $op.type == JacParser.GT:
            emit('if_icmple END_WHILE_'+str(while_max), -2)
        elif $op.type == JacParser.GE:
            emit('if_icmplt END_WHILE_'+str(while_max), -2)
        elif $op.type == JacParser.LT:
            emit('if_icmpge END_WHILE_'+str(while_max), -2)
        elif $op.type == JacParser.LE:
            emit('if_icmpgt END_WHILE_'+str(while_max), -2)
    }
    ;

expression returns [type]: t1 = term ( op = ( PLUS | MINUS ) t2 = term
    {if 1:
        if $t1.type != $t2.type or $t1.type == 's' or $t2.type == 's':
            sys.stderr.write('Error in expression: operator cannot use string type\n')
            update_error()
        else:
            if $op.type == JacParser.PLUS:
                emit('    iadd', -1)
            else:
                emit('    isub', -1)
    }
    )*
    {if 1:
        $type = $t1.type
    }
    ;

term returns [type]: f1 = factor ( op = ( TIMES | OVER | REM ) f2 = factor
    {if 1:
        if $f1.type != $f2.type or $f1.type == 's' or $f2.type == 's':
            sys.stderr.write('Error in term: operator cannot use string type\n')
            update_error()
        else:
            if $op.type == JacParser.TIMES:
                emit('    imul', -1)
            elif $op.type == JacParser.OVER:
                emit('    idiv', -1)
            else:
                emit('    irem', -1)
    }
    )*
    {if 1:
        $type = $f1.type
    }
    ;

factor returns [type]: NUMBER
    {if 1:
        emit('    ldc ' + str($NUMBER.text), +1)
        $type = 'i'
    }
    | STRING
    {if 1:
        emit('    ldc ' + str($STRING.text), +1)
        $type = 's'
    }
    | OP_PAR e =  expression CL_PAR
    {if 1:
        $type = $e.type
    }
    | NAME
    {if 1:
        if $NAME.text not in symbol_table:
            sys.stderr.write('Variable ' + $NAME.text + ' is not defined\n')
            $type = 'error'
            sys.exit(1)
        elif symbol_type[symbol_table.index($NAME.text)] == 'i':
            emit('    iload ' +  str(symbol_table.index($NAME.text)), +1)
            used_table[symbol_table.index($NAME.text)] = True
            $type = symbol_type[symbol_table.index($NAME.text)]
        elif symbol_type[symbol_table.index($NAME.text)] == 's':
            emit('    aload ' +  str(symbol_table.index($NAME.text)), +1)
            used_table[symbol_table.index($NAME.text)] = True
            $type = symbol_type[symbol_table.index($NAME.text)]
    }
    | READINT OP_PAR CL_PAR
    {if 1:
        emit('invokestatic Runtime/readInt()I', +1)
        $type = 'i'
    }
    | READSTR OP_PAR CL_PAR
    {if 1:
        emit('invokestatic Runtime/readString()Ljava/lang/String;', +1)
        $type = 's'
    }
    ;