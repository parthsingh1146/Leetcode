class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0;
        int ans = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            while(start < i && sum > goal){
                sum -= nums[start];
                start++;
            }
            int initial = start;
            if(sum == goal){
                ans++;
            }
            while(start < i && (sum - nums[start] == goal)){
                ans++;
                start++;
            }
            start = initial;
        }
        return ans;
    }
}