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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int currDia = heightOfBT(root.left) + heightOfBT(root.right);
        int childDia = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(currDia,childDia);
    }
    int heightOfBT(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(heightOfBT(root.left),heightOfBT(root.right));
    }
    
}