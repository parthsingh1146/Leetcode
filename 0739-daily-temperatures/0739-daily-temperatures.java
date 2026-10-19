class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int prevDay = st.pop();
                int diff = i - prevDay;
                ans[prevDay] = diff; 
            }
            st.push(i);
        }
        return ans;
    }
}