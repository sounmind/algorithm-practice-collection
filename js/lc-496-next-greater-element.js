/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
  const result = [];

  for (let i = 0; i < nums1.length; i++) {
    const current = nums1[i];
    const position = nums2.indexOf(current);

    if (position === nums2.length - 1) {
      result.push(-1);
    } else {
      let hasFound = false;

      for (let j = position + 1; j < nums2.length; j++) {
        if (current < nums2[j]) {
          result.push(nums2[j]);
          hasFound = true;
          break;
        }
      }

      if (hasFound === false) {
        result.push(-1);
      }
    }
  }

  return result;
};


console.log(nextGreaterElement([4, 1, 2], [1, 3, 4, 2])); // [-1, 3, -1]
