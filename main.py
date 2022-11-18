import sys

class Token:
  def __init__(self, type, text):
    self.type = type
    self.text = text

  def __repr__(self):
    return '(' + self.type + ' ' + self.text + ')'

# -------------------------------------------------------------------------

def lexer(s):
  tokens = []
  s += '$'
  i = 0
  #Encontra todos os tokens e adicioma eles como objeto na lista de tolkens
  while True:
    if s[i] == ' ':
      i += 1
      continue
    elif s[i] == '+':
      i += 1
      tokens.append(Token('PLUS', '+'))
    elif s[i] == '-':
      i += 1
      tokens.append('MINUS', '-')
    elif s[i] == '*':
      i += 1
      tokens.append(Token('TIMES', '*'))
    elif s[i] == '/':
      i += 1
      tokens.append('OVER', '/')
    elif s[i] == "(":
      i += 1
      tokens.append('OP_P', '(')
    elif s[i] == ")":
      i += 1
      tokens.append('CL_P', ')')
    elif s[i] == print:
      i += 1
      tokens.append('PRINT', 'print')
    elif s[i].isdigit():
      number = s[i]
      i += 1
      while s[i].isdigit():
        number += s[i]  
        i += 1
      tokens.append(Token('NUMBER', number))
    elif s[i] == '$':
      tokens.append(Token('END', '$'))
      break
    else:
      print('unknown character')
  return tokens

# -------------------------------------------------------------------------

header = """
.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
"""

footer = """
    invokevirtual java/io/PrintStream/println(I)V

    return  
.limit stack 10
.end method    
"""

# -------------------------------------------------------------------------

def compiler(string):
  global tokens
  tokens = lexer(string)
  print(header)
  expression()
  print(footer)
  if len(tokens) != 1 and tokens[0].type != 'END':
    print('invalid expression: tokens remaining')
    sys.exit(1)

def expression():
  term()
  while (tokens[0].type in ('PLUS', 'MINUS')):
    t = tokens.pop(0)
    term()
    print('    iadd' if t.type == 'PLUS' else '    isub')

def term():
  factor()
  while (tokens[0].type in ('TIMES', 'OVER')):
    t = tokens.pop(0)
    factor()
    print('    imul' if t.type == 'TIMES' else '    idiv')

def factor():
  if tokens[0].type == 'NUMBER':
    print('    ldc', tokens[0].text)
    tokens.pop(0)
  elif tokens[0].type == 'OP_PAR':
    tokens.pop(0)
    expression()
    if tokens[0].type != 'CL_PAR':
      print('invalid expression: missing closing parenthesis')
      sys.exit(1)
    tokens.pop(0)
  else:
    print('invalid expression: expected number')
    sys.exit(1)

# -------------------------------------------------------------------------