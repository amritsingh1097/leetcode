// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
// Memory Usage: 42.1 MB, less than 80.90% of Java online submissions for Find First and Last Position of Element in Sorted Array.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[] { -1, -1 };
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target && (mid == 0 || nums[mid-1] < target)) {
                pos[0] = mid;
                break;
            }
            
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        if (pos[0] != -1) {
            left = pos[0];
            right = nums.length - 1;
            
            while (left <= right) {
                int mid = (left + right) / 2;

                if (mid + 1 == nums.length || (nums[mid] == target && nums[mid+1] > target)) {
                    pos[1] = mid;
                    break;
                }

                if (nums[mid] <= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        
        return pos;
    }
}