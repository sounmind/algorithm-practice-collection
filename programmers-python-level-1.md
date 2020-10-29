# 프로그래머스 | Python 3 | Level 1

---

## 1. 2016년

> 일주일은 반복된다

```python
def solution(month, date):
    # 1일이 금요일이라는 것을 이용하기 위해 요일을 넣은 배열을 목요일부터 시작하도록 했다.
    days = ["THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"]
    # 색인 1이 1월의 일 수가 되도록 월별 일수 배열을 만들었다.
    days_in_month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 
    
    # 입력된 month-1 까지의 총 일 수를 입력된 date에 더한다.
    for i in range(1, month):
        date += days_in_month[i]
    
    # 그것을 7로 나눈 나머지가 요일이다.
    return days[date%7]
```

---

## 2. 소수 찾기

```python
def solution(n):
    is_prime = [False, False] + [True] * (n-1) # 인덱스 9과 1은 소수가 아니므로 제외, 나머지는 소수 취급
    prime_list = [] # 소수를 넣을 배열
    for i in range(2, n+1): # 2부터 n까지 검사
        if is_prime[i]: # i가 소수이면
            prime_list.append(i) # 소수 배열에 추가
            for j in range(i+i, n+1, i): # i 이후의 i의 배수들을 소수에서 제외
                is_prime[j] = False
    return len(prime_list)
```

### 참고

- [에라토스테네스의 체](https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4)

---

## 3. 최대공약수와 최소공배수

```python
def solution(n, m):
    gcd = Euclidean(n, m)
    return [gcd, n*m/gcd] # 최소공배수는 두 수의 곱에 최대공약수를 나눈 것

def Euclidean(a, b):
    while b != 0: # a를 b로 나눈 r(나머지)의 값이 대입된 b가 0이 되었을 때 a가 a,b의 최대공약수
        r = a % b
        a = b # 다시, a에는 b의 값이 대입되고
        b = r # b에는 나머지의 값이 대입된다
    return a
```

### 참고

- [유클리드 호제법](https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95)

---

## 4. 콜라츠 추측

```python
def solution(num):
    count = 0
    while(num != 1): # num이 1이 될 때까지 반복
        if num % 2 == 0: # num이 짝수라면
            num /= 2 # num을 2로 나눈다.
        else: # 홀수라면
            num = num * 3 + 1 # num을 3배하고 1을 더한다
        count += 1 # 반복횟수에 1을 더한다
    return count if count <= 500 else -1 # 반복문이 끝났을 때 count가 500이하이면 count를 반환하고, 아니면 -1를 반환한다.
```

### 참고

- [if 조건문 한 줄로 쓰기](https://dejavuqa.tistory.com/291)
- [Python one liners 공식 문서](https://wiki.python.org/moin/Powerful%20Python%20One-Liners)

---

## 5. 예산

```python
def solution(costs, budget): # 작은 값부터 예산에서 빼야 최댓값이 산출된다.
    answer = 0
    costs.sort() # 신청 금액들을 정렬한 다음
    
    for cost in costs:
        budget -= cost # 작은 순서대로 예산에서 제한다.
        if budget < 0: # 예산이 0 미만이 되면 중단한다
            break
        answer += 1
    return answer
```

---

## 6. 비밀지도

```python
def solution(n, arr1, arr2): # 전체 지도는 두 장의 지도의 배열을 OR 연산 한 것이다.
    answer = []
    one_row = "" # 정답 배열에 들어갈 한 행의 문자열

    for i, j in zip(arr1, arr2):
        row_bin = format(i|j, 'b') # OR 연산하여 이진수 형태의 문자열로 바꾼다.
        len_bin = len(row_bin)
        if len_bin < n: # 이진수 높은(왼쪽) 자리 수가 0일 경우 문자열 길이가 달라지면,
            row_bin = " " * (n - len_bin) + row_bin # 줄어든 만큼 공백을 추가해준다.
        for i in range(n): # 0을 공백으로, 1을 #으로 바꿔주고
            if row_bin[i] == "1":
                one_row += "#"
            else:
                one_row += " "
        answer.append(one_row) # 만든 문자열을 정답 배열에 추가한다.
        one_row = "" # 문자열을 초기화시켜준다. 이후 다시 마지막 행까지 반복한다

    return answer
```

### 참고

- [비트 연산자](https://dojang.io/mod/page/view.php?id=2460)
- 파이썬 내장함수 [zip()](https://wikidocs.net/32#zip)

---

## 7. 다트 게임

```python
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
            if len(scores) > 1:  # 점수가 2개 이상이면,
                scores[-2] *= 2  # 현재 점수 이전 점수에 가산
            scores[-1] *= 2  # 현재 점수에 가산
        elif c == "#":
            scores[-1] = -scores[-1]
    print(scores)
    return sum(scores)  # 점수 리스트의 총합 반환
```

### 참고

- [파이썬 반복문 enumerate](https://wikidocs.net/16045)

---

## 8. 완주하지 못한 선수

```python
def solution(participant, completion):
    answer = ''
    
    # 참가자, 완주자 명단 정렬
    participant.sort()
    completion.sort()

    for part, compl in zip(participant, completion):
        if part != compl: # 같은 순서의 참가자와 완주자 명단의 이름이 서로 다르다면,
            answer += part # 그 참가자가 완주하지 않은 것이므로 정답 문자열에 추가
            break # 완주하지 않은 사람은 한 명이므로 바로 중단
    if answer == '': # 완주자 명단의 끝까지 갔음에도 참가자 명단과 서로 다른 사람이 없었다면,
        answer += participant[-1] # 참가자 명단의 가장 마지막 사람이 완주하지 않은 사람
        
    return answer
```

### 참고

- 시간초과 답변 ( count 함수의 남발 )

    ```python
    def solution(participant, completion):
        answer = ''
        for one in participant:
            if completion.count(one) != participant.count(one):
                answer += one
                break
        return answer
    ```

---

## 9. 실패율

```python
def solution(total_stages, stage_stopped):
    answer = []
    stage_fail_rate = {} # 스테이지별 실패율을 담을 딕셔너리
    stage_stopped.sort() # 각자 멈춘 스테이지 리스트 정렬

    for i in range(total_stages):
        try: # index 함수의 오류 대비하여 try except 사용
            # k 스테이지의 실패율 = k 스테이지에서 멈춘 사람 수 / k 스테이지 이상에서 멈춘 사람 수
            stage_fail_rate[i+1] = stage_stopped.count(i+1) / len(stage_stopped[stage_stopped.index(i+1):])
        except: # k 스테이지에서 멈춘 사람이 없을 경우
            stage_fail_rate[i+1] = 0 # k 스테이지의 실패율은 0
    
    stage_sort_by_fail_rate = sorted(stage_fail_rate.items(), key = lambda x : x[1], reverse=True) # 딕셔너리의 value를 기준으로 내림차 순으로 정렬
    for stage_fail in stage_sort_by_fail_rate: # 스테이지-실패율을 하나씩 꺼내어
        answer.append(stage_fail[0]) # 튜플의 첫번째 요소(스테이지)를 정답 리스트에 추가

		return answer
```

### 참고

- [예외 처리](https://wikidocs.net/16060)
- [딕셔너리 정렬](https://rfriend.tistory.com/473)
- list 내장함수; [count()](https://wikidocs.net/14#count) 와 [index()](https://wikidocs.net/14#index)

---

## 10. 크레인 인형뽑기 게임

```python
def solution(board, moves): # 터트려진 인형의 개수 return
    answer = 0
    box = [] # 뽑은 인형을 넣는 바구니

    for move in moves: # move == 인형을 뽑을 열
        for row in board: # 위에서부터 인형의 위치가 표시된 행 정보
            if row[move-1] != 0: # 해당 행의 move열에 인형이 있다면
                box.append(row[move-1]) # 그 행의 인형을 바구니에 넣고
                row[move-1] = 0 # 그 인형의 위치를 0으로 초기화
                if len(box)>1 and box[-2]==box[-1]: # 바구니에 들어있는 인형의 수가 2 이상이고, 가장 최근 두 개의 인형이 같다면
                    box.pop() # 인형 두 개를 pop 하여 제거
                    box.pop()
                    answer += 2 # 정답(제거된 인형 개수)에 가산
                break
    print("box: ", end="")
    print(box)
    return answer
```

### 참고

- list 내장 함수 [pop()](https://wikidocs.net/14#pop)

---

## 11. 두 개 뽑아서 더하기

```python
def solution(numbers):
    sum_set = set([]) # 집합 초기화
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            sum_set.add(numbers[i]+numbers[j]) # 차례대로 집합에 추가하기
    return sorted(list(sum_set)) # 집합을 리스트로 바꾼 뒤 정렬한 다음 반환
```

### 참고

- [파이썬 집합 자료형](https://wikidocs.net/1015)

## 두 번째 풀이: combination 모듈 이용

```python
from itertools import combinations  # 조합 모듈 이용하기

# 바로 set()을 선언하고 진행해도 되지만
# 프로그래머스 json iteralize 오류 때문에 list 위주로 풀이했다.

def solution(numbers):
    answer = []

    # 조합 모듈 사용
    result = combinations(numbers, 2)

    for combination in result:
        answer.append(sum(combination))
    # 리스트를 집합으로 바꿔 중복을 제거 -> 다시 리스트로 바꾸어 오름차 정렬
    answer = sorted(list(set(answer)))

    return answer
```

### 오류 발생

- 오류 발생 소스 코드
- VSCode에서는 정상 작동하는데, 프로그래머스 온라인 저지에서는 오류)
- 오류이름→`TypeError: Object of type set is not JSON serializable`
    - 프로그래머스에서는 set 자체가 선언되고 출력되면 오류가 생기는 것 같다. set을 어떤 함수 안에서 사용하고 출력하지 않으면 오류가 생기지 않는다.

---

## 12. 키패드 누르기

```python
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
```

### 참고

- 파이썬 내장 함수 [abs()](https://docs.python.org/ko/3/library/functions.html#abs)

---

## 13. 체육복

```python
def solution(n, lost, spare): # n: 전체 학생, lost: 도난당한 학생목록, spare: 여벌 체육복 가져온 학생목록
    lost_total = len(lost)
    spare_total = len(spare)
    answer = n - lost_total # 정답을 전체 학생 수에서 체육복 잃어버린 사람 수를 빼서 초기화
    lost.sort()
    spare.sort()

    # 여벌-도난 모두 해당하는 학생을 배열에서 예외로 처리 -> 일반 학생 취급
    spare_and_lost = 0
    for i in range(lost_total):
        for j in range(spare_total):
            if lost[i] == spare[j]: # 여벌 학생이 동시에 도난 학생인 경우
                lost[i] = -100
                spare[j] = -100
                spare_and_lost += 1
    # 양 옆에 도난 또는 여벌 학생 있는 경우
    for i in range(lost_total):
        for j in range(spare_total):
            if i > 0 and lost[i] - lost[i-1] == 2 and spare[j] == lost[i] - 1:
                continue # 여벌 학생 양 옆에 도난 학생 있을 경우, 한 명만 줘야 하기 때문에 continue
            if abs(lost[i] - spare[j]) == 1: # 도난 학생 양 옆 중 한 명이 여벌 학생일 경우
                answer += 1 # 도난 학생이 여벌 체육복을 받았다!
                break # 다음 도난 학생으로 넘어감

    return answer + spare_and_lost # ( 일반 학생 + 여벌 체육복 받은 학생 ) + 여벌 체육복 가져오고 잃어버린 학생
```