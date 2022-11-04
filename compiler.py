# python3 compiler.py [input_file [output_file]]

import sys
from antlr4 import *
from JacLexer  import JacLexer
from JacParser import JacParser

if len(sys.argv) > 1:
    sys.stdin = open(sys.argv[1], 'r')
    
    if len(sys.argv) > 2:    
        sys.stdout = open(sys.argv[2], 'w')

input_stream = InputStream(sys.stdin.read())
lexer = JacLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = JacParser(tokens)

parser.program()

