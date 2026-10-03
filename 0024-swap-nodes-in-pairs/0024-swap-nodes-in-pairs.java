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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode lastNode = head;
        ListNode prevNode = head;
        ListNode currNode = prevNode.next;
        ListNode nextNode = currNode.next;
        head = currNode;
        while(nextNode!= null && nextNode.next!=null){
            lastNode.next = currNode;
            currNode.next = prevNode;
            prevNode.next = nextNode;
            lastNode = prevNode;
            prevNode = nextNode;
            currNode = nextNode.next;
            nextNode = nextNode.next.next;
        }
        lastNode.next = currNode;
        currNode.next = prevNode;
        prevNode.next = nextNode;
        if(nextNode != null){
            nextNode.next = null;
        }
        return head;
    }
}