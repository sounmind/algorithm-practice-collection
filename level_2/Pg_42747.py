def solution(citations):
    answer = 0
    citations.sort()
    n = len(citations)
    h_paper = 0  # h번 이상 인용된 논문 편 수

    for i in range(n + 1):
        for citation in citations:
            if citation >= i:  # h번 이상 인용된
                h_paper += 1
        if h_paper >= i:
            answer = i
        h_paper = 0

    return answer


print(solution([3, 0, 6, 1, 5]))  # 3
print(solution([6, 6, 6, 6, 6, 1]))  # 5
print(solution([4, 4, 4]))  # 3
print(solution([4, 4, 4, 5, 0, 1, 2, 3]))  # 4
print(solution([10, 11, 12, 13]))  # 4
print(solution([2, 2]))  # 2
print(solution([3, 0, 6, 1, 5]))  # 3
print(solution([0, 0, 1, 1]))  # 1
print(solution([0, 1]))  # 1
print(solution([10, 9, 4, 1, 1]))  # 3
