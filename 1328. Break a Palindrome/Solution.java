// Runtime: 0 ms, faster than 100.00% of Java online submissions for Break a Palindrome.
// Memory Usage: 37.2 MB, less than 61.54% of Java online submissions for Break a Palindrome.

class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1)
            return "";
        
        char[] chArr = palindrome.toCharArray();
        for (int i = 0; i < chArr.length / 2; ++i) {
            if (chArr[i] != 'a') {
                chArr[i] = 'a';
                return String.valueOf(chArr);
            }
        }
        
        chArr[chArr.length - 1] = 'b';
        return String.valueOf(chArr);
    }
}