class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> anagram = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int count[] = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                count[strs[i].charAt(j)-'a']+=1;
            }
            String key = Arrays.toString(count);
            if(anagram.containsKey(key)){
                List<String> Value = new ArrayList<>();
                Value = anagram.get(key);
                Value.add(strs[i]);
                anagram.put(key, Value);
            }else {
                List<String> Value = new ArrayList<>();
                Value.add(strs[i]);
                anagram.put(key, Value);
            }
        }
        return new ArrayList<>(anagram.values());
    }
}
