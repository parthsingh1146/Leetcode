class Solution {
    public int pivotIndex(int[] nums) {
       int totalSum = 0;
       for(int n : nums){
            totalSum += n;
       }
       int prefixSum = 0;
       for(int i = 0;i<nums.length;i++){
            int suffixSum = totalSum - (prefixSum + nums[i]);
            if(prefixSum == suffixSum){
                return i;
            }
            prefixSum += nums[i];
       }
       return -1;
    }   
}