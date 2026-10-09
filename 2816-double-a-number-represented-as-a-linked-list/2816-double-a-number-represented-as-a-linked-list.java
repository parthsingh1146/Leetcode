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
    public ListNode doubleIt(ListNode head) {
        // reverse list
        ListNode reversedList = reverse(head);
        // multiply each element by 2 , forward carry to nextelement
        ListNode temp = reversedList;
        int carry = 0;
        ListNode prev = null;
        while(temp!=null){
            int value = temp.val * 2 + carry;
            temp.val = value % 10;
            carry = value/10;
            prev = temp;
            temp = temp.next;
        }
        if(carry!=0){
            ListNode carrNode = new ListNode(carry);
            prev.next = carrNode;
        }
        // reverse list
        ListNode ans = reverse(reversedList);
        return ans;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}