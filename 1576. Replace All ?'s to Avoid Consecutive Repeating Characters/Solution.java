// Runtime: 1 ms, faster than 100.00% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.
// Memory Usage: 39.2 MB, less than 51.66% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.

class Solution {
    public String modifyString(String s) {
        if (s.length() == 1)
            return ((s.charAt(0) == '?') ? "a" : s);
        
        char[] ch = s.toCharArray();
        
        if (ch[0] == '?')
            ch[0] = ch[1] == 'a' ? 'c' : 'a';
        
        for (int i = 1; i < ch.length - 1; ++i) {
            if (ch[i] == '?') {
                if (((ch[i-1] != 'a' && ch[i+1] != 'c')
                     && (ch[i-1] != 'c' && ch[i+1] != 'a'))
                   || ((ch[i-1] == 'c' && ch[i+1] != 'a')
                       || (ch[i-1] != 'a' && ch[i+1] == 'c')))
                    ch[i] = 'a';
                else if ((ch[i-1] == 'a' && ch[i+1] != 'c')
                         || (ch[i-1] != 'c' && ch[i+1] == 'a'))
                    ch[i] = 'c';
                else
                    ch[i] = 'b';
            }
        }
        
        if (ch[ch.length - 1] == '?')
            ch[ch.length - 1] = (ch[ch.length - 2] == 'a') ? 'c' : 'a';
        
        return String.valueOf(ch);
    }
}