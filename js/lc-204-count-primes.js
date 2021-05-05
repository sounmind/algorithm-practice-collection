var countPrimes = function (n) {
  n--;

  if (n === 1 || n === 0) {
    return 0;
  }

  const isPrimeNumber = Array(n + 1).fill(1);
  isPrimeNumber[0] = 0;
  isPrimeNumber[1] = 0;

  for (let i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
    if (!isPrimeNumber[i]) {
      continue;
    }

    // i가 소수일 때 i의 배수들을 모두 소수가 아닌 것으로 판단
    for (let j = 2; i * j <= n; j++) {
      isPrimeNumber[i * j] = 0;
    }
  }

  return isPrimeNumber.reduce(
    (accumulator, currentValue) => accumulator + currentValue
  );
};

console.log(countPrimes(2));
