.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

        ldc "This "    ; delta=1
        astore 0    ; delta=1
        ldc "just "    ; delta=1
        astore 1    ; delta=1
        aload 0    ; delta=1
        astore 2    ; delta=1
        ldc "test!"    ; delta=1
        astore 0    ; delta=1
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        aload 2    ; delta=1
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc "is "    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        aload 1    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        ldc "a "    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        aload 0    ; delta=1
        invokevirtual java/io/PrintStream/print(I)V
    ; delta=-2
        getstatic java/lang/System/out Ljava/io/PrintStream;    ; delta=1
        invokevirtual java/io/PrintStream/println()V
    ; delta=-1
    return
.limit locals 3
.limit stack 10
.end method

; symbol_table: ['c', 'b', 'a']

; symbol_type: ['s', 's', 's']

; used_table: [True, True, True]
