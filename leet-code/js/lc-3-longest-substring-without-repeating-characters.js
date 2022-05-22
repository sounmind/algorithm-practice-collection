/**
 * @see https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
  /**
   * 특정 문자를 문자열에서 좌측에서 탐색했을 때 가장 나중에(최근에) 나타난 위치(index + 1)
   */
  const latestCharAppearancePosition = {};
  let longestSubstringLength = 0;
  let leftIndex = 0;

  for (let rightIndex = 0; rightIndex < s.length; rightIndex++) {
    const currentChar = s[rightIndex];

    if (latestCharAppearancePosition[currentChar]) {
      leftIndex = Math.max(
        latestCharAppearancePosition[currentChar],
        leftIndex
      );
    }

    const currentSubstringLength = rightIndex - leftIndex + 1;

    longestSubstringLength = Math.max(
      longestSubstringLength,
      currentSubstringLength
    );

    latestCharAppearancePosition[currentChar] = rightIndex + 1;
  }

  return longestSubstringLength;
};
