def solution(n):
    answer = []
    n = str(n)
    for i in n:
        answer.append(int(i))
    return list(reversed(answer))

print(solution(12345))

# 리스트를 리턴하는 함수의 반환값을 출력할 때 print(list(함수리턴값))으로 감싸줘야 제대로 출력된다. list()로 감싸주지 않으면 None이 출력된다. 