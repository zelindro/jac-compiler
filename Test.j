.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static square(I)V
        iload 0    ; delta=1
        iload 0    ; delta=1
        imul    ; delta=-1
        istore 1    ; delta=-1
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc "The square is "    ; delta=1
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        iload 1    ; delta=1
    invokevirtual java/io/PrintStream/print(I)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
    invokevirtual java/io/PrintStream/println()V    ; delta=-1
return
.limit locals 2
.limit stack 2
.end method

.method public static check(III)V
        ldc "different from"    ; delta=1
        astore 3    ; delta=-1
        iload 0    ; delta=1
        iload 1    ; delta=1
        iadd    ; delta=-1
        iload 2    ; delta=1
        iadd    ; delta=-1
        iload 0    ; delta=1
        iload 1    ; delta=1
        imul    ; delta=-1
        iload 2    ; delta=1
        imul    ; delta=-1
    if_icmpne NOT_IF_1    ; delta=-2
        ldc "equal to"    ; delta=1
        astore 3    ; delta=-1
NOT_IF_1:
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc "The sum is "    ; delta=1
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        aload 3    ; delta=1
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc " the product"    ; delta=1
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
    invokevirtual java/io/PrintStream/println()V    ; delta=-1
return
.limit locals 4
.limit stack 3
.end method

.method public static main([Ljava/lang/String;)V
        ldc "Summary:"    ; delta=1
        astore 0    ; delta=-1
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        aload 0    ; delta=1
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V    ; delta=-2
    getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
    invokevirtual java/io/PrintStream/println()V    ; delta=-1
        ldc 8    ; delta=1
    invokestatic Test/square(I)V
        ldc 1    ; delta=1
        ldc 2    ; delta=1
        ldc 3    ; delta=1
    invokestatic Test/check(III)V
return
.limit locals 1
.limit stack 4
.end method

; symbol_table: ['y']

; symbol_type: ['s']

; used_table: [True]
