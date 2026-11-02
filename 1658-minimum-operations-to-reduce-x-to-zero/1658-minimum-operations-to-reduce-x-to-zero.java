class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        // step 1: calculate totalSum
        long totalSum = 0;
        for(int element : nums){
            totalSum += element;
        }
        long target = totalSum - x ;
        // step 2: find len of maximum subarray whose sum = totalSum - x;
        long currSum = 0;
        int startIndex = 0;
        int maxLen = -1;
        for(int i = 0;i<n;i++){
            currSum += nums[i];
            while(startIndex <= i && currSum > target){
                currSum -= nums[startIndex];
                startIndex++;
            }
            if(currSum == target){
                int len = i - startIndex + 1;
                if(len > maxLen){
                    maxLen = len;
                }
            }
        }
        // step 3: ans = nums.length - maxLen
        if(maxLen == -1){
            return -1;
        }
        return n - maxLen;
    }
}