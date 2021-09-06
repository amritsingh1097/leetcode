// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 38.6 MB, less than 86.89% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            
            if (maxSum < sum)   maxSum = sum;
            
            if (sum < 0)    sum = 0;
        }
        
        return maxSum;
    }
}