def arrayPairSum(nums):
    sum = 0
    nums.sort()

    for i in range(0, len(nums), 2):
        sum += nums[i]

    return sum


print(arrayPairSum([1, 4, 3, 2]))  # 4
print(arrayPairSum([6, 2, 6, 5, 1, 2]))  # 9
