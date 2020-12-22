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

print(solution(5, 24))