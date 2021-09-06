// Runtime: 0 ms, faster than 100.00% of Java online submissions for Generate a String With Characters That Have Odd Counts.
// Memory Usage: 36.3 MB, less than 84.38% of Java online submissions for Generate a String With Characters That Have Odd Counts.

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i)
            sb.append('a');
        
        if (n % 2 == 0)
            sb.setCharAt(0, 'b');
        
        return sb.toString();
    }
}