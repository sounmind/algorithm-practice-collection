def solution(s):
    stack = []
    for c in s:
        if len(stack) == 0:  # 스택이 비었다면
            stack.append(c)  # 문자열의 현재 문자 추가
        elif stack[-1] == c:  # 스택의 peak이 문자열의 현재 문자가 같다면
            stack.pop()  # 스택의 peak 제거
        else:  # 스택의 peak이 문자열의 현재 문자와 같지 않다면
            stack.append(c)  # 스택에 그 문자 추가
    if len(stack) == 0:  # stack이 비었으면 짝 지어 지울 수 있다는 뜻
        return 1
    else:
        return 0


print(solution("baabaa"))  # 1
print(solution("cdcd"))  # 0
print(solution("cdddcd"))  # 0
print(solution("fffddcddcddeeffeef"))  # 1

# 풀이 참조: https://eda-ai-lab.tistory.com/492
