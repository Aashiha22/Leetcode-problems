#Return permutation of list of numbers:

from itertools import permutations
class Solution:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        l1 = []
        for i in list(permutations(nums)):
            l1.append(i)
        return l1
