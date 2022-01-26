// Runtime: 984 ms, faster than 5.10% of Java online submissions for All Elements in Two Binary Search Trees.
// Memory Usage: 85.9 MB, less than 31.32% of Java online submissions for All Elements in Two Binary Search Trees.

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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        
        // Inorder traversal of first tree
        // Create a new list with inorder traversal
        while (root1 != null || !s.isEmpty()) {
            while (root1 != null) {
                s.push(root1);
                root1 = root1.left;
            }
            
            root1 = s.pop();
            list.add(root1.val);
            root1 = root1.right;
        }
        
        // Inorder traversal of second tree
        // Update the list during traversal
        int i = 0;
        while (root2 != null || !s.isEmpty()) {
            while (root2 != null) {
                s.push(root2);
                root2 = root2.left;
            }
            
            root2 = s.pop();
            
            while (i < list.size() && list.get(i) <= root2.val)
                ++i;
            
            list.add(i, root2.val);
            
            root2 = root2.right;
        }
        
        return list;
    }
}