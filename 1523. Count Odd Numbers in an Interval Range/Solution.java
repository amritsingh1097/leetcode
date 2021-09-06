// Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
// Memory Usage: 35.2 MB, less than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.

class Solution {
    public int countOdds(int low, int high) {
        return (++high / 2) - (low / 2);
    }
}