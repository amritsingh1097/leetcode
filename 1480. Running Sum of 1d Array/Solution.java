// Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
// Memory Usage: 39 MB, less than 71.81% of Java online submissions for Running Sum of 1d Array.

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i-1];
        }
        
        return nums;
    }
}