class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        inputSet = set()
        for i, num in enumerate(nums):
            inputSet.add(num)
        if (len(inputSet)==len(nums)):
            return False
        return True