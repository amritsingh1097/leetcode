// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 38.3 MB, less than 92.30% of Java online submissions for Search Insert Position.

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            
            if (nums[mid] == target)    return mid;
            
            if (target < nums[mid]) right = mid - 1;
            else    left = mid + 1;
        }
        
        return left;
    }
}