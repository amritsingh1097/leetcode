class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchedWords = new ArrayList<>();
        
        for (String word : words) {
            if (matchWordUsingIndex(word, pattern)) {
                matchedWords.add(word);
            }
        }
        
        return matchedWords;
    }
    
    // Runtime: 4 ms, faster than 32.06% of Java online submissions for Find and Replace Pattern.
    // Memory Usage: 42.7 MB, less than 74.75% of Java online submissions for Find and Replace Pattern.
    boolean matchWord(String word, String pattern) {
        Map<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < word.length(); ++i) {
            char cp = pattern.charAt(i);
            char cw = word.charAt(i);

            if (mp.containsKey(cp) && mp.get(cp) != cw) {
                return false;
            }

            mp.put(cp, cw);
        }

        boolean[] visited = new boolean[26];
        for (char c : mp.values()) {
            if (visited[c - 'a']) return false;
            visited[c - 'a'] = true;
        }
        
        return true;
    }
    
    // Runtime: 1 ms, faster than 98.01% of Java online submissions for Find and Replace Pattern.
    // Memory Usage: 42.8 MB, less than 69.60% of Java online submissions for Find and Replace Pattern.
    boolean matchWordUsingIndex(String word, String pattern) {
        for (int i = 0; i < word.length(); ++i) {
            char cp = pattern.charAt(i);
            char cw = word.charAt(i);
            
            if (pattern.indexOf(cp) != word.indexOf(cw)) return false;
        }
        
        return true;
    }
}
