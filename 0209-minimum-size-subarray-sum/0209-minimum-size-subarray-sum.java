class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLen = nums.length + 1;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            while(sum >= target){
                int len = i - start + 1;
                if(len < minLen){
                    minLen = len;
                }
                
                sum -= nums[start];
                start++ ;
            }
        }
        if(minLen == nums.length + 1){
            return 0;
        }
        return minLen;
    }
}