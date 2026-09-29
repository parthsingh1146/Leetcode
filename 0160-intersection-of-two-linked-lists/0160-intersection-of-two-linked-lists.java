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
        // while(tempA!=null){
        //     // check headB
        //     if(tempA == tempB){
        //         return tempA;
        //     }
        //     tempB = tempB.next;
        //     if(tempB == null){
        //         tempA = tempA.next;
        //         tempB = headB;
        //     }
        // }
        // find lengths
        int len1 = 1;
        while(tempA.next!=null){
            len1++;
            tempA = tempA.next;
        }
        int len2 = 1;
        while(tempB.next!=null){
            len2++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(len1 <= len2){
            // diff
            int diff = len2 - len1;
            for(int i = 1;i<= diff;i++){
                tempB = tempB.next;
            }
        }else{
            int diff = len1 - len2;
            for(int i = 1;i<= diff;i++){
                tempA = tempA.next;
            }
        }
        while(tempA !=null && tempB != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null; 
    }
}