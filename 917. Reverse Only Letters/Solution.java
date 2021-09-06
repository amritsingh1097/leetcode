// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
// Memory Usage: 36.8 MB, less than 97.68% of Java online submissions for Reverse Only Letters.

class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        char[] chArr = s.toCharArray();
        
        while (left < right) {
            if (((chArr[left] >= 'a' && chArr[left] <= 'z')
                 || (chArr[left] >= 'A' && chArr[left] <= 'Z'))
                && ((chArr[right] >= 'a' && chArr[right] <= 'z')
                    || (chArr[right] >= 'A' && chArr[right] <= 'Z'))) {
                char tmp = chArr[left];
                chArr[left] = chArr[right];
                chArr[right] = tmp;
                
                ++left;
                --right;
            } else {
                if ((chArr[left] < 'a' || chArr[left] > 'z')
                    && (chArr[left] < 'A' || chArr[left] > 'Z'))
                    ++left;
                
                if ((chArr[right] < 'a' || chArr[right] > 'z')
                    && (chArr[right] < 'A' || chArr[right] > 'Z'))
                    --right;
            }
        }
        
        return String.valueOf(chArr);
    }
}