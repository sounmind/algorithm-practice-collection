function solution(arr1, arr2) {
  const answer = Array(arr1.length)
    .fill(0)
    .map(() => Array(arr2[0].length).fill(0));

  for (let i = 0; i < arr1.length; i++) {
    const row = arr1[i];

    for (let j = 0; j < arr2[0].length; j++) {
      const col = arr2.map((row) => row[j]);

      answer[i][j] = multiply(row, col);
    }
  }

  return answer;
}

function multiply(arr1, arr2) {
  let sum = 0;

  for (let i = 0; i < arr1.length; i++) {
    sum += arr1[i] * arr2[i];
  }

  return sum;
}
