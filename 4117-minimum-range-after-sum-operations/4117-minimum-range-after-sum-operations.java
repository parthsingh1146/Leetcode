class Solution {
    public int minRange(int a, int b, int c) {
        int sum = a + b + c;
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int cond1ans = max - min;
        int remain = sum - max - min;
        max = remain + min;
        int cond2ans = max - min;

        return Math.min(cond1ans , cond2ans);
    }
}