# errors for function parameters

def fw():

def fx(a):

def fy(b, c):

def fz(d, d):  # error: parameter names must be unique

fw(1)          # error: wrong number of arguments

fx()           # error: wrong number of arguments
fx(1, 2)       # error: wrong number of arguments
fx(1, 2, 3)    # error: wrong number of arguments

fx("ab")       # error: all arguments must be integer
fy(1, "ab")    # error: all arguments must be integer
fy("ab", 2)    # error: all arguments must be integer

