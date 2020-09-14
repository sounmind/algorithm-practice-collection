def solution(numbers):
    sum_set = set([]) # 집합 초기화
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            sum_set.add(numbers[i]+numbers[j]) # 차례대로 집합에 추가하기
    return sorted(list(sum_set)) # 집합을 리스트로 바꾼 뒤 정렬한 다음 반환

print(solution(	[2, 1, 3, 4, 1] ))
print(solution(	[5, 0, 2, 7] ))