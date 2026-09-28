class Solution {
    public int maxProduct(int n) {
        int v = n;
        // digits of n
        int digitCount = 0;
        while(v != 0){
            digitCount++;
            v = v/10;
        }
        v = n;
        int[] arr = new int[digitCount+1];
        int i = 0;
        while(v>0){
            int r = v % 10;
            arr[i++] = r;
            v = v/10;
        }
        Arrays.sort(arr);
        return arr[digitCount] * arr[digitCount-1];
    }
}