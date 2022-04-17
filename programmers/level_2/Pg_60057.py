def solution(string):
    length_list = []
    string_length = len(string)
    if string_length == 1:
        return 1
    for compress_length in range(1, string_length // 2 + 1):
        length_list.append(
            len(compress_string_by_length(string, compress_length, string_length))
        )
    return min(length_list)


def compress_string_by_length(string, compress_length, string_length):
    compressed_string = ""
    splited_string = split_string_by_length(string, compress_length, string_length)
    duplicated_count = 1
    for i in range(len(splited_string)):
        if i < len(splited_string) - 1 and splited_string[i] == splited_string[i + 1]:
            duplicated_count += 1
        else:
            if duplicated_count == 1:
                compressed_string += splited_string[i]
            else:
                compressed_string += str(duplicated_count) + splited_string[i]
            duplicated_count = 1
    return compressed_string


def split_string_by_length(string, compress_length, string_length):
    return [
        string[i : i + compress_length]
        for i in range(0, string_length, compress_length)
    ]


print(solution("aabbaccc"))  # 7
print(solution("ababcdcdababcdcd"))  # 9
print(solution("abcabcdede"))  # 8
print(solution("abcabcabcabcdededededede"))  # 14
print(solution("xababcdcdababcdcd"))  # 17
print(solution("xababcdcdababcdcdef"))  # 19
print(solution("ab"))  # 2
print(solution("a"))  # 1