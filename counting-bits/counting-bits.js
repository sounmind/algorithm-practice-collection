/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
  const result = [];

  for (let i = 0; i <= n; i++) {
    result.push(convertNumberToBinary(i).filter((num) => num === 1).length);
  }

  return result;
};

function convertNumberToBinary(n) {
  const result = [];
  let quotient = n;
  let remainder;

  do {
    remainder = quotient % 2;
    quotient = parseInt(quotient / 2);

    result.push(remainder);
  } while (quotient);

  return result;
}