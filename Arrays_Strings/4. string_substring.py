# Find number of times string A must be repeated to have string B substring of String A:

#For string B to be substring of string A, string A must be repeated x or x+1 times where x is len(B)/len(A).

# CODE:

from math import ceil
class Solution:
    def repeatedStringMatch(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: int
        """
        x = ceil(len(B)/len(A))
        if B in A*x:
            return x
        elif B in A*(x+1):
            return x+1
        else:
            return -1
