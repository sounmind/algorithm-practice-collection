# 개미수열
def countAndSay(n):
    # 해당 숫자의 개수를 앞에, 숫자를 뒤에
    if n == 1:
        return "1"
    previous = countAndSay(n - 1)
    count = 1
    digit = str(previous[0])  # 이전 문자열의 첫번째 숫자
    returnString = ""

    for i in range(1, len(previous)):
        if previous[i] == previous[i - 1]:  # 같으면 count 추가
            count += 1
        else:  # 다르면 count개의 digit
            returnString += str(count) + digit
            count = 1 # count 초기화
            digit = str(previous[i])
    return returnString + str(count) + digit


print(countAndSay(2))
print(countAndSay(3))