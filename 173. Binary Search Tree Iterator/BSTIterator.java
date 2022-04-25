// Runtime: 14 ms, faster than 85.69% of Java online submissions for Binary Search Tree Iterator.
// Memory Usage: 46.2 MB, less than 87.92% of Java online submissions for Binary Search Tree Iterator.

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
class BSTIterator {
    
    TreeNode curr;
    Map<Integer, TreeNode> threads = new HashMap<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            if (curr == null && root.left == null) {
                curr = new TreeNode(-1);
                curr.left = null;
                curr.right = root;
            }
            
            // Get predecessor
            TreeNode pred = root.left;
            while (pred != null && pred.right != null) pred = pred.right;
            
            // Map the predecessor to the current node
            if (pred != null) threads.put(pred.val, root);
            
            
            if (root.left != null) {
                root = root.left;
            } else {
                // Travel to successors using threads
                // until we don't find a connecting thread
                while (threads.containsKey(root.val))
                    root = threads.get(root.val);
                
                root = root.right;
            }
        }
    }
    
    public int next() {
        if (curr.right == null) {
            curr = threads.get(curr.val);
        } else {
            // Get successor
            curr = curr.right;
            while (curr != null && curr.left != null) curr = curr.left;
        }
        
        return curr.val;
    }
    
    public boolean hasNext() {
        return (curr.right != null || threads.containsKey(curr.val));
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
