def solution(n, m):
    gcd = Euclidean(n, m)
    return [gcd, n*m/gcd] 

def Euclidean(a, b):
    while b != 0:
        r = a % b
        a = b
        b = r
    return a

# 참고:
# 1. 유클리드 호제법 https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95