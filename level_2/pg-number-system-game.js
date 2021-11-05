function solution(n, totalNumbersWillBePrepared, totalPeople, myOrder) {
  let answer = "";
  let naturalNumber = 0;
  let convertedNaturalNumber = ["0"];
  let convertedNaturalNumberIndex = 0;
  let currentOrder = 1;

  if (totalPeople === myOrder) {
    myOrder = 0;
  }

  while (true) {
    const myTurn = currentOrder % totalPeople === myOrder;

    if (myTurn) {
      answer += convertedNaturalNumber[convertedNaturalNumberIndex];
    }

    if (answer.length === totalNumbersWillBePrepared) {
      return answer.toUpperCase();
    }

    currentOrder++;
    convertedNaturalNumberIndex++;

    if (convertedNaturalNumber.length === convertedNaturalNumberIndex) {
      naturalNumber++;
      convertedNaturalNumber = naturalNumber.toString(n).split("");
      convertedNaturalNumberIndex = 0;
    }
  }
}

/**
 * 2 ≦ n ≦ 16
 * 0 ＜ totalNumbersWillBePrepared ≦ 1000
 * 2 ≦ totalPeople ≦ 100
 * 1 ≦ myOrder ≦ m
 */

console.log(solution(2, 4, 2, 1)); // "0111"
console.log(solution(16, 16, 2, 1)); // "02468ACE11111111"
console.log(solution(16, 16, 2, 2)); // "13579BDF01234567"
