def reverse_only_letters(s):
    s = list(s)
    i = 0
    j = len(s)-1

    while i < j:
        if s[i].isalpha() and s[j].isalpha():
            s[i], s[j] = s[j], s[i]
            i += 1
            j -= 1
        elif s[i].isalpha() and not s[j].isalpha():
            j -= 1
        else:
            i += 1

    return "".join(s)

print(reverse_only_letters(s="ab1-cd"))
print(reverse_only_letters(s="a-bC-dEf-ghIj"))
print(reverse_only_letters(s="Test1ng-Leet=code-Q!"))

