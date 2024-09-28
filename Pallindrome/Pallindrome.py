def palindrome(x) -> bool:
    list_num = [n for n in str(x)]
    # print(list_num)
    list_reversed = list_num[::-1]
    # print(list_reversed)
    rev = ''.join(list_reversed)
    # print(rev)
    print(f"{x} is Pallindrome...{list_num == list_reversed}")

palindrome(124)
palindrome(11211)
