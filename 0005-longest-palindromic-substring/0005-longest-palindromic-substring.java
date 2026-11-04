class Solution {
    public String longestPalindrome(String s) {
        int i = 0;
        String maxPalin = "";
        while(i < s.length()){
            int j = i;
            while(j<s.length()){
                if(s.charAt(j) == s.charAt(i)){
                    // check isPalin
                    String subs = s.substring(i,j+1);
                    if(isPalin(subs)){
                        int len = subs.length();
                        if(len > maxPalin.length()){
                            maxPalin = subs;
                        }
                    }
                }
                j++;
            }
            i++;
        }
        return maxPalin;
    }
    boolean isPalin(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}