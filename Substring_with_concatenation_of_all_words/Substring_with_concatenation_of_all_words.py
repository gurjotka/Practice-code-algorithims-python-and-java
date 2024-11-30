def substring_with_concatenation_of_all_words(s, words):

    def generate_permutations(word, current_perm=[]):
        # Base case: If no words left, add the current permutation to the result

        if not word:
            return [''.join(current_perm)]

        result = []
        for j in range(len(word)):
            # Choose the current word and recursively generate permutations
            remaining = word[:j] + word[j + 1:]  # Remove the chosen word
            result += generate_permutations(remaining, current_perm + [word[j]])

        return result

    output = []

    all_concatenations = generate_permutations(words)

    for concatenation in all_concatenations:
        for i in range(len(s)):
            if s[i:i+len(concatenation)] == concatenation:
                output.append(i)

    print(output)

substring_with_concatenation_of_all_words("barfoothefoobarman", ["foo", "bar"])
substring_with_concatenation_of_all_words("wordgoodgoodgoodbestword", ["word","good","best","word"])
substring_with_concatenation_of_all_words("barfoofoobarthefoobarman",["bar", "foo", "the"])
