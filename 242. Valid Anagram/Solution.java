// Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Anagram.
// Memory Usage: 39.2 MB, less than 75.04% of Java online submissions for Valid Anagram.

// Note: Space for new arrays created by toCharArray() is not considered here due to it being a language specific detail.
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())   return false;
        
        int[] counter = new int[26];
        
        for (char c : s.toCharArray()) {
            ++counter[c - 'a'];
        }
        
        for (char c : t.toCharArray()) {
            if (counter[c - 'a']-- == 0)    return false;
        }
        
        return true;
    }
}


// Program to accomodate for unicode characters.

// Runtime: 16 ms, faster than 14.37% of Java online submissions for Valid Anagram.
// Memory Usage: 43.2 MB, less than 5.01% of Java online submissions for Valid Anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())   return false;
        Map<Character, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < s.length(); ++i) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < s.length(); ++i) {
            int a = mp.getOrDefault(t.charAt(i), 0);
            if (a == 0) return false;
            mp.put(t.charAt(i), a - 1);
        }
        
        return true;
    }
}