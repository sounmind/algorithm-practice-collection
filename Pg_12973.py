def solution(s):
    i = 0
    origin_len = len(s)
    while True:
        try:
            if i > 0 and s[i - 1] == s[i]:
                s = s[: i - 1] + s[i + 1 :]
                i = 0
            else:
                i += 1
        except:
            if len(s) == 0:
                return 1
        if i == origin_len:
            return 0


print(solution("baabaa"))  # 1
print(solution("cdcd"))  # 0
print(solution("fffddcddcddeeffeef"))  # 1
