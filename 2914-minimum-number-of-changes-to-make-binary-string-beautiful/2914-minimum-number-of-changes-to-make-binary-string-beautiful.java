class Solution {
    public int minChanges(String s) {
        int count = 0;
        int left = 0;

        while(left < s.length()){
           char leftChar = s.charAt(left);
           if(s.charAt(left+1)!=leftChar){
            count++;
           }
           left+= 2;
        }
        return count; 
    }
}