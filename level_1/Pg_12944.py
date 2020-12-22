def solution(arr):
    answer = 0
    
    for i in arr:
        answer += i
    answer = answer/len(arr)
    if answer == int(answer):
        int(answer)
    
    return answer