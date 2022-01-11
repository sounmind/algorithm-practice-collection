# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, list_1: ListNode, list_2: ListNode) -> ListNode:
        if (not list_1) or (list_2 and list_1.val > list_2.val):
            list_1, list_2 = list_2, list_1
        if list_1:
            list_1.next = self.mergeTwoLists(list_1.next, list_2)
        return list_1
