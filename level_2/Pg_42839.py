from itertools import permutations
from math import sqrt


def solution(numbers):
    answer = 0
    number_list = []
    n = len(numbers)
    number_merged = ""

    for i in range(1, n + 1):
        for number in list(permutations(numbers, i)):  # i개를 뽑아 중복을 허용하지 않고 나열
            for char in number:
                number_merged += char
            number_list.append(int(number_merged))
            number_merged = ""
    number_list = list(set(number_list))  # 중복 제거
    for num in number_list:
        if is_prime(num) == True:
            answer += 1
    return answer


def is_prime(number):
    if number == 0 or number == 1:
        return False
    elif number == 2:
        return True
    for i in range(2, int(sqrt(number)) + 1):
        if number % i == 0:
            return False
    return True


print(solution("17"))  # 3
print(solution("011"))  # 2
