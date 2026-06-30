class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int largestCount = 0;
        int count=0;
        int left=0;
        for(int c=0; c<s.length(); c++){
            System.out.println(c+" count:"+count);
            if(!set.contains(s.charAt(c))){
                count+=1;
                set.add(s.charAt(c));
                largestCount = Math.max(count, largestCount);
            } else {
                while(set.contains(s.charAt(c)) && !set.isEmpty()){
                    set.remove(s.charAt(left));
                    count--;
                    left++;
                }
                set.add(s.charAt(c));
                count+=1;
            }
            System.out.println(c+" count:"+count);
        }
        return largestCount;
    }
}
