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
     public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) return root;
        if (root == null) return null;
        TreeNode current = root;
        while (current != null) {
            if (val < current.val) current = current.left;
            else if (val > current.val) current = current.right;
            else return current;
        }
        return null;
    }

}