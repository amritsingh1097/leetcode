class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); ++i) {
                ++freq[word.charAt(i) - 'a'];
            }
        }

        for (int n : freq) {
            if (n > 0 && n % words.length != 0) return false;
        }

        return true;
    }
}
