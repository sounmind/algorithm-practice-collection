import re
from collections import Counter


def solution(s):
    dict_number_count = Counter(re.findall("\d+", s))

    sorted_item_list = list(
        sorted(dict_number_count.items(), key=lambda x: x[1], reverse=True)
    )

    answer = []
    for key, value in sorted_item_list:
        answer.append(int(key))

    return answer


print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
print(solution("{{20,111},{111}}"))
print(solution("{{123}}"))
print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))
