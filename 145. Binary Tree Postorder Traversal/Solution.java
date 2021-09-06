// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
// Memory Usage: 37.1 MB, less than 84.44% of Java online submissions for Binary Tree Postorder Traversal.

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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        
        if (root == null)   return l;
        
        Stack<TreeNode> s = new Stack<>();
        
        s.push(root);
        
        while (!s.isEmpty()) {
            
            root = s.pop();
            
            if (root.left != null) s.push(root.left);
            if (root.right != null) s.push(root.right);
            
            l.add(0, root.val);
            
        }
        
        return l;
    }
    
}