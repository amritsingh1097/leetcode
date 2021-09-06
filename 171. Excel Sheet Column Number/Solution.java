// Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
// Memory Usage: 38.8 MB, less than 85.17% of Java online submissions for Excel Sheet Column Number.

class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        
        for (int i = 0; i < columnTitle.length(); ++i) {
            num = (num * 26) + (columnTitle.charAt(i) - 'A') + 1;
        }
        
        return num;
    }
}