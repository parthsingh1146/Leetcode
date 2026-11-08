class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        for(int ticket : tickets){
            q.offer(ticket);
        }
        int count = 0;
        int currK = k;
        while(tickets[k] != 0){
            count++;
            int v = q.poll();
            if(currK == 0){
                tickets[k] -- ;
            }
            if(v>1){
                q.offer(v-1);
            }
            if(currK == 0){
                currK = q.size() - 1;
            }
            else{
                currK -- ;
            }
        }
        return count;
    }
}