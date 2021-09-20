// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 35.4 MB, less than 96.81% of Java online submissions for Climbing Stairs.

class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int ways = 1;
        
        for (int i = 2; i <= n; ++i) {
            ways += n1;
            n1 = ways - n1;
        }
        
        return ways;
    }
}