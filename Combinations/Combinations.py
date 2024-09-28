n=4
k=2


def backtrack(first=1, curr=[]):
    if len(curr) == k:
        output.append(curr[:])
        return
    for i in range(first, n + 1):
        curr.append(i)
        backtrack(i + 1, curr)
        curr.pop()


output = []
backtrack()
print(output)
