class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_map = {}
        # 딕셔너리에 키(숫자)와 값(순서)으로 저장
        for i, num in enumerate(nums):
            nums_map[num] = 1
        for i, num in enumerate(nums):
            if target - num in nums_map and i != nums_map[target - num]:
                return nums.index(num), nums_map[target - num]
