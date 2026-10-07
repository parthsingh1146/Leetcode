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
    public ListNode partition(ListNode head, int x) {
        ListNode lowHead = new ListNode(-1);
        ListNode lowTail = lowHead;
        ListNode upperHead = new ListNode(-1);
        ListNode upperTail = upperHead;
        
        ListNode temp = head;

        while(temp!= null){
            if(temp.val<x){
                lowTail.next = temp;
                lowTail = lowTail.next;
            }
            else{
                upperTail.next = temp;
                upperTail = upperTail.next;
            }
            temp = temp.next;
        }
        upperTail.next = null;
        if(lowHead.next == null){
            return upperHead.next;
        }
        lowTail.next = upperHead.next;
        return lowHead.next;
    }
}