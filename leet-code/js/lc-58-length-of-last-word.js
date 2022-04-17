/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
  s = s.trim();

  if (s === "") {
    return 0;
  }

  return s.split(" ").pop().length;
};

console.log(lengthOfLastWord("a "));
