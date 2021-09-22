// Runtime: 5 ms, faster than 83.76% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 38.9 MB, less than 90.78% of Java online submissions for Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            
            if (set.contains(c)) {
                while (s.charAt(left) != c)
                    set.remove(s.charAt(left++));
                
                set.remove(s.charAt(left++));
            }
            
            set.add(c);
            
            if (max < set.size())
                max = set.size();
        }
        
        return max;
    }
}