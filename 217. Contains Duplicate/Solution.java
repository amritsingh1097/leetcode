// Runtime: 6 ms, faster than 60.47% of Java online submissions for Contains Duplicate.
// Memory Usage: 44.5 MB, less than 70.30% of Java online submissions for Contains Duplicate.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        
        for (int n : nums) {
            if (s.contains(n))  return true;
            
            s.add(n);
        }
        
        return false;
    }
}