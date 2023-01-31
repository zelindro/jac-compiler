# errors for complete functions

def fw(): int
    return "ab"    # error: return value must be of integer type

def fx(a):
    return 0       # error: a void function does not return a value

def fy(b, c): int
    print(b + c)   # error: missing return statement in returning function

e = fx(1)          # error: a void function does not return a value

fy(1, 2)           # error: return value cannot be ignored

f = "ab"
f = fy(1, 2)       # error in attribution: string variable 'f' cannot receive an integer expression

