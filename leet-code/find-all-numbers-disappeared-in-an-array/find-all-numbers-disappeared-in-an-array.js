/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
  const result = [];
  const counter = Array(nums.length + 1).fill(0);

  nums.forEach((num) => {
    counter[num] += 1;
  });

  counter.forEach((num, index) => {
    if (index !== 0 && num === 0) {
      result.push(index);
    }
  })

  return result;
};