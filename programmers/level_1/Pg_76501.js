function solution(absolutes, signs) {
  let result = 0;

  absolutes.forEach((value, index) => {
    let sign = 1;

    if (!signs[index]) {
      sign = -1;
    }

    result += value * sign;
  });

  return result;
}

console.log(solution([4, 7, 12], [true, false, true])); // 9
console.log(solution([1, 2, 3], [false, false, true])); // 0
