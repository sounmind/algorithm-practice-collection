/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function (nums1, nums2) {
  const [originNums, targetNums] = [Array.from(nums1), Array.from(nums2)];
  const counter = Array(Math.max(...nums1.concat(nums2)) + 1).fill(0);
  const result = [];

  targetNums.forEach((targetNum) => {
    if (originNums.includes(targetNum)) {
      counter[targetNum] += 1;
      originNums[originNums.indexOf(targetNum)] = null;
    }
  });

  for (let i = 0; i < counter.length; i++) {
    while (counter[i] > 0) {
      result.push(i);
      counter[i] -= 1;
    }
  }

  return result;
};

// tests
console.log(intersect([1, 2, 2, 1], [2, 2])); // [2, 2]
console.log(intersect([4, 9, 5], [9, 4, 9, 8, 4])); // [4, 9] or [9, 4]
