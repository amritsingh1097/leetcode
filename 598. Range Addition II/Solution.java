// Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Addition II.
// Memory Usage: 38.6 MB, less than 92.91% of Java online submissions for Range Addition II.

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        
        if (ops.length == 0)    return m * n;
        
        for (int i = 1; i < ops.length; ++i) {
            if (ops[0][0] > ops[i][0])   ops[0][0] = ops[i][0];
            if (ops[0][1] > ops[i][1])   ops[0][1] = ops[i][1];
        }
        
        return ops[0][0] * ops[0][1];
    }
}