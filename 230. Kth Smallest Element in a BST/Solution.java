// Runtime: 1 ms, faster than 70.51% of Java online submissions for Kth Smallest Element in a BST.
// Memory Usage: 41.8 MB, less than 96.47% of Java online submissions for Kth Smallest Element in a BST.

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
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        
        Stack<TreeNode> s = new Stack<>();
        while (!s.isEmpty() || root != null) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            
            ++count;
            root = s.pop();
            
            if (count == k) return root.val;
            
            root = root.right;
        }
        
        return root.val;
    }
}
