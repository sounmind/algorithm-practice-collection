def solution(phone_book):
    total = len(phone_book)
    for i in range(total):
        the_number = phone_book[i]
        for j in range(total):
            if j == i:
                continue
            try:
                if the_number in phone_book[j][:len(the_number)]:
                    return False
            except:
                continue
    return True


# print(solution(	["119", "97674223", "1195524421"]))
# print(solution(	["123", "456", "789"]))
# print(solution(	["12", "123", "1235", "567", "88"])) 