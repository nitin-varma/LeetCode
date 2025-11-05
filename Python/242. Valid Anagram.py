class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False

        cntS = [0] * 26
        cntT = [0] * 26

        for i in range(0,len(s)):
            cntS[ord(s[i])-ord('a')] += 1
            cntT[ord(t[i])-ord('a')] += 1
        
        for i in range(0,26):
            if(cntS[i]!=cntT[i]):
                return False

        return True

        