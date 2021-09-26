// Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Permutation.
// Memory Usage: 39 MB, less than 84.88% of Java online submissions for Next Permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        while (left >= 0 && nums[left] >= nums[left + 1])
            --left;
        
        int right = nums.length - 1;
        if (left >= 0) {
            while (nums[left] >= nums[right])
                --right;
            
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        
        // Reverse
        ++left;
        right = nums.length - 1;
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            ++left;
            --right;
        }
    }
}