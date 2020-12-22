from math import gcd


def lcm(x, y):  # 최소공배수
    return x * y // gcd(x, y)


def solution(arr):
    while True:
        # arr의 원소 두 개를 pop하여 최소공배수를 구한 것을 arr에 추가한다.
        arr.append(lcm(arr.pop(), arr.pop()))
        # arr의 길이가 1이면 리턴
        if len(arr) == 1:
            return arr[0]


print(solution([2, 6, 8, 14]))  # 168
print(solution([1, 2, 3]))  # 6
print(solution([3, 6, 10, 12]))  # 60

# 풀이 참고: https://brownbears.tistory.com/454