def solution(board, moves):
    answer = 0
    capture_box = []  # 뽑은 인형을 넣는 상자
    for move in moves:
        for row in board:
            if row[move - 1] == 0:  # 인형이 없을 때
                continue  # 다음 층으로
            else:  # 인형이 있을 때
                capture_box.append(row[move - 1])
                row[move - 1] = 0  # 뽑힌 자리는 0으로
                break  # 다음 뽑기 명령으로

        if len(capture_box) > 1 and capture_box[-1] == capture_box[-2]:
            capture_box.pop()
            capture_box.pop()
            answer += 2

    # 사라진 인형의 개수 리턴
    return answer


# print(
#     solution(
#         [
#             [0, 0, 0, 0, 0],
#             [0, 0, 1, 0, 3],
#             [0, 2, 5, 0, 1],
#             [4, 2, 4, 4, 2],
#             [3, 5, 1, 3, 1],
#         ],
#         [1, 5, 3, 5, 1, 2, 1, 4],
#     )
# )
