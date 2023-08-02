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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        InOrder(lst, root);
        return lst;
    }

    public static void InOrder(List<Integer> lst, TreeNode root) {
        if (root == null) return;
        InOrder(lst, root.left);
        lst.add(root.val);
        InOrder(lst, root.right);

    }
}
