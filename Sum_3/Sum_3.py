def Sum_3(list):
    group = []

    for i in range(len(list)):
        for j in range(len(list)):
            for k in range(len(list)):
                if list[i] + list[j] + list[k] == 0 and i != j and j != k and i != k:
                    triplet = sorted([list[i], list[j], list[k]])
                    if triplet not in group:
                        group.append(triplet)

    print(group)

Sum_3([-1,0,1,2,-1,-4])
Sum_3([0,1,1])
Sum_3([0,0,0])