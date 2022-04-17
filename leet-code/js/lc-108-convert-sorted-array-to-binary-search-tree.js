function TreeNode(val, left, right) {
  this.val = val === undefined ? 0 : val;
  this.left = left === undefined ? null : left;
  this.right = right === undefined ? null : right;
}

var sortedArrayToBST = function (nums) {
  return (function makeTree(leftIndex, rightIndex) {
    console.log(leftIndex, rightIndex);
    if (leftIndex === rightIndex) {
      return new TreeNode(nums[leftIndex]);
    }

    const midIndex = Math.floor((leftIndex + rightIndex) / 2);
    const node = new TreeNode(nums[midIndex]);

    if (leftIndex <= midIndex - 1) {
      node.left = makeTree(leftIndex, midIndex - 1);
    }

    node.right = makeTree(midIndex + 1, rightIndex);

    return node;
  })(0, nums.length - 1);
};

console.log(sortedArrayToBST([-10, -3, 0, 5, 9]));

// Reference: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/1181749/Javascript-or-recursion-O(n)-or-easy-to-understand
