.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

        ldc 1    ; delta=1
        istore 0    ; delta=1
        ldc 2    ; delta=1
        istore 1    ; delta=1
        ldc 3    ; delta=1
        istore 2    ; delta=1
        iload 0    ; delta=1
        iload 1    ; delta=1
    if_icmpne NOT_IF_1    ; delta=-2
        iload 1    ; delta=1
        iload 2    ; delta=1
    if_icmple NOT_IF_2    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 4    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_2:
        iload 1    ; delta=1
        iload 2    ; delta=1
    if_icmpgt NOT_IF_4    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 5    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_4:
NOT_IF_1:
        iload 0    ; delta=1
        iload 1    ; delta=1
    if_icmpeq NOT_IF_7    ; delta=-2
        iload 0    ; delta=1
        iload 1    ; delta=1
    if_icmpge NOT_IF_8    ; delta=-2
        iload 1    ; delta=1
        iload 2    ; delta=1
    if_icmple NOT_IF_9    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 6    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_9:
        iload 1    ; delta=1
        iload 2    ; delta=1
    if_icmpgt NOT_IF_11    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 7    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_11:
NOT_IF_8:
        iload 0    ; delta=1
        iload 1    ; delta=1
    if_icmplt NOT_IF_14    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc 8    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
NOT_IF_14:
NOT_IF_7:
    return
.limit locals 3
.limit stack 8
.end method

; symbol_table: ['a', 'b', 'c']
