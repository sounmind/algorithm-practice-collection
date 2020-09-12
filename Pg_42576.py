def solution(participant, completion):
    answer = ''

    participant.sort()
    completion.sort()
    for part, compl in zip(participant, completion):
        if part != compl:
            answer += part
            break
    if answer == '':
        answer += participant[-1]
        
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