/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
const isSameTree = function (treeA, treeB) {
  if (!treeA && !treeB) {
    return true;
  }

  if (treeA?.val !== treeB?.val) {
    return false;
  }

  return isSameTree(treeA.left, treeB.left) && isSameTree(treeA.right, treeB.right);
};