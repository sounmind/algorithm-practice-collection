def solution(n, m):
    gcd = Euclidean(n, m)
    return [gcd, n*m/gcd] # 최소공배수는 두 수의 곱에 최대공약수를 나눈 것

def Euclidean(a, b):
    while b != 0: # a를 b로 나눈 r(나머지)의 값이 대입된 b가 0이 되었을 때 a가 a,b의 최대공약수
        r = a % b
        a = b # 다시, a에는 b의 값이 대입되고
        b = r # b에는 나머지의 값이 대입된다
    return a

# 참고:
# 1. 유클리드 호제법 https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95