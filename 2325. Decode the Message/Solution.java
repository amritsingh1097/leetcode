class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        for (int i = 0; i < 26; ++i) map[i] = '0';

        int c = 'a';
        for (int i = 0; i < key.length(); ++i) {
            int ch = key.charAt(i);
            if (ch != ' ' && map[ch - 'a'] == '0') map[ch - 'a'] = (char) c++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); ++i) {
            if (message.charAt(i) == ' ') sb.append(' ');
            else sb.append(map[message.charAt(i) - 'a']);
        }

        return sb.toString();
    }
}
