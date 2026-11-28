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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }
    void helper(TreeNode root , String str, List<String> ans){
        if(root == null){
            return;
        }
        str = str + String.valueOf(root.val);
        if(root.left == null && root.right == null){
            ans.add(str);
            return;
        }
        str = str + "->";
        // left call
        helper(root.left,str,ans);

        // right call
        helper(root.right,str,ans);
    }
}