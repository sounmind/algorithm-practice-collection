def solution(new_id):
    new_id = new_id.lower()
    new_id = validateAllLetters(new_id)
    new_id = removeDubleDot(new_id)
    new_id = removeDotOfFrontAndRear(new_id)
    new_id = handleEmptyId(new_id)
    new_id = handleLongId(new_id)
    new_id = handleShortId(new_id)
    return new_id


def validateAllLetters(id):
    new_id = ""
    for letter in id:
        if letter.isalpha() or letter.isdigit() or letter in ["-", "_", "."]:
            new_id += letter
    return new_id


def removeDubleDot(id):
    while ".." in id:
        id = id.replace("..", ".")
    return id


def removeDotOfFrontAndRear(id):
    if id == ".":
        return ""
    if id[0] == ".":
        id = id[1:]
    if id[-1] == ".":
        id = id[:-1]
    return id


def handleEmptyId(id):
    if id == "":
        return "a"
    return id


def handleLongId(id):
    if len(id) >= 16:
        id = id[:15]
        if id[-1] == ".":
            id = id[:-1]
    return id


def handleShortId(id):
    if len(id) <= 2:
        lastLetter = id[-1]
        while len(id) < 3:
            id += lastLetter
    return id


print(solution("...!@BaT#*..y.abcdefghijklm") == "bat.y.abcdefghi")
print(solution("z-+.^.") == "z--")
print(solution("=.=") == "aaa")
print(solution("123_.def") == "123_.def")
print(solution("abcdefghijklmn.p") == "abcdefghijklmn")
