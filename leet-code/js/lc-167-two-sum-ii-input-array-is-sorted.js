/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
  const match = {};

  for (let i = 0; i < numbers.length; i++) {
    const substraction = target - numbers[i];

    if (match[numbers[i]]) {
      return [numbers.indexOf(substraction) + 1, i + 1];
    } else {
      match[substraction] = true;
    }
  }
};

console.log(twoSum([2, 3, 4], 6)); // [1,3]
console.log(twoSum([2, 7, 11, 15], 9)); // [1,2]
console.log(twoSum([-1, 0], -1)); // [1,2]
