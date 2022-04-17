/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function (n) {
  if (n === 0) {
    return false;
  }

  while (n !== 1) {
    if (n % 3 === 0) {
      n /= 3;
    } else {
      return false;
    }
  }

  return true;
};

// tests
console.log(isPowerOfThree(27) === true);
console.log(isPowerOfThree(0) === false);
console.log(isPowerOfThree(9) === true);
console.log(isPowerOfThree(45) === false);
