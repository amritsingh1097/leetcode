// Runtime: 1 ms, faster than 98.69% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.2 MB, less than 62.94% of Java online submissions for Valid Parentheses.

class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<>();
        
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                list.addLast(c);
            } else {
                if (list.size() == 0) {
                    return false;
                }
                
                char last = list.getLast();
                if ((c == ')' && last == '(')
                    || (c == ']' && last == '[')
                    || (c == '}' && last == '{')) {
                    list.removeLast();
                } else {
                    return false;
                }
            }
        }
        
        return list.size() == 0;
    }
}