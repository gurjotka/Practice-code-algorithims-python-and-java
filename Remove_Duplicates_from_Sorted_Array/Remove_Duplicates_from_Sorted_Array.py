def remove_duplicates_from_array(nums):
    i = 1
    while i < len(nums):
        if nums[i] == nums[i - 1]:
            nums.pop(i)
        else:
            i+=1

    print(len(nums),",", nums)

remove_duplicates_from_array(nums = [1, 1, 2])
remove_duplicates_from_array(nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4])
