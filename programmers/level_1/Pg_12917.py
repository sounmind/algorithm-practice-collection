def solution(s):
    answer = ''

    s = sorted(s, reverse=True)
    for alpha in s:
        answer += alpha

    return answer


print(solution("Zbcdefg"))