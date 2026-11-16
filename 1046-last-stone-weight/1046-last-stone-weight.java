class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int top1 = pq.poll();
            int top2 = pq.poll();
            if(top1 != top2){
                int offerVal = Math.abs(top1 - top2);
                pq.offer(offerVal);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
    }
}