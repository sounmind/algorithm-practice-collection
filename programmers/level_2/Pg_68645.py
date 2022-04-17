# 삼각달팽이(https://programmers.co.kr/learn/courses/30/lessons/68645?language=python3)
def solution(n):
    dx = [1, 0, -1]  # 세로
    dy = [0, 1, -1]  # 가로
    board = [[0] * (n) for _ in range(n)]

    count = 1  # 채울 숫자
    x, y = 0, 0
    direction = 0
    end_count = (n * (n + 1)) / 2
    while end_count >= count:
        if (0 <= x < n) and (0 <= y < n) and (board[x][y] == 0):
            board[x][y] = count
            count += 1
        else:
            x -= dx[direction]
            y -= dy[direction]
            direction = (direction + 1) % 3
        x += dx[direction]
        y += dy[direction]

    answer = []
    for x in range(n):
        for y in range(0, x + 1):
            answer.append(board[x][y])
    return answer


print(solution(4))  # [1, 2, 9, 3, 10, 8, 4, 5, 6, 7]
print(solution(5))  # [1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9]
print(
    solution(6)
)  # 	[1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11]

# 풀이 참고: https://choichumji.tistory.com/108