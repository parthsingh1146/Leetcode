class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        if(num.length() == k){
            return "0";
        }
        for(char ch : num.toCharArray()){
            if(st.isEmpty() || st.peek() <= ch){
                // push into stack
                st.push(ch);
            }
            else{
                //st.peek() >= ch
                while(!st.isEmpty() && k > 0 && st.peek() > ch){
                    st.pop();
                    k--;
                }
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size() > k){
            char numVal = st.removeLast();
            if(numVal == '0' && ans.isEmpty()){
                continue;
            }
            ans.append(numVal);
        }
        if(ans.isEmpty()){
            return "0";
        }
        return ans.toString();
    }
}