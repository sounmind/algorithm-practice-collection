/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
  const numsLength = nums.length;

  let sum = (numsLength * (numsLength + 1)) / 2;

  nums.forEach((num) => {
    sum -= num;
  });

  return sum;
};

console.log(missingNumber([3, 0, 1]) === 2);
console.log(missingNumber([0, 1]) === 2);
console.log(missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]) === 8);
