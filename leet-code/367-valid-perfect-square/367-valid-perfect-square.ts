function isPerfectSquare(num: number): boolean {
  let [left, right] = [0, num];

  while (left <= right) {
    const middle = Math.floor((left + right) / 2);
    const square = middle * middle;

    if (square === num) {
      return true;
    }

    if (square < num) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
  }

  return false;
}