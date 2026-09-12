class Solution {
    public String largestOddNumber(String num) {
        int p = num.length()-1;
        while(p>=0){
            // check element a p-th index
            int v = num.charAt(p) - 48;

            // check if v is odd
            if(v%2!=0){
                return num.substring(0,p+1);
            }
            p--;
        }
        return "";
    }
}