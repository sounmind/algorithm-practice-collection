class TreeNode {
  val: number;
  left: TreeNode | null;
  right: TreeNode | null;
  constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

function leafSimilar(root1: TreeNode | null, root2: TreeNode | null): boolean {
  return isSameArray(getLeaves(root1), getLeaves(root2));
}

const getLeaves = (root: TreeNode, leaves = []) => {
  if (!root?.left && !root?.right) {
    leaves.push(root.val);
  }

  root?.left && getLeaves(root.left, leaves);
  root?.right && getLeaves(root.right, leaves);

  return leaves;
};

const isSameArray = (arr1: number[], arr2: number[]) => {
  if (arr1.length !== arr2.length) {
    return false;
  }

  for (let i = 0; i < arr1.length; i++) {
    if (arr1[i] !== arr2[i]) {
      return false;
    }
  }

  return true;
};
