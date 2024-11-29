def sum_4_part2(list1, list2, list3, list4):
    group = []
    index_tuple = []

    for i in range(len(list1)):
        for j in range(len(list2)):
            for k in range(len(list3)):
                for l in range(len(list4)):
                    if list1[i] + list2[j] + list3[k] + list4[l] == 0:
                        result = sorted([list1[i], list2[j], list3[k], list4[l]])
                        result_tuple = (i, j, k, l)
                        if result not in group:
                            group.append(result)
                        if result_tuple not in index_tuple:
                            index_tuple.append(result_tuple)

    print(f"Number lists whose sum is zero = {group}")
    print(f"Indexes tuples of numbers whose sum is zero =  {index_tuple}")
    length = len(index_tuple)
    print(f"Length of the tuple list = {length}")

sum_4_part2([1, 2],[-2, -1], [-1, 2], [0, 2])
sum_4_part2([0],[0],[0],[0])
