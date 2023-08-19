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
    int previous = Integer.MAX_VALUE;
    int res = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        return InOrder(root);
    }

    public int InOrder(TreeNode root) {
        if (root.left != null) InOrder(root.left);
        res = Math.min(res, Math.abs(root.val - previous));
        previous = root.val;
        if (root.right != null) InOrder(root.right);
        return res;
    }
}