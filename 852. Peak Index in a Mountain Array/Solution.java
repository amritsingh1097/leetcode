// Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
// Memory Usage: 38.9 MB, less than 85.57% of Java online submissions for Peak Index in a Mountain Array.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] < arr[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        
        return left;
    }
}