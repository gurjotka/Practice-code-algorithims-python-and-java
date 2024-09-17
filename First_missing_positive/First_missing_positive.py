def first_missing_positive(list):
    target = 1
    positive_num = [num for num in list if num > 0]
    min_pos_num = min(positive_num)



    if min_pos_num == target:
        target = min_pos_num + 1
        if target in list:
            target += 1

    print("First Missing POsitive Number =  " + target)

first_missing_positive(list=[1,2,0])
first_missing_positive(list=[3, 4, -1, 1])
first_missing_positive(list=[7, 8, 9, 11, 12])