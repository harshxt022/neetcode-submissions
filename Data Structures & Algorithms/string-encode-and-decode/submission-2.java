class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String s : strs){
            sb.append(s);
            sb.append("~");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        for(int i = 0;i<str.length();i++){
            int start = i;
            while(str.charAt(i) != '~'){
                i++;
            }
            int end = i;
            res.add(str.substring(start,end));
            // i++;
        }
        return res;
    }
}
