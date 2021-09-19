// Runtime: 2 ms, faster than 93.43% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 38.9 MB, less than 93.59% of Java online submissions for Intersection of Two Arrays II.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int n : nums1) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        
        int i = 0;
        for (int n : nums2) {
            if (mp.containsKey(n) && mp.get(n) > 0) {
                nums1[i++] = n;
                mp.put(n, mp.get(n) - 1);
            }
        }
        
        return Arrays.copyOf(nums1, i);
    }
}