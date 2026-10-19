class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<temperatures.length;i++){
            // if stack is empty or current day is cooler than topVaue
            if(st.isEmpty() || temperatures[st.peek()]>temperatures[i]){
                st.push(i);
            }
            // if current day is hotter 
            else {
                // resolve prev day temp 
                while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    int diff = i - st.peek();
                    ans[st.peek()] = diff;
                    st.pop(); 
                }
                st.push(i);
            }
        }
        return ans;
    }
}