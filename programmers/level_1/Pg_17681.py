def solution(n, arr1, arr2): # 전체 지도는 두 장의 지도의 배열을 OR 연산 한 것이다.
    answer = []
    one_row = "" # 정답 배열에 들어갈 한 행의 문자열

    for i, j in zip(arr1, arr2):
        row_bin = format(i|j, 'b') # OR 연산하여 이진수 형태의 문자열로 바꾼다.
        len_bin = len(row_bin)
        if len_bin < n: # 이진수 높은(왼쪽) 자리 수가 0일 경우 문자열 길이가 달라지면,
            row_bin = " " * (n - len_bin) + row_bin # 줄어든 만큼 공백을 추가해준다.
        for i in range(n): # 0을 공백으로, 1을 #으로 바꿔주고
            if row_bin[i] == "1":
                one_row += "#"
            else:
                one_row += " "
        answer.append(one_row) # 만든 문자열을 정답 배열에 추가한다.
        one_row = "" # 문자열을 초기화시켜준다. 이후 다시 마지막 행까지 반복한다

    return answer


print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))
print(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]))