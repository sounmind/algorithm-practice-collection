# 124 나라의 숫자
def solution(n):
    # 1, 2, 3만 있는 3진법으로 표현한다고 보면 쉽다.
    # 자연수 3일 때 10이 아니라 '4'라는 '한'자리로 표현한다.
    # n이 3의 배수일 때 예외처리를 해줘야 한다.
    answer = ""
    while n > 3:
        quotient = n // 3
        remainer = n % 3
        if remainer == 0:  # 3으로 나누어 떨어질 때
            answer = str(3) + answer  # 3을 추가하고
            n = n // 3 - 1  # n을 3으로 나눈 몫에 1 뺀 것으로 교체한다.
            # 124 나라에서는 n이 3의 배수일 때 3진법에서 0대신 4가 들어가고 자리 추가가 되지 않는다.
            # 따라서 높은 자리로 추가되는 1을 상쇄하기 위하여 n // 3 - 1 을 한다.
        else:
            answer = str(n % 3) + answer
            n = n // 3
    # 3 이하일 때는 그대로 추가한다.
    answer = str(n) + answer
    # 3을 4로 바꾼다
    answer = answer.replace("3", "4")
    return answer


# test
for i in range(1, 100):
    print(i, "is", solution(i))