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
  let previous;

  current.prev = null;

  while (current) {
    length++;

    previous = current;
    current = current.next;
    if (current) {
      current.prev = previous;
    }
  }

  let right = previous; // tail of origin linked list
  let left = head;

  const middle = Math.floor(length / 2);

  do {
    if (left.val !== right.val) {
      return false;
    }

    length--;
    left = left.next;
    right = right.prev;
  } while (middle < length);

  return true;
};
