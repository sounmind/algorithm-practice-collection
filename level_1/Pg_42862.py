def solution(n, lost, spare): # n: 전체 학생, lost: 도난당한 학생목록, spare: 여벌 체육복 가져온 학생목록
    lost_total = len(lost)
    spare_total = len(spare)
    answer = n - lost_total # 정답을 전체 학생 수에서 체육복 잃어버린 사람 수를 빼서 초기화
    lost.sort()
    spare.sort()

    # 여벌-도난 모두 해당하는 학생을 배열에서 예외로 처리 -> 일반 학생 취급
    spare_and_lost = 0
    for i in range(lost_total):
        for j in range(spare_total):
            if lost[i] == spare[j]: # 여벌 학생이 동시에 도난 학생인 경우
                lost[i] = -100
                spare[j] = -100
                spare_and_lost += 1
    # 양 옆에 도난 또는 여벌 학생 있는 경우
    for i in range(lost_total):
        for j in range(spare_total):
            if i > 0 and lost[i] - lost[i-1] == 2 and spare[j] == lost[i] - 1:
                continue # 여벌 학생 양 옆에 도난 학생 있을 경우, 한 명만 줘야 하기 때문에 continue
            if abs(lost[i] - spare[j]) == 1: # 도난 학생 양 옆 중 한 명이 여벌 학생일 경우
                answer += 1 # 도난 학생이 여벌 체육복을 받았다!
                break # 다음 도난 학생으로 넘어감


    return answer + spare_and_lost # ( 일반 학생 + 여벌 체육복 받은 학생 ) + 여벌 체육복 가져오고 잃어버린 학생


print(solution(	5, [2, 4], [1, 3, 5]))
print(solution(	5, [2, 4], [3]))
print(solution(	24, [12, 13, 16, 17, 19, 20, 21, 22], [1, 22, 16, 18, 9, 10]))
print(solution(	18, [7, 8, 11, 12], [1, 6, 8, 10]))
print(solution(3, [2, 3], [1]))