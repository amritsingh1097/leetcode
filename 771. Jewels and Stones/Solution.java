// Runtime: 0 ms, faster than 100.00% of Java online submissions for Jewels and Stones.
// Memory Usage: 36.9 MB, less than 97.85% of Java online submissions for Jewels and Stones.

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for (char c : stones.toCharArray()) {
            for (int i = 0; i < jewels.length(); ++i) {
                if (c == jewels.charAt(i))  ++count;
            }
        }
        
        return count;
    }
}