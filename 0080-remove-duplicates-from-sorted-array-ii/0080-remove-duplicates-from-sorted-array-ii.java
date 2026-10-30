class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;
        int count = 1;
        int i = 1;
        while(i < n){
            if(nums[i] == nums[i-1]){
                count++;
            }
            nums[k] = nums[i];
            k++;
            i++;
            while(i< n && count == 2 && nums[i] == nums[i-1]){
                i++;
            }
            if(i == n){
                return k;
            }
            count = 1;
        }
        return k;
    }
}