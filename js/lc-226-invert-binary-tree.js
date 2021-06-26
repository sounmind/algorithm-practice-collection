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
 * @return {TreeNode}
 */
var invertTree = function(root) {
  if (root === null) {
    return null;
  }

  function helper(node) {
    if (node === null) {
      return;
    }

    const left = node.left;
    node.left = node.right;
    node.right = left;

    helper(node.left);
    helper(node.right);
  }

  helper(root);

  return root;
};
