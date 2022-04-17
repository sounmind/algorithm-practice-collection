import math

def solution(n):
    answer = 0

    n_sqrt = math.sqrt(n)
    if n_sqrt - int(n_sqrt) == 0:
        answer = math.pow(n_sqrt+1, 2)
    else:
        answer = -1

    return answer