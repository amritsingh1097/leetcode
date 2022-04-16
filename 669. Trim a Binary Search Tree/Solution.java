// Runtime: 1 ms, faster than 18.45% of Java online submissions for Trim a Binary Search Tree.
// Memory Usage: 41.8 MB, less than 87.65% of Java online submissions for Trim a Binary Search Tree.

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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // Update root
        while (root != null && (root.val < low || root.val > high)) {
            root = (low < root.val) ? root.left : root.right;
        }
        
        if (root == null) return null;
        
        // Use DFS to trim
        Stack<TreeNode> s = new Stack<>();
        TreeNode tmp = root;
        while (!s.isEmpty() || tmp != null) {
            while (tmp != null) {
                if (tmp.val == low)
                    tmp.left = null;
                else if (tmp.val < low) {
                    s.peek().left = tmp.right;
                    tmp = tmp.right;
                    continue;
                }
                
                s.push(tmp);
                tmp = tmp.left;
            }
            
            tmp = s.pop();
            if (tmp.val == high)
                tmp.right = null;
            
            while (tmp.right != null && tmp.right.val > high)
                tmp.right = tmp.right.left;
                
            
            tmp = tmp.right;
        }
        
        return root;
    }
}
