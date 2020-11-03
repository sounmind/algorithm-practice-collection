def solution(scoville, K):
    answer = 0
    while True:
        scoville.sort(reverse=True)
        if len(scoville) <= 1 and min(scoville) <= K:
            answer = -1
            break
        scoville.append(scoville.pop() + scoville.pop() * 2)
        answer += 1
        if min(scoville) >= K:
            break
    print(scoville)
    return answer


print(solution([1, 2, 3, 9, 10, 12], 100))