class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # pairs = dict(enumerate(nums))
        count = 0
        pairs = {}
        for i in nums:
            pairs[i] = count
            count+=1

        for i in range (0, len(nums)):
            if (target-nums[i]) in pairs:
                if i!= pairs[target-nums[i]]:
                    return [i, pairs[target-nums[i]]]