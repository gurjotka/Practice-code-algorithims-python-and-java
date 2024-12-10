def sort_colors(nums):
    left = 0
    right = len(nums) - 1
    ans = 0
    while ans <= right:
        if nums[ans] == 2:
            nums[ans], nums[right] = nums[right], nums[ans]
            right -= 1
        elif nums[ans] == 0:
            nums[ans], nums[left] = nums[left], nums[ans]
            left += 1
            ans += 1
        else:
            ans += 1
    print(nums)

sort_colors([2,0,2,1,1,0])
sort_colors([2,0,1])