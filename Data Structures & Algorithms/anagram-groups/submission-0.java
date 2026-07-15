class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        for(List<String> val : map.values()){
            res.add(val);
        }
        return res;
    }
}
            