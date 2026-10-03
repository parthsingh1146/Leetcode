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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        // to find MidNode
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midNode = slow;
        ListNode reversedEnd = reverseList(midNode.next);
        ListNode temp1 = head;
        ListNode temp2 = reversedEnd;
        ListNode nextTemp1 = temp1.next;
        ListNode nextTemp2 = temp2.next;
        while(nextTemp2 != null){
            temp1.next = temp2;
            temp2.next = nextTemp1;
            temp1 = nextTemp1;
            temp2 = nextTemp2;
            nextTemp1 = nextTemp1.next;
            nextTemp2 = nextTemp2.next;
        }
        temp1.next = temp2;
        temp2.next = nextTemp1;
        if(nextTemp1 != null){
            nextTemp1.next = null;
        }
    }
    ListNode reverseList(ListNode head2){
        if(head2 == null || head2.next == null){
            return head2;
        }
        ListNode prevNode = head2;
        ListNode currNode = prevNode.next;
        ListNode nextNode = currNode.next;
        prevNode.next = null;
        while(nextNode != null){
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        currNode.next = prevNode;
        head2 = currNode;
        return head2;
    }
}