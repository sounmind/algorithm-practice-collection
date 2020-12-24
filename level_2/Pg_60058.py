def solution(given_string):
    if given_string == "":
        return ""
    undividable_balanced, balanced = divide_string_to_2_balanced(given_string)
    if is_right_bracket(undividable_balanced):
        return undividable_balanced + solution(balanced)
    else:
        return (
            "(" + solution(balanced) + ")" + reverse_bracket(undividable_balanced[1:-1])
        )


def divide_string_to_2_balanced(string):
    undividable_balanced, balanced = "", ""
    total_left_bracket, total_right_bracket = 0, 0
    for i, bracket in enumerate(string):
        if bracket == "(":
            total_left_bracket += 1
        if bracket == ")":
            total_right_bracket += 1
        if total_left_bracket == total_right_bracket:
            undividable_balanced = string[: i + 1]
            try:  # 오류가 난다면, balanced 가 공백이라는 뜻
                balanced = string[i + 1 :]
            except:
                balanced = ""
            break
    return undividable_balanced, balanced


def reverse_bracket(string):
    answer = ""
    for i in range(len(string)):
        if string[i] == "(":
            answer += ")"
        else:
            answer += "("
    return answer


def is_right_bracket(string):  # 올바른 괄호
    stack = []
    for element in string:
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