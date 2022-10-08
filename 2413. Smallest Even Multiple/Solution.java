// Runtime: 0 ms, faster than 100.00% of Java online submissions for Smallest Even Multiple.
// Memory Usage: 38.8 MB, less than 98.00% of Java online submissions for Smallest Even Multiple.

class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : 2 * n;
    }
}
