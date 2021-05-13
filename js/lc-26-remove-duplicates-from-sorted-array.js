/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  const filtered = Array.from(new Set(nums));

  nums.splice(0, nums.length, ...filtered);

  return filtered.length;
};
