/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  const counter = Array(Math.max(...nums) + 1).fill(0);

  for (let i = 0; i < nums.length; i++) {
    counter[nums[i]] += 1;

    if (counter[nums[i]] > 1) {
      return true;
    }
  }

  return false;
};

console.log(containsDuplicate([3, 3]));
