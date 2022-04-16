// Runtime: 2 ms, faster than 88.73% of Java online submissions for Average of Levels in Binary Tree.
// Memory Usage: 43.6 MB, less than 90.25% of Java online submissions for Average of Levels in Binary Tree.

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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        List<Double> avgList = new ArrayList<>();
        while (!q.isEmpty()) {
            int currLevelNodes = q.size();
            int nodeCount = q.size();
            
            double avg = 0;
            while (currLevelNodes > 0) {
                TreeNode tmp = q.remove();
                avg += tmp.val;
                
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
                
                --currLevelNodes;
            }
            
            avgList.add(avg / nodeCount);
        }
        
        return avgList;
    }
}
