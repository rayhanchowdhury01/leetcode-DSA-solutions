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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> res = new ArrayList<>();
        Inorder(root1, pq);
        Inorder(root2, pq);
        while (!pq.isEmpty()) res.add(pq.poll());
        return res;
    }

    public static void Inorder(TreeNode tree, PriorityQueue<Integer> pq) {
        if (tree != null) {
            Inorder(tree.left, pq);
            pq.offer(tree.val);
            Inorder(tree.right, pq);
        }
    }
}