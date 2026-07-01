class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        # ans = nums+nums
        # print(ans)
        ans = [None] * len(nums) * 2
        # print(ans)
        for i in range(0, len(nums)):
            ans[i] = nums[i]
            ans[i+len(nums)] = nums[i]
        # print(ans)
        return ans