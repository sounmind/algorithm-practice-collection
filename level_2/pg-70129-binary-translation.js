function solution(s) {
  let count = 0;
  let zeroDissapeared = 0;

  while (s !== "1") {
    const originLength = s.length;
    let oneCount = 0;

    s = s
      .split("")
      .filter((c) => {
        if (c !== "0") {
          oneCount += 1;
          return true;
        }
      })
      .length.toString(2);

    zeroDissapeared += originLength - oneCount;

    count += 1;
  }

  return [count, zeroDissapeared];
}

console.log(solution("110010101001")); // [3, 8]
console.log(solution("01110")); // [3, 3]
console.log(solution("1111111")); // [4, 1]
