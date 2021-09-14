// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Prefix of Word.
// Memory Usage: 37.1 MB, less than 96.94% of Java online submissions for Reverse Prefix of Word.

class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = -1;
        char[] chArr = word.toCharArray();
        
        while (++ind < chArr.length && chArr[ind] != ch);
        
        if (ind == chArr.length)
            return word;
        
        for (int i = 0; i < ind; ++i, --ind) {
            char c = chArr[i];
            chArr[i] = chArr[ind];
            chArr[ind] = c;
        }
        
        return String.valueOf(chArr);
    }
}