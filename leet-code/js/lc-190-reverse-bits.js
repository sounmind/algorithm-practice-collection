/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function (n) {
  const reversed = Array(32).fill("0");
  const bits = n.toString(2);

  for (let i = bits.length - 1, j = 0; i >= 0; i--, j++) {
    reversed[j] = bits[i];
  }

  return parseInt(reversed.join(""), 2);
};

console.log(reverseBits(43261596)); // 964176192
