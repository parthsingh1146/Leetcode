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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        Map<Integer,Integer> map = new TreeMap<>();
        while(temp!= null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        temp = head;
        for(int key : map.keySet()){
            int value = map.get(key);
            for(int i = 1;i<=value;i++){
                temp.val = key;
                temp = temp.next;
            }
        }
        return head;
    }
}