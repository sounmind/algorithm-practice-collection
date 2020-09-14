def solution(num):
    count = 0
    while(num != 1): # num이 1이 될 때까지 반복
        if num % 2 == 0: # num이 짝수라면
            num /= 2 # num을 2로 나눈다.
        else: # 홀수라면
            num = num * 3 + 1 # num을 3배하고 1을 더한다
        count += 1 # 반복횟수에 1을 더한다
    return count if count <= 500 else -1 # 반복문이 끝났을 때 count가 500이하이면 count를 반환하고, 아니면 -1를 반환한다.