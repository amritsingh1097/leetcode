// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
// Memory Usage: 37.2 MB, less than 74.28% of Java online submissions for Binary Tree Inorder Traversal.

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            l.add(root.val);
            
            root = root.right;
        }
        
        return l;
    }
}