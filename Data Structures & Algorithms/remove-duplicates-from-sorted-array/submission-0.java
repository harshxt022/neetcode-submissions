class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int[] res = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            count++;
            set.add(nums[i]);
            res[j]=nums[i];
            j++;
        }
        for(int i = 0;i<count;i++){
            nums[i] = res[i];
        }
        return count;
    }
}