class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0;
        int j = people.length - 1;
        while(j>=i){
            if((people[i] + people[j])>limit){
                count++;
                j--;
            }
            else{
                count++;
                i++;
                j--;
            }
            
        }
        return count;
    }
}