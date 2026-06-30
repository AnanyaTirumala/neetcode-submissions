class Solution {
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     int left = 0;
    //     int right = 1;

    //     while(left<nums.length-1){
    //         if(right-left>k){
    //             left++;
    //             right=left+1;
    //         }
    //         if(right<nums.length){
    //             if(nums[left]!=nums[right]){
    //                 right++;
    //             } else {
    //                 return true;
    //             }
    //         } else {
    //             left++;
    //             right = left+1;
    //         }
            
    //     }
    //     return false;

    // }




    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 1;
        while(left<nums.length-1){
            // System.out.println("l:"+left+" r:"+right);
            if(right==nums.length){
                left+=1;
                right = left+1;
            }
            else if(right-left>k){
                left+=1;
                right = left+1;
            }
            else if(nums[right]==nums[left] && right-left<=k){
                return true;
            } else {
                right++;
            }
        }
        return false;
    }
}