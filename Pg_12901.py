# https://programmers.co.kr/learn/courses/30/lessons/12901
def solution(month, date):
    day = ''
    days = ["THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"]
    days_in_month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    for i in range(1, month):
        date += days_in_month[i]

    day = days[date%7] 

    return day

print(solution(5, 24))