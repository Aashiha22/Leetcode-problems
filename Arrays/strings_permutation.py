2.Check if string s1 contains permutation of other string:

Python(Time limit exceeded):

from itertools import permutations
class Solution:
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        for s in list(permutations(s1)):
            s1 = ''.join(s)         ### join can be done only for list with strings
            if (s1 in str(s2)):
                return True
        return False
