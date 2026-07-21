class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            pq.offer(gift);
        }
        for(int i = 0;i<k;i++){
            int rich = pq.poll();
            rich = (int)Math.sqrt(rich);
            pq.offer(rich);
        }
        int size = 0;
        while(!pq.isEmpty()){
            size+=pq.poll();
        }
        return size;
    }
}