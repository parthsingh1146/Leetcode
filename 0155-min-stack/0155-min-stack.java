class MinStack {
    Deque<Integer> st;
    Deque<Integer> minis = new ArrayDeque<>();
    void minStackPush(Deque<Integer> minis ,int num){
        if(minis.isEmpty() || minis.peek() >= num){
            minis.push(num);
            return;
        }
        int topVal = minis.pop();
        minStackPush(minis,num);
        minis.push(topVal);
    }
    void minStackPop(Deque<Integer> minis ,int num){
        if(minis.peek() == num){
            minis.pop();
            return;
        }
        int topVal = minis.pop();
        minStackPop(minis,num);
        minis.push(topVal);
    }
    public MinStack() {
       st = new ArrayDeque<>();
    }
    
    public void push(int value) {
        minStackPush(minis,value);
        st.push(value);
    }
    
    public void pop() {
        int val = st.pop();
        minStackPop(minis,val);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minis.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */