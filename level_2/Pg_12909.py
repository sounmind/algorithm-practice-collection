def solution(s):  # 올바른 괄호
    stack = []
    for element in s:
        stack.append(element)
        find_and_delete_pair_of_bracket(stack)
    return len(stack) == 0


def find_and_delete_pair_of_bracket(stack):
    try:
        if stack[-2:] == ["(", ")"]:
            stack.pop()
            stack.pop()
    except:
        pass


print(solution("()()"))
print(solution("(())()"))
print(solution(")()("))
print(solution("(()("))