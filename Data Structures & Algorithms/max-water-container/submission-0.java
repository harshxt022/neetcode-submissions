class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int start = 0;
        int end = heights.length-1;
        while(end>start){
            int area = Math.min(heights[start],heights[end])*(end-start);
            if(area>max) max = area;
            if(heights[start]>heights[end]) end--;
            else start++;
        }
        return max;
    }
}
