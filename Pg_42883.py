from itertools import combinations


def solution(number, k):
    n = len(number)
    maximum = 0
    for number_selected in combinations(number, n - k):
        num = int("".join(number_selected))
        if maximum <= num:
            maximum = num
    return str(maximum)


print(solution("1924", 2))