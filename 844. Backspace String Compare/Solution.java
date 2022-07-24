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

        // Method 2
//         for (int p1 = s.length() - 1, p2 = t.length() - 1; p1 >= 0 || p2 >= 0; --p1, --p2) {
//             int backspaces = 0;
            
//             while (p1 >= 0) {
//                 if (s.charAt(p1) == '#') {
//                     ++backspaces;
//                     --p1;
//                 } else if (backspaces > 0) {
//                     --backspaces;
//                     --p1;
//                 } else {
//                     break;
//                 }
//             }
            
//             backspaces = 0;
//             while (p2 >= 0) {
//                 if (t.charAt(p2) == '#') {
//                     ++backspaces;
//                     --p2;
//                 } else if (backspaces > 0) {
//                     --backspaces;
//                     --p2;
//                 } else {
//                     break;
//                 }
//             }
            
//             if ((p1 >= 0) != (p2 >= 0)) return false;
//             if (p1 >= 0 && p2 >= 0 && s.charAt(p1) != t.charAt(p2)) return false;
//         }
        
        return true;
    }
}
