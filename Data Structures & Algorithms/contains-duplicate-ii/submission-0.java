class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 1;

        while(left<nums.length-1){
            if(right-left>k){
                left++;
                right=left+1;
            }
            if(right<nums.length){
                if(nums[left]!=nums[right]){
                    right++;
                } else {
                    return true;
                }
            } else {
                left++;
                right = left+1;
            }
            
        }
        return false;

    }
}