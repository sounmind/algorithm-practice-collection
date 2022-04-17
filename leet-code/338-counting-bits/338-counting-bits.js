/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function (n) {
  const memo = [0, 1];

  if (n === 0) {
    return [0];
  }

  let firstNewLengthBinary = 1; // binary number like 1, 10, 100, 1000 ...

  for (let i = 1; i <= n; i++) {
    if (i === firstNewLengthBinary * 2) {
      firstNewLengthBinary *= 2;
      memo[i] = 1;
    } else {
      memo[i] = memo[firstNewLengthBinary] + memo[i - firstNewLengthBinary];
    }
  }

  return memo;
};