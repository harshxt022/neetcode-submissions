class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n+m];
        int a =0,b=0;
        while(a<m && b<n){
            if(nums1[a]<=nums2[b]){
                res[a+b] = nums1[a];
                a++;
            }else{
                res[a+b] = nums2[b];
                b++;
            }
        }
         while (a < m) {
            res[a + b] = nums1[a];
            a++;
        }
        while (b < n) {
            res[a + b] = nums2[b];
            b++;
        }
        for(int i = 0;i<m+n;i++){
            nums1[i] = res[i];
        }
    }
}