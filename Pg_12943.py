def solution(num):
    return Collatz(num)

def Collatz(num):
    count = 0
    while(num != 1):
        if num%2==0:
            num /= 2
        else:
            num = num*3 + 1
        count += 1
    
    return count if count <= 500 else -1