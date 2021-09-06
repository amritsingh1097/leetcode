// Runtime: 2 ms, faster than 99.25% of Java online submissions for Maximum Product of Three Numbers.
// Memory Usage: 40.2 MB, less than 78.82% of Java online submissions for Maximum Product of Three Numbers.

class Solution {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for (int n : nums) {
            if (min1 > n) {
                min2 = min1;
                min1 = n;
            } else if (min2 > n) {
                min2 = n;
            }
            
            if (max1 < n) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 < n) {
                max3 = max2;
                max2 = n;
            } else if (max3 < n) {
                max3 = n;
            }
        }
        
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}