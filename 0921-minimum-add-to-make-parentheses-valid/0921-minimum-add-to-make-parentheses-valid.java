class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                // ch == ')'
                if(st.isEmpty()){
                    st.push(ch);
                }
                else {
                    char topVal = st.peek();
                    if(topVal == '('){
                        st.pop();
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
        }
        return st.size();
    }
}