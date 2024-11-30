def sum_4(list, target):
    group = []

    for i in range(len(list)):
        for j in range(len(list)):
            for k in range(len(list)):
                for l in range(len(list)):
                    if (list[i] + list[j] + list[k] + list[l] == target and i != j
                            and j != k and k != l and i != k and i != l and j != l):
                        triplet = sorted([list[i], list[j], list[k], list[l]])
                        if triplet not in group:
                            group.append(triplet)

    print(group)

sum_4([1,0,-1,0,-2,2], 0)
sum_4([2,2,2,2], 8)
