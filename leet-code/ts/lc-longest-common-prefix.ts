function longestCommonPrefix(strs: string[]): string {
  if (!strs || !strs.length) {
    return "";
  }

  return getLongestCommonPrefix(strs, 0, strs.length - 1);
}

function getLongestCommonPrefix(
  strs: string[],
  leftIndex: number,
  rightIndex: number
) {
  if (leftIndex === rightIndex) {
    return strs[leftIndex];
  }

  const middleIndex = Math.floor((leftIndex + rightIndex) / 2);
  const leftLongestCommonPrefix = getLongestCommonPrefix(
    strs,
    leftIndex,
    middleIndex
  );
  const rightLongestCommonPrefix = getLongestCommonPrefix(
    strs,
    middleIndex + 1,
    rightIndex
  );

  return getCommonPrefix(leftLongestCommonPrefix, rightLongestCommonPrefix);
}

function getCommonPrefix(left: string, right: string): string {
  const shorterLength = Math.min(left.length, right.length);
  let index = 0;

  for (index = 0; index < shorterLength; index++) {
    if (left[index] !== right[index]) {
      break;
    }
  }

  return left.slice(0, index);
}
