class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            // for each char
            char c = s.charAt(i);
            // find reversed value of c 
            int value = 26 - (c - 'a');
            // multiply with index and add in sum
            sum += value*(i+1);
        }
        return sum;
    }
}