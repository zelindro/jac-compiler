a = 1
x = "X"
b = 2
y = "Y"

a = 3
b = a
a = "Z"           # error in attribution: integer variable 'a' cannot receive a string expression
b = x             # error in attribution: integer variable 'b' cannot receive a string expression
a = readstr()     # error in attribution: integer variable 'a' cannot receive a string expression

x = "Q"
y = x
x = 4             # error in attribution: string variable 'x' cannot receive an integer expression
y = b             # error in attribution: string variable 'y' cannot receive an integer expression
x = readint()     # error in attribution: string variable 'x' cannot receive an integer expression

print(123)
print("xyz")

print(a + x)      # error in expression: operator cannot use string type
print(b - y)      # error in expression: operator cannot use string type

print(x * "W")    # error in term: operator cannot use string type
print(y / x)      # error in term: operator cannot use string type
print(8 % (x))    # error in term: operator cannot use string type

if a == x:        # error in comparison: operator cannot use string type
    print(456)

while y < 4:      # error in comparison: operator cannot use string type
    print("hi!")

