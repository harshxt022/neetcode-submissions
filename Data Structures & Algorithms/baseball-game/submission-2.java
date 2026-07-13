class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("+")){
                // s.push(operations[i-1]+operations[i-2]);
                int temp = s.pop();
                int total = s.peek()+ temp;
                s.push(temp);
                s.push(total);
            }
            else if(operations[i].equals("D")){
                s.push(2*s.peek());
            }
            else if(operations[i].equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int count = 0;
        while(!s.isEmpty()){
            count+=s.pop();
        }
        return count;
    }
}