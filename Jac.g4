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
inside_while = []

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
    main
    ;

main:
    {if 1:
        print('.method public static main([Ljava/lang/String;)V\n')
    }
    ( statement )+
    {if 1:
        print('    return')
        if (len(symbol_table) > 0):
            print('.limit locals ' + str(len(symbol_table)))
        print('.limit stack ' + str(stack_max))
        print('.end method')
        print('\n; symbol_table:', symbol_table)
        print('\n; symbol_type:', symbol_type)
        print('\n; used_table:', used_table)
        if (False in used_table):
            sys.stderr.write('Warning: unused variables: ' + str([symbol_table[i] for i in range(len(used_table)) if not used_table[i]]) + '\n')
    }
    ;

statement: NL | st_print | st_attrib | st_if | st_while | st_break | st_continue
    ;

st_print:
    PRINT OP_PAR(
    {if 1:
        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    e1 = expression
    {if 1:
        if $e1.type == 'i':
            emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
        elif $e1.type == 's':
            emit('    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n', -2)
        else:
            sys.stderr.write('**HELP**\n')
            exit(1)
    }
    ( COMMA 
    {if 1:
        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    e2 = expression
    {if 1:
        emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
    }
    )*
    )? CL_PAR
    {if 1:
        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
        emit('    invokevirtual java/io/PrintStream/println()V\n', -1)
    }
    ;

st_attrib: NAME ATTRIB expression
    {if 1:
        if $NAME.text not in symbol_table:
            symbol_table.append($NAME.text)
            symbol_type.append($expression.type)
            used_table.append(False)
        if $expression.type == 'i':
            emit('    istore ' +  str(symbol_table.index($NAME.text)), +1)
        elif $expression.type == 's':
            emit('    astore ' +  str(symbol_table.index($NAME.text)), +1)
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

comparison_if returns [type]: expression op = ( EQ | NE | GT | GE | LT | LE ) expression
    {if 1:
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

comparison_while: expression op = ( EQ | NE | GT | GE | LT | LE ) expression
    {if 1:
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
        emit('    invokestatic Runtime/readInt()I', +1)
        $type = 'i'
    }
    | READSTR OP_PAR CL_PAR
    {if 1:
        emit('    invokestatic Runtime/readString()Ljava/lang/String;', +1)
        $type = 's'
    }
    ;