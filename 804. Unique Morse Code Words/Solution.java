// Runtime: 2 ms, faster than 99.55% of Java online submissions for Unique Morse Code Words.
// Memory Usage: 40.5 MB, less than 91.91% of Java online submissions for Unique Morse Code Words.

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> s = new HashSet<>();
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); ++i) {
                sb.append(codes[w.charAt(i) - 'a']);
            }
            
            s.add(sb.toString());
        }
        
        return s.size();
    }
}
