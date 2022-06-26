/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function (rowIndex) {
  const row = [];

  while (row.length < rowIndex + 1) {
    const previousRow = [...row];

    for (let i = 1; i < row.length; i++) {
      row[i] = previousRow[i] + previousRow[i - 1];
    }

    row[row.length] = 1;
  }

  return row;
};
