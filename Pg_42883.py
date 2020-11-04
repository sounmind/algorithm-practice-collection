from itertools import combinations


def solution(number, k):
    answer = ""
    number_list = list(map(int, list(number)))
    answer_len = len(number) - k

    # 첫 값
    try:
        max_num = max(number_list[: -k + 1])
    except:
        max_num = max(number_list)
    answer += str(max_num)
    max_index = -1

    # 두번째 이후 값
    for i in range(answer_len - 1):
        max_index = number_list.index(max_num, max_index + 1)
        try:
            max_num = max(number_list[max_index + 1 : -answer_len + 2 + i])
        except:
            max_num = max(number_list[max_index + 1 :])
        print("max_index", max_index)
        answer += str(max_num)

    return answer


# 테스트 1, 10, 11실패

print(solution("553", 2))
print(solution("553", 1))
print(solution("1924", 2))
print(solution("1231234", 3))
print(solution("4177252841", 4))
print(solution("9999999999", 5))
print(solution("9991119991", 5))

print([1, 2, 3, 4][1:0])
