Robot circle:
If number of L == R, and U ==D

My solution:
class Solution:
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        val = 0
        for ch in moves:
            if ch=="U":
                val += 1
            elif ch =="D":
                val -= 1
            elif ch =="L":
                val += 2
            elif ch =="R":
                val -= 2
        if val == 0:
            return True
        else:
            return False

Good solution:

class Solution:
    def judgeCircle(self, moves):
        if moves.count("U")==moves.count("D") and moves.count("L")==moves.count("R"):
            return True
        else:
            return False
