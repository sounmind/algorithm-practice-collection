import re
from collections import Counter


def solution(s):
    numbers_sorted_by_frequency = Counter(re.findall("\d+", s)).most_common()
    return [int(key) for key, value in numbers_sorted_by_frequency]


print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
print(solution("{{20,111},{111}}"))
print(solution("{{123}}"))
print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))