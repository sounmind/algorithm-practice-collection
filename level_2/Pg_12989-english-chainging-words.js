function solution(n, words) {
  const answers = {};
  let round = 1;
  let beforeWord = words[0];
  answers[beforeWord] = true;

  for (let i = 1; i < words.length; i++) {
    let currentWord = words[i];
    if (i % n === 0) {
      round += 1;
    }

    if (beforeWord[beforeWord.length - 1] !== currentWord[0]) {
      return [(i % n) + 1, round];
    }

    if (answers[currentWord]) {
      return [(i % n) + 1, round];
    } else {
      answers[currentWord] = true;
    }

    beforeWord = currentWord;
  }

  return [0, 0];
}

console.log(
  solution(3, [
    "tank",
    "kick",
    "know",
    "wheel",
    "land",
    "dream",
    "mother",
    "robot",
    "tank",
  ])
); // [3, 3]

console.log(
  solution(5, [
    "hello",
    "observe",
    "effect",
    "take",
    "either",
    "recognize",
    "encourage",
    "ensure",
    "establish",
    "hang",
    "gather",
    "refer",
    "reference",
    "estimate",
    "executive",
  ])
); // [0, 0]

console.log(
  solution(2, ["hello", "one", "even", "never", "now", "world", "draw"])
); // [1, 3]
