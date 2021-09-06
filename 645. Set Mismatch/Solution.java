// Runtime: 2 ms, faster than 81.48% of Java online submissions for Set Mismatch.
// Memory Usage: 40.1 MB, less than 97.17% of Java online submissions for Set Mismatch.

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; ++i) {
            int p = Math.abs(nums[i]) - 1;
            
            if (nums[p] < 0)    ans[0] = p + 1;
            else    nums[p] = -nums[p];
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                ans[1] = i+1;
                return ans;
            }
        }
        
        ans[1] = nums.length;
        
        return ans;
    }
}