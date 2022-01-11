def arrayPairSum(nums):
    return sum(sorted(nums)[::2])


print(arrayPairSum([1, 4, 3, 2]))  # 4
print(arrayPairSum([6, 2, 6, 5, 1, 2]))  # 9
