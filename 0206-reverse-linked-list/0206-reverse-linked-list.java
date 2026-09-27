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
    public ListNode reverseList(ListNode head) {
        // if zero or 1 elemnt in list
        if(head == null || head.next == null){
            return head;
        }
        // logic
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode agla = curr.next;
        while(agla != null){
            curr.next = prev;
            if(prev == head){
                prev.next = null;
            }
            prev = curr;
            curr = agla;
            agla = agla.next;
        }
        // for last two nodes
        curr.next = prev;
        // if list have just two elements
        if(prev == head){
            prev.next = null;
        }
        head = curr;
        return head;
    }
}