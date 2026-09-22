class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x = num;
        for(int i = 1;i<=t;i++){
            x = x + 2;
        }
        return x;
    }
}