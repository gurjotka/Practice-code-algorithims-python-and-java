def search_insert_position(nums, target):
    result = 0

    for num in range(len(nums)):
        if target == nums[num]:
            result = num
        elif target != num:
            if target > nums[len(nums)-1]:
                result = len(nums)
            elif target < nums[0]:
                result = 0
            elif target > nums[num-1] and target < nums[num]:
                    result = num

    print(result)

search_insert_position([1,3,5,6], 5)
search_insert_position([1,3,5,6], 2)
search_insert_position([1,3,5,6],7)
search_insert_position([1], 2) 