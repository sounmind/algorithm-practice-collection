# 튜플
def solution(s):
    answer = []
    given_list_without_braket = list(map(lambda x: x.split(","), s[2:-2].split("},{")))
    number_count_dict = dict()
    for element in given_list_without_braket:
        for number in element:
            if number in number_count_dict:
                number_count_dict[number] = number_count_dict[number] + 1
            else:
                number_count_dict[number] = 1

    for item in sorted(
        list(number_count_dict.items()), key=lambda x: x[1], reverse=True
    ):
        answer.append(int(item[0]))
    return answer


print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
print(solution("{{20,111},{111}}"))
print(solution("{{123}}"))
print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))
