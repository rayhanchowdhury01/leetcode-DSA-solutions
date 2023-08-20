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
   int flag, x = 0,res=0;

    public int kthSmallest(TreeNode root, int k) {
        flag = k;
        return inOrder(root);
    }

    public int inOrder(TreeNode tree) {
        if (tree.left != null) inOrder(tree.left);
        x++;
        if (x == flag) res= tree.val;
        if (tree.right != null) inOrder(tree.right);
        return res;
    }
}