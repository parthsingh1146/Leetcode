class Solution {
    public int minSwaps(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        int open = 0;
        while(!st.isEmpty()){
            if(st.peek() == '['){
                open++;
            }
            st.pop();
        }
        return (open+1)/2;
    }
}