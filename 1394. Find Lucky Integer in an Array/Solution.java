// Runtime: 3 ms, faster than 65.69% of Java online submissions for Find Lucky Integer in an Array.
// Memory Usage: 38.8 MB, less than 48.40% of Java online submissions for Find Lucky Integer in an Array.

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        
        int lucky = -1;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getKey() == entry.getValue() && lucky < entry.getKey())
                lucky = entry.getKey();
        }
        
        return lucky;
    }
}
