def solution(brown, yellow):
    # 카펫의 가로 길이 >= 세로 길이
    answer = []
    # 노란색 격자가 가로로 한 줄로 쭉 나열되어 있다고 가정하고 초기화
    y_width = yellow  # 노란색 가로
    y_height = 1  # 노란색 세로

    # 노란색 격자 수의 약수를 차례로 공식에 대입해 갈색 격자 개수와 맞는지 확인
    for i in range(2, yellow + 1):
        if yellow % i == 0:
            y_width = yellow // i
            y_height = yellow // y_width
            # print(y_width, y_height)
        if brown == (y_width + y_height + 2) * 2:
            break

    # 노란색 카펫의 가로 세로에 +2 하여 전체 카펫 길이 계산
    answer.append(y_width + 2)
    answer.append(y_height + 2)
    # 가로가 더 길도록 정렬
    answer.sort(reverse=True)
    return answer


print(solution(10, 2))
print(solution(8, 1))
print(solution(24, 24))
