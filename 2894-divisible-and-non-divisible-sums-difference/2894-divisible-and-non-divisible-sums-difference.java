class Solution {
    public int differenceOfSums(int n, int m) {
        int sumOfND = 0;
        int sumOfD = 0;
        for(int i = 1;i<=n;i++){
            if(i%m != 0){
                sumOfND += i;
            }
            else{
                sumOfD += i;
            }
        }
        return sumOfND - sumOfD;
    }
}