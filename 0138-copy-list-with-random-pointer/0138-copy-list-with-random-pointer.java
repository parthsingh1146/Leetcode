/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node ansHead = new Node(-1);
        Node ansTail = ansHead;
        Node temp1 = head;
        while(temp1!= null){
            Node newNode = new Node(temp1.val);
            ansTail.next = newNode;
            temp1 = temp1.next;
            ansTail = ansTail.next;
        }
        ansHead = ansHead.next;
        temp1 = head;
        ansTail = ansHead;
        HashMap<Node,Node> map = new HashMap<>();
        while(temp1 != null){
            map.put(temp1,ansTail);
            temp1 = temp1.next;
            ansTail = ansTail.next;
        }
        temp1 = head;
        ansTail = ansHead;
        while(temp1 != null){
            if(temp1.random!=null){
                ansTail.random = map.get(temp1.random);
            }
            temp1 = temp1.next;
            ansTail = ansTail.next;
        }
        return ansHead;
    }
}