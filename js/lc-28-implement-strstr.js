/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  if (needle === "") {
    return 0;
  }

  return haystack.indexOf(needle);
};

console.log(strStr("hello", "ll") === 2);
console.log(strStr("aaaaa", "bba") === -1);
console.log(strStr("", "") === 0);
