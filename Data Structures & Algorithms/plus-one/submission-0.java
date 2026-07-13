class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }else{
                digits[i] = 10 - digits[i] ;
                if(i == 0){
                    int[] ans = new int[digits.length + 1];
                    ans[0] = 1;
                    for(int j = 1;j<ans.length;j++){
                        ans[j] = digits[j-1];
                    }
                    return ans;
                }
            }
        }
        return digits;
    }
}
