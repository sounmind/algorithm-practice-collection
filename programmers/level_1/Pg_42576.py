from collections import Counter


def solution(participant, completion):
    answer = ""

    # 참가자, 완주자 명단 정렬
    participant.sort()
    completion.sort()

    for part, compl in zip(participant, completion):
        if part != compl:  # 같은 순서의 참가자와 완주자 명단의 이름이 서로 다르다면,
            answer += part  # 그 참가자가 완주하지 않은 것이므로 정답 문자열에 추가
            break  # 완주하지 않은 사람은 한 명이므로 바로 중단
    if answer == "":  # 완주자 명단의 끝까지 갔음에도 참가자 명단과 서로 다른 사람이 없었다면,
        answer += participant[-1]  # 참가자 명단의 가장 마지막 사람이 완주하지 않은 사람

    return answer


# 해시를 알아야 함. Collections 알아보기
# https://min-zero.tistory.com/entry/python%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98%ED%95%B4%EC%8B%9C

# p = ["m", "s", "m", "a"]
p = ["m", "j", "n", "v", "f"]
c = ["m", "j", "n", "f"]
# c = ["s", "a", "m"]
print(solution(p, c))

"""
# 시간초과 답변
def solution(participant, completion):
    answer = ''

    for one in participant:
        if completion.count(one) != participant.count(one):
            answer += one
            break
        
    return answer
"""

print(Counter(p))
print(Counter(c))
print(Counter(p)-Counter(c))