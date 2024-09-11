def remove_element(nums, val):
    """
    :type nums: List[int]
    :type val: int
    :rtype: int
    """
    nums[:] = [x for x in nums if x != val]

    # Print the modified list
    print(nums)


remove_element([3, 3, 2, 2], 3)