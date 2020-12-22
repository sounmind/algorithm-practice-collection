def solution(money, expected_list, actual_list):
    answer = -1

    # 직전 판의 승리 여부, True이면 100원, False이면 이전 판돈의 2배 배팅
    flag = True
    # 직전 판의 배팅 금액
    previous_bet = 100
    # 현재 판의 배팅 금액
    current_bet = 100

    # 승부 시작
    for expected, actual in zip(expected_list, actual_list):
        # 배팅
        if flag == True:  # 직전 판에서 이겼다면 100원 배팅
            current_bet = 100
        else:
            # 직전 판에서 졌다면 1) 이전 판 배팅 금액의 2배 배팅
            # 2) 남은 돈이 부족하다면 가지고 있는 모든 돈 배팅
            current_bet = previous_bet * 2
            if money < previous_bet * 2:
                current_bet = money

        print("판돈", current_bet, end=" ")
        # 승부 결과
        if expected == actual:  # 승리
            print("승리")
            flag = True
            money += current_bet  # 돈 얻음
        else:  # 패배
            print("패배")
            flag = False
            money -= current_bet  # 돈 잃음
        # 현재 배팅 금액이 이전 배팅 금액이 됨
        previous_bet = current_bet
        # 현재 남은 금액이 0 이하 라면 바로 게임 종료
        if money <= 0:
            print("돈이 없어 게임 종료")
            return 0

    # 남은 금액을 리턴
    return money


print(
    solution(
        1000, ["H", "T", "H", "T", "H", "T", "H"], ["T", "T", "H", "H", "T", "T", "H"]
    )
)
print(solution(1200, ["T", "T", "H", "H", "H"], ["H", "H", "T", "H", "T"]))
print(solution(1500, ["H", "H", "H", "T", "H"], ["T", "T", "T", "H", "T"]))