class Solution {
    public boolean isPalindrome(String s) {
        String noWhiteSpace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] pallindrome = noWhiteSpace.toCharArray();
        System.out.println(pallindrome);
        // if(pallindrome.length%2==0){
        //     return false;
        // }
        int first = 0;
        int last = pallindrome.length-1;

        while(first<last){
            if(pallindrome[first]!=pallindrome[last]){
                System.out.println(first + " ::: " + last);
                return false;
            } else {
                first+=1;
                last-=1;
            }
        }

        return true;
    }
}
