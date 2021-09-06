// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
// Memory Usage: 35.8 MB, less than 70.62% of Java online submissions for Number of 1 Bits.

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        
        while (n != 0) {
            ++ones;
            n = n & (n - 1);
        }
        
        return ones;
    }
}