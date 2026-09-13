class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,0,list,ans);
        return ans;
    }
    void solve(int[] candidates,int target,int sum ,int index,List<Integer> list,List<List<Integer>> ans){
        if(sum == target){
            if(!ans.contains(list))
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target || index == candidates.length){
            return;
        }
        // // // include wali call
        // list.add(candidates[index]);
        // solve(candidates,target,sum + candidates[index],index + 1,list,ans);

        // // // exclude wali call
        // list.removeLast();
        // solve(candidates,target,sum,index + 1,list,ans);
        for(int i = index;i<candidates.length;i++){
            if(i> index && candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            solve(candidates,target,sum + candidates[i],i+1,list,ans);
            list.removeLast();
        }
    }
}