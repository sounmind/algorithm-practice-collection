def solution(strings, n):
    answer = []

    strings = sorted(strings)
    answer = sorted(strings, key = lambda x: x[n])
    
    return answer

print(solution(["sun", "bed", "car"], 1))
print(solution(["abce", "abcd", "cdx"], 2))
# 파이썬 특정 기준 정렬: https://dailyheumsi.tistory.com/67