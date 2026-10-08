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
    public ListNode reverseKGroup(ListNode head, int k) {
        // to find head;
        ListNode temp = head;
        for(int i = 1;i<= k - 1;i++){
            temp = temp.next;
        }
        ListNode prev = head;
        ListNode verifyTemp = head;
        ListNode curr = head.next;
        ListNode lastNode = null;
        ListNode prevHead = prev;
        head = temp;
        while(curr!=null){
            for(int i = 1;i<= k - 1;i++){
                verifyTemp = verifyTemp.next;
                if(verifyTemp == null){
                    return head;
                }
            }
            for(int i = 1;i<=k-1 && curr!=null;i++){
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            if(lastNode!=null){
                lastNode.next = prev;
            }
            prevHead.next = curr;
            lastNode = prevHead;
            prevHead = curr;
            prev = curr;
            if(curr == null){
                break;
            }
            verifyTemp = prevHead;
            curr = curr.next;
        }
        return head;
    }
}