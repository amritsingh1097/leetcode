// Runtime: 9 ms, faster than 87.88% of Java online submissions for Longest Common Subsequence.
// Memory Usage: 42.6 MB, less than 76.30% of Java online submissions for Longest Common Subsequence.

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        dp[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
        
        for (int i = 1; i < text1.length(); ++i) {
            if (text1.charAt(i) == text2.charAt(0))
                dp[i][0] = 1;
            else
                dp[i][0] = dp[i-1][0];
        }
        
        for (int i = 1; i < text2.length(); ++i) {
            if (text1.charAt(0) == text2.charAt(i))
                dp[0][i] = 1;
            else
                dp[0][i] = dp[0][i-1];
        }
        
        for (int i = 1; i < text1.length(); ++i) {
            for (int j = 1; j < text2.length(); ++j) {
                if (text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[dp.length - 1][dp[0].length - 1];
    }
}