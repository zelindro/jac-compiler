.source While.src
.class  public For
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc    1
    istore 0

BEGIN_WHILE_0:
    iload  0
    ldc    5
    if_icmpgt END_WHILE_0 ; compara os dois valores da pilha, usando comparacao inversa

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload  0
    invokevirtual java/io/PrintStream/println(I)V

    iload  0
    ldc    1
    iadd
    istore 0

    goto   BEGIN_WHILE_0 ; desvia para executar novo teste de repeticao
END_WHILE_0:

    return
.limit stack  2 ; numero maximo da altura que a pilha atinge
.limit locals 1 ; numero de parametros e variaveis locais
.end method

