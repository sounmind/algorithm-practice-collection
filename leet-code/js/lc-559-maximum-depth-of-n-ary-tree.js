/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number}
 */
var maxDepth = function (root, depth = 1) {
  if (!root) {
    return 0;
  }

  if (root.children.length > 0) {
    const depths = root.children.map((child) => {
      return maxDepth(child, depth + 1);
    });

    return Math.max(...depths);
  }

  return depth;
};
