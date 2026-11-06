class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length + 1];
        int noOfOdds = 0;
        arr[0] = 1;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 != 0){
                noOfOdds++;
            }
            if(noOfOdds - k >= 0){
                ans += arr[noOfOdds - k];
            }
            arr[noOfOdds]++;
        }
        return ans;
    }
}