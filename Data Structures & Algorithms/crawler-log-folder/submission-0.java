class Solution {
    public int minOperations(String[] logs) {
        String out = "../";
        String same = "./";
        int count = 0;
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals(same)) continue;
            else if(logs[i].equals(out)){
                count--;
                if(count<0) count = 0;
            }else count++;
        }
        return count;
    }
}