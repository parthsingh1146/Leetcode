class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int maxLen = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                k--;
            }
            while(k < 0){
                if(nums[start] == 0){
                    k++;
                }
                start++;
            }
            int len = i - start + 1;
            if(len > maxLen){
                maxLen = len;
            }
        }
        return maxLen;
    }
}