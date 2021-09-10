// Runtime: 0 ms, faster than 100.00% of Java online submissions for Replace All Digits with Characters.
// Memory Usage: 36.7 MB, less than 98.82% of Java online submissions for Replace All Digits with Characters.

class Solution {
    public String replaceDigits(String s) {
        char[] chArr = s.toCharArray();
        for (int i = 1; i < chArr.length; i += 2) {
            chArr[i] = (char)(chArr[i-1] + (chArr[i] - '0'));
        }
        
        return String.valueOf(chArr);
    }
}