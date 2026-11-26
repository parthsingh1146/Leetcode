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
    int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfBT(root);
        return maxDia;
    }
    int heightOfBT(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);
        int currHeight = 1 + Math.max(leftHeight,rightHeight);
        int currDiameter = leftHeight + rightHeight;
        maxDia = Math.max(currDiameter,maxDia);
        return currHeight;
    }
}