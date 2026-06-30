class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char temps[] = s.toCharArray();
        char tempt[] = t.toCharArray();
        Arrays.sort(temps);
        Arrays.sort(tempt);
        for(int i=0; i<temps.length; i++){
            if(temps[i]!=tempt[i]){
                return false;
            } 
        }
        return true;
    }
}
