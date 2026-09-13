class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(candidates, target, 0, 0, list,ans);
        return ans;
    }
    void solve(int[] candidates, int target, int sum, int index,List<Integer> list,List<List<Integer>> ans){
        // Base Case
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>target || index == candidates.length){
            return;
        }

        // include wali call
        list.add(candidates[index]);
        solve(candidates, target, sum + candidates[index], index, list,ans);

        // exclude wali call
        list.removeLast();
        solve(candidates, target, sum, index + 1, list,ans);
    }
}