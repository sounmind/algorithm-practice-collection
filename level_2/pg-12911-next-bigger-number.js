function solution(n) {
  let result = n;
  let originOneLength = n
    .toString(2)
    .split("")
    .filter((c) => c === "1").length;

  while (true) {
    result += 1;
    const resultOneLength = result
      .toString(2)
      .split("")
      .filter((c) => c === "1").length;
    if (originOneLength === resultOneLength) {
      return result;
    }
  }
}

console.log(solution(78) === 83);
console.log(solution(15) === 23);
