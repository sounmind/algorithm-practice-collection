/**
 * @param {number[]} nums
 * @return {number}
 */

var getContinuosOrStartValue = (nums, index) => {
  if (index === 0) {
    return nums[0];
  }

  return Math.max(
    getContinuosOrStartValue(nums, index - 1) + nums[index],
    nums[index]
  );
};

var getMaxByIndex = (nums, index) => {
  if (index === 0) {
    return nums[0];
  }

  return Math.max(
    getMaxByIndex(nums, index - 1),
    getContinuosOrStartValue(nums, index)
  );
};

var maxSubArray = (nums) => {
  if (nums.length === 0) {
    return 0;
  }

  if (nums.length === 1) {
    return nums[0];
  }

  return getMaxByIndex(nums, nums.length - 1);
};

console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])); // 6
console.log(maxSubArray([1])); // 1
console.log(maxSubArray([5, 4, -1, 7, 8])); // 23
