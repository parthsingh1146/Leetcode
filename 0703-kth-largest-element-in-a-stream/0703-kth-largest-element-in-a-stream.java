class KthLargest {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
    // Deque<Integer> stack = new ArrayDeque<>();
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int n : nums){
            pq.offer(n);
            if(pq.size() > size){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > size){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */