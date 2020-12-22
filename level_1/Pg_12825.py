# https://programmers.co.kr/learn/courses/30/lessons/12925

def solution(s):
    answer = 0

    if s[0].isalpha():
        if s[0] == "+":
            answer = int(s[1:])
        else:
            answer = -int(s[1:])
    else:
        answer = int(s)

    return answer

print(solution("1234"))
print(solution("-134"))
print(solution("+124"))
print(solution("234"))