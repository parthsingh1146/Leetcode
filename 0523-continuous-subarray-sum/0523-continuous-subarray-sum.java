class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int sumModK = sum % k;
            if(map.containsKey(sumModK)){
                int index = map.get(sumModK);
                int len = i - index;
                if(len >= 2){
                    return true;
                }
            } else {
                map.put(sumModK,i);
            }
        }
        return false;
    }
}