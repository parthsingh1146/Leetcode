class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return num;
        //     }

        //     set.add(num);
        // }
        // return 0;

        // O(nlogn) TC &  O(1) space solution
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] == i+1){
        //         continue;
        //     }
        //     if(nums[i] > i+1){

        //     }
        // }

        // O(n) time Complexity and O(1) space complexity
        int i = 0;
        while (i < nums.length) {
            int value = nums[i];
            if(nums[i] == i + 1){
                // perfect skip this
                i++;
                continue;
            }
            if(nums[i] == nums[value - 1]){
                return nums[i];
            }
            // swap
            int temp = nums[value - 1];
            nums[value - 1] = nums[i];
            nums[i] = temp;
        }
        return 0;
    }
}