class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Deque<Integer> st = new ArrayDeque<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int v : nums2){
            while(!st.isEmpty() && st.peek() < v){
                int topVal = st.pop();
                map.put(topVal , v);
            }
            st.push(v);
        }
        for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
            else{
                ans[i] = -1;
            }
        }
        return ans;
     }
}