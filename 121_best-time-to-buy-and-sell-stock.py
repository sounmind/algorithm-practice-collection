import sys


def maxProfit(prices):
    # 저점과 현재 값과의 차이 계산
    profit = 0
    min_price = sys.maxsize

    for price in prices:
        min_price = min(min_price, price)
        profit = max(profit, price - min_price)

    return profit


print(maxProfit([7, 1, 5, 3, 6, 4]))  # 5
print(maxProfit([7, 6, 4, 3, 1]))  # 0
print(maxProfit([2, 1, 2, 1, 0, 1, 2]))  # 2
print(maxProfit([3, 3, 5, 0, 0, 3, 1, 4]))  # 4
print(maxProfit([1, 6, 0, 3]))  # 5
