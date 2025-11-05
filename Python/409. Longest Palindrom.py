class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        char_set = set()
        length = 0
        for char in s:
            if char in char_set:
                length+=2
                char_set.remove(char)
            else:
                char_set.add(char)
        
        if char_set:
            length+=1
        
        return length