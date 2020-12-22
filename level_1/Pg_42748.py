# https://programmers.co.kr/learn/courses/30/lessons/42748
def solution(array, commands):
    answer = []
    for one_command in commands:
        Kth_number = sorted(array[one_command[0]-1:one_command[1]])[one_command[2]-1]
        answer.append(Kth_number)

    return answer

print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))

"""
1. 파이썬 정렬: https://wikidocs.net/16041
2. 파이썬 리스트 원소 추가, 삭제 https://wikidocs.net/16040
3. 오류 발생: 문제에서 n번째를 말할 때 실제 리스트의 index와 차이를 반영하지 않아 오류가 생김.
"""