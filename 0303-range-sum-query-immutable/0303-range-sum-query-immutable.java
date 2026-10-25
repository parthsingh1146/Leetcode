class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];
        // Array to store prefixSum
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            prefixSum[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = prefixSum[right];
        if(left>0){
            sum -= prefixSum[left-1];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */