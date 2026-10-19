class MinStack {
    Deque<Integer> st;
    Deque<Integer> minis;

    public MinStack() {
        st = new ArrayDeque<>();
        minis = new ArrayDeque<>();
    }

    public void push(int value) {
        st.push(value);

        if (minis.isEmpty()) {
            minis.push(value);
        } else {
            minis.push(Math.min(value, minis.peek()));
        }
    }

    public void pop() {
        st.pop();
        minis.pop();
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