class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int ans = 0;
        // for(int i = 0;i<tickets.length;i++){
        //     if(i==k){
        //         continue;
        //     }
        //     if(tickets[i] <= tickets[k] ){
        //         ans += tickets[i];
        //     }
        //     else{
        //         ans += tickets[k];
        //     }
        // }
        // return ans + tickets[k];
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