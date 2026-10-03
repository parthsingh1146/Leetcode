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
    ListNode reverseList(ListNode midNode) {
        // if zero or 1 elemnt in list
        if(midNode == null || midNode.next == null){
            return midNode;
        }
        // logic
        ListNode prev = midNode;
        ListNode curr = prev.next;
        ListNode agla = curr.next;
        while(agla != null){
            curr.next = prev;
            if(prev == midNode){
                prev.next = null;
            }
            prev = curr;
            curr = agla;
            agla = agla.next;
        }
        // for last two nodes
        curr.next = prev;
        // if list have just two elements
        if(prev == midNode){
            prev.next = null;
        }
        midNode = curr;
        return midNode;
    }
}