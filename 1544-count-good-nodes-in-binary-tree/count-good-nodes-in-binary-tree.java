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

    int count = 1;

    public int goodNodes(TreeNode root) {
        count = 1;
        int max = root.val;

        solve(root, max);

        return count;
    }

    void solve(TreeNode root, int max) {

        if (root == null) {
            return;
        }

        if (root.left != null) {

            int leftMax = max;

            if (root.left.val >= max) {
                count++;
                leftMax = root.left.val;
            }

            solve(root.left, leftMax);
        }
        if (root.right != null) {

            int rightMax = max;

            if (root.right.val >= max) {
                count++;
                rightMax = root.right.val;
            }

            solve(root.right, rightMax);
        }
    }
}