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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return maxSum;
    }

    public int maxPathSumUtil(TreeNode root){
        if(root == null) 
            return 0;
        
        int ls = Math.max(0, maxPathSumUtil(root.left));
        int rs = Math.max(0, maxPathSumUtil(root.right));

        int val = root.val;

        maxSum = Math.max(maxSum, Math.max(ls + rs + root.val, root.val));

        return val + Math.max(ls, rs);
    }
}