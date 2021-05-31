function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}

var mergeTwoLists = function (left, right) {
  let result = new ListNode();
  let resultTail = result;

  while (left && right) {
    if (left.val < right.val) {
      resultTail.next = left;
      left = left.next;
    } else {
      resultTail.next = right;
      right = right.next;
    }
    resultTail = resultTail.next;
  }

  resultTail.next = left || right;

  return result.next;
};
