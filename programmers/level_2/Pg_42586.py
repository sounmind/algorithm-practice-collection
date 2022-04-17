import math

def solution(progresses, speeds):
    answer = []
    f_total = len(progresses)
    f_release = 0 # 하루에 출시되는 기능 개수
    f_day_taken = [] # 해당 기능을 개발하기까지 걸리는 시간(일)
    for rate, speed in zip(progresses, speeds): # 기능 별 걸리는 시간 리스트 초기화
        f_day_taken.append( math.ceil( (100 - rate) / speed ) )
    now_date = f_day_taken[0] # 가장 최근 기능 출시 시점(일)
    f_release += 1 # 첫번째 기능은 무조건 바로 출시
    for i in range(1, f_total):
        if f_day_taken[i] <= now_date: # 걸린 시간이 출시 시점보다 작거나 같다면
            f_release += 1  # 출시
        else: # 출시 시점보다 더 오래 걸린다면
            answer.append(f_release) # 지금까지 출시할 수 있는 기능 정답 리스트에 추가
            now_date = f_day_taken[i] # 시점을 현재 기능 시점으로 옮기기
            f_release = 1 # 출시 기능 개수 초기화
    answer.append(f_release) # 마지막 출시된 기능 개수 정답 리스트에 추가

    return answer

print(solution(	[93, 30, 55], [1, 30, 5 ])) # [2, 1] 
print(solution(	[95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1] )) # [1, 3, 2]

# 파이썬 올림: https://wikidocs.net/21113