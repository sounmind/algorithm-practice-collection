function solution(n) {
  // n을 계속해서 2로 나눈다.
  // 나눈 값이 홀수이면 나눈 몫을 - 1하여 짝수로 만들고 배터리 사용량 1을 더한다.
  // 나눈 값이 짝수이면 계속해서 2로 나눈다.

  let batteryUsage = 0;

  while (n !== 0) {
    if (n % 2 === 0) {
      n /= 2;
    } else {
      n -= 1;
      batteryUsage++;
    }
  }

  return batteryUsage;
}

console.log(solution(5) === 2);
console.log(solution(6) === 2);
console.log(solution(5000) === 5);
