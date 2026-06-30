class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i : nums){
            numSet.add(i);
        }
        int sequence = 0;
        int longest = 0;
        int curr;
        for(int i=0; i<nums.length; i++){
            sequence = 1;
            curr = nums[i];
            while(sequence>0){
                if(numSet.contains(curr+1)){
                    sequence+=1;
                    curr = curr+1;
                } else {
                    if(sequence>longest){
                        longest=sequence;
                    }
                    sequence=0;
                }
            }
        }
        return longest;
    }
}
