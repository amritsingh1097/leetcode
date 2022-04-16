// Runtime: 1 ms, faster than 82.11% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 42.5 MB, less than 81.89% of Java online submissions for Binary Tree Level Order Traversal.

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        
        while (!q.isEmpty()) {
            int currLevelNodes = q.size();
            
            List<Integer> level = new ArrayList<>();
            while (currLevelNodes > 0) {
                TreeNode tmp = q.remove();
                level.add(tmp.val);
                
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
                
                --currLevelNodes;
            }
            
            traversal.add(level);
        }
        
        return traversal;
    }
}
