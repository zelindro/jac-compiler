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
used_table = []

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

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;
COLON : ':' ;

OP_PAR : '(' ;
CL_PAR : ')' ;
ATTRIB : '=' ;

COMMA  : ',' ;

EQ     : '==' ;
NE     : '!=' ;
GT     : '>'  ;
GE     : '>=' ;
LT     : '<'  ;
LE     : '<=' ;

NAME: 'a'..'z'+ ;

NUMBER: '0'..'9'+ ;

COMMENT: '#' ~('\n')* -> skip ;
NL: ('\r'? '\n' ' '*);
SPACE: (' '|'\t')+ -> skip ;

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
        if (False in used_table):
            sys.stderr.write('Warning: unused variables: ' + str([symbol_table[i] for i in range(len(used_table)) if not used_table[i]]) + '\n')
    }
    ;

statement: NL | st_print | st_attrib | st_if | st_while
    ;

st_print:
    PRINT OP_PAR(
    {if 1:
        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    expression
    {if 1:
        emit('    invokevirtual java/io/PrintStream/print(I)V\n', -2)
    }
    ( COMMA 
    {if 1:
        emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', +1)
    }
    expression
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
            used_table.append(False)
        emit('    istore ' +  str(symbol_table.index($NAME.text)), +1)
    }
    ;

st_if: IF comparison_if
    {if 1:
        global if_max
        local_if = if_max
        if_max += 1
    }
    COLON INDENT ( statement )+ DEDENT
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
    }
    comparison_while
    {if 1:
        while_max += 1
    }
    COLON INDENT ( statement )+ DEDENT
    {if 1:
        emit('goto BEGIN_WHILE_' + str(local_while), 0)
        print('END_WHILE_' + str(local_while) + ':')
    }
    ;

comparison_if: expression op = ( EQ | NE | GT | GE | LT | LE ) expression
    {if 1:
        if $op.type == JacParser.EQ:
            emit('if_icmpne NOT_IF_'+str(if_max), -2)
        elif $op.type == JacParser.NE:
            emit('if_icmpeq NOT_IF_'+str(if_max), -2)
        elif $op.type == JacParser.GT:
            emit('if_icmple NOT_IF_'+str(if_max), -2)
        elif $op.type == JacParser.GE:
            emit('if_icmplt NOT_IF_'+str(if_max), -2)
        elif $op.type == JacParser.LT:
            emit('if_icmpge NOT_IF_'+str(if_max), -2)
        elif $op.type == JacParser.LE:
            emit('if_icmpgt NOT_IF_'+str(if_max), -2)
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


expression: term ( op = ( PLUS | MINUS ) term
    {if 1:
        if $op.type == JacParser.PLUS:
            emit('    iadd', -1)
        else:
            emit('    isub', -1)
    }
    )*
    ;

term: factor ( op = ( TIMES | OVER | REM ) factor
    {if 1:
        if $op.type == JacParser.TIMES:
            emit('    imul', -1)
        elif $op.type == JacParser.OVER:
            emit('    idiv', -1)
        else:
            emit('    irem', -1)
    }
    )*
    ;

factor: NUMBER
    {if 1:
        emit('    ldc ' + str($NUMBER.text), +1)
    }
    | OP_PAR expression CL_PAR
    | NAME
    {if 1:
        if $NAME.text not in symbol_table:
            sys.stderr.write('Variable ' + $NAME.text + ' is not defined')
            sys.exit(1)
        else:
            emit('    iload ' +  str(symbol_table.index($NAME.text)), +1)
            used_table[symbol_table.index($NAME.text)] = True
    }
    | READINT OP_PAR CL_PAR
    {if 1:
        emit('    invokestatic Runtime/readInt()I', +1)
    }
    ;