class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        int[] ans = new int[k];

        list.addAll(map.entrySet());
        Collections.sort(list, (a,b)->b.getValue()- a.getValue());
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}