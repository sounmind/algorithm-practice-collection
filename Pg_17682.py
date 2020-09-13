def solution(dartResult):
    scores = []
    score = 0

    for i, c in enumerate(dartResult):
        if c.isdigit():
            if c == "1" and dartResult[i+1] == "0":
                score = 10
            elif c == "0" and dartResult[i-1] == "1":
                continue
            else:
                score = int(c)
            continue
        elif c == "S":
            scores.append(score)
            continue
        elif c == "D":
            score **= 2
            scores.append(score)
            continue
        elif c == "T":
            score **= 3
            scores.append(score)
            continue
        elif c == "*":
            if len(scores)>1:
                scores[-2] *= 2
            scores[-1] *= 2
        elif c == "#":
            scores[-1] = -scores[-1]
    print(scores)
    return sum(scores)

print(solution("1S2D*3T"))
print(solution("1D2S#10S"))
print(solution(	"1D2S0T"))
print(solution(	"1S*2T*3S"))
print(solution(	"1D#2S*3S"))
print(solution(	"1T2D3D#"))
print(solution(	"1D2S3T*"))