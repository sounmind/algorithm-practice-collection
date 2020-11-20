def solution(s):
    while True:
        current_len = len(s)
        if current_len == 0:
            return 1
        for i in range(current_len):
            if i > 0 and s[i - 1] == s[i]:
                s = s[: i - 1] + s[i + 1 :]
                break
        if len(s) == current_len:  # 처음 길이와 같다면(제거할 것이 없다면)
            return 0


print(solution("baabaa"))  # 1
print(solution("cdcd"))  # 0
