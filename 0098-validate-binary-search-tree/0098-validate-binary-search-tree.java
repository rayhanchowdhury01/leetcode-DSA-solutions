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
    long min = Long.MIN_VALUE;
    long max = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        return Solve(root, min, max);
    }

    public boolean Solve(TreeNode tree, long min, long max) {
        if (tree == null) return true;
        if (tree.val <= min || tree.val >= max) return false;
        boolean isLeftValid = Solve(tree.left, min, tree.val);
        return (isLeftValid && Solve(tree.right, tree.val, max));
    }


}