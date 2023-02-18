class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') ++open;
            if (open > 1) sb.append(c);
            if (c == ')') --open;
        }

        return sb.toString();
    }
}
