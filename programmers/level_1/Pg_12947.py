def solution(x):
    str_x = str(x)
    sum = 0
    for digit in str_x:
        sum += int(digit)
    if x % sum == 0:
        answer = True
    else:
        answer = False

    return answer