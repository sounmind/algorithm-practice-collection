def solution(costs, budget):
    answer = 0
    costs.sort()
    
    for cost in costs:
        budget -= cost
        if budget < 0:
            break
        answer += 1

    return answer