def productExceptSelf(nums):
    # 입력: [a, b, c, d] --> 결과: [bcd, acd, abd, bcd]
    out = []
    # 왼쪽부터 한 개씩 더 붙여 1에 누적으로 곱하여 리스트에 넣기
    # --> [1, a, ab, abc]
    p = 1
    for i in range(0, len(nums)):
        out.append(p)
        p = p * nums[i]
    # 오른쪽부터 한 개씩 더 붙여 1에 누적으로 곱하여 리스트에 '곱하여' 넣기
    # --> [1 * bcd, b * cd, ab * d, abc * 1]
    p = 1
    for i in range(len(nums) - 1, 0 - 1, -1):
        out[i] = out[i] * p
        p = p * nums[i]
    return out
    # 왼쪽 곱셈 결과에 오른쪽 값을 차례대로 곱셈