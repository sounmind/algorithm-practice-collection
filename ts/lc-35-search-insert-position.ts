function searchInsert(nums: number[], target: number): number {
  for (let i = 0; i < nums.length; i++) {
    const currentNumber = nums[i];

    if (target <= currentNumber) {
      return i;
    }
  }

  return nums.length;
}
