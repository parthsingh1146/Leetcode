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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = prevNode.next;
        ListNode nextNode = currNode.next;
        prevNode.next = null;
        // while(nextNode != null){
        //     currNode.next = prevNode;
        //     prevNode = currNode;
        //     currNode = nextNode;
        //     nextNode = nextNode.next;
        // }
        // currNode.next = prevNode;
        // head = currNode;
        // return head;
        return solve(prevNode,currNode,nextNode);
    }
    ListNode solve(ListNode prevNode, ListNode currNode, ListNode nextNode){
        // base case
        if(nextNode == null){
            currNode.next = prevNode;
            return currNode;
        }
        currNode.next = prevNode;
        return solve(currNode,nextNode,nextNode.next);
    }
}