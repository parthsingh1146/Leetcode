class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                int v = stack.peek();
                if((ch == ')' && v == '(') || (ch == '}' && v == '{') || (ch == ']' && v == '[')){
                    stack.pop();
                } else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}