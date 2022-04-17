function solution(strNumMixed) {
  const numberByWord = {
    zero: "0",
    one: "1",
    two: "2",
    three: "3",
    four: "4",
    five: "5",
    six: "6",
    seven: "7",
    eight: "8",
    nine: "9",
  };
  let stack = [];
  let answer = "";

  for (let i = 0; i < strNumMixed.length; i++) {
    const char = strNumMixed[i];

    if (Number.isNaN(Number(char))) {
      stack.push(char);
    } else {
      answer += char;
    }

    const word = stack.join("");
    const numString = numberByWord[word];

    if (numString) {
      answer += numString;
      stack = [];
    }
  }

  return Number(answer);
}

console.log(solution("one4seveneight") === 1478);
console.log(solution("23four5six7") === 234567);
console.log(solution("2three45sixseven") === 234567);
console.log(solution("123") === 123);
