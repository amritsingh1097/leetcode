// Runtime: 4 ms, faster than 97.95% of Java online submissions for First Unique Character in a String.
// Memory Usage: 39.1 MB, less than 93.85% of Java online submissions for First Unique Character in a String.

class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        char[] str = s.toCharArray();
        for (char c : str) {
            ++a[c - 'a'];
        }
        
        for (int i = 0; i < str.length; ++i) {
            if (a[str[i] - 'a'] == 1)  return i;
        }
        
        return -1;
    }
}