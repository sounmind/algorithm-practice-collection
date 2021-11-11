function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {TreeNode}
 */
var mergeTrees = function(root1, root2) {
  if (!root1 && !root2) {
    return null;
  }

  let newRootVal = 0;
  newRootVal += root1 ? root1.val : 0;
  newRootVal += root2 ? root2.val : 0;

  const newRoot = new TreeNode(newRootVal);
  const treeOne = root1;
  const treeTwo = root2;
  const merged = newRoot;

  function merge(merged, treeOne, treeTwo) {
    if (treeOne?.left || treeTwo?.left) {
      merged.left = new TreeNode((treeOne?.left?.val || 0) + (treeTwo?.left?.val || 0));
      merge(merged.left, treeOne?.left, treeTwo?.left);
    }

    if (treeOne?.right || treeTwo?.right) {
      merged.right = new TreeNode((treeOne?.right?.val || 0) + (treeTwo?.right?.val || 0));
      merge(merged.right, treeOne?.right, treeTwo?.right);
    }
  }

  merge(merged, treeOne, treeTwo);

  return newRoot;
};