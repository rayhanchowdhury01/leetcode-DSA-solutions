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
   int sum = 0, l, h;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        l = low;
        h = high;
        Helper(root);
        return sum;

    }

    public void Helper(TreeNode root) {
        if (root.left != null) Helper(root.left);
        if (root.val >= l && root.val <= h) sum += root.val;
        if (root.right != null) Helper(root.right);
    }
}