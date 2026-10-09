/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            if(temp.child == null){
                temp = temp.next;
            }
            else{
                Node nextNode = temp.next;
                temp.next = temp.child;
                temp.child.prev = temp;
                Node temp2 = temp.child;
                temp.child = null;
                while(temp2.next!=null){
                    temp2 = temp2.next;
                }
                temp2.next = nextNode;
                if(nextNode != null)
                    nextNode.prev = temp2;
                temp = temp.next;
            }
        }
        return head;
    }
}

// RECURSIVE SOLUTION
// class Solution {
//     public Node flatten(Node head) {
//         Node temp = head;
//         while(temp!=null){
//             if(temp.child==null){
//                 temp = temp.next;
//             }
//             else{
//                 Node nextNode = temp.next;
//                 Node flattendList = flatten(temp.child);
//                 temp.next = flattendList;
//                 flattendList.prev = temp;
//                 Node temp2 = flattendList;
//                 while(temp2.next!=null){
//                     temp2 = temp2.next;
//                 }
//                 temp2.next = nextNode;
//                 if(nextNode != null)
//                     nextNode.prev = temp2;
//                 temp.child = null;
//                 temp = temp.next;
//             }
//         }
//         return head;
//     }
// }