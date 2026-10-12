class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if (stack.isEmpty()) {
                    return false;
                }
                int element = stack.peek();
                if(element == map.get(ch)){
                    stack.pop();
                }
                else{
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