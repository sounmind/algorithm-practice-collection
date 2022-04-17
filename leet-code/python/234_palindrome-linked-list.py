import collections
from typing import Deque


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        deque: Deque = collections.deque()
        # 빈 연결 리스트
        if not head:
            return True
        # node를 연결 리스트의 가장 처음을 가리키도록 함
        node = head
        # node가 가리키는 노드가 None이면(연결리스트 끝이면) 종료
        while node is not None:
            # deque에 연결리스트의 값 차례로 넣기
            deque.append(node.val)
            node = node.next
        # deque의 길이가 2일 때까지 양 쪽 끝 값 비교
        while len(deque) > 1:
            # 양 쪽 끝 값이 다르면 즉 시 거짓 반환
            if deque.popleft() != deque.pop():
                return False
        return True


d = ListNode(1, None)
c = ListNode(2, d)
b = ListNode(2, c)
a = ListNode(1, b)

print(Solution().isPalindrome(a))
