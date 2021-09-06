// Runtime: 0 ms, faster than 100.00% of Java online submissions for Backspace String Compare.
// Memory Usage: 37 MB, less than 92.05% of Java online submissions for Backspace String Compare.

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        
        int i = 0;
        int left1 = 0;
        for (i = 0; i < c1.length; ++i) {
            if (c1[i] == '#')
                left1 = (left1 - 1) <= 0 ? 0 : --left1;
            else
                c1[left1++] = c1[i];
        }
        
        int left2 = 0;
        for (i = 0; i < c2.length; ++i) {
            if (c2[i] == '#')
                left2 = (left2 - 1) <= 0 ? 0 : --left2;
            else
                c2[left2++] = c2[i];
        }
        
        if (left1 != left2) return false;
        
        i = 0;
        while (i < left1 && i < left2) {
            if (c1[i] != c2[i])
                return false;
            
            ++i;
        }
        
        return true;
    }
}