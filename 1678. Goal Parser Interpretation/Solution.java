class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char last = command.charAt(0);
        if (last == 'G') sb.append(last);

        for (int i = 1; i < command.length(); ++i) {
            char c = command.charAt(i);
            if (last == '(' && c == ')') sb.append('o');
            else if (Character.isLetter(c)) sb.append(c);
            last = c;
        }

        return sb.toString();
    }
}
