from collections import deque


def solution(people, limit):
    answer = 0
    people = deque(sorted(people))
    while len(people) > 0:
        if len(people) == 1: # 사람이 한 명밖에 없으면,
            people.pop()
            return answer + 1
        else:
            if people[0] + people[-1] <= limit:  # 가장 가벼운 사람과 무거운 사람이 보트에 탈 수 있다면
                # 사람 목록에서 가장 가벼운, 무거운 사람 제거
                people.popleft()
                people.pop()
            else:  # 가장 끝에 있는 사람은 같이 탈 사람이 없으니 배 하나를 추가해야 한다.
                # 사람 목록에서 가장 무거운 사람 제거
                people.pop()
            answer += 1
    return answer


print(solution([70, 50, 80, 50], 100))  # 3
print(solution([70, 80, 50], 100))  # 3
print(solution([10, 20, 30, 40, 50, 60, 70, 80, 90, 100], 100))  # 6
