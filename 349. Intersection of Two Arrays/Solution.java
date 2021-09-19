// Runtime: 2 ms, faster than 95.55% of Java online submissions for Intersection of Two Arrays.
// Memory Usage: 39 MB, less than 86.32% of Java online submissions for Intersection of Two Arrays.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        
        for (int n : nums1) {
            s1.add(n);
        }
        
        int i = 0;
        for (int n : nums2) {
            if (s1.contains(n)) {
                nums1[i++] = n;
                s1.remove(n);
            }
        }
        
        return Arrays.copyOf(nums1, i);
    }
}