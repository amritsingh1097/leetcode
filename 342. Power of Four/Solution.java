// Runtime: 1 ms, faster than 99.41% of Java online submissions for Power of Four.
// Memory Usage: 35.7 MB, less than 97.28% of Java online submissions for Power of Four.

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            
            n /= 4;
        }
        
        return true;
    }
}