// Runtime: 6 ms, faster than 69.30% of Java online submissions for Palindromic Substrings.
// Memory Usage: 42.4 MB, less than 52.38% of Java online submissions for Palindromic Substrings.

class Solution {
    public int countSubstrings(String s) {
        int count = s.length();
        
        for (int pivot = 0; pivot < s.length(); ++pivot) {
            // Even Palindrome
            int left = pivot - 1;
            int right = pivot;
            
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ++count;
                --left;
                ++right;
            }
            
            // Odd Palindrome
            left = pivot - 1;
            right = pivot + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ++count;
                --left;
                ++right;
            }
        }
        
        return count;
    }
}
