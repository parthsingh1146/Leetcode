class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            // +1 or -1
            if(nums[i] == 1){
                sum += 1;
            }
            else{
                sum -= 1;
            }

            if(map.containsKey(sum)){
                int initialIndex = map.get(sum);
                int len = i - initialIndex;
                if(len > maxLen){
                    maxLen = len;
                }
            }
            else{
                map.put(sum , i);
            }
        }
        return maxLen;
    }
}