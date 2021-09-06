// Runtime: 12 ms, faster than 98.31% of Java online submissions for First Bad Version.
// Memory Usage: 35.5 MB, less than 81.29% of Java online submissions for First Bad Version.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        
        while (left <= right) {
            
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}