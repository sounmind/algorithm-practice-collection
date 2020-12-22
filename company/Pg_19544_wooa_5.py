def solution(penter, pexit, pescape, data):
    answer = ""
    length = len(penter)
    data_len = len(data)
    result = []
    for i in range(0, data_len, length):
        result.append(data[i : i + length])
    print(result)
    temp = []
    for i in result:
        if i == penter or i == pexit or i == pescape:
            temp.append(pescape)
            temp.append(i)
        else:
            temp.append(i)

    return penter + "".join(temp) + pexit


print(solution("1100", "0010", "1001", "1101100100101111001111000000"))
print(solution("10", "11", "00", "00011011"))
