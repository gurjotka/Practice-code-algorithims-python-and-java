def median_sorted(num1,num2):
    merged = num1 + num2
    merged.sort()
    len_merged = len(merged)

    if len_merged % 2 == 0:
        median = (merged[int(len_merged/2)] + merged[int((len_merged/2) - 1)])/2

    else:
        median = merged[int((len_merged+1)/2)]

    print(median)

median_sorted(num1=[3, 4], num2=[1, 2])
median_sorted(num1=[3, 7, 9, 11, 5], num2=[1, 2, 3, 11, 10, 5])