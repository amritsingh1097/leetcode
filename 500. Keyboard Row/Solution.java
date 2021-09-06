// Runtime: 3 ms, faster than 21.74% of Java online submissions for Keyboard Row.
// Memory Usage: 37.5 MB, less than 25.38% of Java online submissions for Keyboard Row.

class Solution {
    public String[] findWords(String[] words) {
        int last = 0;
        for (String s : words) {
            String s1 = s.replaceAll("[qwertyuiopQWERTYUIOP]", "");
            String s2 = s1.replaceAll("[asdfghjklASDFGHJKL]", "");
            
            if (s1.length() == 0
               || (s1.length() == s.length()
                   && (s2.length() == 0) || s2.length() == s.length()))
                words[last++] = s;
        }
        
        return Arrays.copyOfRange(words, 0, last);
    }
}