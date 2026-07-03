
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            Integer count = hm.get(nums[i]);
            if(count!=null) return true;
            else hm.put(nums[i],1);
        }
        return false;
    }
}