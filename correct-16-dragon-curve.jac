# Dragon curve
# https://en.wikipedia.org/wiki/Dragon_curve

def dragon(level, direction):
    if direction == 0: # left
        if level == 0: # base case
            print("    <line x1='0' y1='0' x2='500' y2='0' stroke='blue'/>")
        if level != 0: # recursion
            print("    <g transform='scale(0.7071) rotate(-45)'>")
            dragon(level - 1, 0)
            print("    <g transform='translate(500,0) rotate(90)'>")
            dragon(level - 1, 1)
            print("    </g></g>")
    if direction == 1: # right
        if level == 0: # base case
            print("    <line x1='0' y1='0' x2='500' y2='0' stroke='red'/>")
        if level != 0: # recursion
            print("    <g transform='scale(0.7071) rotate(45)'>")
            dragon(level - 1, 0)
            print("    <g transform='translate(500,0) rotate(-90) '>")
            dragon(level - 1, 1)
            print("    </g></g>")

# Random number generator
# LCG with m=134456, a=8121 and c=28411 (random0)
# https://en.wikipedia.org/wiki/Linear_congruential_generator

def random(last): int
    return (8121 * last + 28411) % 134456

# Random fractal curve

def curve(level, last):
    if level == 0:
        print("    <line x1='0' y1='0' x2='500' y2='0' stroke='black'/>")
    if level != 0:
        last = random(last) # generate next random
        
        bit = (last / 256) % 2 # get ninth bit
        
        if bit == 0:
            print("    <g transform='scale(0.7071) rotate(-45)'>")
            curve(level - 1, last)
            print("    <g transform='translate(500,0) rotate(90)'>")
            curve(level - 1, last)
        if bit != 0:
            print("    <g transform='scale(0.7071) rotate(45)'>")
            curve(level - 1, last)
            print("    <g transform='translate(500,0) rotate(-90) '>")
            curve(level - 1, last)
        print("    </g></g>")

print("<?xml version='1.0' encoding='UTF-8'?>")
print("<svg xmlns='http://www.w3.org/2000/svg' width='1000' height='800' stroke-width='50'>")
print("  <g transform='translate(300,500)'>")

dragon(10, 0)

# Try curve() instead of dragon(). Test other seed values, too!
# seed = 1
# curve(8, seed)

print("  </g>")
print("</svg>")

