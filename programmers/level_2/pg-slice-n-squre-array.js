function solution(n, left, right) {
  const answer = [];

  // n*n 배열에서 0 ~ k번째 index의 이차원 index는 k를 n으로 나눈 몫과 나머지이다.
  for (let i = left; i <= right; i++) {
    const number = Math.max(Math.floor(i / n), i % n) + 1;

    answer.push(number);
  }

  return answer;
}

console.log(solution(3, 2, 5)); // [3, 2, 2, 3]
console.log(solution(4, 7, 14)); // [4, 3, 3, 3, 4, 4, 4, 4]
console.log(solution(1, 0, 0)); // [1]
