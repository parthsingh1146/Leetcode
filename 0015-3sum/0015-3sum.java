class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length - 2;i++){

            int j = i+1;
            int k = nums.length - 1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    while(j < k && nums[j+1] == nums[j]){
                        j++;
                    }
                    while(j < k && nums[k-1] == nums[k]){
                        k--;
                    }
                    j++;
                    k--;

                }
                else if (sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
            while(i+1 < nums.length && nums[i+1] == nums[i]){
                i++;
            }
        }
        return ans;

        // Set<List<Integer>> ans = new HashSet<>();

        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length - 2; i++) {

        //     int l = i + 1;
        //     int r = nums.length - 1;

        //     while (l < r) {

        //         int sum = nums[i] + nums[l] + nums[r];

        //         if (sum == 0) {

        //             List<Integer> sol = new ArrayList<>();
        //             sol.add(nums[i]);
        //             sol.add(nums[l]);
        //             sol.add(nums[r]);

        //             ans.add(sol);

        //             l++;
        //             r--;
        //         }
        //         else if (sum < 0) {
        //             l++;
        //         }
        //         else {
        //             r--;
        //         }
        //     }
        // }

        // return new ArrayList<>(ans);
    }
}