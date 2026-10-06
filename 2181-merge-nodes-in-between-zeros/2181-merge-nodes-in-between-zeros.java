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
    public ListNode mergeNodes(ListNode head) {
        ListNode ansHead = head.next;
        ListNode ansTemp = ansHead;
        ListNode temp = head.next;
        temp = temp.next;
        while(temp.next!=null){
            if(temp.val != 0){
                ansTemp.val += temp.val;
                temp = temp.next;
            }
            else{
                ansTemp.next = temp;
                ansTemp = ansTemp.next;
                temp = temp.next;
            }
        }
        ansTemp.next = null;
        return ansHead;
    }
}