def solution(total_stages, stage_stopped):
    answer = []
    stage_fail_rate = {} # 스테이지별 실패율을 담을 딕셔너리
    stage_stopped.sort() # 각자 멈춘 스테이지 리스트 정렬

    for i in range(total_stages):
        try: # index 함수의 오류 대비하여 try except 사용
            # k 스테이지의 실패율 = k 스테이지에서 멈춘 사람 수 / k 스테이지 이상에서 멈춘 사람 수
            stage_fail_rate[i+1] = stage_stopped.count(i+1) / len(stage_stopped[stage_stopped.index(i+1):])
        except: # k 스테이지에서 멈춘 사람이 없을 경우
            stage_fail_rate[i+1] = 0 # k 스테이지의 실패율은 0
    
    stage_sort_by_fail_rate = sorted(stage_fail_rate.items(), key = lambda x : x[1], reverse=True) # 딕셔너리의 value를 기준으로 내림차 순으로 정렬
    for stage_fail in stage_sort_by_fail_rate: # 스테이지-실패율을 하나씩 꺼내어
        answer.append(stage_fail[0]) # 튜플의 첫번째 요소(스테이지)를 정답 리스트에 추가

    print("stage_fail_rate: ", end="")    
    print(stage_fail_rate)
    print("stage_sort_by_fail_rate: ", end="")
    print(stage_sort_by_fail_rate)

    return answer


print(solution( 5, [2, 1, 2, 6, 2, 4, 3, 3] ))
print(solution( 4, [4, 4, 4, 4, 4] ))