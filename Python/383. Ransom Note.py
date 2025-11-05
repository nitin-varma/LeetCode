class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        cnt_mag = [0] * 26;
        cnt_ran = [0] * 26;

        for c in ransomNote:
            cnt_ran[ord(c) - ord('a')] +=1;
        for c in magazine:
            cnt_mag[ord(c) - ord('a')] += 1;
        
        for i in range(0 , 26):
            if cnt_ran[i] > cnt_mag[i]:
                return False
        return True
        