// Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
// Memory Usage: 62.1 MB, less than 93.03% of Java online submissions for Minimum Depth of Binary Tree.

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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        
        while (!q.isEmpty()) {
            ++depth;
            
            int currLevelNodes = q.size();
            while (currLevelNodes > 0) {
                TreeNode tmp = q.remove();
                
                if (tmp.left == null && tmp.right == null) return depth;
                
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
                
                --currLevelNodes;
            }
        }
        
        return depth;
    }
}
