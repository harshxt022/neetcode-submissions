class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i <nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(num);
        }
        int[] result = new int[k];
int idx = 0;

for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
    if (bucket[i] != null) {
        for (int num : bucket[i]) {
            result[idx++] = num;

            if (idx == k) {
                break;
            }
        }
    }
}

return result;

    }
}
