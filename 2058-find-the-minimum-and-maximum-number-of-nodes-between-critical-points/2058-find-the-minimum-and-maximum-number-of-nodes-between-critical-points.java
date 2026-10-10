/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head.next;
        if(temp.next == null){
            return new int [] {-1,-1};
        }
        ListNode preTemp = head;
        ListNode postTemp = temp.next;
        int index = 1;
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = 0;
        int prevIndex = -1;
        int startingIndex = -1;
        while(postTemp!=null){
            index++;
            // local maxima
            if(temp.val > preTemp.val && temp.val > postTemp.val){
                if(prevIndex != -1){
                    int diff = index - prevIndex;
                    if(diff < minDiff){
                        minDiff = diff;
                    }
                }
                prevIndex = index;
                if(startingIndex != -1){
                    maxDiff = index - startingIndex;
                }else{
                    startingIndex = index;
                }
            }
            // local minima
            else if(temp.val < preTemp.val && temp.val < postTemp.val){
                if(prevIndex != -1){
                    int diff = index - prevIndex;
                    if(diff < minDiff){
                        minDiff = diff;
                    }
                }
                prevIndex = index;
                if(startingIndex != -1){
                    maxDiff = index - startingIndex;
                }else{
                    startingIndex = index;
                }
            }
            preTemp = temp;
            temp = postTemp;
            postTemp = postTemp.next;
        }
        if(minDiff == Integer.MAX_VALUE){
            return new int [] {-1,-1};
        }
        return new int[] {minDiff, maxDiff};
    }
}