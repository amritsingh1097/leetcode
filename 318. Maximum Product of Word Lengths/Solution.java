// Runtime: 10 ms, faster than 77.35% of Java online submissions for Maximum Product of Word Lengths.
// Memory Usage: 45.9 MB, less than 66.48% of Java online submissions for Maximum Product of Word Lengths.

class Solution {
    public int maxProduct(String[] words) {
        int product = 0;
        
        int[] bits = new int[words.length];
        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < words[i].length(); ++j) {
                bits[i] = bits[i] | 1 << (words[i].charAt(j) - 'a');
            }
            
            for (int j = 0; j < i; ++j) {
                if ((bits[i] & bits[j]) == 0) {
                    product = Math.max(words[i].length() * words[j].length(), product);
                }
            }
        }
        
        return product;
    }
}
