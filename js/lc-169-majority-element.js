/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
  const result = {};

  nums.forEach((num) => {
    if (result[num]) {
      result[num] += 1;
    } else {
      result[num] = 1;
    }
  });

  const values = Object.values(result);
  const keys = Object.keys(result);

  return parseInt(keys.find((key) => result[key] === Math.max(...values)));
};

console.log(majorityElement([3, 2, 3]));
