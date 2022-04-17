function solution(n) {
  return getFibonacciNumber(n) % BigInt(1234567);
}

const fibonacciNumbers = [0, 1, 1];

function getFibonacciNumber(number) {
  let currentNumber = 2;

  while (currentNumber++ !== number && number > 2) {
    fibonacciNumbers[currentNumber] =
      BigInt(fibonacciNumbers[currentNumber - 1]) +
      BigInt(fibonacciNumbers[currentNumber - 2]);
  }

  return BigInt(fibonacciNumbers[number]);
}

console.log(solution(1));
console.log(solution(2));
console.log(solution(3));
console.log(solution(5));
console.log(solution(10));
console.log(solution(100));
console.log(solution(1000));
