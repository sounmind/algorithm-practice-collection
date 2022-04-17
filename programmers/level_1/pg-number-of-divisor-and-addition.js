function solution(left, right) {
  let answer = 0;

  for (let i = left; i <= right; i++) {
    if (Number.isInteger(Math.sqrt(i))) {
      answer -= i;
    } else {
      answer += i;
    }
  }

  return answer;
}

console.log(solution(1, 2) === 1);
console.log(solution(13, 13) === 13);
console.log(solution(13, 17) === 43);
console.log(solution(24, 27) === 52);
