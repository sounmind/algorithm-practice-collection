from itertools import combinations  # 조합 모듈 이용하기

# 바로 set()을 선언하고 진행해도 되지만
# 프로그래머스 json iteralize 오류 때문에 list 위주로 풀이했다.


def solution(numbers):
    answer = []

    # 조합 모듈 사용
    result = combinations(numbers, 2)

    for combination in result:
        answer.append(sum(combination))
    # 리스트를 집합으로 바꿔 중복을 제거 -> 다시 리스트로 바꾸어 오름차 정렬
    answer = sorted(list(set(answer)))

    return answer