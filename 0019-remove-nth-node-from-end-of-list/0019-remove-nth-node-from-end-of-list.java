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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1){
            head = null;
            return head;
        }
        ListNode prev = head;
        ListNode curr = head;
        for(int i = 1;i<=n;i++){
            curr = curr.next;
        }
        if(curr == null){
            return head.next;
        }
        while(curr != null && curr.next!=null){
            curr = curr.next;
            prev = prev.next;
        }
        if(prev.next == head){
            return head.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}