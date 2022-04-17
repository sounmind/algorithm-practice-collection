function solution(n, a, b) {
  let round = 1;

  while (true) {
    if (Math.abs(a - b) === 1 && isRightCompetitor(a, b)) {
      return round;
    }

    a = Math.ceil(a / 2);
    b = Math.ceil(b / 2);

    round++;
  }
}

function isRightCompetitor(a, b) {
  let smaller;

  if (a < b) {
    smaller = a;
  } else {
    smaller = b;
  }

  return smaller % 2 === 1;
}

console.log(solution(8, 4, 7) === 3);
