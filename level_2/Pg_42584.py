def solution(prices):
    prices_len = len(prices)
    answer = [0] * prices_len # 랜덤접근을 위해 미리 리스트 생성
    for i in range(prices_len):
        price_now = prices[i]
        for j in range(i+1, prices_len):
            if price_now > prices[j]: # 가격이 떨어졌다
                answer[i] = j-i # 현재위치에서 해당 가격이 있는 위치를 감하여 시간 계산
                break
            elif i == prices_len-1: # 마지막 초의 가격 변동은 0
                answer[i] = 0
                break
            else: # 가격이 떨어지지 않았으므로 시간 추가
                answer[i] += 1
    return answer

print(solution([1, 2, 3, 2, 3]))











"""
# 시간초과
def solution(prices):
    answer = []

    while True:
        price_now = prices.pop(0)
        if len(prices) == 0:
            answer.append(0)
            break
        for i, price in enumerate(prices): # 가격이 내려가거나 마지막 가격까지
            if price < price_now or i == len(prices)-1:
                answer.append(i+1)
                break
    return answer
"""
"""
# 시간초과2

def solution(prices):
    answer = []
    while True:
        price_now = prices.pop(0)
        len_prices = len(prices)
        if len_prices == 0:
            answer.append(0)
            break
        if price_now <= min(prices): # 끝까지 가격 떨어지지 않음
            answer.append(len_prices)
        else: # 가격 떨어지는 시각 있음
            for i in range(len_prices):
                if prices[i] < price_now:
                    answer.append(i+1)
                    break
    return answer

"""