/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
  nums1.splice(m, nums1.length - m, ...nums2.slice(0, n));
  nums1.sort((a, b) => a - b);
};

const a = [1, 2, 3, 0, 0, 0];
const b = [2, 5, 6];
const c = [1];
const d = [];

console.log(merge(a, 3, b, 3)); // [1,2,3,4,5,6]
console.log(merge(c, 1, d, 0)); // [1]

console.log("a:", a);
console.log("c:", c);
