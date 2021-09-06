// Runtime: 4 ms, faster than 63.40% of Java online submissions for Reverse Vowels of a String.
// Memory Usage: 38.8 MB, less than 94.48% of Java online submissions for Reverse Vowels of a String.

class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> set = new HashSet<>(){{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};
        
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char l = sb.charAt(left);
            char r = sb.charAt(right);
            
            if (l == r) {
                ++left;
                --right;
                continue;
            }
            
            if (set.contains(l) && set.contains(r)) {
                sb.setCharAt(right, l);
                sb.setCharAt(left, r);
                
                ++left;
                --right;
            }
            
            if (!set.contains(sb.charAt(left)))   ++left;
            if (!set.contains(sb.charAt(right)))   --right;
        }
        
        return sb.toString();
    }
}