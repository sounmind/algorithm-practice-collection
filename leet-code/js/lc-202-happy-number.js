/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
  const appearance = {};

  while (true) {
    appearance[n] = true;

    const arrayedStringN = Array.from(n.toString());
    let sum = 0;

    arrayedStringN.forEach((value) => {
      sum += Math.pow(parseInt(value), 2);
    });

    if (sum === 1) {
      return true;
    }

    n = sum;

    if (appearance[n]) {
      return false;
    }
  }
};

console.log(isHappy(19) === true);
console.log(isHappy(2) === false);
