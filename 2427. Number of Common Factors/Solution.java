// Runtime: 1 ms, faster than 80.91% of Java online submissions for Number of Common Factors.
// Memory Usage: 40.3 MB, less than 82.33% of Java online submissions for Number of Common Factors.

class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int n = a < b ? a : b;
        
        for (int i = 2; i <= n; ++i) {
            if (a % i == 0 && b % i == 0) ++count;
        }
        
        return count;
    }
}
