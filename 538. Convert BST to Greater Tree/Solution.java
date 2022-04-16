// Runtime: 1 ms, faster than 83.72% of Java online submissions for Convert BST to Greater Tree.
// Memory Usage: 42.4 MB, less than 90.48% of Java online submissions for Convert BST to Greater Tree.

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
    public TreeNode convertBST(TreeNode root) {
        return convertBSTThreadedTree(root);
    }
    
    // Convert to threaded tree with left of each node
    // pointing to its predecessor in in-order traversal
    private TreeNode convertBSTThreadedTree(TreeNode root) {
        TreeNode tmp = root;
        int sum = 0;
        while (tmp != null) {
            if (tmp.right == null) {
                sum += tmp.val;
                tmp.val = sum;
                tmp = tmp.left;
            } else {
                // Get Successor
                TreeNode succ = tmp.right;
                while (succ.left != null && succ.left != tmp) {
                    succ = succ.left;
                }
                
                if (succ.left == null) {
                    succ.left = tmp;
                    tmp = tmp.right;
                } else {
                    succ.left = null;
                    sum += tmp.val;
                    tmp.val = sum;
                    tmp = tmp.left;
                }
            }
        }
        
        return root;
    }
    

    // Runtime: 3 ms, faster than 13.09% of Java online submissions for Convert BST to Greater Tree.
    // Memory Usage: 42.6 MB, less than 83.27% of Java online submissions for Convert BST to Greater Tree.
    private TreeNode convertBSTStack(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        
        TreeNode tmp = root;
        int sum = 0;
        while (!s.isEmpty() || tmp != null) {
            while (tmp != null) {
                s.push(tmp);
                tmp = tmp.right;
            }
            
            tmp = s.pop();
            sum += tmp.val;
            tmp.val = sum;
            tmp = tmp.left;
        }
        
        return root;
    }
}
