# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        prev = head
        head = head.next
        prev.next = None

        while head != None:
            next_node = head.next
            head.next = prev
            prev = head
            head = next_node

        return prev