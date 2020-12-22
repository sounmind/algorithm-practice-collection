def solution(priorities, doc_loc): # location+1번째에 있는 문서가 몇 번째로 인쇄될까?

    total_docs = len(priorities)
    compare = [] # 인쇄할 문서에 고유값을 부여하기 위해 비교 리스트 선언
    for i in range(len(priorities)): # 비교 리스트에 값 채워넣기
        compare.append(-i)
    doc_id = compare[doc_loc] # 인쇄할 문서의 고유값 초기화

    while True:
        print(priorities)
        highest = max(priorities)
        if priorities[0] < highest: # 인쇄할 문서의 우선순위가 문서 내부에 있는 최우선순위보다 낮으면,
            priorities.append(priorities.pop(0)) # 0번째에 있는 값을 제거한 뒤 마지막에 추가
            compare.append(compare.pop(0)) # 비교 리스트에도 똑같이
        else: # 인쇄할 문서의 우선순위가 최우선순위라면,
            priorities.pop(0) # 리스트에서 제거
            if compare.pop(0) == doc_id: # 비교 리스트에서도 제거하는데, 그것이 처음에 인쇄할 문서였다면,
                return total_docs - len(priorities) # 원래 문서 개수에서 현재 남아 있는 문서 개수를 빼면, 그것이 처음 인쇄하려 했던 문서의 인쇄 순서

print(solution(	[2, 1, 3, 2], 2))
print(solution(	[1, 1, 9, 1, 1, 1], 0))