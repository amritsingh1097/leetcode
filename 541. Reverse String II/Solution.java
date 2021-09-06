// Runtime: 1 ms, faster than 75.03% of Java online submissions for Reverse String II.
// Memory Usage: 38.7 MB, less than 97.54% of Java online submissions for Reverse String II.

class Solution {
    public String reverseStr(String s, int k) {
        char[] chArr = s.toCharArray();
        
        for (int i = 0; i < chArr.length; i += 2 * k) {
            int j = Math.min(i + k - 1, chArr.length - 1);
            int t = i;
            while (t < j) {
                char tmp = chArr[t];
                chArr[t] = chArr[j];
                chArr[j] = tmp;
                ++t;
                --j;
            }
        }
        
        return String.valueOf(chArr);
    }
}