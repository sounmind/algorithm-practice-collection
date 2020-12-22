from itertools import combinations


def solution(logs):
    answer = []
    testers = []
    problems = []
    logs.sort(key=lambda x: (x.split(" ")[0], x.split(" ")[1]))

    previous_tester = ""
    current_tester = ""

    for log in logs:
        # print(log)
        log_split = log.split(" ")
        current_tester = log_split[0]
        if current_tester not in testers:
            testers.append(current_tester)
            problems.append(dict())

    for i, problem in enumerate(problems):
        for log in logs:
            log_split = log.split(" ")
            current_tester = log_split[0]
            if i == testers.index(current_tester):
                problems[i][log_split[1]] = log_split[2]

    # 유저 - 문제 연결하기
    big_dict = dict()
    for i in range(len(problems)):
        big_dict[testers[i]] = problems[i]

    for duo in combinations(testers, 2):
        dict_1 = big_dict[duo[0]]
        dict_2 = big_dict[duo[1]]
        if len(dict_1) == len(dict_2):
            # print("길이는 같아!")
            if list(dict_1.values()) == list(dict_2.values()) and list(
                dict_2.keys()
            ) == list(dict_2.keys()):
                # print("딕셔너리가 같아!")
                if len(dict_1) < 5:
                    continue
                else:
                    answer.append(duo[0])
                    answer.append(duo[1])
    if len(answer) == 0:
        answer.append("None")
    return sorted(list(set(answer)))


print(
    solution(
        [
            "0001 3 95",
            "0001 5 90",
            "0001 5 100",
            "0002 3 95",
            "0001 7 80",
            "0001 8 80",
            "0001 10 90",
            "0002 10 90",
            "0002 7 80",
            "0002 8 80",
            "0002 5 100",
            "0003 99 90",
        ]
    )
)
print(
    solution(
        [
            "1901 1 100",
            "1901 2 100",
            "1901 4 100",
            "1901 7 100",
            "1901 8 100",
            "1902 2 100",
            "1902 1 100",
            "1902 7 100",
            "1902 4 100",
            "1902 8 100",
            "1903 8 100",
            "1903 7 100",
            "1903 4 100",
            "1903 2 100",
            "1903 1 100",
            "2001 1 100",
            "2001 2 100",
            "2001 4 100",
            "2001 7 95",
            "2001 9 100",
            "2002 1 95",
            "2002 2 100",
            "2002 4 100",
            "2002 7 100",
            "2002 9 100",
        ]
    )
)
print(solution(["1901 10 50", "1909 10 50"]))
