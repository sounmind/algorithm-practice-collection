/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
  nums.forEach((num) => {
    if (num === 0) {
      nums.push(...nums.splice(nums.indexOf(0), 1));
    }
  });
};

// tests

const a = [0, 1, 0, 3, 12];
const b = [0];

moveZeroes(a);
moveZeroes(b);

console.log(a); // [1, 3, 12, 0, 0]
console.log(b); // [0]
