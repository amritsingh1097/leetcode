// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
// Memory Usage: 39 MB, less than 80.85% of Java online submissions for Move Zeroes.

// Use swapping to reduce numbr of operations
// Swap element next to last non-zero element with current element if it is not 0.
class Solution {
    public void moveZeroes(int[] nums) {
        int lastInd = 0;
        
        for (int n : nums) {
            if (n != 0) nums[lastInd++] = n;
        }
        
        for (int i = lastInd; i < nums.length; ++i) nums[i] = 0;
    }
}