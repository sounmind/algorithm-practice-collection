/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  const counts = {};

  nums.forEach((num) => {
    if (counts[num]) {
      counts[num] += 1;
    } else {
      counts[num] = 1;
    }
  });

  const singleNumberIndex = Object.values(counts).findIndex(
    (count) => count === 1
  );

  return Object.keys(counts)[singleNumberIndex];
};

console.log(singleNumber([1]));
// console.log(singleNumber([2, 2, 1]));
// console.log(singleNumber([1]));
// console.log(singleNumber([1]));
