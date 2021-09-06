// Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
// Memory Usage: 36.1 MB, less than 80.18% of Java online submissions for Excel Sheet Column Title.

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            sb.append((char)('A' + ((columnNumber - 1) % 26)));
            columnNumber = (columnNumber - 1) / 26;
        }
        
        return sb.reverse().toString();
    }
}