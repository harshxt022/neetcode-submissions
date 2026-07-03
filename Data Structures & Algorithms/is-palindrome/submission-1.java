class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int start = 0,end = s.length()-1;
        while(end>start){
            if(c[start]!=c[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
