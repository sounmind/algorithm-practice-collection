def solution(costs, budget): # 작은 값부터 예산에서 빼야 최댓값이 산출된다.
    answer = 0
    costs.sort() # 신청 금액들을 정렬한 다음
    
    for cost in costs:
        budget -= cost # 작은 순서대로 예산에서 제한다.
        if budget < 0: # 예산이 0 미만이 되면 중단한다
            break
        answer += 1
    return answer