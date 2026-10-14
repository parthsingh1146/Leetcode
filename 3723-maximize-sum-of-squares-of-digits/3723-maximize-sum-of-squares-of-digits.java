class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        while(sum>9 && ans.length()<num){
            ans.append(9);
            sum = sum - 9;
        }
        if(ans.length()<num){
            ans.append(sum);
            while(ans.length()<num){
                ans.append(0);
            }
            sum = 0;
        }
        if(sum == 0){
            return ans.toString();
        }
        else{
            return "";
        }
    }
}