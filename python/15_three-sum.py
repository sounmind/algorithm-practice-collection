def threeSum(nums):
    # 투 포인터로 합 계산
    results = []
    nums.sort()
    totalNumbers = len(nums)
    for i in range(totalNumbers - 2):
        # 중복 값 건너 뛰기
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        # i+1의 왼쪽 값과 오른쪽 끝 값의 범위를 좁혀가며 합 계산
        left = i + 1
        right = totalNumbers - 1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            if sum < 0:
                left += 1  # (정렬 했으므로) 더 큰 값으로 이동
            elif sum > 0:
                right -= 1  # 더 작은 값으로 이동
            else:  # 정답인 경우
                results.append((nums[i], nums[left], nums[right]))
                # 중복 값 건너뛰기
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                # 정답 이후 포인터 이동시켜 범위 좁히기
                left += 1
                right -= 1
    return results


print(threeSum([-1, 0, 1, 2, -1, -4]))  # [[-1,-1,2],[-1,0,1]]
