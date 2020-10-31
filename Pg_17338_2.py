def solution(encrypted_text, key, rotation):
    answer = ""

    a_int = ord("a")
    z_int = ord("z")

    # 암호화
    for text, value in zip(encrypted_text, key):
        sum_value = ord(text) + (ord(value) - a_int + 1)
        if sum_value > z_int:
            sum_value = a_int + (sum_value % z_int) - 1
        answer += chr(sum_value)

    # 회전
    answer = answer[-rotation:] + answer[:-rotation]

    return answer


print(solution("qyyigoptvfb", "abcdefghijk", 3)) # hellopython
print(solution("hellopython", "abcdefghijk", 3)) # igoptvfbqyy
print(solution("xyz", "dbc", 0))  # bac
print(solution("abc", "abc", 0))  # bdf
print(solution("y", "g", 0))  # f
print(solution("h", "a", 0))  # f
