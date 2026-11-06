class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] arr = new int[nums.length+1];
        arr[0] = 1;
        int sum = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int remain = sum - goal;
            if(remain >= 0){
                ans += arr[remain];
            }
            arr[sum]++;
        }
        return ans;
    }
}