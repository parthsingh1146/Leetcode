class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int validPos = -1;
        for(int i = 0;i<n;i++){
            if(digits[i]<9){
                validPos = i;
            }
        }
        if(validPos == -1){
            int[] result = new int[n+1];
            result[0] = 1;
            return result;
        }
        digits[validPos] += 1;
        for(int i = validPos + 1;i<n;i++){
            digits[i] = 0;
        }
        return digits;
    }
}