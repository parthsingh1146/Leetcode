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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null){
            return head;
        }
        int beginVal = 0;
        int endVal = 0;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size ++ ;
            if(size == k){
                beginVal = temp.val;
            }
            temp = temp.next;
        }
        temp = head;
        for(int i = 1;i<=k-1;i++){
            temp = temp.next;
        }
        int endPos = size - k + 1;
        ListNode temp2 = head;
        for(int i = 1;i<= endPos - 1;i++){
            temp2 = temp2.next;
        }
        endVal = temp2.val;
        temp2.val = beginVal;
        temp.val = endVal;

        return head;
    }
}