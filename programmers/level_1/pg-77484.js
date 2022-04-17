function solution(lottos, win_nums) {
  const rankPerMatches = [6, 6, 5, 4, 3, 2, 1];

  const unknownNumberCount = lottos.filter((number) => number === 0).length;
  const matchCount = lottos.filter((number) => {
    if (win_nums.includes(number)) {
      return true;
    }
  }).length;

  const minimumRank = rankPerMatches[matchCount];
  const maximumRank = rankPerMatches[matchCount + unknownNumberCount];

  return [maximumRank, minimumRank];
}

console.log(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])); // [3, 5]
console.log(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25])); // [1, 6]
console.log(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35])); // [1, 1]
