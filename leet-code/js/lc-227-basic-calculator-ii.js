const OPERATORS_BY_PRIORITY = {
  "*": 2,
  "/": 2,
  "+": 1,
  "-": 1,
};

function calculate(s) {
  const infixExpression = s
    .split("+")
    .join(" + ")
    .split("-")
    .join(" - ")
    .split("*")
    .join(" * ")
    .split("/")
    .join(" / ")
    .split(" ")
    .filter((s) => s !== "");

  const postfixExpression = convertInfixToPostfix(infixExpression);

  return calculatePostifxExpression(postfixExpression);
}

function convertInfixToPostfix(infixExpression) {
  const operatorStack = [];
  let postifxExpression = [];

  for (let i = 0; i < infixExpression.length; i++) {
    const char = infixExpression[i];

    if (OPERATORS_BY_PRIORITY[char]) {
      let peek = operatorStack[operatorStack.length - 1];

      while (
        peek &&
        OPERATORS_BY_PRIORITY[peek] >= OPERATORS_BY_PRIORITY[char]
      ) {
        postifxExpression.push(operatorStack.pop());

        peek = operatorStack[operatorStack.length - 1];
      }

      operatorStack.push(char);
    } else {
      postifxExpression.push(char);
    }
  }

  return [...postifxExpression, ...operatorStack.reverse()];
}

function calculatePostifxExpression(postifxExpression) {
  const operandStack = [];

  for (let i = 0; i < postifxExpression.length; i++) {
    const char = postifxExpression[i];

    if (OPERATORS_BY_PRIORITY[char]) {
      const right = operandStack.pop();
      const left = operandStack.pop();
      let result;

      if (char === "+") {
        result = String(Number(left) + Number(right));
      } else if (char === "-") {
        result = String(Number(left) - Number(right));
      } else if (char === "*") {
        result = String(Number(left) * Number(right));
      } else {
        result = String(Math.floor(Number(left) / Number(right)));
      }

      operandStack.push(result);
    } else {
      operandStack.push(char);
    }
  }

  return Number(operandStack.pop());
}
