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
    
     public TreeNode deleteNode(TreeNode root, int key) {
        return Delete(root, key);
    }

    public TreeNode Delete(TreeNode tree, int val) {
        if (tree == null) return null;
        if (val < tree.val) {
            tree.left = deleteNode(tree.left, val);
            return tree;
        } else if (val > tree.val) {
            tree.right = deleteNode(tree.right, val);
            return tree;
        } else {
            if (tree.left == null) return tree.right;
            else if (tree.right == null) return tree.left;
            else {
                int min = MinValue(tree.right);
                tree.val = min;
                tree.right = deleteNode(tree.right, min);
                return tree;
            }

        }
    }

    public int MinValue(TreeNode tree) {
        if (tree.left == null) return tree.val;
        else return MinValue(tree.left);
    }
}