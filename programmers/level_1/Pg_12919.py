# https://programmers.co.kr/learn/courses/30/lessons/12919

def solution(seoul):
    location = 0
    
    for name in seoul:
        if name == "Kim":
            break
        location += 1

    answer = f"김서방은 {location}에 있다"
    return answer

print(solution(["Jane", "Kim"]))


# 참고:
# 파이썬 리스트 안에 특정 문자열 찾기 https://daeunginfo.blogspot.com/2019/04/python_15.html