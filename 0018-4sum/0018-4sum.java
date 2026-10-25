class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length - 3;i++){
            for(int j = i+1;j<nums.length - 2;j++){
                int s = j+1;
                int e = nums.length - 1;
                while(s<e){
                    long sum = (long) nums[i] + nums[j] + nums[s] + nums[e];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[s]);
                        list.add(nums[e]);
                        if(!ans.contains(list)){
                           ans.add(list);
                        }
                        s++;
                        e--;
                    }
                    else if(sum > target){
                        e--;
                    }
                    else{
                        s++;
                    }
                }
            }
        }
        return ans;
    }
}