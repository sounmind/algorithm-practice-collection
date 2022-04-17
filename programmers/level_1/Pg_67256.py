def solution(numbers, hand):
    answer = ''
    key_index = [[3, 1]] # 키패드를 2차원 배열로 봤을 때 인덱스값(x,y)이 좌측 상단부터 우측 하단까지 순서대로 들어가도록 만든 리스트, 0번째는 숫자 0의 인덱스 값으로 초기화했다.

    # 키패드 숫자별 인덱스 리스트 삽입 ( 1에서 9까지 )
    for i in range(3):
        for j in range(3):
            key_index.append([i, j])
    
    # 왼손가락 오른손가락 위치 초기화
    left_pos = [3, 0] # '*'의 인덱스
    right_pos = [3, 2] # '#'의 인덱스

    for n in numbers:
        # 두 손가락 간 거리 비교
        left_dis = abs(left_pos[0] - key_index[n][0]) + abs(left_pos[1] - key_index[n][1])
        right_dis = abs(right_pos[0] - key_index[n][0]) + abs(right_pos[1] - key_index[n][1])
        if n in [3, 6, 9]:
            right_pos = key_index[n]
            answer += "R"
        elif n in [1, 4, 7]:
            left_pos = key_index[n]
            answer += "L"
        else: # 번호가 2, 5, 8, 0
            if left_dis < right_dis:
                left_pos = key_index[n]
                answer += "L"               
            elif left_dis > right_dis:
                right_pos = key_index[n]
                answer += "R"
            else: # 두 손가락 간 거리가 같을 때
                if hand == "right":
                    right_pos = key_index[n]
                    answer += "R"
                else:
                    left_pos = key_index[n]
                    answer += "L"
    return answer

print(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right"))
print(solution( [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left"))
print(solution(	[1, 2, 3, 4, 5, 6, 7, 8, 9, 0], "right"))


"""
# 문제를 잘못 이해했다...바보 바보 바보!
def solution(numbers, hand):
    answer = ''
    key_index = [[3, 1]] # 키패드를 2차원 배열로 봤을 때 인덱스값(x,y)이 좌측 상단부터 우측 하단까지 순서대로 들어가도록 만든 리스트, 0번째는 숫자 0의 인덱스 값으로 초기화했다.
    left_index = [3, 0]
    right_index = [3, 2] 

    # 키패드 숫자별 인덱스 리스트 삽입
    for i in range(3):
        for j in range(3):
            key_index.append([i, j])
    
    # 왼손가락 오른손가락 위치 초기화
    left_pos = left_index
    right_pos = right_index

    print(key_index)

    for n in numbers:
        print(f"n={n} | ", end="")
        # 두 손가락 간 거리 비교
        left_dis = abs(left_pos[0] - key_index[n][0]) + abs(left_pos[1] - key_index[n][1])
        right_dis = abs(right_pos[0] - key_index[n][0]) + abs(right_pos[1] - key_index[n][1])
        print(f"left dis: {left_dis}, right dis: {right_dis} ", end="")
        if left_dis > right_dis: # 오른손이 더 가깝다
            right_pos = key_index[n]
            answer += "R"
        elif left_dis < right_dis: # 왼손이 더 가깝다
            left_pos = key_index[n]
            answer += "L"
        else: # 거리가 같을 때, 
            if hand == "right":
                right_pos = key_index[n]
                answer += "R"
            else: # 왼손잡이
                left_pos = key_index[n]
                answer += "L"
        print(f"-> left pos: {left_pos}, right pos: {right_pos}")
    return answer
"""