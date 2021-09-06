// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
// Memory Usage: 40.8 MB, less than 39.14% of Java online submissions for Remove Duplicates from Sorted Array.

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[k] != nums[i]) {
                if (i-k == 1)   ++k;
                else    nums[++k] = nums[i];
            }
        }
        
        return k+1;
    }
}