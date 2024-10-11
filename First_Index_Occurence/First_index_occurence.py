def first_index_occurence(haystack, needle):

    first_index_word = []
    first_index = ""
    if needle in haystack:
        for i in range(len(haystack)):
            if needle[0] == haystack[i]:
                first_index_word.append(i)
                first_index = first_index_word[0]
        print(f"First index occurence of the needle word = {first_index}")
    else:
        print(-1)



first_index_occurence("sadbutsad", "sad")
first_index_occurence("leetcode", "leeto")