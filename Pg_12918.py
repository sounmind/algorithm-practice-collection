def solution(s):
    answer = True

    if len(s) == 4 or len(s) == 6:
        pass
    else:
        return False

    for char in s:
        if char.isalpha():
            return False
    

    return answer