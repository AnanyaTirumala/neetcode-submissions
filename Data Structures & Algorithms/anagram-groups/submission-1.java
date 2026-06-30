class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freq = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] cstr = strs[i].toCharArray();
            int[] ckey = new int[26];
            for(char c:cstr){
                ckey[c-'a']++;
            }
            String key = Arrays.toString(ckey);
            freq.putIfAbsent(key, new ArrayList<>());
            freq.get(key).add(strs[i]);
        }
        return new ArrayList<>(freq.values());
    }
}
