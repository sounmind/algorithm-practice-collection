const wordBreak = function (origin: string, wordDict: string[]) {
  const words = new Set(wordDict);
  const wordLengths = new Set(wordDict.map((word) => word.length));
  const startIndexes = new Set([0]);

  for (const startIndex of startIndexes) {
    for (const wordLength of wordLengths) {
      if (words.has(origin.slice(startIndex, startIndex + wordLength))) {
        startIndexes.add(startIndex + wordLength);
      }
    }
  }
  return startIndexes.has(origin.length);
};
