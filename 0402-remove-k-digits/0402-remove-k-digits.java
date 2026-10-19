class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        // if we have to remove all digits
        if(num.length() == k){
            return "0";
        }
        // to remove some digits
        for(char ch : num.toCharArray()){
            // if topvalue > curr value --> pop the top value
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
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