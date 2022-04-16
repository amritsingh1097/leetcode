// Runtime: 13 ms, faster than 28.49% of Java online submissions for Valid Palindrome II.
// Memory Usage: 42.7 MB, less than 92.08% of Java online submissions for Valid Palindrome II.

class Solution {
    public boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            ++left;
            --right;
        }
        
        return true;
    }
    
    public boolean validPalindrome(String s) {
        char[] chArr = s.toCharArray();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return (checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1));
            }
            
            ++left;
            --right;
        }
        
        return true;
    }
}
