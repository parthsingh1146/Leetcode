/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null){
            // check headB
            if(tempA == tempB){
                return tempA;
            }
            tempB = tempB.next;
            if(tempB == null){
                tempA = tempA.next;
                tempB = headB;
            }
        }
        return null;
    }
}