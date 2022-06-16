function climbStairs(n: number): number {
  const memo = [0, 1, 2];
  let count = 0;

  while (count++ < n) {
    if (!memo[count]) {
      memo[count] = memo[count - 1] + memo[count - 2];
    }
  }

  return memo[n];
}
