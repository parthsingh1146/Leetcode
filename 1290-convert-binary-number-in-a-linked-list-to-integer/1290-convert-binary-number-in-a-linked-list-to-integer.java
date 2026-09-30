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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int index = -1;
        while(temp!= null){
            index++;
            temp = temp.next;
        }
        temp = head;
        int ans = 0;
        while(temp!= null){
            int data = temp.val;
            ans = ans +  (int)Math.pow(2,index)*data;
            temp = temp.next;
            index--;
        }
        return ans;
    }
}