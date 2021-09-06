// Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
// Memory Usage: 36.1 MB, less than 99.06% of Java online submissions for Univalued Binary Tree.

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
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        Stack<TreeNode> s = new Stack<>();
        
        while (!s.isEmpty() || root != null) {
            while (root != null) {
                if (root.val != val)
                    return false;
                
                s.push(root.right);
                root = root.left;
            }
            
            root = s.pop();
        }
        
        return true;
    }
}