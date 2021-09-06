// Runtime: 6 ms, faster than 99.97% of Java online submissions for Palindrome Number.
// Memory Usage: 38 MB, less than 92.77% of Java online submissions for Palindrome Number.

class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        
        // Using integer reverse and compare
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int rev = 0;
        while (rev < x) {
            rev *= 10;
            rev += x%10;
            x /= 10;
        }
        
        return x == rev || x == rev/10;
    }
}