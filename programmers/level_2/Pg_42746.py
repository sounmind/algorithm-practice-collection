def solution(numbers):
    answer = ''
    total = len(numbers)
    for i in range(total): # 문자열로 바꿔주기
        numbers[i] = str(numbers[i])

    # 리스트를 (첫째 자리부터 마지막 자리 기준으로 각각 정렬) 규칙대로 정렬하기. 나머지 연산으로 오류를 나지 않도록 한다.
    numbers.sort(key=lambda number: (number[0], number[1 % len(number)], number[2 % len(number)], number[3 % len(number)]), reverse=True)
    
    for n in numbers: # 정렬된 리스트를 정답 문자열에 합치기
        answer += n
    return answer if int(answer) != 0 else "0" # 0이 여러 개일 경우 "0000"과 같이 되는 경우가 생기므로 예외 처리하여 정답 반환

print(solution( [6, 10, 2] ))
print(solution(	[3, 30, 34, 5, 9] ))
print(solution(	[3, 30, 34, 343, 31, 4, 300, 5, 9] ))
print(solution(	[0,0,0,0] ))
print(solution(	[0,1,0,0] ))

# 파이썬 특정 기준 정렬 https://wayhome25.github.io/python/2017/03/07/key-function/
# 다른 사람 풀이 https://leedakyeong.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%88%98-in-python 