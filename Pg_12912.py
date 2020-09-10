# https://programmers.co.kr/learn/courses/30/lessons/12912
def solution(a, b):
    answer = 0
    
    if(a<b):
        bigger = b
        smaller = a
    else:
        bigger = a
        smaller = b
    
    for i in range(smaller, bigger+1):
        answer += i
        
    return answer