/**
 * @param {string} columnTitle
 * @return {number}
 */

const chars = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
const charNum = {};

chars.forEach((char, index) => {
  charNum[char] = index;
});

var titleToNumber = function (columnTitle) {
  let number = 0;
  let currentPosition = 1;

  for (let i = columnTitle.length - 1; i >= 0; i--) {
    number += currentPosition * charNum[columnTitle[i]];
    currentPosition *= 26;
  }

  return number;
};

console.log(titleToNumber("A") === 1);
console.log(titleToNumber("AB") === 28);
console.log(titleToNumber("ZY") === 701);
console.log(titleToNumber("FXSHRXW") === 2147483647);
