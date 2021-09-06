// Runtime: 13 ms, faster than 60.10% of Java online submissions for License Key Formatting.
// Memory Usage: 42 MB, less than 18.85% of Java online submissions for License Key Formatting.

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int tk = k;
        
        for (int i = s.length() - 1; i >= 0; --i) {
            char ch = s.charAt(i);
            if (ch == '-')
                continue;
            
            if (tk == 0) {
                sb.append("-");
                tk = k;
            }
            
            sb.append(Character.toUpperCase(ch));
            --tk;
        }
        
        return sb.reverse().toString();
    }
}