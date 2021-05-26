/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function (nums, target) {
  let result = nums[0] + nums[1] + nums[2];
  let minSub = Math.abs(result - target);

  for (let i = 0; i < nums.length - 2; i++) {
    for (let j = i + 1; j < nums.length - 1; j++) {
      for (let k = j + 1; k < nums.length; k++) {
        const sum = nums[i] + nums[j] + nums[k];
        const newSub = Math.abs(sum - target);

        if (newSub < minSub) {
          minSub = newSub;
          result = sum;
        }
      }
    }
  }

  return result;
};

console.log(threeSumClosest([-1, 2, 1, -4], 1));
