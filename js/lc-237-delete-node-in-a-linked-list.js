/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} node
 * @return {void} Do not return anything, modify node in-place instead.
 */
var deleteNode = (target) => {
  const nextNode = target.next;
  const nextValue = nextNode.val;

  target.val = nextValue;
  target.next = nextNode.next;
};
