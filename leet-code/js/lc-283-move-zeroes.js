/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
  const nonZeroes = nums.filter((num) => num !== 0);
  const zeros = Array(nums.length - nonZeroes.length).fill(0);

  nums.splice(0, nums.length, ...nonZeroes, ...zeros);
};

// tests

const a = [0, 1, 0, 3, 12];
const b = [0];

moveZeroes(a);
moveZeroes(b);

console.log(a); // [1, 3, 12, 0, 0]
console.log(b); // [0]
