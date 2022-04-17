/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  const stack = [];

  const bracePairs = {
    ")": "(",
    "]": "[",
    "}": "{",
  };

  const openBraces = Object.values(bracePairs);

  for (let i = 0; i < s.length; i++) {
    if (openBraces.includes(s[i])) {
      stack.push(s[i]);
    } else if (
      stack.length > 0 &&
      stack[stack.length - 1] === bracePairs[s[i]]
    ) {
      stack.pop();
    } else {
      return false;
    }
  }

  return stack.length === 0;
};

console.log(isValid("()"));
console.log(isValid("()[]{}"));
console.log(isValid("(]"));
console.log(isValid("([)]"));
console.log(isValid("{[]}"));
