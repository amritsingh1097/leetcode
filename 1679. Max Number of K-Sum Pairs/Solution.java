// Runtime: 31 ms, faster than 62.24% of Java online submissions for Max Number of K-Sum Pairs.
// Memory Usage: 55.6 MB, less than 84.47% of Java online submissions for Max Number of K-Sum Pairs.

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        
        for (int n : nums) {
            if (mp.containsKey(n) && mp.get(n) > 0) {
                mp.put(n, mp.get(n) - 1);
                ++count;
            } else if (n <= k) {
                mp.put(k-n, mp.getOrDefault(k-n, 0) + 1);
            }
        }
        
        return count;
    }
}
