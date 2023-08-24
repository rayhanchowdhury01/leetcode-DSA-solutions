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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return BuildMinBST(nums, 0, nums.length-1);
        
    }
    public TreeNode BuildMinBST(int[] a, int l, int r){
        if(l > r) return null;
        int mid = (l + r) / 2;
        TreeNode tree = new TreeNode(a[mid]);
        
        tree.left = BuildMinBST(a, l, mid-1);
        tree.right = BuildMinBST(a, mid+1, r);
        
        return tree;
    }
}