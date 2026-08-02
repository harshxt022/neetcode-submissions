class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        int count = 0;
        while(l<=r){
            if(height[l]>lmax) lmax = height[l];
            if(height[r]>rmax) rmax = height[r];
            if(height[l]<=height[r]){
                count+=Math.min(height[r],lmax)-height[l];
                l++;
            }else if(height[r]<height[l]){
                count+=Math.min(height[l],rmax)-height[r];
                r--;
            }
        }
        return count;
    }
}
