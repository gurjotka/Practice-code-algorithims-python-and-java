def longest_palindrome(s):
    palindrome_list = []
    longest_palindrome = ""

    # Check all possible substrings
    for start in range(len(s)):
        for end in range(start + 1, len(s) + 1):
            substring = s[start:end]
            if substring == substring[::-1]:  # Check if the substring is a palindrome
                palindrome_list.append(substring)
                # Update longest_palindrome if the current one is longer
                if len(substring) > len(longest_palindrome):
                    longest_palindrome = substring

    print("Longest Palindromic Substring:", longest_palindrome)

# Test the function
longest_palindrome("babadd")
longest_palindrome("cbbd")
longest_palindrome("121")