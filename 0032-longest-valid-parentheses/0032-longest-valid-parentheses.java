class Solution {
    public int longestValidParentheses(String s) {
        Deque<Character> st = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
                list.removeLast();
            }
            else{
                st.push(s.charAt(i));
                list.add(i);
            }
        }
        if (list.size() == 0) {
            return s.length();
        }
        int startIndex = 0;
        int endIndex = s.length() - 1;
        int maxLength = 0;

        for(int i = 0;i<list.size();i++){
            if(i == 0){
                continue;
            }
            int length = list.get(i) - list.get(i-1) - 1;
            if(length > maxLength){
                maxLength = length;
            }
        }
        // first case
        int length = list.get(0) - startIndex;
        if(length > maxLength){
            maxLength = length;
        }
        // last case;
        length = endIndex - list.get(list.size()-1);
        if(length > maxLength) {
            maxLength = length;
        }
        return maxLength;
    }
}