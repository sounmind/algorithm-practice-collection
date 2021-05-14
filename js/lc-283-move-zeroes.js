/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
  let indexForNonZero = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== 0) {
      nums[indexForNonZero] = nums[i];
      indexForNonZero += 1;
    }
  }

  const zeroesLength = nums.length - indexForNonZero;
  let indexForZero = indexForNonZero;

  for (let i = 0; i < zeroesLength; i++) {
    nums[indexForZero] = 0;
    indexForZero += 1;
  }
};

// tests

const a = [0, 1, 0, 3, 12];
const b = [0];

moveZeroes(a);
moveZeroes(b);

console.log(a); // [1, 3, 12, 0, 0]
console.log(b); // [0]
