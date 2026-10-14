class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int additions = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            }
            else{
                if(open>0){
                    open -- ;
                }
                else{
                    additions++;
                }
            }
        }
        return open + additions;
        // Deque<Character> st = new ArrayDeque<>();
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         st.push(ch);
        //     }
        //     else{
        //         // ch == ')'
        //         if(st.isEmpty()){
        //             st.push(ch);
        //         }
        //         else {
        //             char topVal = st.peek();
        //             if(topVal == '('){
        //                 st.pop();
        //             }
        //             else{
        //                 st.push(ch);
        //             }
        //         }
        //     }
        // }
        // return st.size();
    }
}