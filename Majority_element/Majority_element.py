def majority_element(nums):
    counts = {}

    for num in nums:
         if num in counts:
             counts[num] += 1
         else:
             counts[num] = 1

    max_count = 0
    max_count_element = None
    for element, count in counts.items():
        if count > max_count:
            max_count = count
            max_count_element = element

    print(max_count_element)


majority_element([3,2,3])
majority_element([2,2,1,1,1,2,2])
majority_element([1,2,2,3,4,4,4,5])