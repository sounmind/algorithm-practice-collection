/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < 0) {
    return false;
  }

  x = Array.from(x.toString());

  while (x.length > 1) {
    if (x.shift() !== x.pop()) {
      return false;
    }
  }

  return true;
};

console.log(isPalindrome(121) === true);
console.log(isPalindrome(-121) === false);
console.log(isPalindrome(10) === false);
console.log(isPalindrome(-101) === false);
