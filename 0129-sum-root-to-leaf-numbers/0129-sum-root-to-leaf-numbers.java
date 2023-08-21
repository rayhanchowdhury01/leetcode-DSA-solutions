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
    public int sumNumbers(TreeNode root) {

        ArrayList<String> lst = new ArrayList<>();
        lst = inOrder(lst, root, "");
        int sum = 0;
        for (String i : lst) sum += Integer.parseInt(i);
        return sum;
    }

    public ArrayList<String> inOrder(ArrayList<String> lst, TreeNode tree, String s) {

        if (tree == null) return lst;
        s += tree.val;
        if (tree.left == null && tree.right == null) lst.add(s);

        inOrder(lst, tree.left, s);
        inOrder(lst, tree.right, s);
        return lst;
    }
}