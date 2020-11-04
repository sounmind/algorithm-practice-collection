def solution(number, k):
    num_list = []  # 가장 큰 수가 모일 배열

    for (i, num) in enumerate(number):
        # num_list에 원소가 존재하고
        # num_list의 마지막 원소가 number의 해당 원소보다 작아야 하고,
        # k가 0보다 클 때 (빼야 할 수가 남아 있을 때)
        # num_list의 가장 마지막 값을 제거하고 k를 -1 한다.
        while num_list and num_list[-1] < num and k > 0:
            num_list.pop()
            k -= 1
        # k=0, 빼야 할 수가 없을 때 나머지 숫자를 num_list에 추가한다.
        if k == 0:
            num_list += number[i:]
            break
        # 모든 조건이 아니라면, number의 현재 원소를 num_list에 추가한다.
        num_list.append(num)

    # 반복문 바깥에서 k가 0보다 크다면(빼야 할 숫자가 남았다면) 뒤에서 k개 원소를 남기고 자른다.
    num_list = num_list[:-k] if k > 0 else num_list
    answer = "".join(num_list)
    return answer


print(solution("553", 2))
print(solution("553", 1))
print(solution("1924", 2))
print(solution("1231234", 3))
print(solution("4177252841", 4))
print(solution("9999999999", 5))
print(solution("9991119991", 5))
print(solution("1000000000", 9))

# 참고: https://gurumee92.tistory.com/162