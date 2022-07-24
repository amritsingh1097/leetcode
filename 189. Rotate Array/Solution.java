// Runtime: 2 ms, faster than 49.24% of Java online submissions for Rotate Array.
// Memory Usage: 64.7 MB, less than 21.73% of Java online submissions for Rotate Array.

class Solution {
    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        
        int i = 0;
        // Reverse the array
        while (i < nums.length / 2) {
            swap(nums, i, nums.length - i - 1);
            ++i;
        }
        
        // Reverse first k elements
        i = 0;
        while (i < k / 2) {
            swap(nums, i, k - i - 1);
            ++i;
        }
        
        // Reverse rest of the elements
        i = 0;
        while (k + i < (k + nums.length) / 2) {
            swap(nums, i + k, nums.length - i - 1);
            ++i;
        }
    }
}
