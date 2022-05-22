/**
 * @see https://leetcode.com/problems/long-pressed-name/
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function (origin, typed) {
  const originMap = makeCharMap(origin);
  const typedMap = makeCharMap(typed);

  if (originMap.length !== typedMap.length) {
    return false;
  }

  for (let i = 0; i < originMap.length; i++) {
    const [originChar, originCharCount] = originMap[i];
    const [typedChar, typedCharCount] = typedMap[i];

    if (originChar !== typedChar || originCharCount > typedCharCount) {
      return false;
    }
  }

  return true;
};

const makeCharMap = (str) => {
  const result = [];

  [...str].forEach((char, index) => {
    if (index === 0 || char !== str[index - 1]) {
      result.push([char, 1]);
    } else if (char === str[index - 1]) {
      result.at(-1)[1] += 1;
    }
  });

  return result;
};
