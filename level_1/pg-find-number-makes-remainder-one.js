function solution(n) {
  for (let i = 2; i < n; i++) {
    if (n % i === 1) {
      return i;
    }
  }
}

console.log(solution(3) === 2);
console.log(solution(10) === 3);
console.log(solution(12) === 11);
