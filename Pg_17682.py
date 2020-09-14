def solution(dartResult):
    scores = []
    score = 0

    for i, c in enumerate(dartResult):
        # 점수
        if c.isdigit(): # darResult의 문자가 숫자라면,
             # 그 문자가 10의 일부라면, 10은 두 자리를 차지하기 때문에 따로 처리
            if c == "1" and dartResult[i+1] == "0": # 현재 문자가 1이고 다음 문자가 0이면, score에 10점 대입
                score = 10
            elif c == "0" and dartResult[i-1] == "1": # 현재 문자가 0이고 이전 문자가 1이면, 이미 이전에 점수로 10을 대입했기 때문에 그냥 넘어감
                continue # 다음 문자 검사
            else: # 다트 하나의 점수가 한 자리 숫자일 경우
                score = int(c) # int로 변환해 score에 대입
            continue # 다음 문자 검사
        # 보너스
        elif c == "S": # 문자에 따라 점수에 가산
            scores.append(score) # 점수를 점수 리스트에 추가
            continue
        elif c == "D":
            score **= 2
            scores.append(score)
            continue
        elif c == "T":
            score **= 3
            scores.append(score)
            continue
        # 옵션
        elif c == "*":
            if len(scores)>1:  # 점수가 2개 이상이면,
                scores[-2] *= 2  # 현재 점수 이전 점수에 가산
            scores[-1] *= 2  # 현재 점수에 가산
        elif c == "#":
            scores[-1] = -scores[-1]
    print(scores)
    return sum(scores)  # 점수 리스트의 총합 반환


print(solution("1S2D*3T"))
print(solution("1D2S#10S"))
print(solution(	"1D2S0T"))
print(solution(	"1S*2T*3S"))
print(solution(	"1D#2S*3S"))
print(solution(	"1T2D3D#"))
print(solution(	"1D2S3T*"))