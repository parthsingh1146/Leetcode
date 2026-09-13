class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        solve(nums,n,0,list,ans,k);
        return ans;
    }
    void solve(int[] nums, int target,int index,List<Integer> list,List<List<Integer>> ans,int k){
        // Base Case
        if(target == 0){
            if(list.size() == k)
                ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0 || index == nums.length || list.size() > k){
            return;
        }
        // include wali call
        list.add(nums[index]);
        solve(nums, target - nums[index] , index + 1, list,ans,k);

        // exclude wali call
        list.removeLast();
        solve(nums, target,index + 1, list,ans,k);
    }
}