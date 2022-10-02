// Runtime: 2 ms, faster than 99.28% of Java online submissions for Ransom Note.
// Memory Usage: 42.5 MB, less than 95.47% of Java online submissions for Ransom Note.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        
        int[] count = new int[26];
        
        for (char c : magazine.toCharArray()) {
            ++count[c - 'a'];
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) return false;
            --count[c - 'a'];
        }
        
        return true;
    }
}