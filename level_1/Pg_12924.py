def solution(n):
    answer = 0
    for i in range(1, n // 2 + 1):  # i = 더하기 시작하는 값
        sum = 0
        for j in range(i, n + 1):
            sum += j
            if sum == n:
                answer += 1
                break
            elif sum > n:
                break

    return answer + 1  # 자기 자신만을 더하는 경우 추가


print(solution(15))  # 4
print(solution(10000))  # 5