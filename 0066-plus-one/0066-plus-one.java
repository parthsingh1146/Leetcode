class Solution {
    public int[] plusOne(int[] digits) {
        // int n = digits.length - 1;
        // if(digits[n]==9){
        //     boolean done = false;
        //     digits[n] = 0;
        //     for(int i = n-1;i>=0;i--){
        //         if(digits[i]<9){
        //             digits[i]++;
        //             done = true;
        //             break;
        //         }
        //         else{
        //             digits[i] = 0;
        //         }
        //     }
        //     if(!done){
        //         int[] newArr = new int[digits.length+1];
        //         newArr[0] = 1;
        //         return newArr;
        //     }
        // }
        // else {
        //     digits[n] = digits[n] + 1;
        // }
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
            for(int i = 1;i<result.length;i++){
                result[i] = 0;
            }
            return result;
        }
        digits[validPos] += 1;
        for(int i = validPos + 1;i<n;i++){
            digits[i] = 0;
        }
        return digits;
    }
}