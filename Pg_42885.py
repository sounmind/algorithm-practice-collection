def solution(people, limit):
    answer = 1
    people.sort()
    boat = 0
    for one in people:
        if boat + one > limit:
            answer += 1
            boat = one
        else:
            boat += one

    return answer


print(solution([70, 50, 80, 50], 100))  # 3
print(solution([70, 80, 50], 100))  # 3
