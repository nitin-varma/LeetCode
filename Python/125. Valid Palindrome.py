class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s)==0:
            return True
        start = 0
        end = len(s)-1
        s = s.lower()
        while start<=end:
            first = s[start]
            last = s[end]
            if not first.isalnum():
                start+=1
            elif not last.isalnum():
                end-=1
            else:
                if first!=last:
                    return False
                start+=1
                end-=1
        return True