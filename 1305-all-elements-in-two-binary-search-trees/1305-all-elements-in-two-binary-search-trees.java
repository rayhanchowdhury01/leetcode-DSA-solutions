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
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        Inorder(root1);
        Inorder(root2);
        while (!pq.isEmpty()) res.add(pq.poll());
        return res;
    }

    public void Inorder(TreeNode tree) {
        if (tree != null) {
            Inorder(tree.left);
            pq.offer(tree.val);
            Inorder(tree.right);
        }
    }
}