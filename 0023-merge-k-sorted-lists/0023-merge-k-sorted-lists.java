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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode merged = mergeTwoLists(lists[0],lists[1]);
        for(int i = 2;i<lists.length;i++){
            merged = mergeTwoLists(merged,lists[i]);
        }
        return merged;
    }
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode ansHead = dummy;
        ListNode ansTail = dummy;

        while(list1!= null && list2 != null){
            if(list1.val<=list2.val){
                ansTail.next = list1;
                list1 = list1.next;
                ansTail = ansTail.next;
            }
            else{
                ansTail.next = list2;
                list2 = list2.next;
                ansTail = ansTail.next;
            }
        }
        if(list1!= null){
            ansTail.next = list1;
        }
        if(list2!= null){
            ansTail.next = list2;
        }

        ansHead = ansHead.next;

        return ansHead;
    }
}