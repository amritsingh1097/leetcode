class Solution {
    public String removeStars(String s) {
        return removeStarsUsingPointers(s);
    }

    private String removeStarsUsingStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*') {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    private String removeStarsUsingPointers(String s) {
        int p = 0;
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*') {
                --p;
            } else {
                sb.setCharAt(p, s.charAt(i));
                ++p;
            }
        }

        return sb.substring(0, p);
    }
}
