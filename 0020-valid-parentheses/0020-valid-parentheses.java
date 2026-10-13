class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char v = stack.peek();
                if((ch == ')' && v != '(') || (ch == '}' && v != '{') || (ch == ']' && v != '[')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}