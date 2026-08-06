class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majorityElement=nums[0]
        count=1
        for i in range(1, len(nums)):
            if count==0:
                majorityElement = nums[i]
            if nums[i]==majorityElement:
                count+=1
            else: 
                count-=1
        return majorityElement