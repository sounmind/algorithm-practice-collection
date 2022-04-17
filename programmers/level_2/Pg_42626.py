import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while True:
        try:
            new_scoville = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        except:
            answer = -1
            break
        heapq.heappush(scoville, new_scoville)
        answer += 1
        if scoville[0] >= K:
            break

    return answer


print(solution([1, 2, 3, 9, 10, 12], 7))


# 파이썬 힙 모듈 사용법 참고 https://www.daleseo.com/python-heapq/