/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = (x) => {
  let num = 0;

  while (true) {
    if (num * num > x) {
      return num - 1;
    }
    num += 1;
  }
};

console.log(mySqrt(4) === 2);
console.log(mySqrt(8) === 2);
