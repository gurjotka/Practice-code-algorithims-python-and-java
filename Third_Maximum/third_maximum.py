def third_maximum(nums):
    nums = sorted(set(nums), reverse=True)

    if len(nums) >= 3:
        third_max = nums[2]
        return third_max
    else:
        first_max = nums[0]
        return first_max

print(third_maximum([1, 2]))
print(third_maximum([3, 2, 1]))
print(third_maximum([2, 2, 3, 1]))
