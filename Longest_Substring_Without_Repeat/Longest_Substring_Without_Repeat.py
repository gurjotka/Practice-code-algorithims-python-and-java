def longest_substring_without_repeat(s):

    output_needed = []
    max_length = 0
    start = 0

    for i in range(len(s)):
        while s[i] in output_needed:
            output_needed.remove(s[start])
            start += 1

        output_needed.append(s[i])
        if len(output_needed) > max_length:
            max_length = len(output_needed)


    print(max_length)

longest_substring_without_repeat(s = "pwwkew")
longest_substring_without_repeat(s = "abcabcbb")
longest_substring_without_repeat(s = "bbbbb")