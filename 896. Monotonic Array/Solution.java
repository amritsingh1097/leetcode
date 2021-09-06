// Runtime: 1 ms, faster than 100.00% of Java online submissions for Monotonic Array.
// Memory Usage: 47.4 MB, less than 78.66% of Java online submissions for Monotonic Array.

class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 1;
        
        for (i = 1; i < nums.length && nums[i] == nums[i-1]; ++i);
        
        if (i == nums.length)   return true;
        
        if (nums[i] > nums[i-1]) {
            while (++i < nums.length) {
                if (nums[i-1] > nums[i])    return false;
            }
        } else {
            while (++i < nums.length) {
                if (nums[i-1] < nums[i])    return false;
            }
        }
        
        return true;
    }
}