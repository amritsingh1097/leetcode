// Runtime: 2 ms, faster than 76.49% of Java online submissions for Maximum Number of Balloons.
// Memory Usage: 37.2 MB, less than 98.79% of Java online submissions for Maximum Number of Balloons.

class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        
        for (char ch : text.toCharArray()) {
            if (ch == 'b')
                ++b;
            else if (ch == 'a')
                ++a;
            else if (ch == 'l')
                ++l;
            else if (ch == 'o')
                ++o;
            else if (ch == 'n')
                ++n;
        }
        
        l /= 2;
        o /= 2;
        
        b = b < a ? b : a;
        b = b < l ? b : l;
        b = b < o ? b : o;
        b = b < n ? b : n;
        
        return b;
    }
}