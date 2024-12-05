def plus_one(digit_list):
    result = int(''.join(map(str, digit_list)))
    result += 1

    result = [int(digit) for digit in str(result)]
    print(result)

plus_one([1,2,3])
plus_one([4,3,2,1])
plus_one([9,9])
