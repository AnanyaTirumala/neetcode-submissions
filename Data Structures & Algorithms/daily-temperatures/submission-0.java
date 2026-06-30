class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> mono = new Stack<>();
        int output[] = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while (!mono.empty() && mono.peek()[0]<temperatures[i]){
                int[] pair = mono.pop();
                output[pair[1]] = i-pair[1];
            }
            mono.push(new int[] {temperatures[i], i});    
        }
        return output;
    }
}