// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
// Memory Usage: 38.3 MB, less than 83.38% of Java online submissions for Find Minimum in Rotated Sorted Array.

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1)   return nums[0];
        
        int i = 1;
        
        while (i < nums.length && nums[i] > nums[i-1])  ++i;
        
        if (i == nums.length)
            return nums[0];
        
        return nums[i];
    }
}