import collections
from typing import Deque


class Solution:
    def isPalindrome(self, s: str) -> bool:
        string_deque: Deque = collections.deque()
        for char in s:
            if char.isalnum():
                string_deque.append(char.lower())
        while len(string_deque) > 1:
            if string_deque.popleft() != string_deque.pop():
                return False
        return True


print(Solution().isPalindrome("asdlksajl"))
print(Solution().isPalindrome("A man, a plan, a canal: Panama"))