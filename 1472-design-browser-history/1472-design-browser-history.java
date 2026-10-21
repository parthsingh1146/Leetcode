class BrowserHistory {
    Deque<String> backSt;
    Deque<String> forwSt;
    public BrowserHistory(String homepage) {
        backSt = new ArrayDeque<>();
        backSt.push(homepage);
        forwSt = new ArrayDeque<>();
    }
    
    public void visit(String url) {
        backSt.push(url);
        forwSt.clear();
    }
    
    public String back(int steps) {
        while(backSt.size() > 1 && steps > 0){
            steps--;
            forwSt.push(backSt.pop());
        }
        return backSt.peek();
    }
    
    public String forward(int steps) {
        while(!forwSt.isEmpty() && steps > 0){
            steps-- ;
            backSt.push(forwSt.pop());
        }
        return backSt.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */