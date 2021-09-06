// Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Palindrome.
// Memory Usage: 38.7 MB, less than 96.03% of Java online submissions for Valid Palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        int i = 0;
        int j = s.length() - 1;
        char ci = 'a';
        char cj = 'a';
        
        while (i < j) {
            ci = s.charAt(i);
            cj = s.charAt(j);
            
            if ((ci < 'a' || ci > 'z') && (ci < '0' || ci > '9')) {
                i++;
                continue;
            }
            
            if ((cj < 'a' || cj > 'z') && (cj < '0' || cj > '9')) {
                j--;
                continue;
            }
            
            if (ci != cj)   return false;
            
            i++;
            j--;
        }
        
        return true;
        
    }
}