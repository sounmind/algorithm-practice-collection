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
 * @return {number[]}
 */
var inorderTraversal = function (root) {
  const visited = [];

  (function inorderTraverse(node) {
    if (!node) {
      return;
    }

    if (node.left) {
      inorderTraverse(node.left);
    }

    visited.push(node.val);

    if (node.right) {
      inorderTraverse(node.right);
    }
  })(root);

  return visited;
};
