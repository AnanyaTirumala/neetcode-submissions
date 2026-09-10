class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [0]*len(nums)
        pre=1
        output[0] = 1
        for i in range(0,len(nums)-1):
            pre = pre*nums[i]
            output[i+1] = pre

        post = 1
        for i in range(len(nums)-1, -1, -1):
            output[i] = post*output[i]
            post = post*nums[i]

        return output