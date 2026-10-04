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
        // find size
        ListNode sizeWala = head;
        int size = 0;
        while(sizeWala != null){
            size++;
            sizeWala = sizeWala.next;
        }
        k = k % size;
        for(int i = 1;i<=k;i++){
            ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode newNode = temp.next;
            temp.next = null;
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}