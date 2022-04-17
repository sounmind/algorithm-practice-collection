def solution(clothes):
    # 각 의상 종류를 입거나 안 입는 모든 경우를 곱하고 모두 안 입는 경우(1가지)를 빼주면 된다.
    # 즉, A타입 옷이 5종류이고 B타입 옷이 3종류이면, A타입 옷을 입는 총 가지수는 안 입는 경우를 포함해 6가지이다. B타입은 4가지 이므로, 6*4-1하면 총 23가지이다.
    answer = 1
    clothes_dict = dict(clothes) # 입력 2차원 배열을 딕셔너리로 바꿈
    clothes_types = list(set(list(clothes_dict.values()))) # 2차원 배열의 값(옷 종류)를 중복을 없애고 리스트로 만듦
    dict_type = {zero: 0 for zero in clothes_types} # 중복 없앤 옷 종류를 값이 0으로 초기화된 딕셔너리로 바꿈

    for cloth in clothes: # 종류 별 옷을 헤아림
        dict_type[cloth[1]] += 1
    for i in dict_type.values(): # 헤아린 옷 종류 수를 +1(안 입는 경우)한 다음 모두 곱함
        answer *= (i+1)

    return answer-1 # 모두 안 입는 경우를 빼고 반환


print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))
print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))

# 참고
# list to dict | https://security-nanglam.tistory.com/427
# 다른 사람 풀이 | https://programmers.co.kr/learn/courses/30/lessons/42578/solution_groups?language=python3
