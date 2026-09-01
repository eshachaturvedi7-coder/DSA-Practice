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
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Maximum contribution from left subtree
        int leftGain = Math.max(0, dfs(root.left));

        // Maximum contribution from right subtree
        int rightGain = Math.max(0, dfs(root.right));

        // Path passing through current node
        int currentPath = leftGain + root.val + rightGain;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPath);

        // Return maximum one-sided path to parent
        return root.val + Math.max(leftGain, rightGain);
    }
}