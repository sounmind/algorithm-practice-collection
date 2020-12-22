def solution(s):
    answer = ''
    s = s.split(" ")
    for word in s:
        for i, char in enumerate(word):
            answer += char.upper() if i%2==0 else char.lower()
        answer += ' '
    return answer[:-1]+"end"

print(solution("try hello world"))
print(solution("t"))
print(solution("t r q"))
print(solution("tasd aswqrf afsvbdslkjnv sadsa sad sa    d"))
print(solution("tasd  aswqrf  afsvbdslkjnv  sadsa  sad sad   "))
print(solution("tasd  aswqrf      afsvbdslkjnv  sadsa  sad     sad    "))
