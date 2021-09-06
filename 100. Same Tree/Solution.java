// Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
// Memory Usage: 36.2 MB, less than 86.28% of Java online submissions for Same Tree.

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(p);
        q2.add(q);
        
        while (q1.size() > 0 && q2.size() > 0) {
            
            p = q1.remove();
            q = q2.remove();
            
            if (p == null && q == null) continue;
            
            if ((p == null || q == null)
               || p.val != q.val)
                return false;
            
            q1.add(p.left);
            q1.add(p.right);
            q2.add(q.left);
            q2.add(q.right);
        }
        
        return true;
    }
}