import math

def solution(n):
    answer = 0
    isPrime = [True] * (n+1)
    sqrt = int(n**0.5)
    for i in range(2, sqrt+1):
        if isPrime[i] == True:
            for j in range(i*2, n+1, i):
                isPrime[j] = False
    for i in range(2, n+1):
        if isPrime[i] == True:
            answer += 1
    return answer

print(solution(10))
print(solution(5))
