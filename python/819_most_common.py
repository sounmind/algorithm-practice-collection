import re
from collections import Counter


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # preprocessing(data cleansing)
        words = [
            word
            for word in re.sub(r"[^\w]", " ", paragraph).lower().split()
            if word not in banned
        ]
        # count
        counts = Counter(words)
        return counts.most_common(1)[0][0]  # [('key', count)][0][0]
