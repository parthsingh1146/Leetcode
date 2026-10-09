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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int elementsPerGroup = size / k;
        int remainingElements = size % k;
        temp = head;
        ListNode[] ans = new ListNode[k];
        int index = 0;
        while(temp!=null){
            int totalElements = elementsPerGroup;
            if(remainingElements != 0){
                totalElements = elementsPerGroup + 1;
                remainingElements -- ;
            }
            ListNode partHead = temp;
            ListNode partTail = partHead;
            for(int i = 1;i<=totalElements - 1 && temp!=null;i++){
                partTail = partTail.next;
                temp = temp.next;
            }
            temp = temp.next;
            partTail.next = null;
            ans[index++] = partHead;
        }
        return ans;
    }
}