function solution(s) {
  return s
    .split(" ")
    .map((word) => {
      if (word === "") {
        return "";
      }

      let newWord = "";

      if (!parseInt(word[0]) && word[0] !== 0) {
        newWord += word[0].toUpperCase();
      } else {
        newWord += word[0];
      }

      newWord += word.substring(1).toLowerCase();

      return newWord;
    })
    .join(" ");
}

console.log(solution("3people unFollowed me")); // "3people Unfollowed Me"
console.log(solution("for the last week")); // "For The Last Week"
console.log(solution(" 021sSaA 0Ahs     deSS l0da s 0 wSSSe23134ek")); //
console.log(solution(" k")); //
console.log(solution(" K"));
console.log(solution(" 0"));
