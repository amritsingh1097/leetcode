// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
// Memory Usage: 39.6 MB, less than 95.21% of Java online submissions for Binary Search.

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target)    return mid;
            
            if (target > nums[mid])   left = mid + 1;
            else    right = mid - 1;
        }
        
        return -1;
    }
}