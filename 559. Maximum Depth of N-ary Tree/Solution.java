// Runtime: 1 ms, faster than 78.17% of Java online submissions for Maximum Depth of N-ary Tree.
// Memory Usage: 42.6 MB, less than 81.46% of Java online submissions for Maximum Depth of N-ary Tree.

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        
        while (!q.isEmpty()) {
            ++depth;
            
            int currLevelNodes = q.size();
            while (currLevelNodes > 0) {
                Node tmp = q.remove();
                q.addAll(tmp.children);
                --currLevelNodes;
            }
        }
        
        return depth;
    }
}
