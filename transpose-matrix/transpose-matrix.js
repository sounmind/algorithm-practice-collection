/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
function transpose(matrix) {
  const transposed = makeTransposeForm(matrix);

  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[0].length; j++) {
      transposed[j][i] = matrix[i][j];
    }
  }

  return transposed;
}

function makeTransposeForm(array) {
  const rows = array.length;
  const cols = array[0].length;

  return Array(cols)
    .fill(0)
    .map(() => Array(rows).fill(0));
}