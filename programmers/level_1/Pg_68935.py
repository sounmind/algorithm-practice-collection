def solution(n):
    answer = []
    while n != 0:  # 3진법 적용하여 거꾸로 표현
        b = n % 3  # 나머지
        if b == 0:
            answer.append(0)
        else:
            answer.append(b)
        n = n // 3

    base = 1
    sum = 0
    while answer:
        sum += answer.pop() * base
        base *= 3
    return sum


print(solution(45) == 7)
print(solution(125) == 229)
