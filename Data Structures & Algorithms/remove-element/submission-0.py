class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        lengthNums = len(nums)
        total = len(nums)
        i = 0
        count = 0
        while(i<lengthNums):
            if(nums[i]==val):
                nums.pop(i)
                lengthNums-=1
                count+=1
                i-=1
            i+=1
        return total-count