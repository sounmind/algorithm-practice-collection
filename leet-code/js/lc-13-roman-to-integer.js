/**
 * @param {string} s
 * @return {number}
 */

const romanMap = {
  I: 1,
  V: 5,
  X: 10,
  L: 50,
  C: 100,
  D: 500,
  M: 1000,
};

const specialCases = {
  IV: 4,
  IX: 9,
  XL: 40,
  XC: 90,
  CD: 400,
  CM: 900,
};

var romanToInt = function (s) {
  let sum = 0;

  Object.keys(specialCases).forEach((roman) => {
    while (s.indexOf(roman) !== -1) {
      s = s.replace(roman, "");
      sum += specialCases[roman];
    }
  });

  for (let i = 0; i < s.length; i++) {
    sum += romanMap[s[i]];
  }

  return sum;
};

console.log(romanToInt("III") === 3);
console.log(romanToInt("IV") === 4);
console.log(romanToInt("IX") === 9);
console.log(romanToInt("LVIII") === 58);
console.log(romanToInt("MCMXCIV") === 1994);
