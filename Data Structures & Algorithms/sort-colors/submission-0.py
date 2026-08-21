class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr = [0] * 3
        for i in nums:
            if(i==0):
                arr[0]+=1
            elif(i==1):
                arr[1]+=1
            else:
                arr[2]+=1
            
        i=0
        while arr[0] > 0:
            nums[i] = 0
            arr[0] -= 1
            i+=1
        while arr[1] > 0:
            nums[i] = 1
            arr[1]-= 1
            i+=1
        while arr[2] > 0: 
            nums[i] = 2
            arr[2] -= 1
            i+=1
        