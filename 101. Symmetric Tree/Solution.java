// Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
// Memory Usage: 38.2 MB, less than 30.54% of Java online submissions for Symmetric Tree.

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
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root.left);
        q.add(root.right);
        
        TreeNode n1 = root.left;
        TreeNode n2 = root.right;
        
        while (!q.isEmpty()) {
            n1 = q.remove();
            n2 = q.remove();
            
            if (n1 == null && n2 == null) continue;
            
            if ((n1 == null || n2 == null)
                || n1.val != n2.val)
                return false;
            
            q.add(n1.right);
            q.add(n2.left);
            q.add(n1.left);
            q.add(n2.right);
        }
        
        return true;
        
    }
}