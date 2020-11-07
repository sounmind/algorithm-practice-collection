def solution(grades, weights, threshold):
    grade_weights = [10, 9, 8, 7, 6, 5, 4, 3, 0]
    grade_collection = ["A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"]

    # 점수의 합
    sum = 0
    for grade, weight in zip(grades, weights):
        # 성적 가중치
        grade_weight = grade_weights[grade_collection.index(grade)]
        sum += weight * grade_weight

    return sum - threshold


print(solution(["A+", "D+", "F", "C0"], [2, 5, 10, 3], 50))
print(solution(["B+", "A0", "C+"], [6, 7, 8], 200))