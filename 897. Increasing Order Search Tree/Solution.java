// Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
// Memory Usage: 39.6 MB, less than 95.34% of Java online submissions for Increasing Order Search Tree.

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
    public TreeNode increasingBST(TreeNode root) {
        return increasingBSTStack(root);
    }
    
    private TreeNode increasingBSTThreadedTree(TreeNode root) {
        TreeNode origRoot = root;
        TreeNode newRoot = null;
        
        while (root != null) {
            if (newRoot == null && root.left == null) newRoot = root;
            
            if (root == null) break;
            
            if (root.left != null) {
                // Find predecessor and relink
                TreeNode pred = root.left;
                while (pred.right != null) pred = pred.right;
                pred.right = root;

                TreeNode tmp = root.left;
                root.left = null;
                root = tmp;
            } else if (root.right != null) {
                // Find successor and relink
                TreeNode succ = root.right;
                while (succ.left != null) succ = succ.left;

                TreeNode tmp = root.right;
                root.right = succ;
                root = tmp;
            } else {
                root = root.right;
            }
        }
        
        return newRoot;
    }
    

    // Runtime: 1 ms, faster than 36.55% of Java online submissions for Increasing Order Search Tree.
    // Memory Usage: 39.7 MB, less than 92.33% of Java online submissions for Increasing Order Search Tree.
    private TreeNode increasingBSTStack(TreeNode root) {
        List<TreeNode> inorder = new ArrayList<>();
        
        Stack<TreeNode> s = new Stack<>();
        while (!s.isEmpty() || root != null) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            
            root = s.pop();
            inorder.add(root);
            root = root.right;
        }
        
        for (int i = 1; i < inorder.size(); ++i) {
            inorder.get(i-1).right = inorder.get(i);
            inorder.get(i).left = null;
        }
        
        return inorder.get(0);
    }
}
