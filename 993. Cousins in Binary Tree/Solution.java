// Runtime: 0 ms, faster than 100.00% of Java online submissions for Cousins in Binary Tree.
// Memory Usage: 39.7 MB, less than 98.75% of Java online submissions for Cousins in Binary Tree.

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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int currLevelNodes = q.size();
            
            boolean foundX = false;
            boolean foundY = false;
            while (currLevelNodes > 0) {
                TreeNode tmp = q.remove();
                
                // Check if parent is same
                if (tmp.left != null && tmp.right != null
                    && ((tmp.left.val == x && tmp.right.val == y)
                        || (tmp.left.val == y && tmp.right.val == x)))
                    return false;
                
                foundX |= (tmp.val == x);
                foundY |= (tmp.val == y);
                
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
                
                --currLevelNodes;
            }
            
            if (foundX || foundY) return foundX & foundY;
        }
        
        return false;
    }
}
