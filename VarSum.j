.source VarSum.src
.class  public VarSum
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc    2    ; carrega valor 2 na pilha
    istore 0    ; armazena o topo da pilha na variavel #0

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload  0    ; coloca na pilha o valor da variavel #0
    ldc    4    ; carrega valor 4 na pilha
    iadd        ; soma os dois valores e empilha o resultado
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit stack 10
.limit locals 1 ; numero de variaveis locais
.end method

; symbol_table: ['a']
