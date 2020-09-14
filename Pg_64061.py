def solution(board, moves): # 터트려진 인형의 개수 return
    answer = 0
    box = [] # 뽑은 인형을 넣는 바구니

    for move in moves: # move == 인형을 뽑을 열
        for row in board: # 위에서부터 인형의 위치가 표시된 행 정보
            if row[move-1] != 0: # 해당 행의 move열에 인형이 있다면
                box.append(row[move-1]) # 그 행의 인형을 바구니에 넣고
                row[move-1] = 0 # 그 인형의 위치를 0으로 초기화
                if len(box)>1 and box[-2]==box[-1]: # 바구니에 들어있는 인형의 수가 2 이상이고, 가장 최근 두 개의 인형이 같다면
                    box.pop() # 인형 두 개를 pop 하여 제거
                    box.pop()
                    answer += 2 # 정답(제거된 인형 개수)에 가산
                break
    print("box: ", end="")
    print(box)
    return answer



print(solution(	[[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]], [1, 5, 3, 5, 1, 2, 1, 4] ))
