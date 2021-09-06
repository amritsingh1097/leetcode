// Runtime: 2 ms, faster than 89.33% of Java online submissions for Baseball Game.
// Memory Usage: 37.8 MB, less than 96.60% of Java online submissions for Baseball Game.

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("C")) {
                s.pop();
            } else if (op.equals("D")) {
                s.push(s.peek() * 2);
            } else if (op.equals("+")) {
                int top = s.pop();
                int n = s.peek() + top;
                s.push(top);
                s.push(n);
            } else {
                s.push(Integer.parseInt(op));
            }
        }
        
        int score = 0;
        for (int n : s) score += n;
        return score;
    }
    
}