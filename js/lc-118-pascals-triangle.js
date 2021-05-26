/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
  if (numRows === 1) {
    return [[1]];
  }

  if (numRows === 2) {
    return [[1], [1, 1]];
  }

  const result = [[1], [1, 1]];

  for (let i = 3; i <= numRows; i++) {
    const row = Array.from(Array(i), (value, index) => {
      if (index === 0 || index === i - 1) {
        return 1;
      } else {
        const previousRow = result[i - 2];
        return previousRow[index - 1] + previousRow[index];
      }
    });

    result.push(row);
  }

  return result;
};

console.log(generate(5));
console.log(generate(1));
