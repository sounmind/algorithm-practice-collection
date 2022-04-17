/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function (headA, headB) {
  let [left, right] = [headA, headB];

  while (left && right) {
    if (left.visited) {
      return left;
    }

    left.visited = true;

    if (right.visited) {
      return right;
    }

    right.visited = true;

    [left, right] = [left.next, right.next];
  }

  while (left) {
    if (left.visited) {
      return left;
    }

    left = left.next;
  }

  while (right) {
    if (right.visited) {
      return right;
    }

    right = right.next;
  }

  return null;
};
