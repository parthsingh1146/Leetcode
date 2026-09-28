class Solution {
    public int maxDepth(String s) {
        int countOfpar = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
                if(count > countOfpar){
                    countOfpar = count;
                }
            }
            if(s.charAt(i) == ')'){
                count--;
            }
        }
        return countOfpar;
    }
}