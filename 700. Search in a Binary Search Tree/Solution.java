// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
// Memory Usage: 39.7 MB, less than 81.88% of Java online submissions for Search in a Binary Search Tree.

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        while (root != null) {
            if (val == root.val)
                return root;
            
            if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }
        
        return null;
    }
}