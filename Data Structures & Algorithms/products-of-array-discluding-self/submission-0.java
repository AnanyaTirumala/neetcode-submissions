class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int first = nums[0];
        prefix[0] = first;
        int last = nums[nums.length-1];
        suffix[nums.length-1] = last;
        for(int i=1; i<nums.length; i++){
            prefix[i] = first*nums[i];
            first = prefix[i];
            suffix[nums.length-i-1] = last*nums[nums.length-i-1];
            last = suffix[nums.length-i-1];
        }
        output[0] = suffix[1];
        output[nums.length-1] = prefix[nums.length-2];
        for(int i=1; i< nums.length-1; i++){
            output[i] = prefix[i-1]*suffix[i+1];
        }

        return output;
    }
}  
