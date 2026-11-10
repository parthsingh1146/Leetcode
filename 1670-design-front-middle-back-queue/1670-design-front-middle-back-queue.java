class FrontMiddleBackQueue {
    Deque<Integer> q;
    Deque<Integer> st = new ArrayDeque<>();
    public FrontMiddleBackQueue() {
        q = new ArrayDeque<>();
    }
    
    public void pushFront(int val) {
        q.offerFirst(val);
    }
    
    public void pushMiddle(int val) {
        int n = q.size();
        while(q.size() > n/2){
            st.push(q.pollLast());
        }
        q.offer(val);
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }
    
    public void pushBack(int val) {
        q.offer(val);
    }
    
    public int popFront() {
        if(q.size() == 0){
            return -1;
        }
        return q.poll();
    }
    
    public int popMiddle() {
        if(q.size() == 0){
            return -1;
        }
        int n = q.size();
        while(q.size() > ((n+1)/2)){
            st.push(q.pollLast());
        }
        int popped = q.pollLast();
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        return popped;
    }
    
    public int popBack() {
        if(q.size() == 0){
            return -1;
        }
        return q.pollLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */