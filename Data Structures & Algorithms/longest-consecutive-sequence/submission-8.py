class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        maxLen = 0

        for i in range(0, len(nums)):
            if (nums[i]-1) in numSet:
                continue
            else:
                length = 0
                j = nums[i]
                while j in numSet:
                    length+=1
                    j+=1
                maxLen = max(length, maxLen)
        
        return maxLen
        