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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next == null){
            return head;
        }
        ListNode sizeWala = head;
        int size = 0;
        while(sizeWala != null){
            size++;
            sizeWala = sizeWala.next;
        }
        k = k % size;
        if(k == 0){
            return head;
        }
        int pos = size - k;
        ListNode temp1 = head;
        for(int i = 1;i<= pos -1 ;i++){
            temp1 = temp1.next;
        }
        ListNode temp2head = temp1.next;
        temp1.next = null;
        ListNode temp2 = temp2head;
        while(temp2.next!= null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        head = temp2head;
        return head;
    }
}