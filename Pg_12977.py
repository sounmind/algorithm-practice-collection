from itertools import combinations
from math import sqrt


def is_prime(number):
    if number == 0 or number == 1:
        return False
    elif number == 2:
        return True
    for i in range(2, int(sqrt(number)) + 1):
        if number % i == 0:
            return False
    return True


def solution(nums):
    answer = 0

    for combination in combinations(nums, 3):
        if is_prime(sum(combination)):
            answer += 1
    return answer


print(solution([1, 2, 3, 4]))  # 1
print(solution([1, 2, 7, 6, 4]))  # 4
