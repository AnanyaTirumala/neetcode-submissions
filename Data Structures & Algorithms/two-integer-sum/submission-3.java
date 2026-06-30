class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res1[] = new int [2];
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             res[0] = i;
        //             res[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return res;

        List<Integer> res = new ArrayList<>();
        // res = Arrays.asList(nums);
        for (int i : nums)
        {
            res.add(i);
        }
        int index;
        for (int i=0; i<nums.length; i++){
            index = res.lastIndexOf(target-nums[i]);
            System.out.println(index);

            if (index!=-1){
                if(index!=i){
                    res1[0] = i;
                    res1[1] = index;
                    break;
                }
                
            }
        }
        return res1;
    }
}
