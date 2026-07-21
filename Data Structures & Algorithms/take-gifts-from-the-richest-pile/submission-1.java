class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int gift : gifts){
            pq.offer(gift);
            sum+=gift;
        }
        for(int i = 0;i<k;i++){
            int rich = pq.poll();
            int rem = (int)Math.sqrt(rich);
            sum = sum - rich + rem;
            pq.offer(rem);
        }
        return sum;
    }
}