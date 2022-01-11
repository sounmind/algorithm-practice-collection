class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        root = prev = ListNode(None)
        prev.next = head
        while head and head.next:
            # 바꿔야 할 짝 중 두번째(second)가 head(첫번째 노드)를 가리키도록 할당
            second = head.next  # second를 선언하고, 두번째 노드를 가리키도록 할당
            head.next = second.next  # 첫번째 노드는 두번째의 다음 노드(세번째 노드)를 가리키도록 한다.
            second.next = head  # 두번째 노드는 첫번째 노드를 가리킨다. a -> b -> c  ---->  b -> a -> c

            # prev가 second를 가리키도록 할당
            prev.next = second

            # 다음 짝 비교를 위해 이동
            head = head.next
            prev = prev.next.next
        return root.next