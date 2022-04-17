# https://programmers.co.kr/learn/courses/30/lessons/12903
def solution(s):
    answer = ''
    if len(s)%2 == 0:
        answer = s[len(s)//2-1:len(s)//2+1]
    else:
        answer = s[len(s)//2]

    return answer

"""
참고:
1. 리스트 슬라이싱 https://wikidocs.net/14
2. 발생 오류: string indices must be integers --> 파이썬 산술연산자 '/'는 float을 리턴한다! 자바처럼 정수형 몫을 리턴받으려면 '//'을 사용해야 한다.
"""