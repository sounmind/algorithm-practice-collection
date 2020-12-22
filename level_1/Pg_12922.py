# https://programmers.co.kr/learn/courses/30/lessons/12922
def solution(n):
    answer = ''
    count = 0
    flag = 0
    while(count != n):
        if(flag==0):
            answer += "수"
            flag = 1
        else:
            answer += "박"
            flag = 0
        count += 1

    return answer


print(solution(1))
print(solution(2))
print(solution(3))
print(solution(4))


# 한글 입출력 오류 발생: https://m.blog.naver.com/PostView.nhn?blogId=yms9713&logNo=221450354130&proxyReferer=https:%2F%2Fwww.google.com%2F
# 터미널 오류 발생: https://somjang.tistory.com/entry/Windows-Visual-Studio-Code-%EC%9D%B4-%EC%8B%9C%EC%8A%A4%ED%85%9C%EC%97%90%EC%84%9C-%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8%EB%A5%BC-%EC%8B%A4%ED%96%89%ED%95%A0-%EC%88%98-%EC%97%86%EC%9C%BC%EB%AF%80%EB%A1%9C-%ED%95%B4%EA%B2%B0%EB%B0%A9%EB%B2%95
# 오류 계속 발생: https://sun-kakao.tistory.com/92,  settings.json에서 파이썬 경로 재설정 (miniconda~어쩌구로 되어있었음)