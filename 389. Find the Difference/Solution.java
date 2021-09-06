// Runtime: 1 ms, faster than 98.60% of Java online submissions for Find the Difference.
// Memory Usage: 37.2 MB, less than 86.06% of Java online submissions for Find the Difference.

class Solution {
    public char findTheDifference(String s, String t) {
        int[] counter = new int[26];
        
        for (char c : s.toCharArray()) {
            ++counter[c - 'a'];
        }
        
        for (char c : t.toCharArray()) {
            if (counter[c - 'a'] == 0)  return c;
            --counter[c - 'a'];
        }
        
        return 'a';
    }
}