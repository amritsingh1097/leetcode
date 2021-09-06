// Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
// Memory Usage: 39.1 MB, less than 95.97% of Java online submissions for Find Pivot Index.

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (sum == total - sum - nums[i])   return i;
            
            sum += nums[i];
        }
        
        return -1;
    }
}