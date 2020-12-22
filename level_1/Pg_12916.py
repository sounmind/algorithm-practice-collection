def solution(s):
    answer = True
    p_cnt = 0
    y_cnt = 0
    for letter in s:
        if letter.lower() == "p":
            p_cnt += 1
        if letter.lower() == "y":
            y_cnt += 1
    if p_cnt != y_cnt:
        answer = False
    else:
        answer = True

    return answer

print(solution("pPoooyY"))
print(solution("Pyy"))