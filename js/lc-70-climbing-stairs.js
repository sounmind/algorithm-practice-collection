/**
 * @param {number} n
 * @return {number}
 */

var climbStairs = function (n) {
  const memo = [0, 1, 2];

  if (n < 3) {
    return memo[n];
  }

  for (let i = 3; i <= n; i++) {
    memo[i] = memo[i - 1] + memo[i - 2];
  }

  return memo[n];
};

console.log(climbStairs(2));
console.log(climbStairs(3));
console.log(climbStairs(35));
