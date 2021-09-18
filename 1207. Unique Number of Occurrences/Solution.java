// Runtime: 1 ms, faster than 99.71% of Java online submissions for Unique Number of Occurrences.
// Memory Usage: 36.9 MB, less than 76.65% of Java online submissions for Unique Number of Occurrences.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        
        Set<Integer> s = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            s.add(e.getValue());
        }
        
        return s.size() == mp.size();
    }
}