class Solution {
    public String reorderSpaces(String text) {
        return approach1(text);
    }

    public String approach1(String text) {
        int words = 0;
        int spaces = 0;
        boolean isWord = false;

        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ') {
                ++spaces;
                if (isWord) ++words;
                isWord = false;
            }
            else isWord = true;
        }
        if (isWord) ++words;

        if (spaces == 0) return text;

        int space = words > 1 ? spaces / (words - 1) : spaces;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) != ' ') {
                while (i < text.length() && text.charAt(i) != ' ') sb.append(text.charAt(i++));
                --words;
                if (words > 0) {
                    for (int j = 0; j < space; ++j) sb.append(' ');
                    spaces -= space;
                }
            }
        }

        while (spaces-- > 0) sb.append(' ');

        return sb.toString();
    }

    // Not very efficient
    public String approach2(String text) {
        String[] words = text.trim().split("\\s+");
        int spaces = (int) text.chars().filter(c -> c == ' ').count();
        String space = " ".repeat(words.length > 1 ? spaces / (words.length - 1) : spaces);
        return String.join(space, words) + " ".repeat(spaces - space.length() * (words.length - 1));
    }
}
