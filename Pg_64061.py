def solution(board, moves): # 터트려진 인형의 개수 return
    answer = 0
    box = []

    for move in moves:
        for row in board:
            if row[move-1] != 0:
                box.append(row[move-1])
                row[move-1] = 0
                if len(box)>1 and box[-2]==box[-1]:
                    box.pop()
                    box.pop()
                    answer += 2
                break
    print("box: ", end="")
    print(box)
    return answer



print(solution(	[[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]], [1, 5, 3, 5, 1, 2, 1, 4] ))
