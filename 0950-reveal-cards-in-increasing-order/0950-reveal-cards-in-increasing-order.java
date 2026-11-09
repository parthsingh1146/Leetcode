class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> q = new ArrayDeque<>();
        Arrays.sort(deck);
        for(int i = deck.length - 1;i>=0;i--){
            if(!q.isEmpty()){
                int v = q.poll();
                q.offer(v);
            }
            q.offer(deck[i]);
        }
        int[] ans = new int[deck.length];
        for(int i = 0;i<deck.length;i++){
            ans[i] = q.pollLast();
        }
        return ans;
    }
}