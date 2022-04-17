import collections


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dictionary = collections.defaultdict(list)
        for word in strs:
            dictionary["".join(sorted(word))].append(
                word
            )  # sorted() returns 'list' so, use ''.join()
        return dictionary.values()
