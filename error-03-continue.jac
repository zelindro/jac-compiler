# error when using continue

i = 1
while i <= 10:
    i = i + 1
    if i == 2:
        continue
if i != 0:
    continue  # error: cannot use continue outside a loop

