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
    int getSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    public int[] nextLargerNodes(ListNode head) {
        Deque<int[]> st = new ArrayDeque<>();
        // int[0] -> value , int[1] -> index

        int n = getSize(head);
        int[] ans = new int[n];
        ListNode temp = head;
        int index = 0;
        while(temp!= null){
            while(!st.isEmpty() && st.peek()[0] < temp.val){
                ans[st.peek()[1]] = temp.val;
                st.pop();
            }
            st.push(new int[] {temp.val,index});
            index++;
            temp = temp.next;
        }
        return ans;
    }
}