class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st : stones){
            pq.offer(st);
        }
        while(pq.size()>1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            stone1 = Math.abs(stone1-stone2);
            pq.offer(stone1);
        }
        if(pq.isEmpty()){
            return 0;
        }else{
            return pq.poll();
        }
    }
}
