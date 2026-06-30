class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stk.push(c);
            } else {
                if(stk.empty()){
                    return false;
                }
                Character lastBracket = stk.pop();
                if(c==')' && !(lastBracket=='(')){
                    return false;
                } else if(c=='}' && !(lastBracket=='{')){
                    return false;
                } else if(c==']' && !(lastBracket=='[')){
                    return false;
                }
            }
        }
        if(stk.empty())
            return true;
        return false;
    }
}
