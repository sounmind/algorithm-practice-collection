/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function (head) {
  let length = 0;
  let current = head;
  let previous = null;

  while (current) {
    length++;
    [current.prev, previous, current] = [previous, current, current.next];
  }

  let [left, right] = [head, previous];
  const middle = Math.floor(length / 2);

  do {
    if (left.val !== right.val) {
      return false;
    }

    [left, right] = [left.next, right.prev];
  } while (middle < --length);

  return true;
};
