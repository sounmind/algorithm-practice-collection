def solution(n):
    is_prime = [False, False] + [True] * (n-1) # 인덱스 9과 1은 소수가 아니므로 제외, 나머지는 소수 취급
    prime_list = [] # 소수를 넣을 배열
    for i in range(2, n+1): # 2부터 n까지 검사
        if is_prime[i]: # i가 소수이면
            prime_list.append(i) # 소수 배열에 추가
            for j in range(i+i, n+1, i): # i 이후의 i의 배수들을 소수에서 제외
                is_prime[j] = False
    return len(prime_list)

print(solution(2))
print(solution(3))
print(solution(4))
print(solution(5))
print(solution(6))
print(solution(7))
print(solution(8))
print(solution(9))
print(solution(10))
print(solution(100))
