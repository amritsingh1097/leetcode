class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[26];
        for (int i = 0; i < brokenLetters.length(); ++i) {
            broken[brokenLetters.charAt(i) - 'a'] = true;
        }

        boolean found = false;
        int count = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ') {
                if (!found) ++count;
                found = false;
            } else {
                if (found) continue;
                found = broken[text.charAt(i) - 'a'];
            }
        }

        if (!found) ++count;

        return count;
    }
}
