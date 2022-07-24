// Runtime: 1 ms, faster than 98.93% of Java online submissions for Shortest Unsorted Continuous Subarray.
// Memory Usage: 54.2 MB, less than 42.45% of Java online submissions for Shortest Unsorted Continuous Subarray.

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int s = 0;
        int e = -1;
        int l = 0;
        int r = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while (r >= 0) {
            if (nums[r] <= min) min = nums[r]; else s = r;
            if (nums[l] >= max) max = nums[l]; else e = l;
            
            ++l;
            --r;
        }
        
        return (e - s) + 1;
    }
}
