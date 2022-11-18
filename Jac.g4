grammar Jac;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
import sys;
symbol_table = []
}

/*---------------- LEXER RULES ----------------*/

PRINT : 'print' ;
READINT : 'readint' ;

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;

OP_PAR: '(' ;
CL_PAR: ')' ;
ATTRIB: '=' ;
COMMA : ',' ;

NAME: 'a'..'z'+ ;

NUMBER: '0'..'9'+ ;

SPACE: (' '|'\t'|'\r'|'\n')+ -> skip ;

COMMENT: '#' ~('\n')*        -> skip ;

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
        print('.limit stack 10')
        print('.end method')
        print('\n; symbol_table:', symbol_table)
    }
    ;

statement: st_print | st_attrib
    ;

st_print:
    PRINT OP_PAR(
    {if 1:
        print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    }
    expression
    {if 1:
        print('    invokevirtual java/io/PrintStream/print(I)V\n')
    }
    ( COMMA 
    {if 1:
        print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    }
    expression
    {if 1:
        print('    invokevirtual java/io/PrintStream/print(I)V\n')
    }
    )*
    )? CL_PAR
    {if 1:
        print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
        print('    invokevirtual java/io/PrintStream/println()V\n')
    }
    ;

st_attrib: NAME ATTRIB expression
    {if 1:
        if $NAME.text not in symbol_table:
            symbol_table.append($NAME.text)
            print('    istore', symbol_table.index($NAME.text))
    }
    ;

expression: term ( op = ( PLUS | MINUS ) term
    {if 1:
        if $op.type == JacParser.PLUS:
            print('    iadd')
        else:
            print('    isub')
    }
    )*
    ;

term: factor ( op = ( TIMES | OVER | REM ) factor
    {if 1:
        if   $op.type == JacParser.TIMES:
            print('    imul')
        elif $op.type == JacParser.OVER:
            print('    idiv')
        else:
            print('    irem')
    }
    )*
    ;

factor: NUMBER
    {if 1:
        print('    ldc ' + $NUMBER.text)
    }
    | OP_PAR expression CL_PAR
    | NAME
    {if 1:
        #procurar $NAME.text se nao existir retornar sys.exit(1) retornar erro quando variavel utilizada nao é atribuida
        if ($NAME.text not in symbol_table):
            print('Variavel ', $NAME.text ,' nao declarada')
            sys.exit(1)
        print('    iload', symbol_table.index($NAME.text))
    }
    | READINT OP_PAR CL_PAR
    {if 1:
        print('    invokestatic Runtime/readInt()I')
    }
    ;