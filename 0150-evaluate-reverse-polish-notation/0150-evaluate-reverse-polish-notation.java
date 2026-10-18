class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String str: tokens){
            if(str.equals("+")){
                int v1 = st.pop();
                int v2 = st.pop();
                int val = v1 + v2;
                st.push(val);
            }
            else if(str.equals("-")){
                int v1 = st.pop();
                int v2 = st.pop();
                int val = v2 - v1;
                st.push(val);
            }
            else if(str.equals("*")){
                int v1 = st.pop();
                int v2 = st.pop();
                int val = v1 * v2;
                st.push(val);
            }
            else if(str.equals("/")){
                int v1 = st.pop();
                int v2 = st.pop();
                int val = v2 / v1;
                st.push(val);
            }
            else{
                int num = 0;
                int sign = 1;
                for(char ch : str.toCharArray()){
                    if(ch == '-'){
                        sign = -1;
                        continue;
                    }
                    num = num * 10 + (ch - '0');
                }
                st.push(num * sign);
            }
        }

        return st.peek();
    }
}