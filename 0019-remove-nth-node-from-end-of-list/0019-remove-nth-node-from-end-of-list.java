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
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int pos = size - n;
        if(pos == 0){
            head = head.next;
            return head;
        }
        for(int i = 1;i<= pos - 1;i++){
            temp = temp.next;
        }
        ListNode nextNode = temp.next.next;
        temp.next = nextNode;
        return head;
    }
}