def is_happy(n):
    seen = []
    while n != 1:
        if n in seen:
            return False
        seen.append(n)

        n = sum(int(digit)**2 for digit in str(n))

    return True

print(is_happy(1111111))
print(is_happy(19))
print(is_happy(2))
