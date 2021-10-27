function solution(numbers) {
  const MAX_NUM = 9;
  const MIN_NUM = 1;

  let answer = 0;

  for (let i = MIN_NUM; i <= MAX_NUM; i++) {
    answer += i;
  }

  for (let i = 0; i < numbers.length; i++) {
    answer -= numbers[i];
  }

  return answer;
}

console.log(solution([1, 2, 3, 4, 6, 7, 8, 0]) === 14);
console.log(solution([5, 8, 4, 0, 6, 7, 9]) === 6);
