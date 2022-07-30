// Runtime: 1 ms, faster than 80.16% of Java online submissions for Flatten Binary Tree to Linked List.
// Memory Usage: 42.6 MB, less than 67.36% of Java online submissions for Flatten Binary Tree to Linked List.

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
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                // Get predecessor
                TreeNode pred = root.left;
                while (pred.right != null) pred = pred.right;
                
                pred.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            
            root = root.right;
        }
    }
}
