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
     
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Inorder(root1, l1);
        Inorder(root2, l2);
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                res.add(l1.get(i));
                i++;
            } else if (l2.get(j) < l1.get(i)) {
                res.add(l2.get(j));
                j++;
            } else {
                res.add(l2.get(j));
                res.add(l2.get(j));
                i++;
                j++;
            }

        }
        while (i < l1.size()) res.add(l1.get(i++));
        while (j < l2.size()) res.add(l2.get(j++));
        return res;
    }
    
    public static void Inorder(TreeNode tree, List<Integer> list) {
        if (tree != null) {
            Inorder(tree.left, list);
            list.add(tree.val);
            Inorder(tree.right, list);
        }
    }
}