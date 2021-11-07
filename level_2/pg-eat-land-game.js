function solution(land) {
  const landMemo = Array.from(land, (row) => [...row]);

  for (let i = 1; i < landMemo.length; i++) {
    const prevRow = landMemo[i - 1];
    const currentRow = landMemo[i];

    currentRow[0] += Math.max(prevRow[1], prevRow[2], prevRow[3]);
    currentRow[1] += Math.max(prevRow[0], prevRow[2], prevRow[3]);
    currentRow[2] += Math.max(prevRow[0], prevRow[1], prevRow[3]);
    currentRow[3] += Math.max(prevRow[0], prevRow[1], prevRow[2]);
  }

  return Math.max(...landMemo[landMemo.length - 1]);
}

console.log(
  solution([
    [1, 2, 3, 5],
    [5, 6, 7, 8],
    [4, 3, 2, 1],
  ]) === 16
);

console.log(
  solution([
    [4, 3, 2, 1], // 0 4
    [2, 2, 2, 1], // 1 2
    [6, 6, 6, 4], // 2 6
    [8, 7, 6, 5], // 0 8
  ])
); // 20
