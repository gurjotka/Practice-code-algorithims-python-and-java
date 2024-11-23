def index_of_first_occurrence(haystack, needle):
    index = []
    if needle not in haystack:
        index.append(-1)
    else:
        for i in range(len(haystack)):
            if haystack[i:i+len(needle)] == needle:
                index.append(i)

    print(index[0])

index_of_first_occurrence("sadbutsad", "sad")
index_of_first_occurrence("leetcode", "leeto")