def solution(n, arr1, arr2):
    answer = []
    one_row = ""

    for i, j in zip(arr1, arr2):
        row_bin = format(i|j, 'b')
        len_bin = len(row_bin)
        if len_bin < n:
            row_bin = " " * (n - len_bin) + row_bin
            len_bin = len(row_bin)
        for i in range(len_bin):
            if row_bin[i] == "1":
                one_row += "#"
            else:
                one_row += " "
        answer.append(one_row)
        one_row = ""

    return answer


print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))
print(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]))