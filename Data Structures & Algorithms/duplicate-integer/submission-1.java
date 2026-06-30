class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!visited.contains(nums[i])){
                visited.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}