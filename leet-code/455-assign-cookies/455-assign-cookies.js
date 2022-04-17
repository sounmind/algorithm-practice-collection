/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function (g, s) {
  const children = [...g].sort((a, b) => a - b);
  const cookies = [...s].sort((a, b) => a - b);
  let indexToEat = 0;

  for (let i = 0; i < cookies.length; i++) {
    const cookie = cookies[i];

    if (cookie >= children[indexToEat]) {
      indexToEat += 1;
    }
  }

  return indexToEat;
};
