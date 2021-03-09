# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        def reverse(node: ListNode, prev: ListNode = None):
            if not node:  # node가 None을 가리킬 경우
                return prev
            # node가 가리키는 값이 prev로 할당된다.
            # prev는 node가 첫 노드일 경우 None,
            # 첫 노드가 아닐 경우 자신을 가리키던 노드가 할당된다.
            next_node, node.next = node.next, prev

            # node: node가 원래 가리키던 노드
            # next_node: node가 원래 가리키던 node가 가리키던 노드
            return reverse(next_node, node)

        return reverse(head)