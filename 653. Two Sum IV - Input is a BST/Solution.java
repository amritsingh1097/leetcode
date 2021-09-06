// Runtime: 3 ms, faster than 52.80% of Java online submissions for Two Sum IV - Input is a BST.
// Memory Usage: 38.9 MB, less than 99.83% of Java online submissions for Two Sum IV - Input is a BST.

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
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        Stack<TreeNode> s = new Stack<>();
        
        while (!s.isEmpty() || root != null) {
            while (root != null) {
                s.push(root.right);
                
                if (mp.containsKey(root.val))  return true;
                
                mp.put(k - root.val, root.val);
                root = root.left;
            }
            
            root = s.pop();
        }
        
        return false;
    }
}