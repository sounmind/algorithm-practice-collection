# https://programmers.co.kr/learn/courses/30/lessons/42840?language=python3

def solution(answers):
    result = []
    one_ans = [1, 2, 3, 4, 5]
    two_ans = [2, 1, 2, 3, 2, 4, 2, 5]
    thr_ans = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    one_cnt = 0
    two_cnt = 0
    thr_cnt = 0

    for i in range(len(answers)):
        if answers[i] == one_ans[i%5]:
            one_cnt += 1
        if answers[i] == two_ans[i%8]:
            two_cnt += 1
        if answers[i] == thr_ans[i%10]:
            thr_cnt += 1

    people_answer_cnt = [one_cnt, two_cnt, thr_cnt]
    max_value = max(people_answer_cnt)

    for i in range(3):
        if people_answer_cnt[i] == max_value:
            result.append(i+1)
    return result


print(solution([1,2,3,4,5]))
print("-----")
print(solution([1,3,2,4,2]))