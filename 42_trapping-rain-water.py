def trap(height) -> int:
    if not height:
        return 0

    volume = 0  # 부피

    left = 0
    right = len(height) - 1

    left_max = height[left]  # 포인터가 왼쪽부터 가리키는 와중 가장 높은 높이
    right_max = height[right]

    while left < right:
        left_max = max(height[left], left_max)
        right_max = max(height[right], right_max)

        print(f"left_max: {left_max}, right_max: {right_max}")

        # 더 높은 쪽을 향해 투 포인터 이동
        if left_max <= right_max:
            volume += left_max - height[left]
            left += 1
        else:
            volume += right_max - height[right]
            right -= 1



        print(f"left:{left}, right:{right}, ", end="")
        print(f"volume={volume}")

    return volume


print(trap([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))

"""
설명

양 측에서 포인터는 거리를 좁힌다.
양 측에서 가장 큰 기둥 높이, 우측에서 가장 큰 기둥 높이보다 현재 높이가 낮을 때 그 차이만큼 총 부피(volume)를 증가시킨다.
서로가 가장 높은 기둥에서 만날 때까지 반복한다.
"""