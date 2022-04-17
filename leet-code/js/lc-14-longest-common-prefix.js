/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
  const origin = strs[0];
  const rest = strs.slice(1);

  if (strs.length === 1) {
    return origin;
  }

  let index = 0;

  while (index !== origin.length) {
    if (!rest.every((str) => str[index] === origin[index])) {
      break;
    }

    index += 1;
  }

  return origin.slice(0, index);
};

console.log(longestCommonPrefix([""]));
console.log(longestCommonPrefix(["flower", "flower", "flower", "flower"]));
console.log(longestCommonPrefix(["dog", "racecar", "car"]));
console.log(longestCommonPrefix(["flower", "flow", "flight"]));
