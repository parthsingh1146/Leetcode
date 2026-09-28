class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int max = 0;
        int secMax = 0;
        while(temp > 0){
            int r = temp % 10;
            if(r > max){
                secMax = max;
                max = r;
            }
            else if ( r >= secMax){
                secMax = r;
            }
            temp = temp/10;
        }
        return max * secMax;
    }
}