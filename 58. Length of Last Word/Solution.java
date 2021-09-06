// Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
// Memory Usage: 37.1 MB, less than 89.64% of Java online submissions for Length of Last Word.

class Solution {
    public int lengthOfLastWord(String s) {
        
        short ind = (short)(s.length() - 1);
        short len = 0;
        
        while (ind >= 0 && s.charAt(ind) == ' ')    ind--;
       
        len = ind;
        
        while (ind >= 0 && s.charAt(ind) != ' ')    ind--;
        
        return len - ind;
        
    }
}