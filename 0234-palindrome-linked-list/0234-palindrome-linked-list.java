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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = slow.next;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middleNode = slow;
        ListNode reversed = reverseList(middleNode.next);
        ListNode temp1 = head;
        ListNode temp2 = reversed;
        while(temp2!=null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
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