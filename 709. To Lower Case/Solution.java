// Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
// Memory Usage: 37 MB, less than 86.68% of Java online submissions for To Lower Case.

class Solution {
    public String toLowerCase(String s) {
        char[] chArr = s.toCharArray();
        
        for (int i = 0; i < chArr.length; ++i) {
            if (chArr[i] >= 'A' && chArr[i] <= 'Z')
                chArr[i] += 32;
        }
        
        return String.valueOf(chArr);
    }
}