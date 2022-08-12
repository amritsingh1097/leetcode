// Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
// Memory Usage: 38.9 MB, less than 96.35% of Java online submissions for Unique Paths.

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[2][n];gbn
        
        for (int i = 0; i < n; ++i) {
            dp[0][i] = 1;
        }
        
        for (int i = 1; i < m; ++i) {
            dp[1][0] = 1;
            for (int j = 1; j < n; ++j) {
                dp[1][j] = dp[1][j - 1] + dp[0][j];
            }
            dp[0] = dp[1];
        }
        
        return dp[0][n - 1];
    }
}
