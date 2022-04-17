/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
  const counter = {};

  for (let i = 0; i < s.length; i++) {
    if (counter[s[i]]) {
      counter[s[i]] += 1;
    } else {
      counter[s[i]] = 1;
    }
  }

  const keys = Object.keys(counter);

  return s.indexOf(keys.find((letter) => counter[letter] === 1));
};

console.log(firstUniqChar("dddccdbba"));
