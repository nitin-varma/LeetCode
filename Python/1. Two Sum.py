class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        nums_index = {}
        for i, num in enumerate(nums):
            complement = target-num
            if complement in nums_index:
                return [nums_index[complement], i]
            nums_index[num] = i

        return []