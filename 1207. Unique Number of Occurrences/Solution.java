// Runtime: 1 ms, faster than 99.70% of Java online submissions for Unique Number of Occurrences.
// Memory Usage: 36.7 MB, less than 92.47% of Java online submissions for Unique Number of Occurrences.

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        
        return (new HashSet<>(mp.values()).size()) == mp.size();
    }
}