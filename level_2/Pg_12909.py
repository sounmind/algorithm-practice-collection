def solution(s):  # 올바른 괄호
    for _ in range(len(s)):
        s = s.replace("()", "")
    if len(s) > 0:
        return False
    return True


print(solution("()()"))
print(solution("(())()"))
print(solution(")()("))
print(solution("(()("))