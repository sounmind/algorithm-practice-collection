function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
  let newList = new ListNode();
  let [pointer1, pointer2, newPointer] = [l1, l2, newList];
  let sum = 0;
  let adder = 0;

  while (pointer1 || pointer2) {
    sum = adder;

    if (pointer1) {
      sum += pointer1.val;
      pointer1 = pointer1.next;
    }

    if (pointer2) {
      sum += pointer2.val;
      pointer2 = pointer2.next;
    }

    adder = sum >= 10 ? 1 : 0;
    newPointer.val = sum % 10;

    if (!pointer1 && !pointer2) {
      if (adder > 0) {
        newPointer.next = new ListNode(adder);
      }

      return newList;
    }

    newPointer.next = new ListNode();
    newPointer = newPointer.next;
  }

  return newList;
};