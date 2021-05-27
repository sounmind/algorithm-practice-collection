/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function (head) {
  let current = head;
  const cache = [];

  while (current) {
    if (cache.includes(current)) {
      return true;
    }

    cache.push(current);

    current = current.next;
  }

  return false;
};
