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
        List<Integer> criticalNodes = new ArrayList<>();
        int index = 1;
        while(postTemp!=null){
            index++;
            // local maxima
            if(temp.val > preTemp.val && temp.val > postTemp.val){
                criticalNodes.add(index);
            }
            // local minima
            else if(temp.val < preTemp.val && temp.val < postTemp.val){
                criticalNodes.add(index);
            }
            preTemp = temp;
            temp = postTemp;
            postTemp = postTemp.next;
        }
        int n = criticalNodes.size();
        int[] criticalNodesArray = new int[n];
        int i = 0;
        int minDiff = Integer.MAX_VALUE;
        int prevVal = 0;
        for(int v : criticalNodes){
            if(prevVal != 0){
                int diff = v - prevVal;
                if(diff<minDiff){
                    minDiff = diff;
                }
            }
            criticalNodesArray[i++] = v;
            prevVal = v;
        }
        if(n == 0 || n == 1){
            return new int [] {-1,-1};
        }
        // if(n == 1){
        //     return new int [] {criticalNodesArray[0],criticalNodesArray[0]};
        // }
        int maxDiff = criticalNodesArray[n-1] - criticalNodesArray[0];
        return new int [] {minDiff,maxDiff};
    }
}