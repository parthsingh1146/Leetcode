class Solution {
    public String removeDuplicates(String s) {
        // using stack
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            char topValue = st.peek();
            if(topValue == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
        // StringBuilder sb = new StringBuilder();
        // for(char ch : s.toCharArray()){

        //     sb.append(ch);
        //     if(sb.length() > 1 && sb.charAt(sb.length()-1) == sb.charAt(sb.length()-2)){
        //         sb.deleteCharAt(sb.length()-1);
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        // }
        // return sb.toString();
    }
}