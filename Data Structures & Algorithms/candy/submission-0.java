class Solution {
    public int candy(int[] ratings) {
        int count = 0;
        int[] ltor = new int[ratings.length];
        int[] rtol = new int[ratings.length];
        Arrays.fill(ltor,1);
        Arrays.fill(rtol,1);
        for(int i = 1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                 ltor[i] = ltor[i - 1] + 1;
            }
        }
        for(int i = ratings.length-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                rtol[i] = rtol[i + 1] + 1;
            }
        }
        for(int i = 0;i<ratings.length;i++){
            count+=Math.max(ltor[i],rtol[i]);
        }
        return count;
    }
}