# Reverse a string python

class Solution:
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        list1 = []
        list1 = s.split(" ")
        for i in range(0,len(list1)):
            list1[i] = list1[i][::-1]          ###reverse order
        str1 = ' '.join(list1)
        return str1
