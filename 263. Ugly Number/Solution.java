// Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.
// Memory Usage: 39.8 MB, less than 86.07% of Java online submissions for Ugly Number.

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        
        // while (n > 1) {
        //     if (n % 2 == 0) n /= 2;
        //     else if (n % 3 == 0) n /= 3;
        //     else if (n % 5 == 0) n /= 5;
        //     else return false;
        // }
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        return n == 1;
    }
}
