def solution(given_string):
    if given_string == "":
        return ""
    undividable_balanced, balanced = divide_string_to_2_balanced(given_string)
    if is_right_bracket_string(undividable_balanced):
        return undividable_balanced + solution(balanced)
    return "(" + solution(balanced) + ")" + reverse_bracket(undividable_balanced[1:-1])


def divide_string_to_2_balanced(string):
    undividable_balanced, balanced = string, ""
    for i in range(2, len(string), 2):
        if is_balanced_bracket_string(string[:i]):
            undividable_balanced = string[:i]
            balanced = string[i:]
            break
    return undividable_balanced, balanced


def is_balanced_bracket_string(string):
    return string.count("(") == string.count(")")


def is_right_bracket_string(string):
    count = 0
    for bracket in string:
        if bracket == "(":
            count += 1
        else:
            count -= 1
        if count < 0:
            return False
    return count == 0


def reverse_bracket(string):
    answer = ""
    for i in range(len(string)):
        if string[i] == "(":
            answer += ")"
        else:
            answer += "("
    return answer
