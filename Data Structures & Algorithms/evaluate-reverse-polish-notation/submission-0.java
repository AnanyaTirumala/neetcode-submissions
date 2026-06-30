class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operands = "+-*/";
        for(int i=0; i<tokens.length; i++){
            if(operands.indexOf(tokens[i])==-1){
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                int res = 0;
                switch(tokens[i]){
                    case "+": res = a+b;
                            break;
                    case "-": res = b-a;
                            break;
                    case "*": res = a*b;
                            break;
                    case "/": res = b/a;
                }
                stack.push(res);
            }
        }
        int res = stack.pop();
        return res;
    }
}
