class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> q = new ArrayDeque<>();
       int[] ans = new int[nums.length - (k-1)];
       int left = 0;
       int right = left + (k-1);
       for(int i = left;i<right;i++){
        while(!q.isEmpty() && q.peek() < nums[i]){
            q.poll();
        }
        q.offerFirst(nums[i]);
       }
       int index = 0;
       while(right < nums.length){
            // insert right
            while(!q.isEmpty() && q.peek() < nums[right]){
                q.poll();
            }
            q.offerFirst(nums[right]);

            // max val
            ans[index] = q.peekLast();

            // update left
            if(q.peekLast() == nums[left]){
                q.pollLast();
            }
            index++;
            left++;
            right++;
       }
       return ans;
    }
}