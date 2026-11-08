class RecentCounter {
    Deque<Integer> que = new ArrayDeque<>();

    public RecentCounter() {
        que = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        que.offer(t);
        int low = t - 3000;
        while(que.peek()<low){
            que.poll();
        }
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */