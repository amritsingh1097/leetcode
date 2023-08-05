class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for (int i = left; i <= right; ++i) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) ++c;
        }

        return c;
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
