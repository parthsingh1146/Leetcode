class Solution {
    public String decodeString(String s) {
        Deque<StringBuilder> strs = new ArrayDeque<>();
        Deque<Integer> ints = new ArrayDeque<>();
        int num = 0;
        StringBuilder currentStr = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + ch - '0';
            }
            else if (Character.isLetter(ch)){
                currentStr.append(ch);
            }
            else if(ch == '['){
                ints.push(num);
                strs.push(currentStr);
                currentStr = new StringBuilder();
                num = 0;
            }
            else if(ch == ']'){
                int count = ints.pop();
                StringBuilder prev = strs.pop();
                for (int i = 1; i <= count; i++) {
                    prev.append(currentStr);
                }
                currentStr = prev;
            }
        }
        return currentStr.toString();
    }
}