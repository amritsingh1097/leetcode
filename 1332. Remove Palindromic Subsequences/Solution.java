// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Palindromic Subsequences.
// Memory Usage: 41.3 MB, less than 71.87% of Java online submissions for Remove Palindromic Subsequences.

class Solution {
    public int removePalindromeSub(String s) {
        boolean isPalindrome = true;
        
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        return isPalindrome ? 1 : 2;
    }
}
