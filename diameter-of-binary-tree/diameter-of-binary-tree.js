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
var diameterOfBinaryTree = function(root) {
  let result = 1;
  depthFirstUpdateHeight(root);

  function depthFirstUpdateHeight(node) {
    if (!node) {
      return 0;
    }

    let maxLeftHeight = depthFirstUpdateHeight(node.left);
    let maxRightHeight = depthFirstUpdateHeight(node.right);

    // NOTE 끝에 다다랐기 때문에 길이 + 1
    result = Math.max(result, maxLeftHeight + maxRightHeight + 1);

    // 가장 긴 길이를 리턴한다. 왜 +1일까...?
    return Math.max(maxLeftHeight, maxRightHeight) + 1;
  }

  return result - 1;
};