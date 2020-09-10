# https://programmers.co.kr/learn/courses/30/lessons/12928

def solution(n):
    answer = 0

    for num in range(1, n+1):
        if n % num == 0:
            answer += num

    return answer

print(solution(5))
print(solution(12))