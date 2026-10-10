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
        int start = 0;
        int end = lists.length-1;
        return divisions(lists,start,end);
    }
    ListNode divisions(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        if(end - start == 1){
            return mergeTwoLists(lists[start],lists[end]);
        }
        int mid = (start + end)/2;
        ListNode divi1 = divisions(lists,start,mid);
        ListNode divi2 = divisions(lists,mid+1,end);
        return mergeTwoLists(divi1,divi2);
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