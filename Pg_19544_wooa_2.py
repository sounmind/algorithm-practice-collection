def solution(s, op):
    answer = []
    for i in range(1, len(s)):
        # 좌변, 우변 초기화
        left = int(s[:i])
        right = int(s[i:])
        if op == "+":
            answer.append(left + right)
        elif op == "-":
            answer.append(left - right)
        elif op == "*":
            answer.append(left * right)
    return answer


print(solution("1234", "+"))
print(solution("987987", "-"))
print(solution("31402", "*"))
