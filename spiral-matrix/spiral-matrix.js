/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
function spiralOrder(matrix) {
  const copied = copy(matrix);
  const result = [];
  const length = matrix.length * matrix[0].length;
  const direction = [
    [0, 1],
    [1, 0],
    [0, -1],
    [-1, 0],
  ];
  let directionIndex = 0;
  let [nextXMove, nextYMove] = direction[directionIndex % 4];
  let [x, y] = [0, 0];

  while (result.length < length) {
    result.push(matrix[x][y]);
    matrix[x][y] = undefined;

    if (
      matrix[x + nextXMove] === undefined ||
      matrix[x + nextXMove][y + nextYMove] === undefined
    ) {
      [nextXMove, nextYMove] = direction[++directionIndex % 4];
    }

    x += nextXMove;
    y += nextYMove;
  }

  return result;
}

function copy(twoDimensionArray) {
  return twoDimensionArray.map((row) => [...row]);
}