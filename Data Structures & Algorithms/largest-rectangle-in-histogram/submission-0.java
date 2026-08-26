class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for(int i=0;i<=n;i++){
            int curr = (i == n) ? 0 : heights[i];
            while(!s.isEmpty() && curr <heights[s.peek()]){
                int h = heights[s.pop()];
                int width;
                if(s.isEmpty()) width = i;
                else width = i - s.peek() - 1;
                max = Math.max(width*h,max);
            }
            s.push(i);
        }
        return max;
    }
}