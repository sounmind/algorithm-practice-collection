class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        root = head = ListNode(0)
        carry = 0
        while l1 or l2 or carry:
            # 두 수의 합 계산
            sum = 0
            if l1:
                sum += l1.val
                l1 = l1.next
            if l2:
                sum += l2.val
                l2 = l2.next

            # 자리 올림(합이 10 이상일 경우)과 나머지 값 게산
            carry, value = divmod(
                sum + carry, 10
            )  # 이전에 계산되었던 carry가 여기서 sum과 더해져 나눠진다.
            head.next = ListNode(value)
            head = head.next

        return root.next
