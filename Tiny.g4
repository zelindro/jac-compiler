grammar Tiny;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
# symbol_table = []
}

/*---------------- LEXER RULES ----------------*/

PLUS  : '+' ;
TIMES : '*' ;

NUMBER: '0'..'9'+ ;

SPACE: (' '|'\t'|'\r'|'\n')+ -> skip ;

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
        print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    }
    expression
    {if 1:
        print('    invokevirtual java/io/PrintStream/println(I)V\n')
        print('    return')
        print('.limit stack 10')
        print('.end method')
        # print('\n; symbol_table:', symbol_table)
    }
    ;

expression:
    term ( op = PLUS expression
    {if 1:
        print('    iadd')
    }
    )?
    ;

term: factor ( op = TIMES term
    {if 1:
        print('    imul')
    }
    )?
    ;

factor: NUMBER
    {if 1:
        print('    ldc ' + $NUMBER.text)
        # symbol_table.append($NUMBER.text)
    }
    ;

