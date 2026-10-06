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
        ListNode ansHead = null;
        ListNode ansTemp = ansHead;
        ListNode temp = head.next;
        while(temp.next!=null){
            if(temp.val != 0){
                if(ansHead == null){
                    ansHead = temp;
                    ansTemp = ansHead;
                }
                else{
                    ansTemp.val += temp.val;
                }
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
        // ListNode temp = head.next;
        // ListNode ansHead = new ListNode(0);
        // ListNode ansTemp = ansHead;
        // while(temp.next!= null){
        //     if(temp.val!=0){
        //         ansTemp.val += temp.val;
        //     }
        //     else{
        //         ansTemp.next = new ListNode(0);
        //         ansTemp = ansTemp.next;
        //     }
        //     temp = temp.next;
        // }
        // return ansHead;
    }
}