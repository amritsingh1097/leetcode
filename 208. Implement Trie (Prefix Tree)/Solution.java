// Runtime: 32 ms, faster than 88.87% of Java online submissions for Implement Trie (Prefix Tree).
// Memory Usage: 53.1 MB, less than 82.81% of Java online submissions for Implement Trie (Prefix Tree).

class Trie {
    
    class TrieNode {

        private TrieNode[] links;
        private final int R = 26;
        private boolean isEnd;
    
        public TrieNode() {
            links = new TrieNode[R];
        }
    
        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public void setIsEnd() {
            this.isEnd = true;
        }

        public boolean getIsEnd() {
            return this.isEnd;
        }
    }
    
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        
        for (char ch : word.toCharArray()) {
            if (!node.containsKey(ch)) {
                node.put(ch, new TrieNode());
            }
            
            node = node.get(ch);
        }
        
        node.setIsEnd();
    }
    
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        
        for (char ch : word.toCharArray()) {
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return null;
            }
        }
        
        return node;
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.getIsEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */