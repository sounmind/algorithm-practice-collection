/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function (nums, target) {
  let closest = Infinity;

  nums.sort((a, b) => a - b);

  for (let i = 0; i < nums.length - 2; i++) {
    let [left, right] = [i + 1, nums.length - 1];

    while (left < right) {
      const sum = nums[i] + nums[left] + nums[right];

      if (Math.abs(sum - target) < Math.abs(closest - target)) {
        closest = sum;
      }

      if (sum > target) {
        right -= 1;
      } else {
        left += 1;
      }
    }
  }

  return closest;
};

console.log(threeSumClosest([-1, 2, 1, -4], 1));
