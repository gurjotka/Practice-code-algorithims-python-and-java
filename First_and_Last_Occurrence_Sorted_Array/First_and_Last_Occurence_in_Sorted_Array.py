def first_and_last_element_in_sorted_array(nums, target):
    #O(n2) time complexity
    output = []
    if target not in nums:
        output.append(-1)
        output.append(-1)
    for num in range(len(nums)):
        if target == nums[num]:
            output.append(num)

    print(output)

first_and_last_element_in_sorted_array([5,7,7,8,8,10], 8)
first_and_last_element_in_sorted_array([5,7,7,8,8,10], 6)
first_and_last_element_in_sorted_array([], 0)

def first_last_element_log_o2(nums, target):
    def search(x):
        lo, hi = 0, len(nums)
        while lo < hi:
            mid = (lo + hi) // 2
            if nums[mid] < x:
                lo = mid+1
            else:
                hi = mid
        return lo

    low = search(target)
    high = search(target+1)-1

    if low <= high:
        return [low, high]

    return [-1,-1]

print(first_last_element_log_o2([5,7,7,8,8,10], 8))
print(first_last_element_log_o2([5,7,7,8,8,10], 6))
print(first_last_element_log_o2([], 0))