/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        // check val
        if(p.val != q.val){
            return false;
        }
        // check in left
        boolean leftAns = isSameTree(p.left,q.left);
        // check right 
        boolean rightAns = isSameTree(p.right,q.right);

        return leftAns && rightAns;
    }
}