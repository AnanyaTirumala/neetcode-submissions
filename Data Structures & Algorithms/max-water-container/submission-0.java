class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int maxArea = 0;

        while(end>start){
            int area = ((end-start) * Math.min(heights[start],heights[end]));
            System.out.println(area);
            if(area>maxArea){
                maxArea = area;
            }
            if(heights[start]<heights[end]){
                start++;
            } else if (heights[end]<heights[start]){
                end--;
            } else {
                start++;
            }
        }

        return maxArea;
    }
}
