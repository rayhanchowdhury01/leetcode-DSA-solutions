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
     ArrayList<Integer> lst = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return buildMinTree(0, lst.size() - 1);
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            lst.add(root.val);
            inOrder(root.right);
        }
    }

    public TreeNode buildMinTree(int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        TreeNode tree = new TreeNode(lst.get(mid));

        tree.left = buildMinTree(l, mid - 1);
        tree.right = buildMinTree(mid + 1, r);

        return tree;
    }
    
}