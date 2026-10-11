class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) != -1){
                while(sb.indexOf(String.valueOf(ch)) != -1){
                    sb.deleteCharAt(0);
                }
            }
            sb.append(ch);
            int len = sb.length();
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}