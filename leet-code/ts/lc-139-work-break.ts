const wordBreak = function (origin: string, wordDict: string[]) {
  const originMemo = [true, ...new Array(origin.length).fill(false)];

  for (let startIndex = 0; startIndex <= origin.length; startIndex++) {
    if (originMemo[startIndex] === true) {
      for (const word of wordDict) {
        if (origin.slice(startIndex, startIndex + word.length) === word) {
          originMemo[startIndex + word.length] = true;
        }
      }
    }
  }

  return originMemo[origin.length];
};
