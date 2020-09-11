def solution(s, n):
    answer = ''

    for ch in s:
        ch_num = ord(ch)
        added = ord(ch)+n
        if ch == " ":
            answer += " "
            continue
        if ord('a') <= ch_num <= ord('z'):
            if added > ord('z'):
                added -= 26
        elif ord('A') <= ch_num <= ord('Z'):
            if added > ord('Z'):
                added -= 26
        answer += chr(added)

    return answer

print(solution("AB", 25))

print(solution("z", 1))

print(solution("a B z", 4))