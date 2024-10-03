from collections import Counter


def uncommon_words(s1, s2):
    s1 = s1.split()
    s2 = s2.split()

    words = s1 + s2
    word_count = Counter(words)

    output = [word for word in word_count if word_count[word] == 1]
    print(output)

uncommon_words(s1="this is sour", s2="this is sweet")
uncommon_words(s1="apple apple", s2="banana")