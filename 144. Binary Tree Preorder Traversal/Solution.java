// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
// Memory Usage: 37 MB, less than 86.05% of Java online submissions for Binary Tree Preorder Traversal.

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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s = new Stack<>();
        List<Integer> l = new ArrayList<>();
        
        while (root != null || !s.isEmpty()) {
            
            while (root != null) {
                l.add(root.val);
                s.push(root);		// s.push(root.right);
                root = root.left;
            }
            
            root = s.pop().right;	// s.pop();
            
        }
        
        return l;
    }
}