class NumArray {
    int[] arr;
    int[] prefixSum;
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];
        prefixSum = new int[n];
        // Array to store element
        for(int i = 0;i<n;i++){
            arr[i] = nums[i]; 
        }

        // prefix Sum array
        prefixSum[0] = 0;
        for(int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = prefixSum[right] - prefixSum[left] + arr[right];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */