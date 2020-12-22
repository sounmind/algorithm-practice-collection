def solution(name):
    answer = 0
    bcd = "ABCDEFGHIJKLM"
    zyx = "AZYXWVUTSRQPO"

    for c in name:
        if c == "A":
            continue
        # 알파벳 맞추기
        if c == "N":
            answer += 13
        else:
            if c in bcd:
                answer += bcd.index(c)
            else:
                answer += zyx.index(c)
        # 옆 알파벳으로 넘어가기
        answer += 1

    return answer - 1


print(solution("JEROEN"))  # 56
print(solution("JAN"))  # 23

# 절댓값 abs(number)