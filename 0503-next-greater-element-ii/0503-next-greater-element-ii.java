class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        int count = 1;
        int i = 0;
        while(count <= 2){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                ans[st.pop()] = nums[i];
            }
            st.push(i);
            i++;
            if(i == nums.length){
                i = 0;
                count++;
            }
        }
        return ans;
    }
}