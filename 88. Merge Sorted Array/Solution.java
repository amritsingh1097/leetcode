// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 38.9 MB, less than 81.80% of Java online submissions for Merge Sorted Array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ptr = m-- + --n;
        
        while (m >= 0 && n >= 0) {
            if (nums1[m] <= nums2[n])   nums1[ptr--] = nums2[n--];
            else    nums1[ptr--] = nums1[m--];
        }
        
        while (n >= 0)  nums1[ptr--] = nums2[n--];
        
    }
}