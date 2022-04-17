def solution(a, b):
    answer = 0
    while a and b:
        answer += a.pop() * b.pop()
    return answer


print(solution([1, 2, 3, 4], [-3, -1, 0, 2]) == 3)
print(solution([-1, 0, 1], [1, 0, -1]) == -2)
