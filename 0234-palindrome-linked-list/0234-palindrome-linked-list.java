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

    ListNode getMidPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode list2 = getMidPoint(head);

        ListNode temp = head;
        while(temp.next != list2){
            temp = temp.next;
        }
        temp.next = null;

        ListNode head2 = reverseList(list2);
        
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1 != null && temp2!=null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}