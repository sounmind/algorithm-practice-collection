/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestZigZag = function (root, longestLength = 0) {
  const traverse = (root, isLeft, length = 0) => {
    if (!root) {
      return;
    }

    longestLength = Math.max(length, longestLength);

    traverse(root.left, true, isLeft ? 1 : length + 1);
    traverse(root.right, false, isLeft ? length + 1 : 1);
  };

  traverse(root);

  return longestLength;
};
