def roman_to_int(roman_nums):
    roman_num_values = {}
    roman_num_values["I"] = 1
    roman_num_values["V"] = 5
    roman_num_values["X"] = 10
    roman_num_values["L"] = 50
    roman_num_values["C"] = 100
    roman_num_values["D"] = 500
    roman_num_values["M"] = 1000

    ans = 0

    for i in range(len(roman_nums)):
        if i < len(roman_nums) - 1 and roman_num_values[roman_nums[i]] < roman_num_values[roman_nums[i+1]]:
            ans -= roman_num_values[roman_nums[i]]
        else:
            ans += roman_num_values[roman_nums[i]]

    print(ans)

roman_to_int(roman_nums="III")
roman_to_int(roman_nums="XXX")