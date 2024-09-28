def MultiplyStrings(num1, num2):

    if num1 == '0' or num2 == '0':
        print('0')

    len1, len2 = len(num1), len(num2)
    result = [0] * (len1 + len2)
    # Multiply each digit and store the result in the correct position
    for i in range(len1 - 1, -1, -1):
        for j in range(len2 - 1, -1, -1):
            # Calculate product of current digits
            mul = (ord(num1[i]) - ord('0')) * (ord(num2[j]) - ord('0'))
            # Position in the result array
            p1 = i + j
            p2 = i + j + 1
            # Add multiplication result to the position
            sum_carry = mul + result[p2]

           # Update result array with carry and remainder
            result[p2] = sum_carry % 10
            result[p1] += sum_carry // 10

    # Convert result array to string and remove leading zeros
    result_str = ''.join(map(str, result))
    result_str = result_str.lstrip('0')

    print(f"{result_str}")

MultiplyStrings("12","11")
MultiplyStrings("33", "3")