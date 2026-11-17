class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();
        int len = 0;
        int maxLen = 0;
        int left = 0;
        for(int i = 0;i<nums.length;i++){
            while(!maxQ.isEmpty() && nums[maxQ.peek()] < nums[i]){
                maxQ.poll();
            }
            maxQ.offerFirst(i);
            while(!minQ.isEmpty() && nums[minQ.peek()] > nums[i]){
                minQ.poll();
            }
            minQ.offerFirst(i);
            int max = maxQ.peekLast();
            int min = minQ.peekLast();
            if(nums[max] - nums[min] <= limit){
                len = i - left + 1;
                if(len > maxLen){
                    maxLen = len;
                }
            }
            else{
                while(!maxQ.isEmpty() && !minQ.isEmpty() && nums[maxQ.peekLast()] - nums[minQ.peekLast()] > limit){

                    left++;

                    while(!maxQ.isEmpty() && maxQ.peekLast() < left){
                        maxQ.pollLast();
                    }

                    while(!minQ.isEmpty() && minQ.peekLast() < left){
                        minQ.pollLast();
                    }
                }
            }
        }
        return maxLen;



        //brute force : O(n2)

        // int longestSub = 0;
        // for(int i = 0;i<nums.length;i++){
        //     int max = Integer.MIN_VALUE;
        //     int min = Integer.MAX_VALUE;
        //     int currLen = 0;
        //     for(int j = i;j<nums.length;j++){
        //         if(nums[j] > max){
        //             max = nums[j];
        //         }
        //         if(nums[j] < min){
        //             min = nums[j];
        //         }
        //         int absDiff = max - min;
        //         if(absDiff <= limit){
        //             currLen++;
        //             if(currLen > longestSub){
        //                 longestSub = currLen;
        //             }
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return longestSub;
    }
}