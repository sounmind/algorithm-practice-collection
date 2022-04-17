function solution(expression) {
  const combinations = [
    ["*", "+", "-"],
    ["*", "-", "+"],
    ["+", "*", "-"],
    ["+", "-", "*"],
    ["-", "*", "+"],
    ["-", "+", "*"],
  ];

  let max = 0;
  let splittedExpression = [];
  let numChar = "";

  for (const char of expression) {
    if (Number.isNaN(Number(char))) {
      splittedExpression.push(Number(numChar));
      splittedExpression.push(char);

      numChar = "";
    } else {
      numChar += char;
    }
  }

  splittedExpression.push(Number(numChar));

  for (const combination of combinations) {
    const sampleExpression = [...splittedExpression];

    for (const operator of combination) {
      while (sampleExpression.includes(operator)) {
        const operatorIndex = sampleExpression.indexOf(operator);
        const minimumExpression = sampleExpression.slice(
          operatorIndex - 1,
          operatorIndex + 2
        );
        const result = calculate(...minimumExpression);

        sampleExpression.splice(operatorIndex - 1, 3, result);
      }
    }

    max = Math.max(max, Math.abs(sampleExpression[0]));
  }

  return max;
}

function calculate(left, operator, right) {
  if (operator === "-") {
    return left - right;
  }

  if (operator === "+") {
    return left + right;
  }

  if (operator === "*") {
    return left * right;
  }
}

console.log(solution("100-200*300-500+20") === 60420);
console.log(solution("50*6-3*2") === 300);
console.log(solution("2*2*2*2*2-2*2*2") === 24);
