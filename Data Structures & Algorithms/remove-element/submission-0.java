class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        int start = 0;
        while(end>start){
            if(nums[start] == val && nums[end] != val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                start++;
            }
            if(nums[start] == val && nums[end] == val){
                end--;
            }
            if(nums[start]!=val) start++;

        }
        int count=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val) break;
            count++;
        }
        return count;
    }
}