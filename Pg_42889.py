def solution(total_stages, stage_stopped):
    answer = []
    stage_fail_rate = {}
    stage_stopped.sort()

    for i in range(total_stages):
        try:
            stage_fail_rate[i+1] = stage_stopped.count(i+1) / len(stage_stopped[stage_stopped.index(i+1):])
        except:
            stage_fail_rate[i+1] = 0
    
    stage_sort_by_fail_rate = sorted(stage_fail_rate.items(), key = lambda x : x[1], reverse=True)
    for stage_fail in stage_sort_by_fail_rate:
        answer.append(stage_fail[0])

    print("stage_fail_rate: ", end="")    
    print(stage_fail_rate)
    print("stage_sort_by_fail_rate: ", end="")
    print(stage_sort_by_fail_rate)

    return answer


print(solution( 5, [2, 1, 2, 6, 2, 4, 3, 3] ))
print(solution( 4, [4, 4, 4, 4, 4] ))