.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

        ldc 2    ; delta=1
        istore 0    ; delta=1
        iload 0    ; delta=1
        ldc 3    ; delta=1
    if_icmpne NOT_IF_1    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 1    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_1:
        iload 0    ; delta=1
        ldc 3    ; delta=1
    if_icmpeq NOT_IF_3    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 2    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_3:
    return
.limit locals 1
.limit stack 4
.end method

; symbol_table: ['a']
