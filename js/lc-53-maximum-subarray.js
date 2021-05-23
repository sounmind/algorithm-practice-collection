/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
  if (nums.length === 0) {
    return 0;
  }

  if (nums.length === 1) {
    return nums[0];
  }

  let continuosOrStartValue = nums[0];
  let maximum = nums[0];

  for (let i = 1; i < nums.length; i++) {
    continuosOrStartValue = Math.max(nums[i], continuosOrStartValue + nums[i]);
    maximum = Math.max(maximum, continuosOrStartValue);
  }

  return maximum;
};

console.log(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])); // 6
console.log(maxSubArray([1])); // 1
console.log(maxSubArray([5, 4, -1, 7, 8])); // 23
