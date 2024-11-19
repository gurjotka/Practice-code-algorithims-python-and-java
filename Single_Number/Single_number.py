def single_number(nums):
    unique_number = 0

    # XOR all numbers
    for num in nums:
        unique_number ^= num

    print("The unique number is:", unique_number)

single_number([2,2,1])
single_number([4,1,2,1,2])
single_number([1])     